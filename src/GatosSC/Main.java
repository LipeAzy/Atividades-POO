package GatosSC;

public class Main {
    public static void main(String[] args) {
     Gato sushi = new Gato();
     Gato Cachaça = new Gato();

     sushi.nome = "sushi";
     sushi.qtdComida = 3;
     sushi.sono = false;

     Cachaça.nome = "Cachaça";
     Cachaça.qtdComida = 1;
     Cachaça.sono = false;

     sushi.comer();
     sushi.dormir();

     Cachaça.comer();
     Cachaça.comer();

    }
}
