import java.util.Scanner;
public class ArrayNilai19v4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] nilaiAkhir = new int[10];
    
    for (int i = 0; i < nilaiAkhir.length; i++) {
      System.out.print("Masukkan Nilai Akhir ke-" +i+ " : ");
      nilaiAkhir[i] = input.nextInt();
    }
    for (int i = 0; i < nilaiAkhir.length; i++) {
      if(nilaiAkhir[i] >= 70){
        System.out.println("Mahasiswa ke-" +i+ " lulus!");
      }
      else if(nilaiAkhir[i] < 70){
        System.out.println("Mahasiswa ke-" +i+ " Tidak lulus!");
      }
      System.out.println("Nilai Akhir Mahasiswa ke-" + i + " : " + nilaiAkhir[i]);
    }
  }  
}
