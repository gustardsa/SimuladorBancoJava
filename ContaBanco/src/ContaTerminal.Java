import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float saldo = 237.48f;

        System.out.println("Bem-vindo ao terminal do projeto bootcamp - Terminal Banco Virtual");
        System.out.println("Por favor fale seu nome para iniciarmos o atendimento: ");
        String clienteNome = scanner.next();
        System.out.printf("Olá Sr(a) %s.\n Para começarmos seu atendimento por favor digite o seu usuário: ", clienteNome);
        int usuario = scanner.nextInt();
        System.out.println("Agora digite o número da sua agência: ");
        String agencia = scanner.next();

        System.out.printf("Bem vindo %s, obrigado por criar uma conta em nosso banco, sua conta é [%s], agência [%s] e seu saldo [%s] já está disponivel para saque.",
        clienteNome, usuario, agencia,saldo);
    }
}
