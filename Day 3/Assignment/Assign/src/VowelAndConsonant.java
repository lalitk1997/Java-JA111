public class VowelAndConsonant {
    void checkChar(char ch){
        byte size = (byte)ch;
        if((size >= 65 && size <= 90) || (size >= 97 && size <= 122)){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.println("Vowel : "+ch);
            }else{
                System.out.println("Consonant : "+ch);
            }
        }else{
            System.out.println("Invalid Char");
        }
    }
    public static void main(String[] args) {
        VowelAndConsonant obj = new VowelAndConsonant();
        obj.checkChar('a');
        obj.checkChar('z');
        obj.checkChar('!');
    }
}
