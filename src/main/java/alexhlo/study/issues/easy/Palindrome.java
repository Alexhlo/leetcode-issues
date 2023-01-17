package alexhlo.study.issues.easy;

/*
 * Является ли число/строка палиндромом
 */
public class Palindrome {

    /**
     * Метод вычисляющий является ли число палиндромом математическим способом. Время O(n). Память O(1)
     */
    public boolean isPalindrome(int number) {
        if (number < 0) return false;

        int original = number;
        int reverse = 0;

        while (number > 0) {
            reverse = number % 10 + reverse * 10;
            number /= 10;
        }

        return original == reverse;
    }

    /**
     * Метод вычисляющий является ли число палиндромом рекурсивной функцией. Время O(n). Память O(1)
     */
    public boolean isPalindromeByReverseRecursion(int number) {
        int reverse = 0;
        reverse = getReverse(number, reverse);
        return number == reverse;
    }

    private int getReverse(int original, int reverse) {
        reverse = original % 10 + reverse * 10;
        original /= 10;

        if (original > 0) return getReverse(original, reverse);
        else return reverse;
    }

    /**
     * Метод вычисляющий является ли строка палиндромом методом двух указателей. Время O(log n). Память O(1)
     */
    public boolean isPalindromeString(String str) {
        if (str.length() > 1) {
            String lowerCaseStr = str.toLowerCase();
            for (int i = 0; i < lowerCaseStr.length(); i++) {
                char left = lowerCaseStr.charAt(i);
                int rightIndex = (str.length() - 1) - i;
                char right = lowerCaseStr.charAt(rightIndex);

                if (i <= rightIndex && left != right) {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * Метод вычисляющий является ли строка палиндромом путем реверсирования строки. Время O(n). Память O(1)
     */
    public boolean isPalindromeStringReverse(String str) {
        String lowerCaseStr = str.toLowerCase();
        StringBuilder reverse = new StringBuilder();
        for (int i = lowerCaseStr.length() - 1; i >= 0; i--) reverse.append(lowerCaseStr.charAt(i));
        return lowerCaseStr.equals(reverse.toString());
    }

    /**
     * Метод вычисляющий является ли строка палиндромом исключая символы из строки. Время O(2 log n). Память O(n)
     * */
    public boolean isPalindromeStringWithSymbols(String s) {
        if (s.length() == 1) return true;

        StringBuilder b = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i)))
                b.append(s.charAt(i));
        }

        String ignoreCase = b.toString().toLowerCase();

        for (int i = 0; i < ignoreCase.length(); i++) {
            char left = ignoreCase.charAt(i);
            int rightIndex = ignoreCase.length() - (i + 1);
            char right = ignoreCase.charAt(rightIndex);

            if (i <= rightIndex && left != right) return false;
        }

        return true;
    }

}
