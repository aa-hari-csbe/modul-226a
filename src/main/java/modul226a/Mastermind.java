package modul226a;

import java.util.Random;
import java.util.Scanner;

public class Mastermind {

    public static void main(String[] args) {
        System.out.println("Geben Sie einen versuchs Code mit vier Buchstaben aus der Menge {r, g, b, y, s, w} ein: ");
        System.out.println("Spiel beendet. Der Geheimcode war Anzahl der versuche: ");
        spielSchleife(geheimCode());


    }

    public static void spielSchleife(char[] geheimCode){
        boolean spielStatus = true;
        int[] anzahlSchwarzWeiss = new int[2];

        while (spielStatus){
            codeAbgleichen(geheimCode, benutzerEingabe());
        }
    }

    public static int[] codeAbgleichen(char[] geheimCode, char[] inputCode){
        int[] anzahlSchwarzWeiss = new int[2];

        for (int i = 0; i < 4; i++){
            if (geheimCode[i] == inputCode[i]){
                anzahlSchwarzWeiss[0] += 1;
            }
        }

    }

    public static char[] benutzerEingabe(){
        Scanner input = new Scanner(System.in);
        String inputString;
        char[] inputCode = new char[4];
        inputString = input.next();

        for (int i = 0; i < 4; i++){
            inputCode[i] = inputString.charAt(i);
        }
        return inputCode;
    }

    public static char[] geheimCode() {
        char[] geheimCode = new char[4];
        Random zufaelligeZahlGenerator = new Random();
        int zufaelligeZahl;
        char[] farben = {'r', 'g', 'b', 'y', 's', 'w'};

        for (int i = 0; i < geheimCode.length; i++) {
            zufaelligeZahl = zufaelligeZahlGenerator.nextInt(6);
            geheimCode[i] = farben[zufaelligeZahl];
        }
        return geheimCode;
    }
}
