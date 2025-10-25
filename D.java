import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class D {
    public static void main(String[] args) {
        // Pastikan argumen benar
        if (args.length != 2) {
            System.out.println("Usage: java CopyFileBinary <sumber> <tujuan>");
            return;
        }

        String sumber = args[0];
        String tujuan = args[1];

        // Salin file biner
        try (FileInputStream input = new FileInputStream(sumber);
             FileOutputStream output = new FileOutputStream(tujuan)) {

            byte[] buffer = new byte[4096]; // buffer 4 KB
            int bytesRead;

            while ((bytesRead = input.read(buffer)) != -1) {
                output.write(buffer, bytesRead == 0 ? 0 : 0, bytesRead);
            }

            System.out.println("File berhasil disalin dari " + sumber + " ke " + tujuan);

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
