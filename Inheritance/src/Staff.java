public class Staff extends People{
    private String role;
    private boolean working;
    public Staff(String name, String gender, int age) {
        super(name, gender, age);
    }

    public void changeWork(){
        this.setWorking(!this.isWorking());
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }
}
