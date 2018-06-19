package week5;

import org.junit.Assert;
import org.junit.Test;

public class LesTest {
    /*public static void main(String[] args) {
        boolean out = Les.isPrime(7);
        if (out != true){
            System.out.println("FOUT");
        } else {
            System.out.println("OK");
        }

        out = Les.isPrime(6);
        if (out != false){
            System.out.println("FOUT");
        } else {
            System.out.println("OK");
        }


    }*/

    @Test
    public void  primeNumberReturnsTrueIfValueIsPrime(){
        boolean out = Les.isPrime(7);
        Assert.assertTrue(out);
    }

    @Test
    public void  primeNumberReturnsTrueIfValueIsPrimeb(){
        int[] primes = {3, 5, 7, 97, 13};

        for (int prime:primes) {
            Assert.assertTrue(Les.isPrime(prime));
        }
    }

    @Test
    public void primeNumberReturnsFalseIfValueIsNotPrime(){
        boolean out = Les.isPrime(6);
        Assert.assertFalse(out);

    }

    @Test
    public void oneIsNotAPrime(){
        boolean out = Les.isPrime(1);
        Assert.assertFalse(out);

    }

    @Test
    public void negativeNumbersAreNotPrimes(){
        boolean out = Les.isPrime(-5);
        Assert.assertFalse(out);

    }

}
