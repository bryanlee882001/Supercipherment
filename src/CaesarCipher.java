/*
 * CSCI 1913
 * Project 2
 * Author: Bryan Lee Yen Sheng
 * */

/**
 * A class to represent Caesar Cipher.
 */
public class CaesarCipher extends BaseCipher{

    // Member variable of the class CaesarCipher
    private int key_value;


    /**
     * A constructor that takes one parameter - the key value that
     * Caesar Cipher will use.
     * @param key_value
     */
    public CaesarCipher(int key_value){
        super("CaesarCipher");
        this.key_value = key_value;
    }


    /**
     * A method that returns a boolean indicating if the key is valid.
     * @return true if-and-only-if the key value is between 1 and 25.
     */
    public boolean isValid(){
        return key_value >= 1 && key_value <= 25;
    }


    /**
     * A method that encrypts the input string with the
     * Caesar Cipher algorithm outlined above based on a given key value.
     * @param text -- input string
     * @return encrypted text
     */
    public String encrypt(String text){
        return (rotate(text, key_value));
    }


    /**
     * A method that decrypts the input string with the
     * Caesar Cipher algorithm outlined above based on a given key value.
     * @param text -- input string
     * @return decrypted text
     */
    public String decrypt(String text){
        return (rotate(text, key_value * -1));
    }


    /**
     * A method that returns a string based on a given format.
     * @return a string based on the given format Caesar(<key>)
     */
    public String toString() {
        return "Caesar(" + key_value + ")";
    }


    /**
     * A method that returns a boolean
     * @return boolean indicating if it is passed to another Caesar cipher with the same
     * rotation amount.
     */
    public boolean equals(Object object) {

        if (object instanceof CaesarCipher){
            CaesarCipher new_object = (CaesarCipher) object;
            return (new_object.key_value == this.key_value);
        }
        return false;
    }


    /**
     * A private helper method that rotates a character based
     * on a given key value.
     * @param s -- input string
     * @param key_value -- the amount of rotation
     * @return new character after rotation.
     */
    private String rotate(String s, int key_value ) {

        String encrypted_text = "";

        // loop over given string.
        for (int i = 0; i < s.length(); i++) {

            // convert string to a lower case character.
            char alphabet = s.toLowerCase().charAt(i);

            // check if each character is alphabetic.
            if (Character.isAlphabetic(alphabet)) {

                // modulus operator to ensure that Ascii value is less than 26.
                int currentAscii = (alphabet - 'a' + key_value) % 26;

                // while loop that adds Ascii value until it is more than 0.
                while (currentAscii < 0) {
                    currentAscii += 26;
                }

                // adding rotated character to new string
                encrypted_text = encrypted_text + (char) (currentAscii + 'a');

            }

            else{
                // if character is not alphabetic, add it into string without rotation.
                encrypted_text = encrypted_text + alphabet;
            }

        }
        return encrypted_text;
    }

}
