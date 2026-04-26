package extended;
import java.util.Scanner;
//Input Nilai Mahasiswa
public class Soal_1 {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in );

        int nilai;
        char ulang;

        do {

            System.out.print("masukin nilai yang diperoleh: ");
            nilai = input.nextInt();

            System.out.println("Nilai yang anda masukkan : " + nilai);

            System.out.print("Ulangi? (y/t): ");
            ulang = input.next().charAt(0);
            input.nextLine();

        }while (ulang == 'y' || ulang == 'Y');

        System.out.println("Program Selesai");
    }
}
