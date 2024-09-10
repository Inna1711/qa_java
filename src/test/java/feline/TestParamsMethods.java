package feline;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestParamsMethods {

    int kittensCount;

    public TestParamsMethods(int kittensCount){
        this.kittensCount = kittensCount;
    }

    @Parameterized.Parameters
    public static Object[][] getLionsInit(){
        return new Object[][]{
                {0}, {-1}, {1000000000}
        };
    }

    @Test
    public void TestGetKittensParams(){
        Feline feline = new Feline();
        int kittens = feline.getKittens(kittensCount);
        assertEquals("Kittens count is not equal!", kittensCount, kittens);
    }
}
