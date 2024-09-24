import java.util.Scanner;

public class FlipCase {
    public static void main(String[] args) {
        // Membuat Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        // input string dari pengguna
        System.out.print("Masukkan sebuah kalimat: ");
        String input = scanner.nextLine();
        
        // deklarasi variabel untuk menyimpan hasil dari string yang telah dibalik
        StringBuilder flippedString = new StringBuilder();
        
        // Looping setiap karakter dalam string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            // cek apakah karakter huruf besar, jika iya ubah menjadi huruf kecil
            if (Character.isUpperCase(c)) {
                flippedString.append(Character.toLowerCase(c));
            }
            // jika huruf kecil, ubah menjadi huruf besar
            else if (Character.isLowerCase(c)) {
                flippedString.append(Character.toUpperCase(c));
            }
            // jika bukan huruf (seperti spasi), tetap tambahkan ke string
            else {
                flippedString.append(c);
            }
        }
        
        // print hasilnya
        System.out.println("Hasil setelah membalik huruf besar dan kecil: " + flippedString.toString());
        
        // Menutup scanner
        scanner.close();
    }
}
