public class Gafanhoto extends People{
    private String login;
    private int watchTotal;

    public Gafanhoto(String name, String gender, int age, String login) {
        super(name, gender, age);
        this.login = login;
        this.watchTotal = 0;
    }
    public void ViewSum(){
        
    }
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getWatchTotal() {
        return watchTotal;
    }

    public void setWatchTotal(int watchTotal) {
        this.watchTotal = watchTotal;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +
                "login='" + login + '\'' +
                ", watchTotal=" + watchTotal +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", xp=" + xp +
                '}';
    }
}
