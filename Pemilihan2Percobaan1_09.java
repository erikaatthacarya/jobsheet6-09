import java.util.Scanner;

public class Pemilihan2Percobaan1_09 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        int tahun;

        System.out.print("Masukkan tahun: ");
        tahun = input09.nextInt();

        // if (tahun == 2100) {
        //     System.out.println("Tahun " + tahun + " adalah tahun Kabisat");

        // } else 
        if ((tahun % 4 ) == 0 ) {
            if ((tahun % 100) == 0) {
                if ((tahun % 400) == 0) {
                    System.out.println("Tahun " + tahun + " adalah tahun Kabisat");
                }else{
                    System.out.println("Tahun " + tahun + " bukan tahun Kabisat");
                }
            }  else {
            System.out.println("Tahun " + tahun + " bukan tahun Kabisat");
            }
        }
    }
}