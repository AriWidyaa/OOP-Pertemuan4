package oop.pertemuan4;

import java.util.Scanner;

/**
 *
 * @author Ari Widya
 * TGL : 12 April 2025
 */
public class OOPPertemuan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] NMA = new String[5];
        
        NMA[0]="Ari";
        NMA[1]="Lirya";
        NMA[2]="Edy";
        NMA[3]="Devi";
        NMA[4]="Arlya";
        
        Scanner inp = new Scanner(System.in);
        System.out.println("~~~~~Input Data Ke Array~~~~~");
        for(int idx=0; idx<5; idx++){
            System.out.printf("Data Nama Pengunjung ke-%d: ", idx+1);
            NMA[idx] = inp.nextLine();
        }
        
        System.out.println("\n~~~~~Output Data Ke Array~~~~~");
        for(int idx=0; idx<5; idx++){
            System.out.println("Data Nama Pengunjung ke-"+(idx+1)+": "+NMA[idx]);
        }
        
        System.out.println("\n~~~~~Output2 Data Ke Array~~~~~");
        int no=1;
        for(String isi : NMA){
            System.out.println(no+". "+isi);
            no++;
        }
    }
    
}
