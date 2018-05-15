package pl.edu.ur.oopl9;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Slownik {
    public static void Zad4() {
        Map<String, String> words = new HashMap<>();
        words.put("tak", "yes");
        words.put("nie", "no");
        words.put("mieÄ‡", "have");
        words.put("czĹ‚owiek", "human");
        words.put("mÄ™ĹĽczyzna", "man");
        words.put("kobieta", "woman");
        words.put("jeĹ›Ä‡", "eat");
        words.put("piÄ‡", "drink");
        words.put("graÄ‡", "play");
        words.put("owoce", "fruits");
        words.put("warzywa", "vegetables");
        words.put("spaÄ‡", "sleep");
        words.put("sklep", "shop");
        words.put("proszÄ™", "please");
        words.put("dziÄ™kujÄ™", "thank you");
        words.put("oczywiĹ›cie", "of course");
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