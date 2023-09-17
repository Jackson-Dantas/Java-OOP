
public class Main {
    public static void main(String[] args) {
        People[] firstList = new People[3];
        Book[] libList = new Book[2];

        firstList[0] = new People("Jhon Cenna", 25, "Famale");
        firstList[1] = new People("Gaby Gus", 29, "Male");
        firstList[2] = new People("Andrick", 33, "Agender");

        libList[0] = new Book("Fire and Blood", "George R. R. Martin", 562, false, firstList[0]);
        libList[1] = new Book("Harry Potter - Fenix Order", "J. K. Rowling", 381, false, firstList[2]);

        System.out.println(libList[0].toString());
    }
}