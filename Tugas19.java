import java.util.Scanner;

public class Tugas19 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int tinggi= 0, rendah= 999999999, total= 0;
        
        System.out.print("Masukkan Banyaknya Element: ");
        int jmlElement = input.nextInt();
        int[] nilaiElement = new int [jmlElement];

        for(int i=0; i<jmlElement; i++){
            System.out.print("Masukkan Nilai Element Ke-"+(i+1)+": ");
            nilaiElement[i] = input.nextInt();
            total+= nilaiElement[i];
        }
        for (int i=0; i<jmlElement; i++) {
            if (nilaiElement[i] > tinggi){
                tinggi = nilaiElement[i];
            }else if (nilaiElement[i] < rendah) {
                rendah = nilaiElement[i];
            }
        }
        double rata= (double) total/jmlElement;
        System.out.println();
        System.out.println("Nilai Element Tertinggi Adalah : "+tinggi);
        System.out.println("Nilai Element Terendah Adalah  : "+ rendah);
        System.out.println("Nilai Rata-rata element Adalah : "+rata);
    }
}