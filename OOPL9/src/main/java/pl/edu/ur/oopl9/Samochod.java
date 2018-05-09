/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

 public class Samochod {
     private String marka;
     private String nazwa;
     private int max_predkosc;
     private int cena;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getmax_predkosc() {
        return max_predkosc;
    }

    public void setmax_predkosc(int max_predkosc) {
        this.max_predkosc = max_predkosc;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public Samochod(String marka, String nazwa, int max_predkosc, int cena) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.max_predkosc = max_predkosc;
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Auto{" + "marka=" + marka + ", nazwa=" + nazwa + ", max_predkosc=" + max_predkosc + ", cena=" + cena + '}';
    }
     
 
 }