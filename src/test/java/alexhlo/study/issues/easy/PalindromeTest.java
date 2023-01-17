package alexhlo.study.issues.easy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {

    private static Palindrome palindrome;

    @BeforeAll
    public static void init() {
        palindrome = new Palindrome();
    }

    @Test
    void isPalindromeTrueTest() {
        assertTrue(palindrome.isPalindrome(12321));
    }

    @Test
    void isPalindromeFalseTest() {
        assertFalse(palindrome.isPalindrome(123421));
    }
    //
    @Test
    void isPalindromeByReverseRecursionTrueTest() {
        assertTrue(palindrome.isPalindromeByReverseRecursion(123321));
    }

    @Test
    void isPalindromeByReverseRecursionFalseTest() {
        assertFalse(palindrome.isPalindromeByReverseRecursion(123421));
    }
    //
    @Test
    void isPalindromeStringTrueTest() {
        assertTrue(palindrome.isPalindromeString("asd3dsa"));
    }

    @Test
    void isPalindromeStringFalseTest() {
        assertFalse(palindrome.isPalindromeString("asdw3dsa"));
    }
    //
    @Test
    void isPalindromeStringReverseTrueTest() {
        assertTrue(palindrome.isPalindromeStringReverse("asddsa"));
    }

    @Test
    void isPalindromeStringReverseFalseTest() {
        assertFalse(palindrome.isPalindromeStringReverse("asdfgdsa"));
    }
    //
    @Test
    void isPalindromeStringWithSymbolsTrueTest() {
        assertTrue(palindrome.isPalindromeStringWithSymbols("A man, a plan, a canal: Panama"));
    }

    @Test
    void isPalindromeStringWithSymbolsFalseTest() {
        assertFalse(palindrome.isPalindromeStringWithSymbols("a0"));
    }

}
