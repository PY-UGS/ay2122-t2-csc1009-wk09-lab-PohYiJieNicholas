import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class RandomCharacterTest {
    RandomCharacter r;
    @Before
    public void setUp(){
        r = new RandomCharacter();
    }

    @Test
    public void testGetRandomLowerCaseLetter(){
        char randLower = r.getRandomLowerCaseLetter();
        char lowerChar = Character.toLowerCase(randLower); //gurantee lower case

        assertTrue(randLower == lowerChar);
    }

    @Test
    public void testGetRandomUpperCaseLetter(){
        char randUpper = r.getRandomUpperCaseletter();
        char upperChar = Character.toUpperCase(randUpper); //gurantee upper case

        assertTrue(randUpper == upperChar);
    }

    @Test
    public void testGetRandomDigitCharacter(){
        int randDigit = (int)(r.getRandomDigitCharacter()-'0');
        
        assertTrue(randDigit >=0 && randDigit <=9); //true if random digit in from 0-9
    }

    @Test
    public void testGetRandomCharacter(){
        char randChar = r.getRandomCharacter();
        boolean isAlphaNumeric = Character.isLetterOrDigit(randChar); //gurantee lower case

        assertTrue(isAlphaNumeric);
    }

    @Test
    public void testIfRandomPrime(){
        int randDigit = (int)(r.getRandomDigitCharacter()-'0');
        boolean isPrime;
        if(randDigit <= 1 || (randDigit % 2 == 0 && randDigit!=2)){
            isPrime = false;
        }else{
            isPrime = true;
        }

        assertFalse(randDigit+" is not a Prime number", !isPrime);
        assertTrue(randDigit+ "is a Prime number", isPrime);
    }
}
