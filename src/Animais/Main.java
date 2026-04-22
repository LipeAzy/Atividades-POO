package Animais;

public class Main {
    public static void main(String[] args){

        animal a1 = new papagaio("José","Azul");
        animal a2 = new vaca("Mimosa",180);

        a1.emitirSom();
        a1.mover();

        System.out.println();

        a2.emitirSom();
        a2.mover();

    }
}
