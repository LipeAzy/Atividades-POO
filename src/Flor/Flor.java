package Flor;

public class Flor {
    public String nome;
    public String cor;
    public boolean perfume;

    void mostrarDados() {
        System.out.println("nome: " + nome);
        System.out.println("Cor: " + cor);
        if(perfume){
            System.out.println("Possui perfume: sim");
        }
        else {
            System.out.println("Possui perfume: não");
        }
    }
}
