package hashmap;

import java.util.HashMap;

public class FindFrequencyOfWord
{
    public static void frequency()
    {
        String sentence = "To be or not to be";

        String[] words = sentence.toLowerCase().split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words)
        {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String key : map.keySet())
        {
            System.out.println(key + " : " + map.get(key));
        }
    }

    public static void findFrequency()
    {
        String paragraph = "Paranoids are not paranoid because they are paranoid but " +
                        "because they keep putting themselves deliberately into " +
                        "paranoid avoidable situations";

        String[] words = paragraph.toLowerCase().split("\\s+");

        HashMap<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words)
        {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        for (String word : frequencyMap.keySet())
        {
            System.out.println(word + " : " + frequencyMap.get(word));
        }
    }

    public static void removeWord()
    {
        String sentence = "Paranoids are not paranoid because they are paranoid but " +
                        "because they keep putting themselves deliberately into " +
                        "paranoid avoidable situations";
        String removeWord = "avoidable";
        String[] words = sentence.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words)
        {
            if (!word.equalsIgnoreCase(removeWord))
            {
                result.append(word).append(" ");
            }
        }
        System.out.println(result.toString().trim());
    }

    public static void main(String[] args)
    {
        FindFrequencyOfWord.frequency();
        FindFrequencyOfWord.findFrequency();
        FindFrequencyOfWord.removeWord();
    }
}
