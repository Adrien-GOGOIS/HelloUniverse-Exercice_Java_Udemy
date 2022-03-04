public class VaisseauDeGuerre extends Vaisseau {
/*    static String arme1 = "Lasers photoniques";
    static String arme2 = "Canon ionique";
    static String arme3 = "Torpille nucléaire";
    */
    public void attaque(Vaisseau vaisseauAttaque, String arme, int duree) {
        System.out.println("Un " + type + " attaque un " + vaisseauAttaque.type + " en utilisant " + arme + " pendant " + duree + " minutes");
        vaisseauAttaque.resistanceDuBouclier -= duree;
        vaisseauAttaque.blindage = vaisseauAttaque.blindage/ 2;
    }
}
