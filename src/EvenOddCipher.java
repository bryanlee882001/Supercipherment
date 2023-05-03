/*
 * CSCI 1913
 * Project 2
 * Author: Bryan Lee Yen Sheng
 * */


/**
 * A class that represents the Even Odd Cipher
 */
public class EvenOddCipher extends BaseCipher {


    /**
     * A constructor with a superclass object
     */
    public EvenOddCipher(){
        super("EvenOddCipher");
    }


    /**
     * A method that returns a string after applying even odd cipher to the input.
     * @param text -- input String
     * @return a new String with the encrypted word
     */
    public String encrypt(String text){

        // initialize new string
        String encrypted_word = "";

        // loop through the length of string
        for (int i = 0; i < text.length(); i+=2){
            encrypted_word = encrypted_word + text.charAt(i);
        }

        // after adding even elements, loop again for odd numbers
        for (int j = 1; j < text.length(); j+=2){
                encrypted_word = encrypted_word + text.charAt(j);
        }

        return encrypted_word;
    }


    /**
     * A method that returns a string after reversing the even odd cipher to the input
     * @param text -- input String
     * @return a new String with the decrypted word
     */
    public String decrypt(String text){

        // initialize new string to store decrypted word
        String decrypted_word = "";

        // initialize even and odd positions
        int odd_position = (int) (Math.ceil(text.length()/2.0));
        int even_position = 0;

        // while decrypted word is less than the length of given string
        while (decrypted_word.length() < text.length()) {

            if (even_position < text.length()) {
                // add character to even position
                decrypted_word += text.charAt(even_position);
                // add one count to even position
                even_position += 1;
            }

            if (odd_position < text.length()){
                // add character to odd position
                decrypted_word += text.charAt(odd_position);
                // add one count to odd position
                odd_position += 1;
            }

        }

        return decrypted_word;
    }


    /**
     * A method that returns a string in a given format
     * @return
     */
    public String toString(){
        return "EvenOddCipher";
    }


    /**
     * A method that returns a boolean indicating if it is true if EvenOddCipher object
     * equals to another EvenOddCipher object.
     * @param object -- another EvenOddCipher object.
     * @return boolean indicating if EvenOddCipher objects equals to another EvenOddCipher
     * object.
     */
    public boolean equals(Object object){
        return object instanceof EvenOddCipher;
    }

}

