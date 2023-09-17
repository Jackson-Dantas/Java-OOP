
/*
* Quando uma subClasse apenas herda instance fields and methods,
* without create new things, this known like: pool inheritance or implementation class
* Herança pobre e Classe de implementação
* */
public class Visitor extends People{
    public Visitor(String name, String gender, int age) {
        super(name, gender, age);
    }
}
