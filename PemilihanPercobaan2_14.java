import java.util.Scanner;

public class PemilihanPercobaan2_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Masukkan nilai UAS: ");
        double UAS = input.nextDouble();

        System.out.print("Masukkan nilai UTS: ");
        double UTS = input.nextDouble();

        System.out.print("Masukkan nilai kuis: ");
        double Kuis = input.nextDouble();

        System.out.print("Masukkan nilai tugas: ");
        double Tugas = input.nextDouble();


        double nilaiAkhir = (0.4 * UAS) + (0.3 * UTS) + (0.1 * Kuis) + (0.2 * Tugas);

    
        System.out.println("Nilai Akhir: " + nilaiAkhir);

  
        if (nilaiAkhir < 65) {
            System.out.println("Mahasiswa ini mendapatkan remidi.");
        } else {
            System.out.println("Mahasiswa ini tanpa remidi.");
        }

        input.close();
    }
}