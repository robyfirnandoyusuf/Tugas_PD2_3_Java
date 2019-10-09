/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgs_pd2_3_191116004;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author redPwn
 */
public class TGS_PD2_3_191116004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        boolean validData = true;
        String barang = "";
        double price;
        double subtotal;
        int jum;
        int allbarang ;
        double bayar;
        double kembalian;
        double total;
        List<Double> arrSub = new ArrayList<Double>();
        
        System.out.print("Jumlah macam barang yang dibeli: ");
        allbarang = scanner.nextInt();
        
        int i = 1;
        while (i <= allbarang) {
            System.out.print("\nNama barang : ");

            try {
                barang = scanner.next();
            }catch (InputMismatchException ex){
                System.out.println(ex.getMessage());
            }
            
            System.out.print("Harga barang: ");
            price = scanner.nextInt();
            
            System.out.print("Qty barang : ");
            jum = scanner.nextInt();
            
            subtotal = price * jum;
            arrSub.add(subtotal);
            System.out.print("Subtotal : "+subtotal+"\n");
            if(i == allbarang){
                validData = false;
                total = sum(arrSub);
                
                System.out.print("Bayar : ");
                bayar = scanner.nextInt();
                
                kembalian = bayar - total;
                System.out.println("Total Harga: "+total);
                System.out.print("Kembalian: "+kembalian+"\n");
            }
            i++;
        }

    }
    
    private static double sum(List<Double> arrSub) {
        double sum = 0;
        for (Double i: arrSub) {
            sum += i;
        }
        return sum;
    }
    
}
