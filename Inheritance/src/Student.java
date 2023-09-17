/*
* The Student Class is inheritance with specialization, because
* create new instance fields and methods specified of class Student
* So Student Class is specialization of People Class
*
*/
public class Student extends People {
    private int matriculation;
    private String course;
    public Student(String name, String gender, int age, int matri, String course) {
        super(name, gender, age);
        this.matriculation = matri;
        this.course = course;
    }

    public void payMonthlyFee(){
        System.out.println("Pay montly tuition of Student (Pagando Mensalidade do Aluno)");
    }

    //Special Methods
    public int getMatriculation() {
        return matriculation;
    }

    public void setMatriculation(int matriculation) {
        this.matriculation = matriculation;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }


}
