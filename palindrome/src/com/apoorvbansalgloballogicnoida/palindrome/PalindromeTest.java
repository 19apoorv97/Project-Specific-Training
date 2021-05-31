package com.apoorvbansalgloballogicnoida.palindrome;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome palindrome;

    @Before
    public void initializer()
    {
        palindrome=new Palindrome();
    }

    @Test
    public void givenPalindromeStringShouldReturnTrue()
    {
        assertEquals(true,palindrome.checkPalindrome("madam"));
    }

    @Test
    public void givenNonPalindromeStringShouldReturnFalse()
    {
        assertNotEquals(true,palindrome.checkPalindrome("apoorv"));
    }

    @Test
    public void givenPalindromeNumberShouldReturnTrue()
    {
        assertTrue(palindrome.checkPalindrome(121));
    }

    @Test
    public void givenNonPalindromeNumberShouldReturnFalse()
    {
        assertFalse(palindrome.checkPalindrome(123));
    }

    @Test
    public void givenEmptyStringShouldNotReturnNull()
    {
        assertNotNull(palindrome.checkPalindrome(""));
    }
}