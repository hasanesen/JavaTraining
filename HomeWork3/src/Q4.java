
public class Q4 {
public static void main(String[] input) {
int plan = 1;
plan = plan++ + --plan;
if(plan==1) {
System.out.print("Plan A");
}   if(plan==2) {
    System.out.print("Plan B");
}
 else System.out.print("Plan C");
}
}
