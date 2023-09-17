public class Teacher extends People {
    private String speciallity;
    private double compensation;

    public Teacher(String name, String gender, int age) {
        super(name, gender, age); //o super irá invocar o constructor da SuperClass
    }

    public double increaseCompensation(double increase){
        return this.compensation += increase;
    }

    //special methods;
    public String getSpeciallity() {
        return speciallity;
    }

    public void setSpeciallity(String speciallity) {
        this.speciallity = speciallity;
    }

    public double getCompensation() {
        return compensation;
    }

    public void setCompensation(double compensation) {
        this.compensation = compensation;
    }
}
