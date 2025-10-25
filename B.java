import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Membaca satu baris teks
        System.out.print("Masukkan teks: ");
        String teks = br.readLine();

        // Memisahkan kata berdasarkan spasi
        String[] kata = teks.trim().split("\\s+");

        // Menghitung jumlah kata (pastikan tidak kosong)
        int jumlahKata = (teks.trim().isEmpty()) ? 0 : kata.length;

        // Menampilkan hasil
        System.out.println("Jumlah kata: " + jumlahKata);
    }
}
