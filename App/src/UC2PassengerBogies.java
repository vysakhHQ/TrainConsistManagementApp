import java.util.*;

public class UC2PassengerBogies{
    public static void main(String[] args){
        ArrayList<String> bogies=new ArrayList<>();
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");
        System.out.println(bogies);
        bogies.remove("AC Chair");
        System.out.println(bogies.contains("Sleeper"));
        System.out.println(bogies);

    }
}