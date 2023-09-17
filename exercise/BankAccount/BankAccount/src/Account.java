public class Account {

    private String titular;
    protected String tipoConta;
    public  int accountNumber; 
    private double saldo;
    public boolean status;

    public Account() {

        this.setSaldo(0);
        this.setStatus(false); 
    }
    
// Inserindo os métodos getters e setters 

    public String getTitular () {

        return this.titular; 
    }

    public void setTitular(String t) {

        this.titular = t; 

    }

// Acessores do tipo de conta: 

    public String getTipoConta () {
    
        return this.tipoConta;
    
    }

    public void setTipoConta (String c) {

        this.tipoConta = c; 

    }

// Acessores do Account Number: 

    public int getAccountNumber() {

        return this.accountNumber; 
    }

    public void setAccountNumer(int a) {

        this.accountNumber = a; 
    }

// Acessores do Saldo:  

    public double getSaldo() {

        return this.saldo; 
    }

    public void setSaldo( double s){

        this.saldo = s; 
    }

 // Acessores Status: 
 
 public boolean getStatus() {

    return this.status; 
}

public void setStatus( boolean st){

    this.status = st; 
}
 

// Metódos da Classe

    public void abrirConta(String c) { 

        setTipoConta(c);
        setStatus(true);

        if ("CC".equals(c)) {

            setSaldo(50);


        } else {

            setSaldo(150);
        }

    }

    public void fecharConta(){ 
        

        if (this.getSaldo() == 0) {

            System.out.println("Conta Encerrada");

            setStatus(false);

        } else if (this.getSaldo() > 0) {

            System.out.println("Há saldo na conta"); 

        } else {

            System.out.println("Há débito pendente");
       }
    }

    public void depositar(double d) { 


        if (this.getStatus() == true) {

           setSaldo(this.getSaldo() + d); 
           
           System.out.println(getSaldo());

        } else {

            System.out.println("Não é possível fazer depósito");
        }


     }

   public void sacar( double d) { 

    if (getStatus() == true) {

        if (getSaldo() >= d) {

            setSaldo( getSaldo() - d);

            System.out.println(" Saque de " + d +" realizado com sucesso");
        } else { 

            System.out.println(" O saldo de " + getSaldo() + " insuficiente para o saque");

        }

    } else {

        System.out.println(" Conta Encerrada ");

    }
    
   }

    public void pagarMensal() { 

        int m;

        if (this.getStatus()) { 
            
            switch (this.getTipoConta()) {
        
            case "CC" -> {
    
                m = 12;
                System.out.println( " A mensalidade é " + m);
                

                if (this.getSaldo() > m ){
    
                    this.setSaldo(this.getSaldo() - m);
                    System.out.println( "Mensalidade paga com sucesso"); 
                } else { 
    
                    System.out.println("Saldo insuficiente para pagar mensalidade");
                }
            
            }  
    
            case "CP" -> {
    
                m = 20;
                System.out.println( " A mensalidade é " + m);
    
                
                    if (this.getSaldo() > m ){
    
                        this.setSaldo(this.getSaldo() - m);
                        System.out.println( "Mensalidade paga com sucesso"); 
                    } else { 
        
                        System.out.println("Saldo insuficiente para pagar mensalidade");
                    }
            }
       
       }  

        } else {

            System.out.println("Conta Encerrada");
        }

        
    }


    
}
