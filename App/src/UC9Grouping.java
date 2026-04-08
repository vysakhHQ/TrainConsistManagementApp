import java.util.*;
import java.util.stream.*;
class Bogie{
    String name;
    int capacity;
    Bogie(String name,int capacity){
        this.name=name;
        this.capacity=capacity;
    }
}
public class UC9Grouping{
    public static void main(String[] args){
        List<Bogie> list=new ArrayList<>();
        list.add(new Bogie("Sleeper",72));
        list.add(new Bogie("Sleeper",70));
        list.add(new Bogie("AC Chair",54));
        list.add(new Bogie("First Class",24));
        Map<String,List<Bogie>> map=list.stream().collect(Collectors.groupingBy(b->b.name));
        for(String k:map.keySet()){
            System.out.print(k+" ");
            for(Bogie b:map.get(k)){
                System.out.print(b.capacity+" ");
            }
            System.out.println();
        }
