import com.example.Cat;
import com.example.Feline;
import constants.Constants;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

public class TestCat {
    @Mock
    Feline feline;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void TestGetFood(){
        Cat cat = new Cat(feline);
        try {
            cat.getFood();
            Mockito.verify(feline).eatMeat();
        } catch (Exception e){
            fail("Exception was raised but it shouldn't");
        }
    }

    @Test
    public void TestGetSound(){
        Cat cat = new Cat(feline);
        String sound = cat.getSound();
        assertEquals("Sound is not correct", Constants.CAT_SOUND, sound);
    }
}
