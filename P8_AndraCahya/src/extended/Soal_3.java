package extended;
import java.util.Scanner;
public class Soal_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai, rata_rata, total = 0, banyak_matkul;
        System.out.print("Mau berapa matkul: ");
        banyak_matkul = input.nextInt();
        int i = 1;
        do {
            System.out.print("Nilai matkul ke-" + i + ": ");
            nilai = input.nextInt();
            if (nilai >= 0 && nilai <= 100) {
                total += nilai;
                i++;
            } else {
                System.out.println("yang bener laa emangnya ada nilai " + nilai);
            }
        } while (i <= banyak_matkul);
        rata_rata = total / banyak_matkul;
        System.out.println("Nilai rata-ratanya: " + rata_rata);
        System.out.println("Total nilai: " + total);
        if(rata_rata > 75){
            System.out.println("Gelooo keren banget!!!");
        }else{
            System.out.println("Belajar lagii yaa");
        }
    }
}
