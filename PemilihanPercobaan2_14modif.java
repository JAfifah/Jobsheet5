import java.util.Scanner;

public class PemilihanPercobaan2_14modif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Masukkan nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        System.out.print("Masukkan nilai UTS: ");
        double nilaiUTS = input.nextDouble();

        System.out.print("Masukkan nilai kuis: ");
        double nilaiKuis = input.nextDouble();

        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = input.nextDouble();

        
        double nilaiAkhir = (0.4 * nilaiUAS) + (0.3 * nilaiUTS) + (0.1 * nilaiKuis) + (0.2 * nilaiTugas);

        
        System.out.println("Nilai Akhir: " + nilaiAkhir);

        
        String nilai;
        if (nilaiAkhir > 80) {
            nilai = "A";
        } else if (nilaiAkhir <= 80 && nilaiAkhir > 73) {
            nilai = "B+";
        } else if (nilaiAkhir <= 73 && nilaiAkhir > 65) {
            nilai = "B";
        } else if (nilaiAkhir <= 65 && nilaiAkhir > 60) {
            nilai = "C+";
        } else if (nilaiAkhir <= 60 && nilaiAkhir > 50) {
            nilai = "C";
         } else if (nilaiAkhir <= 50 && nilaiAkhir > 39) {
            nilai = "D";
        } else {
            nilai = "E";
        }

        
        System.out.println("Anda Mendapat nilai : " + nilai);

        input.close();
    }
}