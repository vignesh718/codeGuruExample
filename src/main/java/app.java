import java.io.File;
import java.io.*;

public class app {
    public static void main(String[] args) {
        app main = new app();
        File file = new File(main.getClass().getClassLoader().getResource("Z:\\Downloads\\Project%20Workspace\\Practice%20workspace\\codegur\\sample1\\src\\main\\resources\\data.txt").getFile());
        System.out.println(file.exists());
        File file1 = new File(main.getClass().getClassLoader().getResource("Z:\\Downloads\\Project%20Workspace\\Practice%20workspace\\codegur\\sample1\\src\\main\\resources\\data1.txt").getFile());
        try {
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            FileReader reader1 = new FileReader(file1);
            BufferedReader br1 = new BufferedReader(reader1);
            String line1;
            while ((line1 = br1.readLine()) != null) {
                System.out.println(line1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
