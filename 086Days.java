
import java.util.Scanner;

public class Day86 {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        
        int n = hi.nextInt();
        int no[] = new int[n];

        System.out.print("Masukkan angka kedalam "+n+" indeks: ");
        for (int i = 0; i < no.length; i++) {
            no[i] = hi.nextInt();
        }
        System.out.print("\nMasukkan elemen array yang dicari: ");
        
        int cari = hi.nextInt();
        boolean ada = false;
        
        for (int i = 0; i< no.length; i++) {
            if (no[i] == cari){
                ada = true;
                break;
            }
        }
            
            if (ada){
                System.out.println("Elemen array yaitu "+cari+" ditemukan");
            } else {
                System.out.println("Elemen array tidak ditemukan");
        }
    }
}
