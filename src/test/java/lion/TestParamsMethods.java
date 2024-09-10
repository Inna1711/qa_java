package lion;

import com.example.Feline;
import com.example.Lion;
import constants.Constants;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TestParamsMethods {
    @Mock
    Feline feline;

    String sex;
    Boolean isFailure;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    public TestParamsMethods(String sex, Boolean isFailure){
        this.sex = sex;
        this.isFailure = isFailure;
    }

    @Parameterized.Parameters
    public static Object[][] getLionsInit(){
        return new Object[][]{
                {
                    Constants.MALE, false
                },
                {
                    Constants.FEMALE, false
                },
                {
                    "Нечто", true
                }

        };
    }

    private Lion GetLion(){
        try {
            return new Lion(sex, feline);
        }catch (Exception e){
            assertEquals( "Message is not as expected!", Constants.WRONG_SEX_TYPE_EXCEPTION_MESSAGE, e.getMessage() );
            return null;
        }
    }

    @Test
    public void testConstructor(){
        try {
            new Lion(sex, feline);
        } catch (Exception e){
            if (isFailure){
                assertEquals( "Message is not as expected!", "Используйте допустимые значения пола животного - самей или самка", e.getMessage() );
            } else {
                fail("There shouldn't be an exception raised");
            }
        }

    }

    @Test
    public void testHasMane(){
        if (!isFailure){
            Lion lion = GetLion();
            if (lion != null){
                var result = lion.doesHaveMane();
                assertEquals("Wrong mane attribute", sex.equals(Constants.MALE), result);
            }
            else {
                fail("In this case lion should be created");
            }
        }
    }
}
