package hashtable;

public class Main
{
    public static void main(String[] args)
    {
        HashTable myhashtable=new HashTable();
        myhashtable.set("prabhu",5);
        myhashtable.set("anbu",4);
        myhashtable.set("vinoth",3);
        myhashtable.set("ronaldo",2);
        myhashtable.printTable();
        System.out.println("-------------------------------------------------");
        System.out.println(myhashtable.get("vinoth"));
        System.out.println("-------------------------------------------------");
        System.out.println( myhashtable.keys());
    }
}
