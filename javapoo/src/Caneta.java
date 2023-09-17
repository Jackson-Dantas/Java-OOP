public class Caneta {
    private String modelo; // public faz com que o código possa ser acessado diretamente por todo objeto em qualquer class e package
    public String cor;
    private double ponta; //privado só pode ser acessado dentro da própria classe (não dá para modificar diretamente um objeto) porém um metodo público criado dentro da classe pode acessar o atributo privado
    private int carga;
    private boolean tampada; // protegido permite que a child class acabe herdando esse atributo da parent class, e pode se criar um objeto dentro do mesmo pacote

    /*********************************************************************************************************************** 
    *  Há também o método constructor ou construct, Um construtor em Java é um método especial usado para inicializar objetos. 
      O construtor é chamado quando um objeto de uma classe é criado. Ele pode ser usado para definir valores iniciais 
      para atributos de objeto. Quando o objeto for criado ele já vai vier com os atributos ou METODOS DEFINIDOS.
      É a Syntax é constituida por: 
       
       public <NomedaClasse> () {
        this.NomeAtributo = ...;
        this.tampada(); 
       }

       Ou

       public <NomedaClasse> (String m, int t,...) {
        
        this.modelo = m;
        this.ponta = t;  

       }
    **************************************************************************************************************************
    */

    public Caneta () {

        this.setModelo("Blaze"); 

      }


   public String status (){

        String res;
        if(this.tampada == true){
            res = "Sim!!"; 
        } else{
            res = "Não!!"; 
        };   

        return "A Caneta tem " + this.ponta 
                + " é do modelo " + this.modelo
                + " A cor da Caneta é " + this.cor
                + " A carga está " + this.carga
                + " A Caneta está tampada? " + res;              
    }

    public void rabiscar () {
        if (this.tampada == true){

            System.out.println("Não posso rabiscaaar"); }
        
        else{

            System.out.println("Estou rabiscaaando");
        }

    }

    public boolean tampar() {
        
        return this.tampada = true;

    }

    public boolean destampar() {

        return this.tampada = false;

    }

    // Criando os metódos modificadores Getters and Setters -> Cada Atributo gera um getter e um setter

    /* 
    
    Os metodos gettes e Setters são sempre públicos, o metódo getter (pega algo) 
    por isso ele sempre retorna um valor, já o metódo setter apenas inclui/modifica um  valor/dado
    a Syntax para criação delas é: 
     
        Gett -> Public <tipo de retorno> getNomedoAtributo () { return this.NomedoAtributo; }
        Sett -> Public void setNomedoAtributo (<Tipo de dado String, Int..> nomeDaVariável) { this.NomedoAtributo = NomedaVariável; }

     */


     public String getModelo() {
        return this.modelo; 
     }

     public void setModelo(String modelo) {
        this.modelo = modelo; 
     }

     public String getCor(){
        return this.cor;
     }

     public void setCor(String cor){
        this.cor = cor; 
     }

     public double getPonta(){
        return this.ponta; 
     }

     public void setPonta(double ponta){
        this.ponta = ponta; 
     }
     
     public int getCarga(){
        return this.carga;
     }

    public void setCarga(int carga){
        this.carga = carga; 
    }

    public boolean getTampada(){
        return this.tampada;
    }

    public void setTampada(boolean tampada){
        this.tampada = tampada; 
    }
     
    

    }