import java.util.Scanner;
public class ArrayNilai19 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] nilaiAkhir = new int[10];
    for (int i = 0; i < 10; i++) {
      System.out.print("Masukkan Nilai Akhir ke-" +i+ " : ");
      nilaiAkhir[i] = input.nextInt();
    }
    for (int i = 0; i < 10; i++) {
      System.out.println("Nilai Akhir ke-" + i + " : " + nilaiAkhir[i]);
    }
  }  
}
