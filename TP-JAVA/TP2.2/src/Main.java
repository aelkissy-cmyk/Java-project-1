public class TP2_2 {

    public static void main(String[] args) {

        // 1. Conversion de centimètres en pouces
        double centimetres = 254.0;

        double pouces = centimetres / 2.54;
        System.out.println("Valeur en double : " + pouces);

        int poucesInt = (int) pouces;
        System.out.println("Valeur en int : " + poucesInt);


        // 2. Arrondir avec Math.round() avant de caster en long
        long poucesArrondis = Math.round(pouces);

        System.out.println("Valeur arrondie : " + poucesArrondis);
        System.out.println("Valeur précédente : " + poucesInt);


        // 3. Calcul du total avec float et int
        float prixArticle = 12.99f;
        int quantite = 3;

        double total = prixArticle * quantite;

        System.out.printf("Total = %.2f%n", total);


        // 4. Conversion d'un grand int en byte
        int grandNombre = 2_000_000_000;

        byte petitNombre = (byte) grandNombre;

        System.out.println("Grand nombre : " + grandNombre);
        System.out.println("Après conversion en byte : " + petitNombre);
    }
}