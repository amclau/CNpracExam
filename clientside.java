import java.util.*;
import java.net.*;
import java.io.*;

public class clientside {
    public static void main(String[] args) {
    

    try {
        Socket s=new Socket("localhost", 1234);
        DataInputStream din=new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s1=" ",s2;
        System.out.println("CLIENT SIDE:");
        while (!s1.equals("Quit")) {
            System.out.println("Enter message :");
            s1=br.readLine();
            dout.writeUTF(s1);
            dout.flush();

            s1=din.readUTF();
            System.out.println("SERVER :"+s1);


        }
        dout.close();
        s.close();
       } catch (Exception e) {
        System.out.println(e);
    }
    }
}
