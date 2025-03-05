package TCScodeVita;
import java.util.HashMap;
import java.util.Map;

public class Problem2{
    private static final Map<String, Integer> numWords = new HashMap<>();
    private static final Map<String, Operation> operations = new HashMap<>();

    static {
        // Initialize number words mapping
        numWords.put("zero", 0);
        numWords.put("one", 1);
        numWords.put("two", 2);
        numWords.put("three", 3);
        numWords.put("four", 4);
        numWords.put("five", 5);
        numWords.put("six", 6);
        numWords.put("seven", 7);
        numWords.put("eight", 8);
        numWords.put("nine", 9);
        numWords.put("ten", 10);
        numWords.put("eleven", 11);
        numWords.put("twelve", 12);
        numWords.put("thirteen", 13);
        numWords.put("fourteen", 14);
        numWords.put("fifteen", 15);
        numWords.put("sixteen", 16);
        numWords.put("seventeen", 17);
        numWords.put("eighteen", 18);
        numWords.put("nineteen", 19);
        numWords.put("twenty", 20);
        operations.put("add", Integer::sum);
        operations.put("sub", (x, y) -> x - y);
        operations.put("mul", (x, y) -> x * y);
        operations.put("rem", (x, y) -> x % y);
        operations.put("pow", (x, y) -> {
            int result = 1;
            for (int i = 0; i < y; i++) {
                result *= x;
            }
            return result;
        });
    }

    @FunctionalInterface
    interface Operation {
        int apply(int x, int y);
    }

    public static String evaluateExpression(String expression) {
        String[] words = splitString(expression);
        int[] processedWords = new int[words.length];
        boolean[] isNumber = new boolean[words.length];
        int numberCount = 0;

        // Convert words to numbers or operations
        for (int i = 0; i < words.length; i++) {
            Integer num = convertNumberWord(words[i]);
            if (num != null) {
                processedWords[i] = num;
                isNumber[i] = true;
                numberCount++;
            } else if (operations.containsKey(words[i])) {
                processedWords[i] = -1; // -1 indicates an operation
                isNumber[i] = false;
            } else {
                return "expression evaluation stopped invalid words present";
            }
        }

        // Check if expression is valid
        if (numberCount == 0 || (numberCount == 1 && processedWords.length > 1)) {
            return "expression is not complete or invalid";
        }

        // Evaluate the expression
        return String.valueOf(evaluateProcessedWords(processedWords, isNumber));
    }

    private static int evaluateProcessedWords(int[] processedWords, boolean[] isNumber) {
        int result = 0;
        int currentIndex = 0;
        boolean operationFound = false;

        while (currentIndex < processedWords.length) {
            if (isNumber[currentIndex]) {
                // First number or subsequent number after an operation
                if (currentIndex == 0) {
                    result = processedWords[currentIndex];
                } else if (operationFound) {
                    // Previous must be an operation
                    int operationIndex = currentIndex - 1;
                    String operation = getOperationName(processedWords[operationIndex]);
                    result = applyOperation(result, processedWords[currentIndex], operation);
                    operationFound = false; // Reset for next operation
                }
            } else {
                operationFound = true; // Found an operation
            }
            currentIndex++;
        }

        return result;
    }

    private static String getOperationName(int operationCode) {
        for (Map.Entry<String, Operation> entry : operations.entrySet()) {
            if (operationCode == -1) {
                return entry.getKey();
            }
        }
        return null;
    }

    private static int applyOperation(int a, int b, String operation) {
        return operations.get(operation).apply(a, b);
    }

    private static Integer convertNumberWord(String word) {
        if (word.charAt(0) == 'c') {
            int numValue = 0;
            for (int i = 1; i < word.length(); i++) {
                String digitWord = String.valueOf(word.charAt(i));
                if (numWords.containsKey(digitWord)) {
                    numValue = numValue * 10 + numWords.get(digitWord);
                } else {
                    return null; // Invalid digit word
                }
            }
            return numValue;
        } else {
            return numWords.get(word);
        }
    }

    private static String[] splitString(String str) {
        int spaceCount = 0;

        // Count spaces
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        String[] result = new String[spaceCount + 1];
        int index = 0;
        StringBuilder currentWord = new StringBuilder();

        // Split the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                result[index++] = currentWord.toString();
                currentWord = new StringBuilder(); // Reset current word
            } else currentWord.append(c); // Append character to current word
        }
        result[index] = currentWord.toString(); // Last word

        return result;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(evaluateExpression("add one sub twochundered one")); // "expression evaluation stopped invalid words present"
        System.out.println(evaluateExpression("five mul six six fourcninecnine zero")); // "expression is not complete or invalid"
        System.out.println(evaluateExpression("mul add sub six five oneczero two")); // "22"
        System.out.println(evaluateExpression("add one two")); // "3"
        System.out.println(evaluateExpression("mul add two three one")); // "10"
        System.out.println(evaluateExpression("rem four five")); // "4"
        System.out.println(evaluateExpression("pow two three")); // "8"
        System.out.println(evaluateExpression("add ctwo cthree")); // "5"
        System.out.println(evaluateExpression("add czero cfive")); // "5"
    }
}
