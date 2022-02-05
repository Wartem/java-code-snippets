import java.text.SimpleDateFormat;
import java.util.*;

public class Snippets {

    public static void swapNumbers(int a, int b){
        Main.println("a = " + a +". " + "b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        Main.println("After swap: a = " + a +". " + "b = " + b);
    }

    public static long factorial(long num) {
        return (num == 1) ?
                1 :
                num * factorial(num - 1);
    }

    public static void isNumberPrime(long number){
        Main.println(isNumberPrimeCalc(number) ?
                "Yes, " + number + " is a prime" :
                "No, " + number + " is not a prime");
    }

    /**
     * @param number is True if it's greater than 1 and only dividable with itself or 1,
     * without leaving a remainder.
     */
    public static boolean isNumberPrimeCalc(long number){
        if (number == 0 || number == 1) return false;
        if (number == 2) return true;

            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }

    /**
     * The Fibonacci sequence.
     * Each number is the sum of the two preceding ones.
     * @param num Get the Nth Fibonacci number.
     */
    public static long getFibonacciNumber(long num) {
        if (num <= 1)
            return num;
        return getFibonacciNumber(num-1) + getFibonacciNumber(num-2);
    }

    public static void findTheNextLowestNumber(long[] array){
        long lowestNum = Long.MAX_VALUE;
        long secondLowestNum = Long.MAX_VALUE;

        for(long num : array){
            if(num < lowestNum){
                secondLowestNum = lowestNum;
                lowestNum = num;
            }else if(num < secondLowestNum){
                secondLowestNum = num;
            }
        }
        Main.println("The second lowest number is " + secondLowestNum);
        Main.println("The lowest number is " + lowestNum);
    }

    public static void removeWhiteSpaces(String string){
        String noWhiteSpace = "";
        for(char c : string.toCharArray()){
            noWhiteSpace = noWhiteSpace.concat(Character.isWhitespace(c) ? "" : Character.toString(c));
        }
        Main.println(noWhiteSpace);
    }

    public static void reverseString(String string){
        StringBuilder stringBuilder = new StringBuilder();

        char[] stringChars = string.toCharArray();
        for (int counter = stringChars.length - 1; counter >= 0; counter--) {
            stringBuilder.append(stringChars[counter]);
        }
        Main.println("Reverse string:");
        Main.println("\"" + string + "\" reversed is \"" + stringBuilder +"\"");
    }

    public static void stringContainsVowel(String string){
        Main.println(
                string.toLowerCase().matches(".*[aeiou].*") ? "True" : "False");
    }

    public static void checkIfStringContainsAnotherString(String string, String substring) {
        Main.println("Does '" + string + "' contains '" + substring + "'?");
        Main.println(string.contains(substring) ? "Yes" : "No");
    }

    public static void sortArray(){
        int[] array = {24, -11, 73, 2, -66, -36, -84, 9};
        Arrays.sort(array);
        Main.println(Arrays.toString(array));
    }

    public static void reverseLinkedList(LinkedList<String> linkedList) {
        Iterator<String> iterator = linkedList.descendingIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

    public static void mergeTwoArrayLists() {
        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList1.add("Det");
        arrayList1.add("är");
        arrayList2.add("fint");
        arrayList2.add("väder");
        arrayList2.add("idag");
        arrayList1.addAll(arrayList2);
        System.out.println(arrayList1);
    }

    public static String getTodaysDate(){
        return (new SimpleDateFormat("dd-MM-yyyy")).
                format(new Date());
    }
}
