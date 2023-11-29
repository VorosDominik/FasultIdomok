/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faidomok.Modell;

/**
 *
 * @author VörösDominik(SZF_202
 */
public abstract class  FaIdom {
      private static  double falysuj = 0.8;
   

  
    public abstract double Terfogat();
    public double suly(){
    return Terfogat()*falysuj;
    }
    

    @Override
    public String toString() {
        return "FaIdom{" +"falysuj = " +falysuj + '}';
    }

    
    
    
      
      
      
}
