/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faidomok;

import faidomok.Modell.FaIdom;
import faidomok.Modell.Gomb;
import faidomok.Modell.Hasab;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VörösDominik(SZF_202
 */
public class FaIdomok {

    /**
     * @param args the command line arguments
     */
    

    public   FaIdomok() {
    }

   public double oszsuly(List<FaIdom> idomoklista) {
        double Osuly=0;
        for (FaIdom elem : idomoklista) {
            Osuly+=elem.suly();
        }
        return Osuly;
    }

   public  List<FaIdom> idomok() {
    List<FaIdom> faIdomok = new ArrayList<>();

   
    faIdomok.add(new Gomb(5));
    faIdomok.add(new Gomb(1));
    faIdomok.add(new Gomb(9));
    faIdomok.add(new Gomb(8));
    faIdomok.add(new Hasab(2, 3, 4)); 
    faIdomok.add(new Hasab(1, 2, 2)); 
    faIdomok.add(new Hasab(6, 6, 6)); 
    faIdomok.add(new Hasab(3, 4, 5)); 

    return faIdomok;
}

   public void listakiir(List<FaIdom> idomoklista) {
     double Osuly=0;
        for (FaIdom elem : idomoklista) {
            System.out.println(elem);
        }
    }

  public double csakAgomb(List<FaIdom> idomoklista) {
    double osszsuly = 0.0;

    for (FaIdom elem : idomoklista) {
        if (elem instanceof Gomb) {
            osszsuly += elem.suly();
        }
    }

    return osszsuly;
}
    
}
