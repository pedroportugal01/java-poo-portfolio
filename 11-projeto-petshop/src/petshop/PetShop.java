package petshop;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class PetShop implements Calculavel, Relatorio {
    private ArrayList<Animal> animais = new ArrayList<>();
    private ArrayList<Servico> servicos = new ArrayList<>();

    // Implementação da Interface Calculavel (RF04)
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Servico s : servicos) {
            // Polimorfismo puro: s.calcularCusto sabe dinamicamente qual fórmula executar
            total += s.calcularCusto(s.getAnimalAtendido());
        }
        return total;
    }

    // Implementação da Interface Relatorio (RF04)
    @Override
    public String gerarResumo() {
        if (servicos.isEmpty()) {
            return "Nenhum serviço prestado no dia de hoje.";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("=== RELATÓRIO DE ATENDIMENTOS ===\n\n");
        for (Servico s : servicos) {
            Animal a = s.getAnimalAtendido();
            sb.append("Animal: ").append(a.getNome())
                    .append(" (").append(a.getClass().getSimpleName()).append(")\n")
                    .append("Serviço: ").append(s.getDescricao()).append("\n")
                    .append("Custo: R$ ").append(String.format("%.2f", s.calcularCusto(a))).append("\n")
                    .append("--------------------------------------------------\n");
        }
        return sb.toString();
    }

    public void iniciar() {
        String[] opcoesMenu = {"Cadastrar Animal", "Registrar Serviço", "Calcular Conta Total", "Exibir Relatório", "Finalizar"};
        int escolha;

        do {
            escolha = JOptionPane.showOptionDialog(
                    null,
                    "Escolha uma operação para continuar:",
                    "PetShop Patinhas Felizes - Menu Principal",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opcoesMenu,
                    opcoesMenu[0]
            );

            switch (escolha) {
                case 0:
                    cadastrarAnimal();
                    break;
                case 1:
                    registrarServico();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Valor Total faturado no dia:\nR$ " + String.format("%.2f", calcularTotal()), "Faturamento", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, gerarResumo(), "Relatório Diário", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4:
                case -1: // Caso o usuário feche a janela no 'X'
                    JOptionPane.showMessageDialog(null, "Encerrando sistema... Obrigado!");
                    break;
            }
        } while (escolha != 4 && escolha != -1);
    }

    private void cadastrarAnimal() {
        String[] tipos = {"Cachorro", "Gato", "Pássaro"};
        int tipoEscolhido = JOptionPane.showOptionDialog(null, "Selecione o tipo de animal:", "Cadastro de Animal",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, tipos, tipos[0]);

        if (tipoEscolhido == -1) return;

        String nome = JOptionPane.showInputDialog("Digite o nome do animal:");
        if (nome == null || nome.trim().isEmpty()) return;

        double peso;
        try {
            peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do animal (em kg):"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Peso inválido! Operação cancelada.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Animal novoAnimal = null;
        if (tipoEscolhido == 0) {
            novoAnimal = new Cachorro(nome, peso);
        } else if (tipoEscolhido == 1) {
            String[] pelagens = {"Curto", "Longo"};
            int pelagemEscolhida = JOptionPane.showOptionDialog(null, "Selecione o tipo de pelagem:", "Pelagem do Gato",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, pelagens, pelagens[0]);
            String pelagem = (pelagemEscolhida == 1) ? "Longo" : "Curto";
            novoAnimal = new Gato(nome, peso, pelagem);
        } else if (tipoEscolhido == 2) {
            novoAnimal = new Passaro(nome, peso);
        }

        if (novoAnimal != null) {
            animais.add(novoAnimal);
            JOptionPane.showMessageDialog(null, nome + " cadastrado(a) com sucesso!");
        }
    }

    private void registrarServico() {
        if (animais.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum animal cadastrado no sistema ainda!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Criar vetor com os nomes dos animais cadastrados para a seleção
        String[] listaAnimais = new String[animais.size()];
        for (int i = 0; i < animais.size(); i++) {
            listaAnimais[i] = animais.get(i).getNome() + " (" + animais.get(i).getClass().getSimpleName() + ")";
        }

        String animalSelecionadoStr = (String) JOptionPane.showInputDialog(
                null, "Selecione o animal para o atendimento:", "Registrar Serviço",
                JOptionPane.QUESTION_MESSAGE, null, listaAnimais, listaAnimais[0]
        );

        if (animalSelecionadoStr == null) return;

        // Recuperar o objeto do animal correspondente
        int indexSelecionado = -1;
        for (int i = 0; i < listaAnimais.length; i++) {
            if (listaAnimais[i].equals(animalSelecionadoStr)) {
                indexSelecionado = i;
                break;
            }
        }
        Animal animal = animais.get(indexSelecionado);

        // Opções de Serviço
        String[] servicosDisponiveis = {"Banho", "Consulta"};
        int servicoEscolhido = JOptionPane.showOptionDialog(null, "Selecione o serviço desejado:", "Escolha de Serviço",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, servicosDisponiveis, servicosDisponiveis[0]);

        if (servicoEscolhido == -1) return;

        // Regra de Negócio imposta: Pássaro não aceita Banho
        if (servicoEscolhido == 0 && animal instanceof Passaro) {
            JOptionPane.showMessageDialog(null, "Erro: Pássaros não realizam o serviço de banho!", "Restrição de Serviço", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int duracao;
        try {
            duracao = Integer.parseInt(JOptionPane.showInputDialog("Digite a duração do serviço em minutos:"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Duração inválida! Operação cancelada.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Servico novoServico = null;
        if (servicoEscolhido == 0) {
            novoServico = new Banho(duracao, animal);
        } else {
            novoServico = new Consulta(duracao, animal);
        }

        servicos.add(novoServico);
        JOptionPane.showMessageDialog(null, "Serviço de " + novoServico.getDescricao() + " registrado com sucesso!");
    }

    public static void main(String[] args) {
        // Inicializa o programa
        new PetShop().iniciar();
    }
}