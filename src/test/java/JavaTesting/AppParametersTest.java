package JavaTesting;

import JavaTesting.Resources.AppParameters;
import org.junit.Assert;
import org.junit.Test;

public class AppParametersTest {
    public static final String DOMAIN_EXPECTED = "127.0.0.1";

    public static final String PORT_EXPECTED = "80";

    public static final String URL_EXPECTED = "http://" + DOMAIN_EXPECTED + ":" + PORT_EXPECTED;

    @Test
    public void domainURLCorrect(){

        Assert.assertEquals("Retorna una part FQDN", DOMAIN_EXPECTED, AppParameters.DOMAIN);
    }

    @Test
    public void correctPort(){

        Assert.assertEquals("Retorna el port correcte", PORT_EXPECTED, AppParameters.PORT);
    }

    @Test
    public void correctURL(){

        Assert.assertEquals("Retorna la URL de forma correcte", URL_EXPECTED, AppParameters.deployedURL());
    }


    @Test
    public void singletonCorrectness(){
        AppParameters inst1 = AppParameters.getInstance();
        AppParameters inst2 = AppParameters.getInstance();

        Assert.assertTrue("Comprovació unicitat instancia del singleton", (inst1 == inst2));
    }
}