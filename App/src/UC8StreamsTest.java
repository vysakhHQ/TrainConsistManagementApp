import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
class UC8StreamsTest{
    @Test
    void testFilter_CapacityGreaterThan60(){
        List<Bogie> list=new ArrayList<>();
        list.add(new Bogie("Sleeper",72));
        list.add(new Bogie("AC Chair",54));
        list.add(new Bogie("First Class",24));

        List<Bogie> result=list.stream().filter(b->b.capacity>60).toList();

        assertEquals(1,result.size());
        assertEquals("Sleeper",result.get(0).name);
    }
    @Test
    void testFilter_NoMatch(){
        List<Bogie> list=new ArrayList<>();
        list.add(new Bogie("AC Chair",50));
        list.add(new Bogie("First Class",24));
        List<Bogie> result=list.stream().filter(b->b.capacity>60).toList();
        assertEquals(0,result.size());
    }
    @Test
    void testFilter_AllMatch(){
        List<Bogie> list=new ArrayList<>();
        list.add(new Bogie("Sleeper",72));
        list.add(new Bogie("AC",80));
        List<Bogie> result=list.stream().filter(b->b.capacity>60).toList();
        assertEquals(2,result.size());
    }
    @Test
    void testOriginalListUnchanged(){
        List<Bogie> list=new ArrayList<>();
        list.add(new Bogie("Sleeper",72));
        list.add(new Bogie("AC Chair",54));
        list.stream().filter(b->b.capacity>60).toList();
        assertEquals(2,list.size());
    }
}