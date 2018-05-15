/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;
import java.util.Random;
import java.util.Iterator;
import java.util.TreeSet;
/**
 *
 * @author student
 */
public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //ZAD 1
        System.out.println("ZAD 1\n");
        
        Random gen = new Random();
        
        int[] tab = new int[100];
        
        for(int i=0;i<100;i++){
            tab[i]=gen.nextInt(100);
        }
        
        int temp;
        int z = 1;
        while(z>0){
            z = 0;
                for(int i=0; i<100-1; i++){
                    if(tab[i]>tab[i+1]){
                    temp = tab[i+1];
                    tab[i+1] = tab[i];
                    tab[i] = temp;
                    z++;
                    }
                }
        }
        for(int i=0;i<100;i++){
            System.out.println(tab[i]);
        }
        
        //ZAD 2
        System.out.println("\nZAD 2\n");
        
        int[] tab2 = new int[100];
        
        TreeSet<Integer> tree = new TreeSet<Integer>();
        for(int i=0;i<100;i++){
            tree.add(tab2[i]=gen.nextInt(100));
        }
        
        Iterator<Integer> iter= tree.iterator();
	System.out.println("TreeSet: ");

	while (iter.hasNext()) {
		System.out.println(iter.next());
	}
        
        
        //ZAD 3
        
        System.out.println("ZAD 3");
        /*
        String marka = "Audi";
        String model = "A4";
        Integer cena = 18700;
        Integer vmax = 270;
        */
        Cars audi = new Cars("audi", "a4", 152, 548);
        Cars seat = new Cars("seat", "leon", 1552, 5548);
        audi.pokaz();
        seat.pokaz();
        
    }
    
}
