public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double calcularDesconto(double percentual) {
        return preco - (preco * percentual / 100);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public static void main(String[] args) {
        Produto p = new Produto("Camiseta", 100);

        double precoComDesconto = p.calcularDesconto(20);

        System.out.println("Produto: " + p.getNome());
        System.out.println("Preço original: " + p.getPreco());
        System.out.println("Preço com 20% de desconto: " + precoComDesconto);
    }
}