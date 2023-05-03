/*
 * CSCI 1913
 * Project 2
 * Author: Bryan Lee Yen Sheng
 * */

/**
 * A class to represent Word Replacement Cipher.
 */
public class WordReplacementCipher extends BaseCipher {

    // Variable to represent word to replace from
    private String word_from;

    // Variable to represent word to replace to
    private String word_to;


    /**
     * A constructor that takes two parameters - the word to replace from
     * and the word to replace to.
     *
     * @param word_from -- word to replace from
     * @param word_to   -- word to replace to
     */
    public WordReplacementCipher(String word_from, String word_to) {
        super("WordReplacementCipher");
        this.word_from = word_from;
        this.word_to = word_to;
    }


    /**
     * A method that returns a string as a result of applying the word replacement
     * cipher to the input.
     * @param text -- input String
     * @return a string with the replaced word.
     */
    public String encrypt(String text) {
        return text.replace(word_from, word_to);
    }


    /**
     * A method that returns a string as a result of reversing the word replacement
     * cipher to the input.
     * @param text -- input String
     * @return a string with the replaced word.
     */
    public String decrypt(String text) {
        return text.replace(word_to, word_from);
    }


    /**
     * A method that returns a string in a given format.
     * @return string in a given format.
     */
    public String toString() {
        return "WordReplacementCipher(" + word_from + ", " + word_to + ")";
    }


    /**
     * A method to indicate if WordReplacementCipher object equals to another
     * WordReplacementCipher object.
     * @param object -- another WordReplacementCipher object
     * @return a boolean indicating if WordReplacementCipher object equals to
     * another WordReplacementCipher object.
     */
    public boolean equals(Object object) {

        if (object instanceof WordReplacementCipher){
            WordReplacementCipher new_object = (WordReplacementCipher) object;
            return (new_object.word_from.equals(this.word_from)) && (new_object.word_to.equals(this.word_to));
        }
        return false;
    }
}
