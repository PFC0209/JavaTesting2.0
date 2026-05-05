package JavaTesting.collectionsTest;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class SimpleCollectionTest {

    @Test
    public void firstCollectionTest() {
        String [] nombres = {"zero", "un", "dos", "tres"};

        List<String> numerals = new ArrayList<>();

        for (String s : nombres) {
            numerals.add(s);
        }

        numerals.add("quatre");

        Assert.assertTrue(numerals.size() == 5);

        List<String> llistaNumeros = Arrays.asList(nombres);

        //llistaNumeros.add("quatre");

        Assert.assertTrue(llistaNumeros.size() == 4);
    }

    @Test
    public void diesSetmana(){
        List<String> diesSetmana = new ArrayList<>();
        List<String> diesFeiners = new ArrayList<>();
        List<String> diesCapDeSetmana = new ArrayList<>();
        List<String> calculDies = new ArrayList<>();

        initDiesFeiners(diesFeiners);

        Assert.assertTrue(diesFeiners.size() == 5);

        Assert.assertEquals(0, diesSetmana.size());
        Assert.assertFalse(diesSetmana.containsAll(diesFeiners));

        diesSetmana.addAll(diesFeiners);

        Assert.assertEquals(5, diesSetmana.size());
        Assert.assertFalse(diesSetmana.containsAll(diesFeiners));

        diesCapDeSetmana.add("disssabte");
        diesCapDeSetmana.add("diumenge");

        diesSetmana.addAll(diesCapDeSetmana);

        Assert.assertEquals(7, diesSetmana.size());
        Assert.assertFalse(diesSetmana.contains(diesCapDeSetmana));

        List<String> diesSenars = new ArrayList<>();

        diesSenars.addAll(diesSetmana);

        Assert.assertTrue(diesSenars.contains("dimarts"));

        diesSenars.remove(1);

        Assert.assertFalse(diesSenars.contains("dimarts"));

        diesSenars.remove("dijous");

        Assert.assertFalse(diesSenars.contains("dijous"));

        List<String> diesFeinersSenars = new ArrayList<>();

        diesFeinersSenars.addAll(diesSenars);

        diesFeinersSenars.removeAll(diesCapDeSetmana);

        Assert.assertEquals(3,diesFeinersSenars.size());

        Assert.assertFalse(diesFeinersSenars.contains("dissabte"));

        calculDies.addAll(diesSetmana);

        Assert.assertTrue(calculDies.containsAll(diesFeiners));
        Assert.assertTrue(calculDies.containsAll(diesCapDeSetmana));

        calculDies.clear();

        Assert.assertTrue(calculDies.isEmpty());

        calculDies.addAll(diesSetmana);

        calculDies.removeAll(diesCapDeSetmana);

        Assert.assertEquals(5, calculDies.size());

    }

    @Test
    public void provesAmbMaps(){

        Map<String, String> map = new HashMap<>();

        map.put("fons","negre");
        map.put("menus", "blau");
        map.put("dialeg", "verd");

        Assert.assertEquals(map.size(), 3);

        Assert.assertTrue(map.containsKey("menus"));

        map.remove("dialeg");

        Assert.assertEquals(map.size(), 2);

        map.remove("clauInexistent");

        Assert.assertEquals(map.size(), 2);

        Assert.assertTrue(map.get("fons").equals("negre"));


    }

    public void initDiesFeiners(List<String> dies){
        dies.add("dilluns");
        dies.add("dimarts");
        dies.add("dimecres");
        dies.add("dijous");
        dies.add("divendres");


    }

    @Test
    public void provesSetTest(){

        Set<String> dies = new HashSet<>();

        dies.add("dilluns");
        dies.add("dilluns");
        dies.add("dilluns");

        Assert.assertEquals(dies.size(), 1);
    }
}