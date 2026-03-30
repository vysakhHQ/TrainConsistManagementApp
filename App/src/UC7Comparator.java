import java.util.*;

class Bogie{
    String name;
    int capacity;

    Bogie(String name,int capacity){
        this.name=name;
        this.capacity=capacity;
    }
}

public class UC7Comparator{
    public static void main(String[] args){
        List<Bogie> list=new ArrayList<>();

        list.add(new Bogie("Sleeper",72));
        list.add(new Bogie("AC Chair",54));
        list.add(new Bogie("First Class",24));

        list.sort(Comparator.comparingInt(b->b.capacity));

        for(Bogie b:list){
            System.out.println(b.name+" "+b.capacity);
        }
    }
}