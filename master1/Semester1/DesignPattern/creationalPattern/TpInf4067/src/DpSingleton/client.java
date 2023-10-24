package DpSingleton;

public class client {
    public static void main(String[] args) {
        System.out.println("********* singleton pattern ********");

        int som = Singleton.getInstance().somme(2, 5, 6);
        System.out.printf("la somme est %d",som);

        Singleton s1 = Singleton.getInstance(8, 3, 9);
        s1.affiche();

        Singleton s2 = Singleton.getInstance(5, 9, 4);
        s2.affiche();
    }
}
