public class SpecifiedCharacter {
        public static void main (String[] args) {

        String input = "Hello World";
        
        String inputLower = input.toLowerCase();
        
        char [] character = inputLower.toCharArray();
        //System.out.print(inputLower);
        
           SpecifiedCharacterFunction.getOccurences(character);

                }

}