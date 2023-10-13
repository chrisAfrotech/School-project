package DPFactory1;

public class ProduitFactory {
        public static final int TYPE_PRODUCTA1 = 1;
        public static final int TYPE_PRODUCTA2 = 2;
         public static final int TYPE_PRODUCTA3 = 3;

        public ProduitA getProduitA(int typeProduit){
            return switch (typeProduit) {
                case TYPE_PRODUCTA1 -> new ProduitA1();
                case TYPE_PRODUCTA2 -> new ProduitA2();
                case TYPE_PRODUCTA3 -> new ProduitA3();
                default -> throw new IllegalArgumentException("Type de produit inconnu");
            };
        }
}
