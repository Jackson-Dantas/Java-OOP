public abstract class People {
    protected String name, gender;
    protected int age, xp;

    public People(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.xp = 0;
    }

    public void xpGain(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
}
