public class Bolsista extends Student{
    private int bolsa;
    public Bolsista(String name, String gender, int age, int matri, String course, int bolsa) {
        super(name, gender, age, matri, course);
        this.bolsa = bolsa;
    }

    public void renewBolsa(){
        System.out.println("Renovando a bolsa de " + this.getName());
    }

    @Override
    public void payMonthlyFee(){
        System.out.println(this.getName() + " é bolsita, não precisa pagar");
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
}
