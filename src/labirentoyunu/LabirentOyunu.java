/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labirentoyunu;
import java.util.*;
/**
 *
 * @author Asus
 */
public class LabirentOyunu {

    public static int[][]labirent={{2,2,2,2,2,2,2,2,2,2,2,2,2,2},
    {2,2,3,2,2,2,2,2,2,2,2,2,2,2},
    {2,2,1,2,1,1,2,2,2,2,2,2,2,2},
    {2,2,1,5,2,2,2,2,2,2,2,2,2,2},
    {2,2,1,1,1,1,2,2,2,2,2,2,2,2},
    {2,2,1,1,1,1,2,2,2,2,2,2,2,2},
    {2,2,1,1,1,1,2,2,2,2,2,2,2,2},
    {2,2,1,1,1,1,1,2,2,2,2,2,2,2},
    {2,2,1,1,2,2,1,1,1,2,2,2,2,2},
    {2,2,2,1,1,1,1,2,2,1,1,1,2,2},
    {2,2,2,2,2,2,1,1,1,1,2,1,1,4},
    {2,2,2,2,2,2,2,2,2,2,2,2,2,2}};
    public static Scanner consol= new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int manUp=0 ,manDown=0;
        int locUp=0 ,locDown=0;
        int kutuUp=0 ,kutuDown=0;
        int toplamAdim=0;
        for (int y = 0; y < labirent.length; y++) {
            for (int x = 0; x < labirent[y].length; x++) {
                int hucre =labirent[y][x];
                if (hucre==3) {
                    manUp=x;
                    manDown=y;
                }
                if (hucre==4) {
                    locUp=x;
                    locDown=y;
                }
                if (hucre==5) {
                    kutuUp=x;
                    kutuDown=y;
                    
                }
                
            }
            
        }
        while (true) {
            System.out.println("------------------------\n");
            for (int y = 0; y < labirent.length; y++) {
            for (int x = 0; x < labirent[y].length; x++) {
                int hucre =labirent[y][x];
                switch (hucre) {
                    case 1:
                        System.out.print("-");
                        break;
                    case 2:
                        System.out.print("#");
                        break;
                    case 3:
                        System.out.print("M");
                        break;
                    case 4:
                        System.out.print("O");
                        break;
                    case 5:
                        System.out.print("K");
                        break;
                }
            }
                System.out.println("");
          }   
            
       
            System.out.println("\n Toplam Adım"+toplamAdim);
            System.out.println("\n--------------\n");
            System.out.print("Yön tuşları (w=yukarı,s=aşağı,a=sol,d=sağ)seçiniz:");
            String secimStr=consol.next();
            char secim =secimStr.charAt(0);
            switch (secim){
                case 'w':
                case 'W':
                    if (labirent[manDown-1][manUp]==1) {
                        labirent[manDown][manUp]=1;
                        labirent[--manDown][manUp]=3;
                        toplamAdim++;
                    }
                break;
                case 'a':
                case 'A':
                    if (labirent[manDown][manUp-1]==1) {
                        labirent[manDown][manUp]=1;
                        labirent[manDown][--manUp]=3;
                        toplamAdim++;
                    }
                break;
                case 's':
                case 'S':
                    if (labirent[manDown+1][manUp]==1) {
                        labirent[manDown][manUp]=1;
                        labirent[++manDown][manUp]=3;
                        toplamAdim++;
                    }
                break;
                case 'd':
                case 'D':
                    if (labirent[manDown][manUp+1]==1) {
                        labirent[manDown][manUp]=1;
                        labirent[manDown][++manUp]=3;
                        toplamAdim++;
                    }
                break;
                
                }
                
                if (kutuUp==locUp && kutuDown==locDown) {
                System.out.println("Tebrikler! Oyunu Kazandınız..");
                break;
            }
  
        
             
        
      
        }
     }
}
