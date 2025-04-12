package arraymultidimensi;

import java.util.Scanner;

/**
 *
 * @author Ari Widya
 * TGL : 12 April 2025
 */
public class ArrayMultidimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] meja = new String[3][2];
        
        meja[0][0] = "Meja A";
        meja[0][1] = "Meja B";
        
        meja[1][0] = "Meja C";
        meja[1][1] = "Meja D";
        
        meja[2][0] = "Meja E";
        meja[2][1] = "Meja F";
        
        Scanner inp = new Scanner(System.in);
        for(int brs=0; brs<3; brs++){
            System.out.printf("Baris ke-%d\n", brs);
            for(int klm=0; klm<2; klm++){
                System.out.printf(">> Kolom ke-%d :", klm);
                meja[brs][klm] = inp.nextLine();
            }
        }
        
        //for(int br=0;br<meja.length;br++){
        //    for(int kl=0;kl<meja[br].length;kl++){
          //      System.out.printf("meja %d%d ditempati oleh %s",br,kl,meja[br][kl]);
            //    System.out.println();   
            //}
            //System.out.println();
        }      
    }
    

