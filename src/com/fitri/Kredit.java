package com.fitri;
public class Kredit {
    private double gajiPokok;
    private double hargaBarang;
    private double uangMuka;
    private int lamaCicilan;
    private double bungaPerTahun;
    private int tanggungan;
    private double pokokCicilan;
    private double bungaPerBulan;
    private double cicilanPerBulan;

    public Kredit(double gajiPokok, double hargaBarang, double uangMuka, int lamaCicilan,double bungaPerTahun, int tanggungan) {
        this.gajiPokok = gajiPokok;
        this.hargaBarang = hargaBarang;
        this.uangMuka = uangMuka;
        this.lamaCicilan = lamaCicilan;
        this.bungaPerTahun = bungaPerTahun / 100;
        this.tanggungan = tanggungan;
    }

    Kredit(double parseDouble, double parseDouble0, double parseDouble1, double parseDouble2) {
        this.gajiPokok = gajiPokok;
        this.hargaBarang = hargaBarang;
        this.uangMuka = uangMuka;
        this.lamaCicilan = lamaCicilan;
        this.bungaPerTahun = bungaPerTahun / 100;
        this.tanggungan = tanggungan;
    }
    
    private double PokokCicilan() {
        return hargaBarang - uangMuka;
    }
    
    private double BungaPerBulan() {
        double durasi = lamaCicilan;
        double x = durasi / 12.0;
        return x * PokokCicilan() * bungaPerTahun;
    }
    
    private double TotalCicilan() {
        return PokokCicilan() + BungaPerBulan();
    }

    private double CicilanPerBulan() {
        double durasi = lamaCicilan;
        return BungaPerBulan() + (PokokCicilan() / durasi);
    }

    private double GajiTanggungan() {
        return gajiPokok / (tanggungan + 1);
    }
    
    public boolean CekPengajuan() {
        boolean hasil;
        double durasi = lamaCicilan;
        double x = durasi / 12.0;
        System.out.println("Gaji Pokok :" + String.format("%,.2f", gajiPokok));
        System.out.println("Harga Barang :" + String.format("%,.2f", hargaBarang));
        System.out.println("Uang Muka :" + String.format("%,.2f", uangMuka));
        System.out.println("Tanggungan :" + tanggungan);
        System.out.println("Lama Cicilan :" + lamaCicilan);
        System.out.println("Lama Cicilan per Tahun : " + String.format("%,.2f", x));
        System.out.println("Bunga per Tahun : " + String.format("%,.2f", bungaPerTahun));
        System.out.println("Pokok Cicilan :" + String.format("%,.2f", PokokCicilan()));
        System.out.println("Bunga per Bulan :" + String.format("%,.2f", BungaPerBulan()));
        System.out.println("Cicilan per Bulan :" + String.format("%,.2f", CicilanPerBulan()));
        System.out.println("Gaji di Bagi Tanggungan :" + String.format("%,.2f", GajiTanggungan()));
        if (Math.abs(GajiTanggungan()) > Math.abs(CicilanPerBulan())) {
            hasil = true;
        } else {
            hasil = false;
        }
        return hasil;
    }
    
    public double getPokokCicilan() {
        return PokokCicilan();
    }

    public double getBungaPerBulan() {
        return BungaPerBulan();
    }

    public double getTotalCicilan() {
        return TotalCicilan();
    }
    
    public double getCicilanPerBulan() {
        return CicilanPerBulan();
    }
}
