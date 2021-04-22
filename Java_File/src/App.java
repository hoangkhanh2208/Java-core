import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.System.Logger;

public class App {
    public static void main(String[] args) throws Exception {
        File file = new File("test.txt");

        if (!file.isFile()) {
            file.createNewFile();
        }
        //Đọc dữ liệu
        FileInputStream a = null;
        //Ghi dữ liệu
        FileOutputStream b = null;

        try {
            a = new FileInputStream(file);
            b = new FileOutputStream("testCopy.txt");

            int ch;

            while ((ch = a.read()) != -1) {
                System.out.print((char) ch);
                b.write(ch);
            }
        } catch (Exception e) {
            System.out.println("Xử lý");

        } finally {
            if (a != null) {
                try {
                    a.close();
                } catch (Exception e) {
                    System.out.println("Xử lý");
                }
            }
        }

    }
}
