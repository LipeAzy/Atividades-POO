package Animais;

public abstract class animal {

    protected String nome;

    public animal(String nome){
        this.nome = nome;
    }

    abstract void emitirSom();
    abstract void mover();
}
