package AbstractFactory;

public class ProduitFactory2 implements IproduitFactory{
    public ProduitA getProduitA(){
        return new ProduitA2();
    }
    public ProduitB getProduitB(){
        return new ProduitB2();
    }
}
