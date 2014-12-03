import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by archoud on 12/1/14.
 */
public class HelloWorld {
    public static void main(String[] args) {
//        Orange orange = new Orange();
//        System.out.println(orange.edible);
//        orange.rot();
//        System.out.println(orange.edible);

//        ArrayList<Orange> oranges = new ArrayList<Orange>();
//        ArrayList<Fruit> fruits = new ArrayList<Fruit>();
//
//        fruits.add(new Orange("Michelle"));
//        fruits.add(new Orange("Asif"));
//        fruits.add(new Orange("Richie"));
//        fruits.add(new Banana("Nana"));
//
//        for (Fruit fruit : fruits) {
//            System.out.println(fruit.name);
//            System.out.println(fruit.edible);
//            fruit.rot();
//            System.out.println(fruit.edible);
//        }


//        return;
//        boolean loggedIn = false;
//        int count = 0;
//        while (!loggedIn && count < 4){
//            loggedIn = login();
//            count += 1;
////            System.out.println(count);
//        }
    }

    public static boolean login(){
        System.out.println("password?");
        String password = getInput();
        String realPassword = "kittens";
        if (password.equals(realPassword) ){
            System.out.println("access granted");
            return true;
        }
        else {
            System.out.println("permission denied");
            return false;
        }
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
