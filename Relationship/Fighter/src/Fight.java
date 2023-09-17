import java.util.Random;

public class Fight {
    private Fighter defiant;
    private Fighter challenged;
    private int rounds;
    private boolean ok;

    //specify methods
    public void scheduleFight(Fighter defiant, Fighter challenged){
        if(defiant.getCategory().equalsIgnoreCase(challenged.getCategory()) && defiant != challenged){
            this.setOk(true);
            this.setDefiant(defiant);
            this.setChallenged(challenged);
            System.out.println("Let's Fight, baby!");
        } else{
            this.setOk(false);
            this.defiant = null;
            this.challenged = null;
            System.out.println("ERROR");
        }
    }

    public void fight(){
        if(this.isOk()){
            this.getDefiant().introduce();
            this.getChallenged().introduce();
            Random n = new Random();
            int winner = n.nextInt(3);
            switch (winner){
                case 0 -> {
                    this.getDefiant().drawFight();
                    this.getChallenged().drawFight();
                    System.out.println("Empatou");
                }
                case 1 -> {
                    this.getDefiant().winFight();
                    this.getChallenged().defeatFight();
                    System.out.println("Desefiante ganhou");
                }
                case 2 -> {
                    this.getDefiant().defeatFight();
                    this.getChallenged().winFight();
                    System.out.println("Desefiado Ganhou");
                }
            }
        }else{
            System.out.println("Fight can't happen");
        }
    }

    //special methods

    public Fighter getDefiant() {
        return defiant;
    }

    public void setDefiant(Fighter defiant) {
        this.defiant = defiant;
    }

    public Fighter getChallenged() {
        return challenged;
    }

    public void setChallenged(Fighter challenged) {
        this.challenged = challenged;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isOk() {
        return ok;
    }

    private void setOk(boolean ok) {
        this.ok = ok;
    }
}
