public class Fighter {
    private String name, nationality, category;
    private double height,weight;
    private int victories, defeats, draw, age;

    public Fighter(String name, String nationality, int age, double height, double weight, int victories, int defeats, int draw) {
        //this.name = name;
        this.setName(name);
        //this.nationality = nationality;
        this.setNationality(nationality);
        //this.age = age;
        this.setAge(age);
        //this.height = height;
        this.setHeight(height);
        //this.weight = weight;
        this.setWeight(weight);
        //this.setCategory(weight);
        //this.victories = victories;
        this.setVictories(victories);
        //this.defeats = defeats;
        this.setDefeats(defeats);
        //this.draw = draw;
        this.setDraw(draw);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        this.setCategory(weight);
    }

    public String getCategory() {
        return category;
    }

    private void setCategory(double weight) {
        if(weight < 52.7){
            this.category = "Peso Inválido, impossível classificar categoria";
        } else if(weight < 72.3){
            this.category = "Peso Leve";
        } else if (weight < 83.9) {
            this.category = "Peso médio";
        } else if (weight <= 120) {
            this.category = "Peso Pesado";
        }else{
           this.category = "Muito pesado, impossível categorizar";
        }

        // 52 -------------72---------88-------------->

    }

    public int getVictories() {
        return victories;
    }

    public void setVictories(int victories) {
        this.victories = victories;
    }

    public int getDefeats() {
        return defeats;
    }

    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    //Methods of Class
    public void introduce(){
        System.out.printf("Chegou a hora! Apresentamos o lutador %s \n Diretamente de %s, com %d, pesando %.1f " +
                        "\n com %d vitórias \n e %d derrotas, \n e com %d empates \n\n",
        this.getName(), this.getNationality(), this.getAge(), this.getWeight(), this.getVictories(), this.getDefeats(),
        this.getDraw());
    }
    public void status(){
        System.out.printf("%s é um peso %s e ganhou %d vezes, perdeu %d vezes e empatou %d vezes ", this.getName(), this.getCategory(),
        this.getVictories(), this.getDefeats(), this.getDraw());
    }
    public void winFight(){
        this.setVictories(this.getVictories()+1);
    }
    public void defeatFight(){
        this.setDefeats(this.getDefeats()+1);
    }
    public void drawFight(){
        this.setDraw(this.getDraw()+1);
    }
}
