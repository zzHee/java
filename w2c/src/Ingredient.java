
import java.util.Calendar;

public abstract class Ingredient {
    protected String name;
    protected Calendar c;
    protected int slife;

    public Ingredient() {
    }

    public Ingredient(String name, int slife) {
        c = Calendar.getInstance();
        this.name = name;
        this.slife = slife;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", c=" + c +
                ", slife=" + slife +
                '}';
    }
}
