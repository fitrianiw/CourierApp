/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class WhyNullPointer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  //      String nama;
  //      System.out.println(nama);
        Artis artis = new Artis();
        
        String namaArtis =artis.getNama();
        System.out.println(namaArtis);//tidaak error, menampilkan Null
        System.out.println(namaArtis.toUpperCase())//NPE
    }
    
}
