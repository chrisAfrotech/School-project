package DpBuilder;

public class Serveur {
    private MonteurPizza monteurPizza;

    public void setMonteurPizza(MonteurPizza mp){
        monteurPizza = mp;
    }
    public Pizza getPizza(){
        return monteurPizza.getPizza();
    }
    public void constructPizza(){
        MonteurPizza.creerNouvellePizza();
        MonteurPizza.monterPate();
        MonteurPizza.monterSauce();
        MonteurPizza.monterGarniture();


    }

}
