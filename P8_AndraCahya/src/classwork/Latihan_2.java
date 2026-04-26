package classwork;
import java.util.Scanner;

public class Latihan_2{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int pilihan;
        float kehadiran, realisasi, persentase;

        System.out.println("1. KEHADIRAN");
        System.out.print("masukkan pilihan andra: ");
        pilihan = input.nextInt();

        if (pilihan == 1){

            System.out.print("masukkan total pertemuan: ");
            realisasi = input.nextFloat();

            // FOR dipakai buat looping validasi
            for (;;) {
                System.out.print("masukkan kehadiran: ");
                kehadiran = input.nextFloat();

                persentase = (kehadiran / realisasi) * 100;

                if (persentase >= 75){
                    break; // keluar kalau sudah valid
                }

                System.out.println("kehadiran anda dibawah 75% (" + persentase + "%)");
            }

            System.out.println("kehadiran valid!");
            System.out.println("persentase: " + persentase + "%");

        }else{
            System.out.println("salah mas");
        }
    }
}