import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;
class UC9GroupingTest{
    @Test
    void testGrouping(){
        List<Bogie> list=new ArrayList<>();
        list.add(new Bogie("Sleeper",72));
        list.add(new Bogie("Sleeper",70));
        list.add(new Bogie("AC Chair",54));
        Map<String,List<Bogie>> map=list.stream().collect(Collectors.groupingBy(b->b.name));
        assertTrue(map.containsKey("Sleeper"));
        assertEquals(2,map.get("Sleeper").size());
    }
    @Test
    void testDifferentTypes(){
        List<Bogie> list=new ArrayList<>();
        list.add(new Bogie("Sleeper",72));
        list.add(new Bogie("AC Chair",54));
        Map<String,List<Bogie>> map=list.stream().collect(Collectors.groupingBy(b->b.name));
        assertEquals(2,map.size());
    }
    @Test
    void testEmptyList(){
        List<Bogie> list=new ArrayList<>();
        Map<String,List<Bogie>> map=list.stream().collect(Collectors.groupingBy(b->b.name));
        assertEquals(0,map.size());
    }
    @Test
    void testOriginalListUnchanged(){
        List<Bogie> list=new ArrayList<>();
        list.add(new Bogie("Sleeper",72));
        list.add(new Bogie("AC Chair",54));
        list.stream().collect(Collectors.groupingBy(b->b.name));
        assertEquals(2,list.size());
    }
}