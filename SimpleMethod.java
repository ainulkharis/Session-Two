import java.util.Scanner;

public class SimpleMethod {

    private static void CetakJudul(){
        String Nama;
        String NIM;
        String Kelas;
        String namaProject;

        Nama        = "Ainul Kharis";
        NIM         = "21090090";
        Kelas       = "1C";
        namaProject = "Menghitung Ganjil / Genap Suatu Bilangan";

        System.out.println("Nama  : "+ Nama);
        System.out.println("NIM   : "+ NIM);
        System.out.println("Kelas : "+ Kelas);
        System.out.println("namaProject : "+ namaProject);
    }

    private static void HitungGanjilGenap(){
        Scanner inputUser = new Scanner((System.in));
        int angka;
        System.out.println("Masukkan Angka = ");
        angka = inputUser.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka " + angka + " adalah Bilangan Genap");
        } else {
            System.out.println("Angka " + angka + " adalah Bilangan Ganjil");
        }
    }
    public static void main(String[] args) {
        // CetakJudul();
        // HitungGanjilGenap();

        SimpleMethod latihanku = new SimpleMethod();
        latihanku.CetakJudul();
        latihanku.HitungGanjilGenap();

    }

}
