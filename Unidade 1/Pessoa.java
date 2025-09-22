public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void cumprimentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos!");
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa("Ywrguem", 19);
        p.cumprimentar();
    }
}
