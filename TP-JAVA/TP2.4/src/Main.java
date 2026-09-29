public class TP2_4 {

    public static void main(String[] args) {

        // 1. Déclarer la ligne météo
        String ligneMeteo = "25.5,70,1012.3";

        // 2. Diviser la chaîne en tableau de chaînes
        String[] valeurs = ligneMeteo.split(",");

        // 3. Parser chaque élément dans le type approprié

        try {

            // Température en double
            double temperature = Double.parseDouble(valeurs[0]);

            // Humidité en int
            int humidite = Integer.parseInt(valeurs[1]);

            // Pression en double
            double pression = Double.parseDouble(valeurs[2]);


            // Afficher les valeurs
            System.out.println("Température : " + temperature + " °C");
            System.out.println("Humidité : " + humidite + " %");
            System.out.println("Pression : " + pression + " hPa");


            // 4. Calculs

            // Conversion Celsius → Fahrenheit
            double temperatureFahrenheit =
                    (temperature * 9 / 5) + 32;

            System.out.println("Température en Fahrenheit : "
                    + temperatureFahrenheit + " °F");


            // Indice de confort
            double indiceConfort =
                    (temperature * humidite) / 100;

            System.out.println("Indice de confort : "
                    + indiceConfort);


            // 6. Bonus : moyenne glissante sur 3 mesures

            double temp1 = 24.4;
            double temp2 = 26.0;
            double temp3 = 25.5;

            double moyenne =
                    (temp1 + temp2 + temp3) / 3;

            System.out.println("Moyenne des 3 températures : "
                    + moyenne);

        } catch (NumberFormatException e) {

            // Gestion des données mal formées
            System.out.println(
                    "Erreur : les données sont mal formées."
            );
        }
    }
}