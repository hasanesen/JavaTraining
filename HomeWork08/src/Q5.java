

public class Q5 {
public static void main(String... teams) {
int score = 0;
try {
int score1 = 1;
System.out.print(score1++);
} catch (Throwable t) {
System.out.print(score++);
} finally {
System.out.print(score++);
}
System.out.print(score++);
}
}