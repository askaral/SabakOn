import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(myMethod(4, 3,6,7,11,8,9,23,65,44,77,9,69));

    }

    public static boolean myMethod(int a, int ... numbers) {
        for (int i = 0; i < numbers.length; i++)
           if(a == numbers[i]){
               return true;
        }  return false;
     }
}

