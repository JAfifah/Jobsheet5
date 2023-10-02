import java.util.Scanner;

public class PemilihanKamar5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Selamat datang di hotel kami!");
        System.out.println("Pilih tipe kamar:");
        System.out.println("1. Twin Bed");
        System.out.println("2. Double Bed");
        System.out.print("Masukkan nomor tipe kamar yang Anda inginkan (1/2): ");
        
        int pilihan = input.nextInt();
        
        if (pilihan == 1) {
            System.out.println("Anda telah memilih kamar Twin Bed. Selamat menginap!");
        } else if (pilihan == 2) {
            System.out.println("Anda telah memilih kamar Double Bed. Selamat menginap!");
        } else {
            System.out.println("Pilihan tidak valid. Mohon masukkan nomor yang sesuai.");
        }
        
        
        input.close();
    }
}