public class Person {
    private String nama;
    private int umur;
    
    public Person(String nama, int umur){
            this.nama = nama;
            this.umur = umur;
    }
    
    public void info(){
        System.out.println(nama.toUpperCase()+ "sudah berumur" + umur);  
    }
    
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public int getUmur(){
        return umur;
    }
    public void setUmur(int umur){
        this.umur = umur;
    }
}
