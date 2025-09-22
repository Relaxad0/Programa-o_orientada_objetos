public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O carro " + marca + " " + modelo + " (" + ano + ") foi ligado.");
        } else {
            System.out.println("O carro " + marca + " " + modelo + " já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O carro " + marca + " " + modelo + " foi desligado.");
        } else {
            System.out.println("O carro " + marca + " " + modelo + " já está desligado.");
        }
    }

    public static void main(String[] args) {
        Carro c1 = new Carro("Toyota", "Corolla", 2020);
        c1.ligar();
        c1.desligar();
        c1.desligar();
    }
}