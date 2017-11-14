/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo12_10116523_latihanuts5;

/**
 *
 * @author user
 */
public class PBO12_10116523_LATIHANUTS5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      JajarGenjang jG = new JajarGenjang();
      jG.JajarGenjang(50,60,70,80,100,120);
      Segitiga sG=new Segitiga();
      sG.segitiga(50,60,70,100,120);
      jG.HitungKeliling();
      jG.HitungLuas();
      sG.HitungKeliling();
      sG.HitungLuas();
      
    }
    
}
