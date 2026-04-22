package Animais;

public class papagaio extends animal{

    private String cor;

    public papagaio(String nome, String cor) {
        super(nome);
        this.cor = cor;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome+ " diz: Curupaco!");
    }

    @Override
    public void mover() {
        System.out.println(nome+ " está Voando pelas Copas de Arvores");
    }


}
