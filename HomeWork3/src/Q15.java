
public class Q15 {
@SuppressWarnings("unused")
public final static void main(String... arguments) {
int hops = 0;
int jumps = 0;
jumps = hops++;
if(false) /* derlenme hatasý vermemesi için () boolen bi ifade olmalý */
System.out.print("Jump!");
else
System.out.print("Hop!");
}
}
