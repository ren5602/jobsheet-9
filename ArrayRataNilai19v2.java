import java.util.Scanner;

public class ArrayRataNilai19v2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] nilaiMhs = new int[10];
        double total = 0, rata2;
        int mhsLuluss=0;

        for(int i=0; i<nilaiMhs.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = input.nextInt();
            if(nilaiMhs[i]>70){
                mhsLuluss++;
            }
        }
        for(int i=0; i<nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata Nilai Mahasiswa Adalah: " + rata2);
        System.out.println("Jumlah Mahasiswa Yang Berhasil Lulus Adalah: "+mhsLuluss);
    }
}

