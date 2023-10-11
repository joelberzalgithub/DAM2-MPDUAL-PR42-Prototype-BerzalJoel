import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Electrodomestic> llista = new ArrayList<>();
        List<Electrodomestic> llistaCopy = new ArrayList<>();

        Rentadora rentadora_1 = new Rentadora();
        rentadora_1.nom = "Rentadora Cecotec";
        rentadora_1.color = "Negre";
        rentadora_1.preu = 279.90;
        rentadora_1.marca = "Cecotec";
        rentadora_1.eficiencia = "D";
        rentadora_1.revolucions = 1200;
        rentadora_1.soroll = 10;
        llista.add(rentadora_1);

        Rentadora rentadora_2 = new Rentadora();
        rentadora_2.nom = "Rentadora CHiQ";
        rentadora_2.color = "Blanca";
        rentadora_2.preu = 349.00;
        rentadora_2.marca = "CHiQ";
        rentadora_2.eficiencia = "A";
        rentadora_2.revolucions = 1000;
        rentadora_2.soroll = 20;
        llista.add(rentadora_2);

        Nevera nevera_1 = new Nevera();
        nevera_1.nom = "Nevera Universalblue";
        nevera_1.color = "Blanca";
        nevera_1.preu = 547.65;
        nevera_1.marca = "UniversalBlue";
        nevera_1.eficiencia = "B";
        nevera_1.frigories = 409;
        nevera_1.soroll = 42;
        llista.add(nevera_1);

        Nevera nevera_2 = new Nevera();
        nevera_2.nom = "Nevera RT62K7005SL/ES";
        nevera_2.color = "Gris";
        nevera_2.preu = 2381.00;
        nevera_2.marca = "Samsung";
        nevera_2.eficiencia = "A";
        nevera_2.frigories = 620;
        nevera_2.soroll = 42;
        llista.add(nevera_2);

        Forn forn_1 = new Forn();
        forn_1.nom = "Forn Hisense";
        forn_1.color = "Gris";
        forn_1.preu = 269.99;
        forn_1.marca = "Hisense";
        forn_1.eficiencia = "C";
        forn_1.temperatura = 300;
        forn_1.autoneteja = "Sí";
        llista.add(forn_1);

        Forn forn_2 = new Forn();
        forn_2.nom = "Forn Bosch";
        forn_2.color = "Blau";
        forn_2.preu = 369.11;
        forn_2.marca = "Bosch";
        forn_2.eficiencia = "B";
        forn_2.temperatura = 250;
        forn_2.autoneteja = "Sí";
        llista.add(forn_2);

        // Clonar la llista
        for (Electrodomestic obj : llista) {
            llistaCopy.add(obj.clone());
        }

        System.out.println("Comparar la mateixa llista:\n");
        for (int i = 0; i < llista.size(); i++) {
            compare(i, llista.get(i), llista.get(i));
        }

        System.out.println("\n\nComparar amb la llista clonada:\n");
        for (int i = 0; i < llista.size(); i++) {
            compare(i, llista.get(i), llistaCopy.get(i));
        }

        System.out.println("\n\nComparar amb la llista clonada però invertida:\n");
        for (int i = 0; i < llista.size(); i++) {
            compare(i, llista.get(i), llistaCopy.get(llista.size() - i - 1));
        }
    }

    static void compare (int i, Electrodomestic a, Electrodomestic b) {
        if (a == b) {
            System.out.println(i + ": Els electrodomestics són el mateix objecte");
        } else {
            System.out.print(i + ": Els electrodomestics són objectes diferents - ");
            if (a.equals(b)) {
                System.out.println(i + ": Els electrodomestics són idèntics");
            } else {
                System.out.println(i + ": Els electrodomestics NO són idèntics");
            }
        }
    }
}