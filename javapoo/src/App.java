public class App {
    public static void main(String[] args) throws Exception {

/*Após criação da classe ela pode ser instanciada
 a Syntax para isso é: 
NomeDaClasse NomeObjeto = new NomeDaClasse(); */    

    Caneta c1 = new Caneta();

/* com objeto criado, basta atribuir valores 
    aos atributos e metodos:  nomeObjeto.Nomeatribudo; 
                              nomeObjeto.Nomemetodo(); */ 

    c1.cor = "azul"; //cor é o único atributo publico da class Caneta por isso pode ser configurado diretamente

    // Os demais atributos da Class Caneta são private, por isso só pode ser modificados e acessados atraves do GETTERS e SETTERS
    c1.setPonta(0.5); 
    c1.setCarga(80);
    c1.setTampada(true);;
    
        
    c1.setTampada(c1.destampar());

    System.out.println(c1.status());
 
    }
}
