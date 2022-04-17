import Model.Mahasiswa;

import java.util.Scanner;

public class InputDataMahasiswa {
    public static void main(String[] args) {

        Mahasiswa Ary = new Mahasiswa("0104940072",
                "Ary Herijanto",
                "Tegal","Teknik Informatika",
                "1Z",2.57);

        Ary.PrintDataSiswa();

        Mahasiswa Andrian = new Mahasiswa("000000",
                "Andrian",
                "Tegal","Teknik Informatika",
                "1A",3.2);

        Andrian.PrintDataSiswa();

        Mahasiswa[] dataAllInput = new Mahasiswa[100];
        for(int index=0;index<dataAllInput.length;index++){

        }
    }
}
