import java.util.LinkedList;

public class Main {

    private static void println(){
        System.out.println();
    }

    private static void println(String string){
        System.out.println(string);
    }

    public static void main(String[] args){
        println();

        println("Swap Numbers:");
        Snippets.swapNumbers(1, 2);
        println();

        println("The factorial sequence");
        println(String.valueOf(Snippets.factorial(10)));
        println();

        println("Is Number Prime:");
        //snippets.isNumberPrime(902424943);
        Snippets.isNumberPrime(4253);
        Snippets.isNumberPrime(7841);
        println();

        println("Fibonacci results:");
        println(String.valueOf(Snippets.getFibonacciNumber(11)));
        println("");

        println("FindTheNextLowestNumber {1,4,2,-254,-92521,-92520,92520}");
        long[] array = {1,4,2,-254,-92521,-92520,92520};
        Snippets.findTheNextLowestNumber(array);
        println();

        println("Remove White Spaces:");
        Snippets.removeWhiteSpaces(" Str i ng Te st ");
        println();

        println("Reverse String:");
        Snippets.reverseString("String Test");
        println();

        println("String Contains Vowel: 'String Test'");
        Snippets.stringContainsVowel("String Test");
        println();

        println("Trimmed String:");
        println((" String    ").trim());
        println();

        println("Check if string contains another string:");
        Snippets.checkIfStringContainsAnotherString("Basfiolsfodralsmakargesäll", "fiol");
        Snippets.checkIfStringContainsAnotherString("Basfiolsfodralsmakargesäll", "gitarrfodral");
        println();

        println("Sort array: {24, -11, 73, 2, -66, -36, -84, 9}:");
        System.out.print("            ");
        Snippets.sortArray();
        println();

        println("Reverse a linked list (a, b, c):");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        Snippets.reverseLinkedList(linkedList);
        println("\n");

        println("Merge two lists:");
        Snippets.mergeTwoArrayLists();
        println();

        println("Print today's date:");
        println(Snippets.getTodaysDate());
        println();
    }
}