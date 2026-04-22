package Animais;

public class vaca extends animal{

    protected int peso;

    public vaca(String nome,int peso) {
        super(nome);
        this.peso = peso;

    }

    @Override
    void emitirSom() {
        System.out.println(nome+ ": Muuuu!");
    }

    @Override
    void mover() {
        System.out.println(nome+ ": Vagando pelo pasto");

    }
}
