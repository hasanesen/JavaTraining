
public class Q43 {
public static void dancing() throws RuntimeException {
try {
throw new IllegalArgumentException();
} catch (Exception e) {
System.out.print("Unable!");
}
}
public static void main(String... count) throws RuntimeException {
dancing();
}
}