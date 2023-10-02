import java.util.Scanner;

public class LatihanPercobaan1_14TO  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Angka: ");
        int angka = input.nextInt();
        
        String hasil = (angka % 2 == 0) ? "genap" : "ganjil";
        
        System.out.println(angka + " adalah angka " + hasil + ".");
        
        input.close();
    }
}