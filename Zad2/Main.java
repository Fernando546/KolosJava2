
public class Main{
    public static void main(String[] args) {
        String sentence = "To! #jest@ przy$$$kladowe# zdanie%";
        String cleanedSentence = removeSpecialCharacters(sentence);

        System.out.println("Oryginalne zdanie: " + sentence);
        System.out.println("Zdanie po usunięciu znaków specjalnych: " + cleanedSentence);
    }
    public static String removeSpecialCharacters(String input) {
        return input.replaceAll("[^a-zA-Z0-9\\s]", "");
    }
}