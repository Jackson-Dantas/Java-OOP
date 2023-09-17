public class Peixe extends Animal{
    protected String corEscama;

    //**********************************Specefic Methods Class************************************
    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }

    //***************************SuperClass Methods***********************************************
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Plactom");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não emite sons");
    }
    //**********************************Special Methods**********************************************
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
