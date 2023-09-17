public abstract class Animal {
    protected double weight;
    protected int age, members;

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    //Special Methods
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }
}
