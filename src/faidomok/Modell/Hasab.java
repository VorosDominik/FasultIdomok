/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faidomok.Modell;

/**
 *
 * @author VörösDominik(SZF_202
 */
public class Hasab extends FaIdom{
    private double A,B,Magassag;

    public Hasab(double A, double B, double Magassag) {
        this.A = A;
        this.B = B;
        this.Magassag = Magassag;
    }
    
    

    @Override
    public double Terfogat() {
    return A * B * Magassag;
}

    @Override
    public String toString() {
        return "Hasab{" + "A=" + A + ", B=" + B + ", Magassag=" + Magassag + "Terfogata = "+Terfogat()+"Sulya= "+suly()+'}';
    }
  
    
    
    
}
