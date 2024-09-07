package Feline;

import com.example.Feline;
import constants.Constants;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TestBaseMethods {
    @Test
    public void TestEatMeat(){
        Feline feline = new Feline();
        try {
            List<String> food = feline.eatMeat();
            assertArrayEquals("Food is not valid!", Constants.PREDATOR_FOOD.toArray(), food.toArray());
        } catch (Exception e){
            fail("Exception is not expected!");
        }

    }
    @Test
    public void TestGetKittens(){
        Feline feline = new Feline();
        int kittensCount = feline.getKittens();
        assertEquals("Amount of kittens is not equal!", Constants.DEFAULT_KITTENS_COUNT, kittensCount);
    }

    @Test
    public void TestGetFamily(){
        Feline feline = new Feline();
        String family = feline.getFamily();
        assertEquals("Family is not correct!", Constants.FELINE_FAMILY_NAME, family);
    }
}


