import java.util.Scanner;

public class ContaTerminal {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Olá! Seja Bem Vindo! Ficamos felizes pelo seu interesse em abrir uma conta conosco.");
        System.out.println("Para começarmos, digite por favor o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite a sua agência: ");
        String agencia = sc.nextLine();
        System.out.println("Agora, digite o número da sua conta: ");
        Integer conta = sc.nextInt();
        System.out.println("E por último, digite o valor que estará depositando em sua conta: ");
        Double saldo = sc.nextDouble();

        System.out.println("Pronto! " + nome + " sua conta foi aberta com sucesso! Sua agência é " + agencia + ", conta " + conta + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}
