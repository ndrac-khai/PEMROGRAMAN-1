package extended;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args){

        float Presensi, Tugas, UTS, UAS;
        float realisasi, kehadiran;
        float nTugas, nUTS, nUAS;
        float total, persentase;
        char grade;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukin realisasi mata kuliah: ");
        realisasi = input.nextFloat();

        System.out.print("Masukin kehadiran kamu: ");
        kehadiran = input.nextFloat();

        System.out.print("Masukin Nilai tugas kamu: ");
        nTugas = input.nextFloat();

        System.out.print("Masukin Nilai UTS kamu: ");
        nUTS = input.nextFloat();

        System.out.print("Masukin Nilai UAS kamu: ");
        nUAS = input.nextFloat();

        // hitung persen kehadiran
        persentase = (kehadiran / realisasi) * 100;

        // bobot nilai
        Presensi = persentase * 10/100;
        Tugas = nTugas * 20/100;
        UTS = nUTS * 30/100;
        UAS = nUAS * 40/100;

        total = Presensi + Tugas + UTS + UAS;

        // ===== LOGIKA GRADE (dari P7) =====
        if (persentase < 75){
            if (total >= 55){
                total = 55;
                grade = 'D';
            } else {
                grade = 'E';
            }
        } else {
            if (total >= 80){
                grade = 'A';
            } else if (total >= 70){
                grade = 'B';
            } else if (total >= 60){
                grade = 'C';
            } else if (total >= 55){
                grade = 'D';
            } else {
                grade = 'E';
            }
        }

        // output
        System.out.println("==============================");
        System.out.println("KEHADIRAN | TUGAS | UTS | UAS");
        System.out.println("==============================");
        System.out.println("   " + kehadiran + "   | " + Tugas + "  | " + UTS + " |  " + UAS);
        System.out.println("================================");
        System.out.println("Total Nilai : " + total);
        System.out.println("Grade       : " + grade);
    }
}