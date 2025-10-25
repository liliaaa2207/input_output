import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membaca dua bilangan dari keyboard
        System.out.print("Masukkan bilangan pertama: ");
        int a = input.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int b = input.nextInt();

        // Menghitung jumlah
        int jumlah = a + b;

        // Menampilkan hasil
        System.out.println("Jumlah: " + jumlah);

        input.close();
    }
}
