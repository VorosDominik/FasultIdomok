/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faidomok.Modell;

/**
 *
 * @author VörösDominik(SZF_202
 */
public class Gomb extends FaIdom{
    private double sugar;

    public Gomb(double sugar) {
        this.sugar = sugar;
    }
    
    
    
    @Override
    public double Terfogat() {
    return (4.0 / 3.0) * Math.PI * Math.pow(sugar, 3);
}

    @Override
    public String toString() {
        return "Gomb{" + "sugar=" + sugar +" Terfogata = "+Terfogat()+" Sulya= "+suly()+ super.toString().replace("FaIdom", "")+'}';
    }
    
    
    
}
