package kcn.kea.alphabetunittest.alphabet;

import java.util.Arrays;

public class Alphabet
{

    private char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r',
            's', 't', 'v', 'x', 'z'}; // 'r'
    private char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'}; // 'u'

    // This method takes a String as parameter (a text),
    // and should return an int (the number of vowels in that string)
    public int numberOfVowels(String s)
    {
        return numberOfMatches(s, vowels);
    }

    private int numberOfMatches(String s, char[] matchingContainer)
    {
        s = s.toLowerCase();
        int count = 0;

        for(int i = 0; i < s.length(); i++)
        {
            if(isContained(s.charAt(i), matchingContainer)){ count++; }
        }

        return count;
    }

    private boolean isContained(char c, char[] matchingContainer)
    {
        return Arrays.binarySearch(matchingContainer, c) > -1;
    }

    public int numberOfConsonants(String s)
    {
        return numberOfMatches(s, consonants);
    }
}

/* The code below is functional but repetitive. Couldn't drop it.. */
//public class Alphabet
//{
//
//    private char[] consonant = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r',
//            's', 't', 'v', 'x', 'z'}; // 'r'
//    private char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'}; // 'u'
//
//    // This method takes a String as parameter (a text),
//    // and should return an int (the number of vowels in that string)
//    public int numberOfVowels(String s)
//    {
//        s = s.toLowerCase();
//        int count = 0;
//
//        for(int i = 0; i < s.length(); i++) {
//            if(isVowel(s.charAt(i))){ count++; }
//        }
//
//        return count;
//    }
//
//    private boolean isVowel(char c)
//    {
//        // binary search returns the first found index of c in vowels, and vowels.length if no c-match found
//        return Arrays.binarySearch(vowels, c) > -1;
//    }
//
//    public int numberOfConsonants(String s)
//    {
//        s = s.toLowerCase();
//
//        int count = 0;
//
//        for(int i = 0; i < s.length(); i++) { if(isConsonant(s.charAt(i))){ count++; } }
//
//        return count;
//    }
//
//    private boolean isConsonant(char c)
//    {
//        return Arrays.binarySearch(consonant, c) > -1;
//    }
//}



