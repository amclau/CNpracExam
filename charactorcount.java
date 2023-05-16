import java.util.Scanner;

import java.util.*;
public class charactorcount {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter NO of strings :");
        int n=sc.nextInt(); 
        String[] data=new String[n];
        int[] size=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter String : "+i+" ");  
            data[i]=sc.next();
            size[i]=data[i].length();
        }
        for (int i = 0; i < n; i++) {
        System.out.print(size[i]+1+""+data[i]);
        }


        

    }
}