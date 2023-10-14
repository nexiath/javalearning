import java.util.Random;

public class Equide {
    public int endurance;
    public int force;
    public int esperanceVie;
    static int F = 1;
    static int M = 0;
    public Random loto;

    public int getGenre(){
        return F;
    }

    public Equide(){
        loto = new Random();
        if(getGenre() == M){
            this.force = 6;
            this.endurance = 4;
        } else {
            this.force = 4;
            this.endurance = 6;
        }
        this.force += 2 - loto.nextInt(5);
        this.endurance += 2 - loto.nextInt(5);

        this.esperanceVie = 20;
    }
}
