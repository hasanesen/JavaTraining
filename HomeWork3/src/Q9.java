
public class Q9 {
 public void calculateResult(Integer candidateA, Integer candidateB) {
 boolean process = candidateA == null || candidateA.intValue() < 10;
 boolean value = candidateA && candidateB; 
 /* candidateA ve candidateB boole ifade olmad�klar� i�in burada derlenme hatas� veriyor.*/
 System.out.print(process || value);
 }
 public static void main(String[] unused) {
 new Q9().calculateResult(null,203);
 }
 }
