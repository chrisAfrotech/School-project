package DpFactory2;

    //Fabrique abstraite
public abstract class ProduitFactory {
        public ProduitA getProduitA(){
            return createProduitA();
        }

        protected abstract ProduitA createProduitA();
    }
