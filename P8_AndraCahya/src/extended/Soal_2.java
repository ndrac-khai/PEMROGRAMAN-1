package extended;
import java.util.Scanner;

public class Soal_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nilai, total = 0;
        int banyak_matkul;

        System.out.print("Mau berapa matkul: ");
        banyak_matkul = input.nextInt();
        int i = 1;

        do {
            System.out.print("Nilai matkul ke-" + i + ": ");
            nilai = input.nextDouble();

            if (nilai >= 0 && nilai <= 100) {
                total += nilai;
                i++;
            } else {
                System.out.println("yang bener laa emangnya ada nilai " + nilai);
            }
        } while (i <= banyak_matkul);
        System.out.println("Total nilai: " + total);
    }
}
