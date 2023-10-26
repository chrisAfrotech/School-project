package DpBuilder;

public class Serveur {
    private MonteurPizza monteurPizza;

    public void setMonteurPizza(MonteurPizza mp){
        MonteurPizza = mp;
    }
    public Pizza getPizza(){
        return MonteurPizza.getPizza();
    }
    public void contructPizza(){
        MonteurPizza.createNewPizzaProduct();
        MonteurPizza.monterPate();
        MonteurPizza.montersauce();
        MonteurPizza.monter();


    }


}
