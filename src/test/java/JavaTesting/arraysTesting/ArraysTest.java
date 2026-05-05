package JavaTesting.arraysTesting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ArraysTest {

    @Test
    public void exempleArraySenzill(){
        String[] numerals = {"zero", "un", "dos", "tres"};

        Assert.assertEquals(numerals[0], "zero");

        String nombres ="";

        for (String n : numerals) {
            nombres += n + '|';
        }

        Assert.assertEquals(nombres, "zero|un|dos|tres");
    }

    @Test
    public void provesordenacioArays(){
        String[] numerals = {"zero", "un", "dos", "tres"};

        Arrays.sort(numerals);

        for(int i = 0; i < numerals.length -1; i++){
            Assert.assertTrue(numerals[i].compareTo(numerals[i+1]) < 0);
        }
    }

    @Test
    public void farcirArrayParcialment(){
        int [] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        Arrays.fill(nums, 5, 10, -1);

        for(int i = 5; i < nums.length -1; i++){
            Assert.assertTrue(nums[i] == -1);
        }
    }

    @Test
    public void copiaRangMatriu(){
        String [] dies = {"dilluns", "diamrts", "dimecres", "dijous", "divendres", "dissabte", "diumenge"};

        String [] feiners = Arrays.copyOfRange(dies, 0, 5);

        Assert.assertEquals(feiners.length, 5);
        Assert.assertTrue(feiners[0].equals("dilluns"));

        String [] feinersEsclaus = Arrays.copyOfRange(feiners, 0, 7);

        Assert.assertTrue(feinersEsclaus[0].equals("dilluns"));

        Assert.assertEquals(feinersEsclaus[5], null);
        Assert.assertEquals(feinersEsclaus[6], null);

        feinersEsclaus[5] ="dissabteDeFeina";
        feinersEsclaus[6] ="diaDeDescans";

        Assert.assertTrue(feinersEsclaus[5].equals("dissabteDeFeina"));
        Assert.assertTrue(feinersEsclaus[6].equals("diaDeDescans"));
    }

    @Test
    public void arraysIrregularsTest(){
        int [][] arrayIrregular = {{0, 1, 2, 3, 4, 5}, {0,1,2,3,4},{0, 1, 2, 3}, {0,1 ,2}, {0, 1}, {0}};

        Assert.assertEquals(arrayIrregular.length, 6);

        Assert.assertEquals(arrayIrregular[0].length, 6);

        Assert.assertEquals(arrayIrregular[5], 1);
    }
}