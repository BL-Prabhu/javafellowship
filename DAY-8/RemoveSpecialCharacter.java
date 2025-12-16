public class RemoveSpecialCharacter
{
    public static void main(String[] args)
    {
        String name="j@A V1a2 !";
        String result="";
        for(int i=0;i<name.length();i++)
        {
            char letter=name.charAt(i);
            if((letter >= 'A' && letter <= 'Z') || (letter >= 'a' && letter <= 'z'))
            {
                result=result+name.charAt(i);
            }
        }
        System.out.println(result);
    }
}
