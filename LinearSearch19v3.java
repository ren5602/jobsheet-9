import java.util.Scanner;

public class LinearSearch19v3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int hasil=0 ;
        System.out.print("Masukkan Banyaknya Element Array: ");
        int jmlElement= sc.nextInt();
        int[] element= new int[jmlElement];

        for(int i=0; i<jmlElement; i++){
            System.out.print("Masukkan Nilai Elemen Ke-"+(i)+": ");
            element[i]= sc.nextInt();
        }
        System.out.print("Masukkan Key Yang Dicari: ");
        int key= sc.nextInt();

        for(int i=0; i<jmlElement; i++){
            if(element[i] == key){
                hasil = i;
                System.out.println("Key Berada Di Indeks Ke-"+(hasil));
                break;
            }
        }
        if(hasil == 0){
            System.out.println("Key tidak ditemukan."); 
    }
}
}