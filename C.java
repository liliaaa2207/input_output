import java.io.*;
import java.nio.file.*;
import java.util.*;

public class C {
    public static void main(String[] args) {
        // Nama file input dan output
        Path inputPath = Paths.get("input.txt");
        Path outputPath = Paths.get("count.txt");

        // HashMap untuk menyimpan frekuensi kata
        Map<String, Integer> frekuensi = new HashMap<>();

        // Membaca file input.txt
        try (BufferedReader reader = Files.newBufferedReader(inputPath)) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Ubah ke huruf kecil dan hapus tanda baca sederhana
                line = line.toLowerCase().replaceAll("[^a-z0-9\\s]", "");

                // Pisahkan menjadi kata-kata
                String[] words = line.trim().split("\\s+");

                // Tambahkan ke peta frekuensi
                for (String word : words) {
                    if (!word.isEmpty()) {
                        frekuensi.put(word, frekuensi.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
            return;
        }

        // Menulis hasil ke count.txt
        try (BufferedWriter writer = Files.newBufferedWriter(outputPath)) {
            for (Map.Entry<String, Integer> entry : frekuensi.entrySet()) {
                writer.write(entry.getKey() + ":" + entry.getValue());
                writer.newLine();
            }
            System.out.println("Hasil word count berhasil disimpan ke count.txt");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis file: " + e.getMessage());
        }
    }
}
