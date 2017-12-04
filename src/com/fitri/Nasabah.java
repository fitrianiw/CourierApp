
package com.fitri;

public class Nasabah {

    private String nama;
    private String alamat;
    private String status;
    private String noHP;
    private String noRumah;
    private Kredit kredit;
    
    public Nasabah(String nik, String nama, String alamat, String ttl, String status, int jumlahTanggungan, String noHP, String noRumah) {
        this.nama = nama;
        this.alamat = alamat;
        this.status = status;
        this.noHP = noHP;
        this.noRumah = noRumah;
    }
 
    public Kredit getKredit() {
        return kredit;
    }
}

