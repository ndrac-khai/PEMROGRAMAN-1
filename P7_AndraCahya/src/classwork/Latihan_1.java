package classwork;
import java.util.Scanner;

public class Latihan_1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int realisasi, absen;
        double tugas, uts, uas, totalNilai, persentase;
        char grade;

        System.out.print("Total pertemuan: ");
        realisasi = input.nextInt();

        System.out.print("Jumlah hadir: ");
        absen = input.nextInt();

        System.out.print("Nilai tugas: ");
        tugas = input.nextDouble();

        System.out.print("Nilai UTS: ");
        uts = input.nextDouble();

        System.out.print("Nilai UAS: ");
        uas = input.nextDouble();

        // hitung kehadiran
        persentase = (absen * 100.0) / realisasi;

        // hitung total nilai
        totalNilai = (persentase * 0.10) + (tugas * 0.20) + (uts * 0.30) + (uas * 0.40);

        // cek kehadiran dulu
        if (persentase < 75) {
            if (totalNilai >= 55) {
                totalNilai = 55;
                grade = 'D';
            } else {
                grade = 'E';
            }
        } else {
            if (totalNilai >= 80){
                grade = 'A';
            } else if (totalNilai >=70) {
                grade = 'B';
            } else if (totalNilai >= 60){
                grade = 'C';
            } else if (totalNilai >= 55){
                grade = 'D';
            } else{
                grade = 'E';
            }
        }

        System.out.println("Persentase: " + persentase);
        System.out.println("Nilai akhir: " + totalNilai);
        System.out.println("Grade: " + grade);
    }
}