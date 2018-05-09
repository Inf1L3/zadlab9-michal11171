/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

/**
 *
 * @author student
 */
public class Cars<T, S> {
    
    T marka, model;
    S vmax, cena;

    public Cars(T marka, T model, S vmax, S cena) {
        this.marka = marka;
        this.model = model;
        this.vmax = vmax;
        this.cena = cena;
    }
    
    public void pokaz(){
        System.out.println("Marka: "+marka);
        System.out.println("Model: "+model);
        System.out.println("Cena: "+cena);
        System.out.println("Predkosc max: "+vmax);
    }
    
    
    
    
    
}
