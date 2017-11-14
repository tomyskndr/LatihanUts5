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
public class JajarGenjang {

    private int luas, keliling;
    private int sisiAb, sisiBc, sisiCd, sisiDa, alas, tinggi;

    public void JajarGenjang(int ab, int bc, int cd, int da, int alas, int tinggi) {
        this.sisiAb = ab;
        this.sisiBc = bc;
        this.sisiCd = cd;
        this.sisiDa = da;
        this.alas = alas;
        this.tinggi = tinggi;

    }

    public void HitungLuas() {
        luas = alas * tinggi;
        System.out.println("luas jajar genjang  =" + luas);

    }

    public void HitungKeliling() {
        keliling = 2 * alas + sisiAb + sisiBc + sisiCd + sisiDa;
        System.out.println("keliling jajar genjang  =" + keliling);

    }
}
