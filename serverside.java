import java.util.*;
import java.net.*;
import java.io.*;

public class serverside {
    public static void main(String[] args) {
        try {
            ServerSocket ss=new ServerSocket(1234);
            Socket s=ss.accept();
            DataInputStream din=new DataInputStream(s.getInputStream());
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String s1=" ",s2;
            System.out.println("SERVER SIDE");
            while (!s1.equals("Quit")) {
                
                s1=din.readUTF();
                System.out.println("CLIENT :"+s1);

                System.out.println("Enter message :");
                s1=br.readLine();
                dout.writeUTF(s1);
                dout.flush();
    

    
    
            }
            s.close();
            ss.close();
            dout.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
