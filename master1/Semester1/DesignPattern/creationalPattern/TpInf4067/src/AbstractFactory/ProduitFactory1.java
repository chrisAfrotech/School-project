package AbstractFactory;

public class ProduitFactory1 implements IproduitFactory{
    public ProduitA getProduitA(){
        return new ProduitA1();
    }
    public ProduitB getProduitB(){
        return new ProduitB1();
    }
}
