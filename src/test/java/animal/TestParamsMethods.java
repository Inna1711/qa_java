package animal;

import com.example.Animal;
import constants.Constants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TestParamsMethods {
    String animalKind;
    Boolean isCorrect;
    List<String> animalFood;

    public TestParamsMethods(String animalKind, Boolean isCorrect, List<String> animalFood){
        this.animalKind = animalKind;
        this.isCorrect = isCorrect;
        this.animalFood = animalFood;
    }

    @Parameterized.Parameters
    public static Object[][] getAnimalKind(){
        return new Object[][]{
                {Constants.PREDATOR, true, Constants.PREDATOR_FOOD},
                {Constants.HERBIVORE, true, Constants.HERBIVORE_FOOD},
                {"Планктон", false, List.of()}
        };
    }

    @Test
    public void TestAnimalFood(){
        Animal animal = new Animal();
        try {
            List<String> food = animal.getFood(animalKind);
            assertArrayEquals("Food is not correct!", animalFood.toArray(), food.toArray());
        } catch (Exception e){
            if (isCorrect){
                fail("Exception should not be thrown!");
            }else {
                assertEquals("Exception message is not correct", Constants.WRONG_ANIMAL_TYPE_EXCEPTION_MESSAGE, e.getMessage());
            }
        }

    }
}
