package DpFactory2;

public class ProduitFactory2 extends ProduitFactory {
    protected ProduitA createProduitA(){
        return new ProduitA2();
    }
}
