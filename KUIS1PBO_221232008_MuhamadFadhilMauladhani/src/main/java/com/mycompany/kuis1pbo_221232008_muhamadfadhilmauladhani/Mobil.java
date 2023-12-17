/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kuis1pbo_221232008_muhamadfadhilmauladhani;

/**
 *
 * @author ASUS
 */
public class Mobil extends Mesin {

    private boolean mesinMenyala;

    public Mobil(String merk) {
        super(merk);
        this.mesinMenyala = false;
    }

    public void nyalakanMesin() {
        this.mesinMenyala = true;
    }

    public void matikanMesin() {
        this.mesinMenyala = false;
    }

    @Override
    public void tambahKecepatan() {
        if (this.mesinMenyala) {
            super.tambahKecepatan();
        }
    }

    @Override
    public void kurangKecepatan() {
        if (this.mesinMenyala) {
            super.kurangKecepatan();
        }
    }

    @Override
    public int getKecepatan() {
        if (this.mesinMenyala) {
            return super.getKecepatan();
        } else {
            return 0;
        }
    }
}
