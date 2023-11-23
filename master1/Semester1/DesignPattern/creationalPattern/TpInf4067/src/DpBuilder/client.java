package DpBuilder;

public class client {
    public static void main(String[] args) {
        System.out.println("**************** Builder pattern ********************");
        Serveur serveur = new Serveur();
        MonteurPizza MonteurPizzaLocale = new MonteurPizzaLocale();
        MonteurPizza  MonteurPizzaPiquante = new MonteurPizzaPiquante();
        MonteurPizza MonteurPizzaReinne = new MonteurPizzaReinne();

        serveur.setMonteurPizza( MonteurPizzaLocale);
        serveur.constructPizza();

        Pizza pizza = serveur.getPizza();
        System.out.println(pizza);

        serveur.setMonteurPizza( MonteurPizzaPiquante);
        serveur.constructPizza();

        pizza = serveur.getPizza();
        System.out.println(pizza);

        serveur.setMonteurPizza( MonteurPizzaPiquante);
        serveur.constructPizza();

        pizza = serveur.getPizza();
        System.out.println(pizza);
    }
}
