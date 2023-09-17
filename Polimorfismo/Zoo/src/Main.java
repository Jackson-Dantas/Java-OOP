
public class Main {
    public static void main(String[] args) {

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.alimentar();
        m.locomover();
        m.emitirSom();

        p.alimentar();
        p.locomover();
        p.emitirSom();
    }
}