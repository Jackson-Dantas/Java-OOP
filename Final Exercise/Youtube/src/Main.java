import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Video [] v = {new Video("Alegria"), new Video("Sadness"), new Video("UnHappy")};

        Gafanhoto jean = new Gafanhoto("Jão", "Non-Binary", 23, "@bynarizinha");

        Visualization vis = new Visualization(jean, v[0]);
        Visualization visOne = new Visualization(jean, v[1]);
        Visualization visTwo = new Visualization(jean, v[1]);
        visOne.rate(20);
        //System.out.println(vis.toString());
        //System.out.println(v[1].toString());

        //---------++++++ EXERCISE OF ARRAY TO REMEMBER, BUT NOTHING ABOUT POLYMORPH TOPIC+++++++----
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Product[] products = new Product[n];

        for (int i = 0; i < products.length; i++) {
            System.out.println("Digite o nome do Produto: ");
            String name = sc.next();
            System.out.println("Digite o Preço: ");
            double price = sc.nextDouble();
            products[i] = new Product(name, price);
        }

        double sumPrices = 0;

        for (Product j: products) {
            sumPrices += j.getPrice();
        }

        double average = sumPrices/n;

        System.out.printf("Average Price of Produts = %.2f", average);

    }
}