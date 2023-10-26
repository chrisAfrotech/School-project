package DpBuilder;

public class MonteurPizzaReinne extends MonteurPizza {
    public void monterPate() {
        pizza.setPate("croisée");
    }
    public void monterSauce() {
        pizza.setSauce("douce");
    }
    public void monterGarniture() {
        pizza.setGarniture("jambon+champignon");
    }
}
