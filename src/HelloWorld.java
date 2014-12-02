import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by archoud on 12/1/14.
 */
public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("what's your name");
//        String name = getInput();
//        System.out.println("hello " + name);
        System.out.println("first number to add");
        int number = Integer.parseInt(getInput());
        int number2 = Integer.parseInt(getInput());
        System.out.println(number + number2);
    }


    public static void greet(String name){
        System.out.println("hi " + name);
    }

    public static int f(int x) {
        return x + 2;
    }

    public static String getInput() {
        String input = "";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            input = bufferedReader.readLine();
        } catch (IOException e) {
            //input already assigned to ""
        }
        return input;
    }
}
