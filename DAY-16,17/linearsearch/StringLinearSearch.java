package linearsearch;

public class StringLinearSearch {

    public static void findSentenceContainingWord(String[] sentences, String word)
    {

        for (int i = 0; i < sentences.length; i++)
        {
            if (sentences[i].contains(word))
            {
                System.out.println(sentences[i]);
                return;
            }
        }

        System.out.println("NOT FOUND");
    }

    public static void main(String[] args) {

        String[] sentences = {
                "Java is a programming language",
                "Linear search is simple",
                "Data structures are important",
                "Searching algorithms are useful"};

        String word = "search";

        findSentenceContainingWord(sentences, word);
    }
}
