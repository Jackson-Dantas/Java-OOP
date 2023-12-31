public class ControleRemoto implements Controlador {

    private int volume; 
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {

       System.out.println("A TV está " + getLigado());
       System.out.println("Esta tocando " + this.getTocando());
       System.out.println("O volume da TV é " + getVolume());

       for(int i = 0; i < this.getVolume(); i += 10){
            System.out.print("|");
       }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando o menu...");
    }

    @Override
    public void maisVolume() {
       
        if(getLigado()) {
            setVolume(getVolume() + 3);
        }
    }

    @Override
    public void menosvolume() {
       
        if(getLigado()){
            setVolume(getVolume() - 3);
        }
    }

    @Override
    public void ligarMudo() {
       if(this.getLigado() && this.getVolume() > 0){
        this.setVolume(0);
       }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !this.getTocando()){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    } 
}
