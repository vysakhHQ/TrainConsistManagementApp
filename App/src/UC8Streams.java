import java.util.*;
import java.util.stream.*;

public class UC8Streams{
    public static void main(String[] args){
        List<Bogie> list=new ArrayList<>();
        list.add(new Bogie("Sleeper",72));
        list.add(new Bogie("AC Chair",54));
        list.add(new Bogie("First Class",24));
        List<Bogie> result=list.stream().filter(b->b.capacity>60).toList();
        for(Bogie b:result){
            System.out.println(b.name+" "+b.capacity);
        }
        System.out.println("UC8 done");
    }
}