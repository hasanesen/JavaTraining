
public class Q50 {
public static String play(int toy, int age) {
final String game;
if(toy<2)
game = age > 1 ? "futbol" : "basketbol"; // p1 atama yap�lan game string bir ifade oldu�u i�in string de�i�kenler verilmeli.�rnek olarak verdi�im gibi.
else
game = age > 3 ? "Ball" : "Swim"; // p2
return game;
}
public static void main(String[] variables) {
System.out.print(play(5,2));
}
}