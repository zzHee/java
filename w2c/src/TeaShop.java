import java.util.ArrayList;
import java.util.Calendar;
import java.util.ListIterator;

public class TeaShop implements Shop{
    public void add_bubbleorcoconut(ArrayList a,Ingredient i)  {
        a.add(i);
    }
    public void add_ingredient(ArrayList b,ArrayList c,Ingredient i) {
        if(i instanceof Bubble)  {
            add_bubbleorcoconut(b,i);
        }else if(i instanceof Coconut)  {
            add_bubbleorcoconut(c,i);
        }
    }
    public void sell(ArrayList b,ArrayList c,String milkname,String ingredientname) {
        ListIterator lb = b.listIterator();
        while(lb.hasNext()) {
            Bubble temp = (Bubble)lb.next();
            Calendar tempc = Calendar.getInstance();
            if(temp.name == ingredientname){
                if(tempc.compareTo(temp.c)>0)
                {
                    lb.remove();
                }else {
                    System.out.println("售出："+milkname+"*1");
                    return;
                }
            }
        }
        ListIterator lc = c.listIterator();
        while(lc.hasNext()) {
            Bubble temp = (Bubble)lc.next();
            Calendar tempc = Calendar.getInstance();
            if(temp.name == ingredientname){
                if(tempc.compareTo(temp.c)>0)
                {
                    lc.remove();
                }else {
                    System.out.println("售出："+milkname+"*1");
                    return;
                }
            }
        }
        SoldOutException s = new SoldOutException();
        

    }
}
