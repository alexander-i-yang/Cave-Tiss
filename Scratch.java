import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

class First extends Frame{

    First() {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(10);
        nums.add(51);
        System.out.println(nums);
        String ret = "";
        for(int i: nums) {
            ret += (double) i + " ";
        }
        System.out.println(ret);
        /*ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Sortable> sortables = new ArrayList<>();
        list.add(10); list.add(5); list.add(15);
        for(int i : list) {
            Sortable s = new Sortable(i);
            sortables.add(s);
        }
        System.out.println(list);
        System.out.println(sortables);
        Collections.sort(list);
        Collections.sort(sortables);
        System.out.println(list);
        System.out.println(sortables);*/

        /*Button b=new Button("click me");
        b.setBounds(30,100,80,30);// setting button position
        add(b);//adding button into frame
        setSize(300,300);//frame size 300 width and 300 height
        setLayout(null);//no layout manager
        setVisible(true);//now frame will be visible, by default not visible*/
    }
    public static void main(String args[]){
        First f=new First();
    }
}

class Sortable implements Comparable<Sortable> {
    private int num;

    public Sortable(int a) {
        this.num = a;
    }

    public int getNum() {return num;}

    @Override
    public int compareTo(Sortable o) {
        return this.num-o.num;
    }

    @Override
    public String toString() {return "Num: " + this.num;}
}
