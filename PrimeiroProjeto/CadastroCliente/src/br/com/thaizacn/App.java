package br.com.thaizacn;

import javax.swing.JOptionPane;

import br.com.thaizacn.dao.ClienteMapDAO;
import br.com.thaizacn.dao.IClienteDAO;
import br.com.thaizacn.domain.Cliente;

/**
 * @author thaizacn
 */
public class App {

    private static IClienteDAO iClienteDAO;

    public static void main(String[] args) {
        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(null,
                "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair",
                "Cadastro", JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcao)) {
            if ("".equals(opcao)) {
                sair();
            }
            opcao = JOptionPane.showInputDialog(null,
                    "Opção inválida digite 1 para cadastro, 2 para consulta, 3 para exclusão, 4 para alteração ou 5 para sair",
                    "Green Dinner", JOptionPane.INFORMATION_MESSAGE);
        }

        while (isOpcaoValida(opcao)) {
            if (isOpcaoSair(opcao)) {
                sair();
            } else if (isCadastro(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados do cliente separados por vígula, conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade e Estado",
                        "Cadastrar cliente", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            } else if (isConsultar(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite apenas os números do CPF que deseja consultar.",
                        "Consultar cliente", JOptionPane.INFORMATION_MESSAGE);
                consultar(dados);
            } else if (isExcluir(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o CPF do cliente.",
                        "Excluir cliente", JOptionPane.INFORMATION_MESSAGE);
                excluir(dados);
            } else {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados do cliente separados por vígula, conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade e Estado.",
                        "Alterar cliente", JOptionPane.INFORMATION_MESSAGE);
                alterar(dados);
            }
            opcao = JOptionPane.showInputDialog(null,
                    "Digite 1 para cadastro, 2 para consulta, 3 para exclusão, 4 para alteração ou 5 para sair",
                    "Green Dinner", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void alterar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2], dadosSeparados[3], dadosSeparados[4], dadosSeparados[5], dadosSeparados[6]);
        iClienteDAO.alterar(cliente);
    }

    private static void excluir(String dados) {
        iClienteDAO.excluir(Long.parseLong(dados));
        JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso: ", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void consultar(String dados) {
        //Validar se foi passado somente o cpf
        try {
            Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
            if (cliente != null) {
                JOptionPane.showMessageDialog(null, "Cliente encontrado: " + cliente.toString(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado.", "Ops...", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas os números do CPF.", "Erro!", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");
        // Validar se todos os daddos necessários foram incluídos durante o cadastro
        try {
            Cliente cliente = new Cliente(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2], dadosSeparados[3], dadosSeparados[4], dadosSeparados[5], dadosSeparados[6]);
            Boolean isCadastrado = iClienteDAO.cadastrar(cliente);
            if (Boolean.TRUE.equals(isCadastrado)) {
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso ", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Cliente já se encontra cadastrado", "Ops...", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Por gentileza, digite todos os campos do cadastro, conforme exemplo.", "Erro!", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isCadastro(String opcao) {
        return "1".equals(opcao);
    }

    private static boolean isConsultar(String opcao) {
        return "2".equals(opcao);
    }

    private static boolean isExcluir(String opcao) {
        return "3".equals(opcao);
    }

    private static boolean isOpcaoSair(String opcao) {
        return "5".equals(opcao);
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null, "Até logo!", "Sair", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isOpcaoValida(String opcao) {
        return "1".equals(opcao) || "2".equals(opcao)
                || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao);
    }
}
