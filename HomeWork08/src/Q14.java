import java.io.FileNotFoundException;
import java.io.IOException;
public class Q14 {
public void print() throws FileNotFoundException {
try {
throw new FileNotFoundException();
} catch (IOException exception) {
System.out.print("Z");
} finally {
System.out.print("Y");
}
}
public static void main(String... ink) throws FileNotFoundException {
new Q14().print();
}
}