/**
 * Created by archoud on 12/1/14.
 */
public class Orange extends Fruit {
    public String color = "Orange";
    public String name;



    public void rot() {
        this.color = "Brown";
        this.edible = false;
    }
}
