import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class App {
    public static void main(String[] args) throws Exception {

        File myfile = new File("Team.txt");
        List<Person> list = new ArrayList<>();
        Scanner sc = new Scanner(myfile);
        
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String str[] = s.split(" - ");

            int age = Integer.valueOf(str[0].trim());
            String name = str[1].trim();
            String f = str[2].trim();
            Position position = Position.valueOf(f);
            
            list.add(new Person(age, name, position));

        }
        
        System.out.println("Danh sách: ");
        list.forEach(System.out::println);

        sc.close();
    //     FileOutputStream fos = null;
    //     DataOutputStream dos = null;
    //     FileInputStream fis = null;
    //     DataInputStream dis = null;

    //     try {
    //         fos = new FileOutputStream("input.txt");
    //         dos = new DataOutputStream(fos);

    //         dos.writeUTF("Hello");
    //         dos.writeUTF("Good");
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     } finally {
    //         fos.close();
    //         dos.close();
    //     }


    //     try {
    //         fis = new FileInputStream("input.txt");
    //         dis = new DataInputStream(fis);

    //         String str = dis.readUTF();
    
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     } finally {
    //         fis.close();
    //         dis.close();
    //     }
    }
}
