public class Main {
    public static void main(String[] args){
        String randomLowerCase = "";
        String randomUpperCase = "";
        String randomDigitCharacter = "";
        String randomCharacter = "";

        RandomCharacter random = new RandomCharacter();

        for (int i = 0; i < 15; i++){
            randomLowerCase += random.getRandomLowerCaseLetter() + ",";
            randomUpperCase += random.getRandomUpperCaseletter()+",";
            randomDigitCharacter += random.getRandomDigitCharacter()+",";
            randomCharacter += random.getRandomCharacter()+",";
        }

        System.out.print("Generate 15 Lowercase Characters:"+ randomLowerCase);
        System.out.print("\nGenerate 15 Uppercase Characters:"+ randomUpperCase);
        System.out.print("\nGenerate 15 Digit Characters:"+ randomDigitCharacter);
        System.out.print("\nGenerate 15 Random Characters:"+ randomCharacter);
    }
}
