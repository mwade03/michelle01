/**
 * Created by archoud on 12/3/14.
 */
public class FarmManager {
    public static void main(String[] args) {
        System.out.println("Welcome To Farm Manager!! :D");
        MenuItem item1 = new MenuItem();
        item1.title = "1. Add Pig";
        MenuItem item2 = new MenuItem();
        item2.title = "2. Feed Pigs";
        item1.printTitle();
        item2.printTitle();

    }
}
