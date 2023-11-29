import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nomeCliente = "Davi Bezerra Marques";
        String tipoDeConta = "Corrente";
        double dinheiroEmCaixa = 1000;
        int operacao = 0;
//        String sair = "sair";

        System.out.println("-----------------------------------------");
        System.out.println("Nome do Cliente: "+nomeCliente);
        System.out.println("Tipo de conta: "+tipoDeConta);
        System.out.println("R$ "+dinheiroEmCaixa);
        System.out.println("-----------------------------------------");

        while (operacao != 4) {
            System.out.println("1 - Consultar dados");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            System.out.println("Digite a operação que deseja realizar: ");
            operacao = leitura.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("Nome do Cliente: "+nomeCliente);
                    System.out.println("Tipo de conta: "+tipoDeConta);
                    System.out.println("R$ "+dinheiroEmCaixa);
                    break;
                case 2:
                    System.out.println("Quanto você deseja receber? ");
                    double valorAReceber = leitura.nextDouble();
                    dinheiroEmCaixa += valorAReceber;
                    break;
                case 3:
                    System.out.println("Quanto você deseja transferir?");
                    double valorATransferir = leitura.nextDouble();
                    if (valorATransferir > dinheiroEmCaixa){
                        System.out.println("Valor insuficiente.");
                    } else {
                        dinheiroEmCaixa -= valorATransferir;
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Número inválido");

            }

        }

        System.out.println("------------- Valor final do dia -------------");
        System.out.println("Nome do Cliente: "+nomeCliente);
        System.out.println("Tipo de conta: "+tipoDeConta);
        System.out.println("R$ "+dinheiroEmCaixa);
        System.out.println("----------------------------------------------");
        System.out.println("Obrigado(a), volte sempre!");

    }
}
