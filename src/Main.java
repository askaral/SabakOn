import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(myMethod(5, 3,6,7,11,8,19,20,15,14,17,9,26));

    }

    public static boolean myMethod(int a, int ... numbers) {
        for (int b:numbers)
           if(a == b){
               return true;
        }  return false;
     }
}

