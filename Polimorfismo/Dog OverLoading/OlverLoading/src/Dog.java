public class Dog extends Wolf{
    @Override
    public void makeNoising() {
        System.out.println("Au Au Au");
    }

    //Overloading (Sobrecarga)
    public void react(String statement){
        switch (statement){
            case "Te amo" -> System.out.println("Latindo e Abanando");
            case "Te odeio" -> System.out.println("Latinindo e Rosnando");
            case "Hora do papa" -> System.out.println("Latindo e Abanando");
            default -> System.out.println("Te odeio");
        }
    }
    public void react(int hour, int min){
        if(hour < 12){
            System.out.println("Abanar");
        } else if (hour >= 18) {
            System.out.println("Ignorar");
        }else{
            System.out.println("Abanar e Latir");
        }
    }

    public void react(boolean tutor){
        if(tutor){
            System.out.println("Abanar");
        }else{
            System.out.println("Rosnar");
        }
    }

    public void react (int age, double weight){

    }
}
