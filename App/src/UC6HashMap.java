import java.util.*;

public class UC6HashMap{
    public static void main(String[] args){
        HashMap<String,Integer> map=new HashMap<>();

        map.put("Sleeper",72);
        map.put("AC Chair",54);
        map.put("First Class",24);

        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}