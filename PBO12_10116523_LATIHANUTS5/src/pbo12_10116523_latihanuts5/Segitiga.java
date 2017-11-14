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
public class Segitiga {

    private int luas, keliling;
    private int sisiAb, sisiBc, sisiCa;
    private int alas, tinggi;

    public void segitiga(int sisiAb, int sisiBc, int sisiCa, int alas, int tinggi) {
        this.sisiAb = sisiAb;
        this.sisiBc = sisiBc;
        this.sisiCa = sisiCa;
        this.alas = alas;
        this.tinggi = tinggi;

    }

    public void HitungLuas() {
        luas = alas * tinggi / 2;
        System.out.println("luas Segitiga  =" + luas);
    }

    public void HitungKeliling() {
        keliling = sisiAb + sisiBc + sisiCa;
        System.out.println("Keliing Segitiga  =" + keliling);
    }
}
