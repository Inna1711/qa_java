import com.example.Cat;
import com.example.Feline;
import constants.Constants;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.*;

public class TestCat {
    @Mock
    Feline feline;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetFood() throws Exception{
        List<String> testFood = List.of("Мясо", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(testFood);
        Cat cat = new Cat(feline);
        List<String> catFood = cat.getFood();
        Mockito.verify(feline).eatMeat();
        assertArrayEquals("Food is not correct!", testFood.toArray(), catFood.toArray());
    }

    @Test
    public void testGetSound(){
        Cat cat = new Cat(feline);
        String sound = cat.getSound();
        assertEquals("Sound is not correct", Constants.CAT_SOUND, sound);
    }
}
