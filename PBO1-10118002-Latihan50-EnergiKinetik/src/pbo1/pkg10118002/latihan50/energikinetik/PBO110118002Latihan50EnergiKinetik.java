
package pbo1.pkg10118002.latihan50.energikinetik;

import java.text.DecimalFormat;

/**
 *
 * @author 
 * NAMA  : Rizky Muslimin
 * KELAS : IF 1
 * NIM   : 10118002
 * Deskripsi Program : Program ini untuk membuat perhitungan energi kinetik.
 */
public class PBO110118002Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Energi kinetik = new Energi();
        kinetik.setMassa(0.145);
        kinetik.setKecepatan(25);
        kinetik.setKecepatanAwal(0);
        kinetik.setKecepatanAkhir(25);
        
        DecimalFormat df = new DecimalFormat("#.#");
        
        System.out.println("=====PROGRAM MENCARI ENERGI KINETIK=====");
        System.out.println("Energi Kinetik\t : " + df.format(
                           kinetik.hitungEnergiKinetik
                          (kinetik.getMassa(), kinetik.getKecepatan())));
        System.out.println("Usaha\t\t : " + df.format (kinetik.hitungUsaha
                          (kinetik.getKecepatanAwal(), 
                           kinetik.getKecepatanAkhir())));
    }
    
}
