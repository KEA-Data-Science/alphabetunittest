package kcn.kea.alphabetunittest.alphabet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlphabetTest
{

    Alphabet alphabet;

    @BeforeEach
    void setUp()
    {
        alphabet = new Alphabet();
    }

    @Test
    void numberOfVowels()
    {
        assertEquals(3, alphabet.numberOfVowels("EeE"));
        assertEquals(3, alphabet.numberOfVowels("Lalele"));
        assertEquals(2, alphabet.numberOfVowels("torben"));
    }

    @Test
    void numberOfConsonants()
    {
        assertEquals(0, alphabet.numberOfConsonants("EeE"));
        assertEquals(3, alphabet.numberOfConsonants("Lelele"));
        assertEquals(4, alphabet.numberOfConsonants("torben"));
    }
}