package lion;

import com.example.Feline;
import com.example.Lion;
import constants.Constants;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.*;

public class TestBaseMethods {
    @Mock
    Feline feline;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetKittens() throws Exception{
        Lion lion = new Lion(Constants.MALE, feline);
        int testKittensCount = 10;
        Mockito.when(feline.getKittens()).thenReturn(testKittensCount);
        int kittensCount = lion.getKittens();
        Mockito.verify(feline).getKittens();
        assertEquals("Kittens count is not correct!", testKittensCount, kittensCount);
    }

    @Test
    public void testGetFood() throws Exception{
        Lion lion = new Lion(Constants.MALE, feline);
        List<String> testFood = List.of("Мясо", "Птица");
        Mockito.when(feline.getFood(Constants.PREDATOR)).thenReturn(testFood);
        List<String> lionFood = lion.getFood();
        Mockito.verify(feline).getFood(Constants.PREDATOR);
        assertArrayEquals("Food is not correct!", testFood.toArray(), lionFood.toArray());
    }
}
