import java.util.Scanner;

public class Pemilihan2Percobaan2_09 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);
       
        float sudut1, sudut2, sudut3, totalSudut;
        String jenis;

        System.out.print("Masukkan Sudut 1 :");
        sudut1 = input09.nextInt();
        System.out.print("Masukkan Sudut 2 :");
        sudut2 = input09.nextInt();
        System.out.print("Masukkan Sudut 3 :");
        sudut3 = input09.nextInt();

        totalSudut = sudut1 + sudut2 + sudut3;

         if(totalSudut == 180) {
            if((sudut1==90) || (sudut2==90) || (sudut3==90)){
                jenis = "Segitiga Siku-siku";
            }else if((sudut1==60) && (sudut2==60) && (sudut3==60)){
                jenis = "Segitiga Sama Sisi";
            }else if((sudut1 == sudut2) || (sudut1==sudut3) || (sudut3==sudut2)){
                jenis = "Segitiga Sama Kaki";
            }else{
                jenis = "Segitiga Sembarang";
            }

            System.out.println("Segitiga tersebut adalah "+ jenis);
            
        }else{
            System.out.println("Bukan Segitiga");
        }

    }
}