package JavaTesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerStudyTest {

    @Test
    public void integerStudy(){

        Integer vuit = Integer.valueOf(8);
        Integer vint = Integer.valueOf(20);
        Integer tretze = 13;
        int esperat = 13;

        assertEquals(" El nombre tretze val realment 13 ", esperat, tretze.intValue());

        assertEquals(" El nombre VINT val realment 20 ", 20, vint.intValue());
    }


}