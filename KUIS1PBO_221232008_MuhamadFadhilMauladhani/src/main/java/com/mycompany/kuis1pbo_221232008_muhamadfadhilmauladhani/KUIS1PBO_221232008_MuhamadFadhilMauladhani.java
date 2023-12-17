/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kuis1pbo_221232008_muhamadfadhilmauladhani;

/**
 *
 * @author ASUS
 */
public class KUIS1PBO_221232008_MuhamadFadhilMauladhani {

    public static void main(String[] args) {

        
        Mobil mobilHonda = new Mobil("Honda");
        mobilHonda.nyalakanMesin();
        mobilHonda.tambahKecepatan();
        System.out.println("Kecepatan mobil Honda: " + mobilHonda.getKecepatan()); // 10

        mobilHonda.matikanMesin();
        mobilHonda.tambahKecepatan();
        System.out.println("Kecepatan mobil Honda: " + mobilHonda.getKecepatan()); // 0

        // Membuat mobil dengan mesin Suzuki
        Mobil mobilSuzuki = new Mobil("Suzuki");
        mobilSuzuki.nyalakanMesin();
        mobilSuzuki.tambahKecepatan();
        System.out.println("Kecepatan mobil Suzuki: " + mobilSuzuki.getKecepatan()); // 15
        mobilSuzuki.tambahKecepatan();
        mobilSuzuki.tambahKecepatan();
        mobilSuzuki.tambahKecepatan();
        mobilSuzuki.tambahKecepatan();
        mobilSuzuki.tambahKecepatan();
        mobilSuzuki.tambahKecepatan();
        mobilSuzuki.tambahKecepatan();
        mobilSuzuki.tambahKecepatan();
        mobilSuzuki.tambahKecepatan();

        System.out.println("Kecepatan mobil Suzuki: " + mobilSuzuki.getKecepatan());
        
        
        Mobil mobilNissan = new Mobil("Nissan");
        mobilNissan.nyalakanMesin();
        mobilNissan.tambahKecepatan();
        System.out.println("Kecepatan mobil Nissan: " + mobilNissan.getKecepatan()); // 10
    }
}
