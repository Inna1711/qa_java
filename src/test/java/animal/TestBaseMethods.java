package animal;

import com.example.Animal;
import constants.Constants;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBaseMethods {

    @Test
    public void TestGetFamily(){
        Animal animal = new Animal();
        String family = animal.getFamily();
        assertEquals("Wrong family names message!", Constants.FAMILY_NAMES_MESSAGE, family);
    }
}
