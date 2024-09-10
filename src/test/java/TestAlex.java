import com.example.Alex;
import constants.Constants;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TestAlex {

    @Test
    public void testConstructor(){
        try {
            new Alex();
        } catch (Exception e){
            fail("Alex constructor should not raise exception!");
        }
    }

    @Test
    public void testGetFriends() throws Exception{
        Alex alex = new Alex();
        List<String> friends = alex.getFriends();
        assertArrayEquals("Alex friends are not correct!", Constants.ALEX_FRIENDS.toArray(), friends.toArray());
    }

    @Test
    public void testGetPlaceOfLiving() throws Exception{
        Alex alex = new Alex();
        String placeOfLiving = alex.getPlaceOfLiving();
        assertEquals("Alex place of living is not correct!", Constants.ALEX_PLACE_OF_LIVING, placeOfLiving);
    }
    @Test
    public void testGetKittens() throws Exception{
        Alex alex = new Alex();
        int kittensCount = alex.getKittens();
        assertEquals("Alex kittens count is not correct!", Constants.ALEX_KITTENS_COUNT, kittensCount);
    }
}
