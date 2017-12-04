public class ArrayForeach {
    public static void main(String[] args) {
        int[] bils = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < bils.length; i++){
            int bil = bils[i];
        }
        //FOREACH LOOP
        int jumlah = 0;
        for (int bil : bils){
            jumlah += bil;
        }
        System.out.println("Jumlah : " + jumlah);
    }
    
}
