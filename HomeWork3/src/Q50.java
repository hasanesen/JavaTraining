
public class Q50 {
public static String play(int toy, int age) {
final String game;
if(toy<2)
game = age > 1 ? "futbol" : "basketbol"; // p1 atama yapýlan game string bir ifade olduðu için string deðiþkenler verilmeli.Örnek olarak verdiðim gibi.
else
game = age > 3 ? "Ball" : "Swim"; // p2
return game;
}
public static void main(String[] variables) {
System.out.print(play(5,2));
}
}