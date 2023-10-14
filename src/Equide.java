import java.util.Random;

public class Equide {
     static int M=0; static int F=1;
 int force; int endurance; int esperanceVie; int age;
 static Random loto;
 public int getGenre() { return F; } // retourne 1 par défaut
 public Equide() {
 loto = new Random();
 if (getGenre() == M) {
 force = 6; endurance = 4;
 }
 else {
 force = 4; endurance = 6;
 }
 force += 2 - loto.nextInt(5); // cette fois c'est +=
 endurance += 2 - loto.nextInt(5); // cette fois c'est +=
 esperanceVie = 20;
 age = 0;
 }
}
