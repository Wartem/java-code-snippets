import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        System.out.println();

        System.out.println("Swap Numbers:");
        Snippets.swapNumbers(1, 2);
        System.out.println();

        System.out.println("Reverse String:");
        Snippets.reverseString("String Test");
        System.out.println();

        System.out.println("String Contains Vowel:");
        Snippets.stringContainsVowel("String Test");
        System.out.println();

        System.out.println("Is Number Prime:");
        //snippets.isNumberPrime(902424943);
        Snippets.isNumberPrime(4253);
        Snippets.isNumberPrime(7841);
        System.out.println();

        System.out.println("The Fibonacci sequence:");
        System.out.println(Snippets.getFibonacciNumber(11));
        System.out.println("");

        System.out.println("Remove White Spaces:");
        Snippets.removeWhiteSpaces(" Str i ng Te st ");
        System.out.println();

        System.out.println("Trimmed String:");
        System.out.println((" String    ").trim());
        System.out.println();

        System.out.println("Sort array: {24, -11, 73, 2, -66, -36, -84, 9}:");
        System.out.print("            ");
        Snippets.sortArray();
        System.out.println();

        System.out.println("The factorial sequence");
        System.out.println(Snippets.factorial(10));
        System.out.println();

        System.out.println("Reverse a linked list (a, b, c):");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        Snippets.reverseLinkedList(linkedList);
        System.out.println("\n");

        System.out.println("FindTheNextLowestNumber {1,4,2,-254,-92521,-92520,92520}");
        long[] array = {1,4,2,-254,-92521,-92520,92520};
        Snippets.findTheNextLowestNumber(array);
        System.out.println();

        System.out.println("Check if string contains another string:");
        Snippets.checkIfStringContainsAnotherString("Basfiolsfodralsmakargesäll", "fiol");
        Snippets.checkIfStringContainsAnotherString("Basfiolsfodralsmakargesäll", "gitarrfodral");
        System.out.println();

        System.out.println("Print today's date:");
        System.out.println(Snippets.getTodaysDate());
        System.out.println();

        System.out.println("Merge two lists:");
        Snippets.mergeTwoArrayLists();
        System.out.println();
    }
}