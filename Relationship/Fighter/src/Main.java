import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList <Fighter> f = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //int numberOfMembers = sc.nextInt();

        // public Fighter(String name, String nationality, int age, double height, double weight, int victories, int defeats, int draw)
        /*
        for (int i = 0; i < numberOfMembers; i++){
            System.out.print("Digite o nome: ");
            String name = sc.next();
            System.out.print("Digite a nacionalidade: ");
            String nationality = sc.next();
            System.out.print("Digite a idade: ");
            int age = sc.nextInt();
            System.out.print("Digite a altura: ");
            double height = sc.nextDouble();
            System.out.print("Digite o peso: ");
            double weight = sc.nextDouble();
            System.out.print("Digite a quantidade de vitórias: ");
            int victories = sc.nextInt();
            System.out.print("Digite quantidade derrotas: ");
            int defeats = sc.nextInt();
            System.out.print("Digite a quantidade de empates: ");
            int draw = sc.nextInt();
            f.add(new Fighter(name, nationality, age, height, weight, victories, defeats, draw));
        }
        */

        f.add(new Fighter("Erick", "USA", 22, 1.55,119, 6, 3, 0));
        f.add(new Fighter("James", "France", 25, 1.98, 96, 3, 1, 0));
        //f.get(0).status();
       //f.get(1).status();
        Fight first = new Fight();
        first.scheduleFight(f.get(0), f.get(1));
        first.fight();

    }
}