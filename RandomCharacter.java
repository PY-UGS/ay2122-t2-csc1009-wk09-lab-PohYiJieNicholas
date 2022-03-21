import java.util.*;

class RandomCharacter{
    Random random = new Random();

    public char getRandomLowerCaseLetter(){
        char lowerCase = (char)(random.nextInt(26)+'a');

        return lowerCase;

    }

    public char getRandomUpperCaseletter(){
        char upperCase = (char)(random.nextInt(26)+'A');

        return upperCase;

    }

    public char getRandomDigitCharacter(){
        char randomDigit = (char)(random.nextInt(9)+'0');

        return randomDigit;

    }
    
    public char getRandomCharacter(){
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        int randomInt = random.nextInt(characters.length());
        char randomChar = characters.charAt(randomInt);

        return randomChar;


    }
   
}