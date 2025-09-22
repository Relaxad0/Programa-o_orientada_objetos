public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
        salario += salario * percentual / 100;
        System.out.println("Novo salário de " + nome + " (" + cargo + "): R$" + salario);
    }

    public static void main(String[] args) {
        Funcionario f = new Funcionario("Ywrguem", "Gerente", 10000);
        f.aumentarSalario(10);
    }
}