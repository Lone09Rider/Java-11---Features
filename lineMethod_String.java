import java.util.List;
import java.util.stream.Collectors;

public class lineMethod_String {
    public static void main(String[] args) {
        String res = "hello\nHow\nare\nyou?";

        List<String> al = res.lines().collect(Collectors.toList());

        System.out.println(al);
    }
}
