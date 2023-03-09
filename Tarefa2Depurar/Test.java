//A variable X non estaba inicializada

public class Test {
    public static void main(String[] args) {
    int x = 0;
    boolean setX = false;
    if (setX) {
        x = 10;
    }
    System.out.println(x);
    }
   } 