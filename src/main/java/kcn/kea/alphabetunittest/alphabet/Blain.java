package kcn.kea.alphabetunittest.alphabet;

public class Blain
{
    public static void main(String[] args)
    {
        Alphabet alphabet = new Alphabet();

        System.out.println(alphabet.numberOfVowels("EEE"));
        System.out.println(alphabet.numberOfVowels("EEEw"));
        System.out.println(alphabet.numberOfVowels("EEEwe"));
        System.out.println(alphabet.numberOfVowels("EEEwwe"));
        System.out.println(alphabet.numberOfConsonants("BBBcB"));
        System.out.println(alphabet.numberOfConsonants("bBtorbenbB"));
    }
}
