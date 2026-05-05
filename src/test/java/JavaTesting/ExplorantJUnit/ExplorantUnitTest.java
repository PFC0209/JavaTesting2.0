package JavaTesting.ExplorantJUnit;

import org.junit.*;
import org.junit.rules.ExpectedException;

import java.security.InvalidParameterException;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;

public class ExplorantUnitTest {

    @Rule
    public ExpectedException expected = ExpectedException.none();


    @Test(expected = InvalidParameterException.class)
    public void testejantIllegalArgumentException(){

        throw new IllegalArgumentException();

    }
    @Ignore
    @Test
    public void illegalParameterersTest(){
        expected.expect(IllegalArgumentException.class);

        throw new IllegalArgumentException();

    }

    @Test
    public void missatgeExepcionTest(){
        expected.expect(IllegalArgumentException.class);
        expected.expectMessage("that");

        throw new IllegalArgumentException("the exception");

    }

    @BeforeClass
    public static void executaUnCopPerClasseAbansDeQualsevolTest(){
        System.out.println("Abans de executar qualsevol test, un cop per classe");
    }

    @AfterClass
    public static void executaUnCopDespresDeQualsevolTest(){
        System.out.println("Abans de executar qualsevol test, un cop per classe");
    }

    @Before
    public void executaAbansDeCadaTest(){
        System.out.println("Abans de executar qualsevol test, per a cada test !!!");
    }

    @After
    public void executaDespresDeCadaTest(){
        System.out.println("Després de executar qualsevol test, un cop per classe");
    }

    @Test
    public void assercionsDeJUnit(){
        Assert.assertEquals(5, 2 + 3);

        Assert.assertFalse("fals es fals", false);

        Assert.assertFalse( (3 > 5));

        Assert.assertTrue((5 > 3));

        int[] finsA10 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] primers10 = {2, 1, 3, 4, 5, 6, 7, 8, 9, 10};

        Arrays.sort(primers10);

        Assert.assertArrayEquals(finsA10, primers10 );

        Assert.assertNotNull("Un String buit No es null", "");
        Assert.assertNotNull("");

        Assert.assertNotSame("Un String buit NO es null","",  null);
        Assert.assertNotSame("",  null);

        Assert.assertNull("Nomes null es considerat null",  null);

        Object obj = null;
        Assert.assertSame(obj,  null);

    }

    @Test
    public void assertThatAmbHamcrest(){

        Assert.assertThat("testejant que 4+5 son 9",4+5, is(9));

        Assert.assertThat("fals es fals", false, equalTo(false));

        Assert.assertThat(false, is(false));


        Assert.assertThat("true es true", true, equalTo(true));

        Assert.assertThat(true, is(true));

        Assert.assertThat("Un String buit no es null", is( not( nullValue() ) ));

        Assert.assertThat("Aixo es un text", containsString("un"));

        Assert.assertThat("Aixo es un text", startsWith("Ai"));
    }
}