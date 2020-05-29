interface CanFly {
public static void fly() {}
}
class Bird {
public void fly(int speed) {}
}
public class Q35 extends Bird implements CanFly {
public void fly() {}
}