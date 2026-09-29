public class Main {
    public static void main(String[] args) {

        // Déclaration des variables
        double nombre1 = 15.0;
        double nombre2 = 4.0;

        // Opérations
        //ADD
        double addition = nombre1 + nombre2;
        //SOUS
        double soustraction = nombre1 - nombre2;
        //MUL
        double multiplication = nombre1 * nombre2;
        //DV
        double division = nombre1 / nombre2;
        //MODULO
        double modulo = nombre1 % nombre2;

        // Affichage des résultats
        System.out.printf("Addition : %.2f%n", addition);
        System.out.printf("Soustraction : %.2f%n", soustraction);
        System.out.printf("Multiplication : %.2f%n", multiplication);
        System.out.printf("Division : %.2f%n", division);
        System.out.printf("Modulo : %.2f%n", modulo);

        // Test de la précédence
        double resultat1 = nombre1 + nombre2 * 2;
        double resultat2 = (nombre1 + nombre2) * 2;

        System.out.println("Résultat 1 : " + resultat1);
        System.out.println("Résultat 2 : " + resultat2);

        // Incrémentation
        int a = 10;

        System.out.println("a++ : " + a++);
        System.out.println("++a : " + ++a);
        double centimetres = 254.0;
        double pouces = centimetres / 2.54;
        System.out.println("Pouces : " + pouces);
        int poucesEntient =( int ) pouces;
        System.out.println("Pouces en int : " + poucesEntiers);
       
    }
}
