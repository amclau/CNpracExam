import java.util.*;
public class bitstuffing {
    public static String bitStuffing(String bitSequence) {
        String stuffedSequence = "";
        int count = 0;
        for (int i = 0; i < bitSequence.length(); i++) {
            char bit = bitSequence.charAt(i);
            if (bit == '1') {
                count++;
            } else {
                count = 0;
            }
            stuffedSequence += bit;
            if (count == 5) {
                stuffedSequence += '0';
                count = 0;
            }
        }
        return stuffedSequence;
    }
    public static void main(String[] args) {
        // int len;
        // Scanner sc=new Scanner(System.in);
        // // System.out.println("Enter string len : ");
        // // len=sc.nextInt();
        // String prv="011111101111111111101";
        
        // int count=0;

        // // System.out.println("Enter String : ");  
        // // prv=sc.next();
        // String aft="";
        // for (int i = 0; i < prv.length(); i++) {
            
        //     char bit=prv.charAt(i);
        //     if(bit=='1')
        //     {
        //         count++;
        //     }
        //     else{
        //         count=0;
        //     }
        //     aft+=bit;
        //     if(count==5)
        //     {
        //         aft += '0';
        //         count=0;
        //     }
        // }

        // System.out.println(aft+"\n");
        String bitSequence = "0111101111101111110";
String stuffedSequence = bitStuffing(bitSequence);
System.out.println(stuffedSequence);
    }
}
