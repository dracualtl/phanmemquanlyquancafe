
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sniper dracula
 */
public class NewClass {
    public static void main(String [] agrs){
        String [] arr={"duong van ly","nguyen quang phong","duong thi luom","nguyen trung thanh"};
       // String a="";
        //System.out.print("Nhap a: ");
       // Scanner m=new Scanner(System.in);
       // a=m.nextLine();
       // System.out.print(a.toUpperCase());
        for (String n:arr){
            if (n.indexOf("ly")!=-1){
                System.err.print("\n"+n);
            }
        }
    }
    
}
