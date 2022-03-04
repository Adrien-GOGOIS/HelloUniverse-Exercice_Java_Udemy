public class HelloUniverse {

    public static void main(String... args) {

        // AJOUT DES PLANETES DU SYSTEME SOLAIRE
        Planete mercure = new Planete("Mercure");
        mercure.matiere = "tellurique";
        mercure.diametre = 4880;

        Planete venus = new Planete("Venus");
        venus.matiere = "tellurique";
        venus.diametre = 12100;

        Planete terre = new Planete("Terre");
        terre.diametre = 12756;
        terre.matiere = "tellurique";

        Planete mars = new Planete("Mars");
        mars.matiere = "tellurique";
        mars.diametre = 6792;

        Planete saturne = new Planete("Saturne");
        saturne.matiere = "gazeuse";
        saturne.diametre = 120536;

        Planete uranus = new Planete("Uranus");
        uranus.matiere = "gazeuse";
        uranus.diametre = 51118;

        Planete neptune = new Planete("Neptune");
        neptune.matiere = "gazeuse";
        neptune.diametre = 49532;

        Planete jupiter = new Planete("Jupiter");
        jupiter.matiere = "gazeuse";
        jupiter.diametre = 142984;

        // Planete X = new Planete();

        // APPEL DES METHODES DE LA CLASSE PLANETE
        neptune.revolution(-3542);
        mars.rotation(-684);
        venus.rotation(1250);

        // SURCHARGE DE METHODE
        //  mars.accueillirVaisseau(8);
        // mars.accueillirVaisseau(Vaisseau );

        // APPEL PROPRIETE ENCAPSULEE DE PLANETE VENANT D'ATMOSPHERE
        // On crée un nouvelle atmosphère :
        Atmosphere atmosphereUranus = new Atmosphere();
        atmosphereUranus.argon = 25f;
        atmosphereUranus.hydrogene = 12f;
        atmosphereUranus.dioxydeCarbone = 50f;
        atmosphereUranus.azote = 13f;
        // et on l'associe à Uranus :
        uranus.atmosphere = atmosphereUranus;

        // Objet en paramètre :

       /* Vaisseau fregate = new Vaisseau();
        fregate.type = "FREGATE";
        fregate.nombrePassagers = 9;

        mars.accueillirVaisseau(fregate);

        Vaisseau croiseur = new Vaisseau();
        croiseur.type = "CROISEUR";
        croiseur.nombrePassagers = 42;

        mars.accueillirVaisseau(croiseur);*/

        // PROPRIETE STATIQUE DE PLANETE
        System.out.println("La forme d'une planète est " + Planete.forme);
        System.out.println("La forme de " + mars.nom + " est " + mars.forme);

        // METHODE STATIQUE
        Planete.expansion(10500000000d);
        Planete.expansion(14500000000d);

        // HERITAGE

        // Déclaration de 2 vaisseaux
        VaisseauDeGuerre chasseur = new VaisseauDeGuerre();
        chasseur.type = "Chasseur";
        chasseur.blindage = 156;
        chasseur.resistanceDuBouclier = 2;

        VaisseauCivil vaisseauMonde = new VaisseauCivil();
        vaisseauMonde.type = "Vaisseau-Monde";
        vaisseauMonde.blindage = 4784;
        vaisseauMonde.resistanceDuBouclier = 30;

        // Activation des boucliers des vaisseaux
        chasseur.activerBouclier();
        vaisseauMonde.activerBouclier();
        // Attaque du chasseur
        chasseur.attaque(vaisseauMonde, "lasers photoniques", 30);
        // Désactivation bouclier vaisseau monde
        vaisseauMonde.desactiverBouclier();
        System.out.println("Il reste au vaisseau-monde " + vaisseauMonde.resistanceDuBouclier + " minute(s) de bouclier");
        System.out.println("Il lui reste " + vaisseauMonde.blindage + " points de bouclier");
    }
}
