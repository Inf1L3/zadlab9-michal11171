/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.Arrays;
import java.util.Random;


public class RandomoweLiczby {

    public static void main(String[] args) {
        int[] tab = new int[100];
        System.out.println("Losowe liczby");
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            tab[i] = r.nextInt();
            System.out.println(tab[i]);
        }
        System.out.println("Posortowane Liczby");
         Arrays.sort(tab);
        for (int i = 0; i < 100; i++) {
            System.out.println(tab[i]);
        }
    }

}