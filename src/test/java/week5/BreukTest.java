package week5;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BreukTest {
    private Breuk a;
    private Breuk b;

    @Before
    public void setUp(){
        a = new Breuk (1, 2);
        b = new Breuk (1, 2);
    }

    @After
    public void tearDown(){
        /*System.out.println("nieuwe test " + a.getTeller() + "/" + a.getNoemer()); niet volledig juist */
    }


    @Test
    public void breukWordCorrectVereenvoudigd(){
        Breuk controleBreuk = new Breuk(4,8);

        controleBreuk.vereenvoudig();

        Assert.assertEquals(controleBreuk.getTeller(), 1);
        Assert.assertEquals(controleBreuk.getNoemer(), 2);


    }
    @Test
    public void teltPlusOp() {
        /*Breuk a = new Breuk (1, 2);
        Breuk b = new Breuk (1, 2);*/ // niet meer nodig door @before en setUp

        a.plus(b);

        Assert.assertEquals(a.getTeller(), 1);
        Assert.assertEquals(a.getNoemer(), 1);
    }

    @Test
    public void trektMinAf() {
        /* setUp();*/ //  niet meer nodig door @Before

        a.min(b);

        Assert.assertEquals(a.getTeller(), 0);
        Assert.assertEquals(a.getNoemer(), 4);
    }

    @Test
    public void vermenigvuldigdMaal() {
        /*Breuk a = new Breuk (1, 2);
        Breuk b = new Breuk (1, 2);*/ // niet meer nodig door @ before en setUp

        a.maal(b);

        Assert.assertEquals(a.getTeller(), 1);
        Assert.assertEquals(a.getNoemer(), 4);
    }

    @Test
    public void deeltDelen() {
        /*Breuk a = new Breuk (1, 2);
        Breuk b = new Breuk (1, 2);*/ // niet meer nodig door @ before en setUp

        a.delen(b);

        Assert.assertEquals(a.getTeller(), 1);
        Assert.assertEquals(a.getNoemer(), 1);
    }

    @Test (expected = IllegalArgumentException.class)
    public void delenDoorNul() {
        Breuk c = new Breuk(1,0);
        a.delen(c);
    }

}
