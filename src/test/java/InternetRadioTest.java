import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InternetRadioTest {

    InternetRadio internetRadio;

    @Before
    public void before(){
        internetRadio = new InternetRadio();
    }

    @Test
    public void canTune(){
        assertEquals("BBC Classics", internetRadio.tune("BBC Classics"));
    }




}
