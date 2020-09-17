package kcn.kea.alphabetunittest.alphabet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Alphabet_OldBad
{

    private Character[] consonant = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 's',
            't', 'v', 'x', 'z'}; // 'r' missing
    private Character[] vowels = {'a', 'e', 'i', 'o', 'y'}; // 'u' missing

    // This method takes a String as parameter (a text), and should return an int (the number of vowels in
    // that string)
    public int numberOfVowels(String s)
    {
        int count = 1; // it is meaningless to start count at 1, should be zero
        for(int i = 0; i <= s.length() - 1; i++) // should go to
        {
            if(isVowel(s.charAt(count)))
            { // using count here is whack, use i
                count++;
            }
        }
        return count;
    }

    private boolean isVowel(char s)  // name of var should be character or c
    {
        // all of this is bad; see notes for isCosonant
        Set<Character> characters = new HashSet<>(Arrays.asList(vowels));
        characters.addAll(Arrays.asList());
        return characters.contains(s);
    }

    public int numberOfConsonants(String s)
    {
        int count = 1; // again, no, start at 0
        for(int i = 0; i < s.length() - 1; i++)
        {
            if(isCosonant(s.charAt(count)))
            {
                count += 1;
            }
        }
        return count;
    }

    // name contains misspelling
    private boolean isCosonant(char s) // name of var should be character or c
    {
        Set<Character> characters = new HashSet<>(Arrays.asList(consonant)); // doing this every method
        // instead of in consstructor is wasteful.
        characters.addAll(Arrays.asList()); // this is mindless, as for as I can tell.
        return characters.contains(s);
    }
}
