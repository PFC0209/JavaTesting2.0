package JavaTesting;

import DomainEntities.User;
import org.junit.Assert;
import org.junit.Test;

public class UserTest {

    @Test
    public void contructUserTest(){
        User usuari = new User("Tomeu", "secret");

        Assert.assertTrue(usuari != null);

        Assert.assertEquals(usuari.getName(), "Tomeu");
        Assert.assertEquals(usuari.getPassword(), "secret");
    }
}