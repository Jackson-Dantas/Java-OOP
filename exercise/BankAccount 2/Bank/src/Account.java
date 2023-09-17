public class Account {

    private String tipoConta; 
    public int numConta;
    private String nomeCliente; 
    private double saldo; 

    //metódo construtor

    public Account(String tipoConta, int numConta, String nomeCliente, double saldo){
        this.setTipoConta(tipoConta);
        this.setNumConta(numConta);
        this.setNomeCliente(nomeCliente);
        this.setSaldo(saldo);
    }

    //metódos Setters e Getters
    public String getTipoConta(){
        return this.tipoConta;
    }

    public void setTipoConta(String tipoConta){
        this.tipoConta = tipoConta; 
    }

    public int getNumConta(){
        return this.numConta;
    }

    public void setNumConta(int numConta){
        this.numConta = numConta; 
    }

    public String getNomeCliente(){
        return this.nomeCliente; 
    }

    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo(){
        return this.saldo;  
    }

    public void setSaldo( double saldo){
        this.saldo = saldo; 
    }

    // methods/function of Account
    public String status(){
        return "A conta é do tipo" + this.getTipoConta() 
                + " O número da conta " + this.getNumConta()
                + " Nome  Cliente " + this.getNomeCliente()
                + " O Saldo da Conta é " + this.getSaldo();
    }

    public double consultaSaldo(){
        return this.getSaldo(); 
    }

    public void deposit(double deposit){
        this.setSaldo(this.getSaldo() + deposit); 
    }

    public void withdraw(double withdraw){
        if(this.getSaldo() < withdraw){
            System.out.println("Saldo Insuficiente");
        } else{
            this.setSaldo(this.getSaldo() - withdraw);
        }
    }
}
