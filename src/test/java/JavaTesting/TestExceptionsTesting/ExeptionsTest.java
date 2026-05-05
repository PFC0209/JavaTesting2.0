package JavaTesting.TestExceptionsTesting;

import org.junit.Assert;
import org.junit.Test;

public class ExeptionsTest {

    @Test (expected = NullPointerException.class)
    public void NullPointerTest(){
        Integer edat = null;

        String edatEnLletres = edat.toString();

        Assert.assertEquals(""+18,edatEnLletres);

    }

    @Test (expected = NullPointerException.class)
    public void catchNullPointerTest(){
        Integer edat = null;

        String edatEnLletres;

        try {
            edatEnLletres = edat.toString();
        }catch (NullPointerException npe){
            edat = 18;
            edatEnLletres = edat.toString();
        }


        Assert.assertEquals(""+18,edatEnLletres);

    }

    @Test (expected = NullPointerException.class)
    public void tryCatchNullPointerTest(){
        Integer edat = null;

        String edatEnLletres = "";

        String text;

        try {
            edatEnLletres = edat.toString();
        }catch (NullPointerException npe){
            edat = 18;
            edatEnLletres = edat.toString();
        }finally {
            text = "Edat ==" + edatEnLletres;
        }


        Assert.assertEquals(""+18, text);

    }

    @Test (expected = NullPointerException.class)
    public void throwingIllegalArgumentExecptionTryCatchNullPointerTest(){
        Integer edat = null;

        String edatEnLletres = "";

        String text;

        try {
            System.out.println(" Passa 1 - generam NullPointerException");
            edatEnLletres = edat.toString();
        }catch (NullPointerException npe){
            System.out.println(" Passa 2 - capturam la NullPointerException");
            System.out.println(" Passa 3 - Anam a llença una excepcio");
            throw new IllegalArgumentException("Excepcio creada i llancada per mi");
        }finally {
            System.out.printf("Passa final -codi tancament");
        }

    }

    @Test (expected = NullPointerException.class)
    public void exepcioErronia(){
        Integer edat = null;

        String edatEnLletres = "";

        String text;

        try {
            System.out.println(" Passa 1 - generam NullPointerException");
            edatEnLletres = edat.toString();

            throw new IllegalArgumentException("Excepcio creada i llancada per mi");
        }catch (IllegalArgumentException e){
            System.out.println(" Passa 2 - capturam la IllegalArgumentException");

        }finally {
            System.out.println("Passa final -codi tancament");

        }


    }

    @Test (expected = NullPointerException.class)
    public void jugantAmbObjecteExepcioTest(){
        Integer edat = null;

        String edatEnLletres;

        try {
            edatEnLletres = edat.toString();
        }catch (NullPointerException npe){
            edat = 18;
            edatEnLletres = edat.toString();
            System.out.println("Anem a jugar amb l'objecte  !!!!");

            System.out.println(npe.getMessage());
            System.out.println(npe.getStackTrace());
            npe.printStackTrace();
        }


        Assert.assertEquals(""+18,edatEnLletres);

    }
}