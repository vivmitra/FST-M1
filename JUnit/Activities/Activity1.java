import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Activity1 {

    static ArrayList<String> list;

    @BeforeEach
    void setup(){
        list = new ArrayList<>();
        list.add("alpha");
        list.add("beta");
    }

    @Test
    void insertText(){
        assertEquals(2, list.size(), "Wrong size");

        list.add("gamma");
        assertEquals(3, list.size(), "Wrong size");

        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("beta", list.get(1), "Wrong element");
        assertEquals("gamma", list.get(2), "Wrong element");
    }

    @Test
    void replaceTest(){

        assertEquals(2, list.size(), "Wrong size");

        list.set(1, "zeta");
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("zeta", list.get(1), "Wrong element");

    }






}
