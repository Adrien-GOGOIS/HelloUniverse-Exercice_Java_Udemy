public class Planete {
    // PROPRIETE STATIQUE
    static String forme = "sphérique";
    static int nbPlanetesDecouvertes = 0;

    // PROPRIETE DE PLANETE
    String nom;
    String matiere;
    long diametre;

    int totalVisiteurs;
    String vaisseauPresent;

    // Propriété encapsulée Atmosphere
    Atmosphere atmosphere;

    // CONSTRUCTEUR
    Planete(String nom) {
        this.nom = nom;
        nbPlanetesDecouvertes++;
        System.out.println("Nouvelle planète découvertes ! --> " + this.nom + ". Nous en sommes à " + nbPlanetesDecouvertes);
    }

    // METHODE STATIQUE
    static void expansion(double distance) {
        if (distance < 14000000000d) {
            System.out.println("Olala mais c'est super rapide !");
        } else {
            System.out.println("Je rêve ou c'est plus rapide que la lumière ?!");
        }
    }

    public void revolution(int angle) {
        int tour = angle / 360;
        System.out.println(this.nom + " a effectué " + tour + " tours complets autour de son étoile");
    }

    public void rotation(int angle) {
        int tour = angle / 360;
        System.out.println(this.nom + " a effectué " + tour + " tours complets autour d'elle même");
    }


    public void accueillirVaisseau(Vaisseau vaisseau) {
        totalVisiteurs += vaisseau.nombrePassagers;
        if (vaisseauPresent == null) {
            System.out.println("Le vaisseau " + vaisseau.type + " a accosté!");
        } else {
            System.out.println("Le vaisseau " + vaisseau.type + " a accosté! Le vaisseau " + vaisseauPresent + " vient de partir.");
        }
        vaisseauPresent = vaisseau.type;
        System.out.println("Il y a actuellement " + totalVisiteurs + " visiteurs sur la planète");
    }

}
