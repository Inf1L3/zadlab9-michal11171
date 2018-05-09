/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;


import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;


public class LiczbyTree {

    public static void main(String[] args) {
        int[] tab = new int[100];
        TreeSet<Integer> al=new TreeSet<Integer>(); 
        System.out.println("Losowe liczby");
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            tab[i] = r.nextInt();
            System.out.println(tab[i]);
            al.add(tab[i]); 
            
        }
        Iterator<Integer> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
        
        
        
    }
    }
}

