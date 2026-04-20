package CarroPessoa;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Fiat Uno");
        Pessoa pessoa1 = new Pessoa("Ana");

        pessoa1.usarCarro(carro1);
    }
}