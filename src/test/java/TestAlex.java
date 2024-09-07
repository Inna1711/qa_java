import com.example.Alex;
import constants.Constants;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TestAlex {

    @Test
    public void TestConstructor(){
        try {
            new Alex();
        } catch (Exception e){
            fail("Alex constructor should not raise exception!");
        }
    }

    @Test
    public void TestGetFriends(){
        try {
            Alex alex = new Alex();
            List<String> friends = alex.getFriends();
            assertArrayEquals("Alex friends are not correct!", Constants.ALEX_FRIENDS.toArray(), friends.toArray());
        } catch (Exception e){
            fail("Alex constructor should not raise exception!");
        }
    }

    @Test
    public void TestGetPlaceOfLiving(){
        try {
            Alex alex = new Alex();
            String placeOfLiving = alex.getPlaceOfLiving();
            assertEquals("Alex place iof living is not correct!", Constants.ALEX_PLACE_OF_LIVING, placeOfLiving);
        } catch (Exception e){
            fail("Alex constructor should not raise exception!");
        }
    }
}
