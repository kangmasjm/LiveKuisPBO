/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kuis1pbo_221232008_muhamadfadhilmauladhani;

/**
 *
 * @author ASUS
 */
public class Mesin {

    private String merk;
    private int kecepatan;

    public Mesin(String merk) {
        this.merk = merk;
        this.kecepatan = 0;
    }

    public void tambahKecepatan() {
        this.kecepatan += getTambahKecepatan();
        
        if (this.kecepatan > 150 && this.merk.equals("Suzuki")) {
            this.kecepatan = 150;
        }
        
        if (this.kecepatan > 300) {
            this.kecepatan = 300;
        }
    }

    public void kurangKecepatan() {
        this.kecepatan -= getKurangKecepatan();
        if (this.kecepatan < 0) {
            this.kecepatan = 0;
        }
    }

    public int getTambahKecepatan() {
        if (this.merk.equals("Honda")) {
            return 10;
        } else if (this.merk.equals("Suzuki")) {
            return 15;
        } else {
            return 20;
        }
    }

    public int getKurangKecepatan() {
        if (this.merk.equals("Honda")) {
            return 5;
        } else if (this.merk.equals("Suzuki")) {
            return 10;
        } else {
            return 15;
        }
    }

    public String getMerk() {
        return merk;
    }

    public int getKecepatan() {
        return kecepatan;
    }
}

