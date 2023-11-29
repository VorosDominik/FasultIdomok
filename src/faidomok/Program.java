/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faidomok;

import faidomok.Modell.FaIdom;
import java.util.List;

/**
 *
 * @author VörösDominik(SZF_202
 */
public class Program {
    public static void main(String[] args) {
        FaIdomok fa= new FaIdomok();
        
       List<FaIdom> idomok = fa.idomok();
       
       
        fa.listakiir(idomok);
        System.out.println("Az összsúly: " + fa.oszsuly(idomok));
        System.out.println("A gombok összsúlya: " + fa.csakAgomb(idomok));
        System.out.println("a leg kisebb térfogatu idom adatai: "+fa.minV(idomok));
        System.out.println("a leg nagyobb térfoagtú idom adatai: "+fa.maxV(idomok));
       
       
       
    }
}
