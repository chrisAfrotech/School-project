package DpSingleton;

public final class Singleton {
    private static Singleton instance = null;
    private int x;
    private int y;
    private int z;
    private Singleton()
    {
        super();
    }
    // un autre constructeur.
        private Singleton(int x, int y, int z)
        {
            this.x=x;
            this.y=y;
            this.z=z;
        }
    // Méthode renvoyant une instance de la classe Singleton.
    public static Singleton getInstance()
    {
        if (instance == null)
            {
                instance = new Singleton();
            }
        return instance;
    }

    // Méthode renvoyant une instance de la classe Singleton
    public static Singleton
    getInstance(int x, int y, int z)
    {
        if (instance == null)
        {
            instance = new Singleton(x, y, z);
        }
        return instance;
    }
    // D'autres méthodes classiques et non "static".
    public int somme(int x, int y, int z)
    {
        return x+y+z;
    }
    public float moyenne(int x, int y, int z)
    {
        final int divider = 3;
        return somme(x, y, z)/divider;
    }
    public void affiche()
    {
        System.out.println("\nJe suis une instance mes valeurs sont : x = "
                + this.x + " et y = "  +this.y + " et z = " + this.z);
    }
//    redefinir la méthode clone pour empêcher son utilisation
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
