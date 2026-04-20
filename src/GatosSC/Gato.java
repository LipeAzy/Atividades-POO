package GatosSC;

public class Gato {
    public String nome;
    public int qtdComida;
    public boolean sono;

    void dormir() {
        sono = false;
        System.out.println(nome + " Dormiu!");
    }

    void comer() {
        if (qtdComida > 0) {
            qtdComida -= 1;
            System.out.println(nome + " comeu. Comida restante: " + qtdComida);
        } else System.out.println(nome + " está sem comida!");
    }
}