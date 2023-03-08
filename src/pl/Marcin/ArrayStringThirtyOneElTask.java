package pl.Marcin;

import java.util.Random;

public class ArrayStringThirtyOneElTask {
    public static void main(String[] args) {
        String[] table = new String[31];
        table[0] = "Paryżu";
        table[1] = "Wiedniu";
        table[2] = "Krakowie";
        table[3] = "Łodzi";
        table[4] = "Brukseli";
        table[5] = "Poznaniu";
        table[6] = "Sydney";
        table[7] = "New York";
        table[8] = "Chicago";
        table[9] = "Ełku";
        table[10] = "Californi";
        table[11] = "Żywcu";
        table[12] = "Bielsku Białej";
        table[13] = "Berlinie";
        table[14] = "Cannes";
        table[15] = "Pradze";
        table[16] = "Sopotni Małej";
        table[17] = "Rzeszowie";
        table[18] = "Meksyku";
        table[19] = "Wieliczce";
        table[20] = "Zwardoniu";
        table[21] = "Rajczy";
        table[22] = "Kaliszu";
        table[23] = "Upssali";
        table[24] = "Watykanie";
        table[25] = "Rzymie";
        table[26] = "Norymberdze";
        table[27] = "Inowrocławiu";
        table[28] = "Jerozolimie";
        table[29] = "Haifie";
        table[30] = "Bershebie";

        String[] month = new String[12];
        month[0] = "Styczniu";
        month[1] = "Lutym";
        month[2] = "Marcu";
        month[3] = "Kwietniu";
        month[4] = "Maju";
        month[5] = "Czerwcu";
        month[6] = "Lipcu";
        month[7] = "Sierpniu";
        month[8] = "Wrześniu";
        month[9] = "Październiku";
        month[10] = "Listopadzie";
        month[11] = "Grudniu";

        String[] character = new String[20];
        character[0] = "miła";
        character[1] = "uczciwa";
        character[2] = "zdolna";
        character[3] = "uczynna";
        character[4] = "wścibska";
        character[5] = "podejrzliwa";
        character[6] = "kłótliwa";
        character[7] = "romantyczna";
        character[8] = "skomplikowana";
        character[9] = "toksyczna";
        character[10] = "pracowita";
        character[11] = "uczynna";
        character[12] = "wrażliwa";
        character[13] = "silna";
        character[14] = "zaradna";
        character[15] = "dociekliwa";
        character[16] = "elokwentna";
        character[17] = "inteligentna";
        character[18] = "przystojna";
        character[19] = "skąpa";

        Random random = new Random();
        int chooseTown = random.nextInt(30);
        int chooseMonth = random.nextInt(11);
        int chooseCharacterFeature = random.nextInt(19);
        String firstPart = "Osoba urodzona w ";
        String sentence = firstPart.concat(table[chooseTown]).concat(" w ").concat(month[chooseMonth]).concat(" jest ").
                concat(character[chooseCharacterFeature]);
        System.out.println(sentence);
    }
}
