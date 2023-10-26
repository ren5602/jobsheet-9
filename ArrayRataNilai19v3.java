import java.util.Scanner;

public class ArrayRataNilai19v3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0, totalLulus=0, totalGagal=0,
        rata2=0, rataLulus=0, rataGagal=0;
        int mhsLuluss=0,mhsGagal=0, jmlMhs=0;
        System.out.print("Jumlah Mahasiswa: ");
        jmlMhs = input.nextInt();
        int [] nilaiMhs = new int[jmlMhs];


        for(int i=0; i<nilaiMhs.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = input.nextInt();
            if(nilaiMhs[i]>70){
                totalLulus+=nilaiMhs[i];
                mhsLuluss++;
            }
                else if(nilaiMhs[i]<=70){
                    totalGagal+=nilaiMhs[i];
                    mhsGagal++;
                }
            }
        for(int i=0; i<nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
        rata2 = total/nilaiMhs.length;
        rataLulus= totalLulus/mhsLuluss;
        rataGagal= totalGagal/mhsGagal;
        System.out.println("Rata-rata Nilai Mahasiswa Adalah: " + rata2);
        System.out.println("Rata-rata Nilai Mahasiswa Yang Lulus Adalah: " + rataLulus);
        System.out.println("Rata-rata Nilai Mahasiswa Yang Gagal Adalah: " + rataGagal);
        System.out.println("Jumlah Mahasiswa Yang Berhasil Lulus Adalah: "+mhsLuluss);
        System.out.println("Jumlah Mahasiswa Yang Gagal Lulus Adalah: "+mhsGagal);
    }
}

