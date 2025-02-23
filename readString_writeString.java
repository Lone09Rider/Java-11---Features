import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class readString_writeString {
    public static void main(String[] args) {
        Path file1 = Paths.get("C:\\Users\\srj00\\Desktop\\Java 11 features\\", "hello.txt");

        try {
            Files.writeString(file1, "OMG", StandardOpenOption.APPEND);

            String vals = Files.readString(file1);

            System.out.println(vals);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
