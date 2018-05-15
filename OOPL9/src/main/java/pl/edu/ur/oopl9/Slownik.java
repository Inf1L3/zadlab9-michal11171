package pl.edu.ur.oopl9;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Slownik {
    public static void Zad4() {
        Map<String, String> words = new HashMap<>();
        words.put("dom", "house");
        words.put("mleko", "milk");
        words.put("kamien", "rock");
        words.put("krzak", "bush");
        words.put("szklanka", "glass");
        words.put("kobieta", "woman");
        words.put("jeĹ›Ä‡", "eat");
        words.put("telewizor", "television");
        words.put("swieczka", "candle");
        words.put("owoce", "fruits");
        words.put("warzywa", "vegetables");
        words.put("sklep", "shop");
        words.put("impreza", "party");
        words.put("koncert", "gig");
        words.put("telefon", "telephone");
        words.put("woda", "water");
        words.put("imiÄ™", "name");
        words.put("nazwisko", "surname");
        words.put("to", "it");
        words.put("jest", "is");
        words.put("koniec!","Program will go back to main menu! ");

        Scanner s = new Scanner(System.in);
        String slowo;
        System.out.println("Type a word from list to translate(tak,nie,mieÄ‡,czĹ‚owiek,mÄ™ĹĽczyzna,kobieta,jeĹ›Ä‡,piÄ‡,graÄ‡,owoce,warzywa,spaÄ‡,sklep,proszÄ™,dziÄ™kuje,oczywiĹ›cie,imiÄ™,nazwisko,to,jest)");

        do {
            slowo = s.nextLine();
            System.out.println(slowo +" - "+ words.get(slowo));

        }while(!"koniec!".equals(slowo));
        Main.main(new String[0]);
    }
}