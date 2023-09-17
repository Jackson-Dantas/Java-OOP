import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Jorge", "Female", 22, 1245, "Antropology");
        Teacher teacher = new Teacher("Alberto", "Male", 45);
        Staff staff = new Staff("Rick", "Agender", 38);

        /*
        student.setCourse("Software Engineer");
        System.out.print(student.toString());
        System.out.format("\n O curso do aluno é %s", student.getCourse());
        */

        Bolsista bolsista = new Bolsista("Rodrigues", "Agender", 28, 45687, "ADM", 1245);

        student.payMonthlyFee();
        bolsista.payMonthlyFee();
    }
}