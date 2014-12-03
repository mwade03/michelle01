import java.util.ArrayList;

/**
 * Created by archoud on 12/3/14.
 */
public class Menu {
    public ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
    public void displayMenu() {
        menuItems.add(new MenuItem("1. Add Pig"));
        menuItems.add(new MenuItem("2. Feed Pigs"));
        menuItems.add(new MenuItem("3. Play with Pigs"));
        menuItems.add(new MenuItem("4. Check Health of Pigs"));
        menuItems.add(new MenuItem("5. Exit"));
        for (MenuItem menuItem : menuItems) {
            menuItem.printTitle();
        }
    }
}
