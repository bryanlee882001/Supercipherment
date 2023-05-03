/*
 * CSCI 1913
 * Project 2
 * Author: Bryan Lee Yen Sheng
 * */


/**
 * A class to represent a superCipher formed by applying a chain
 * of other ciphers.
 */
public class SuperCipher extends BaseCipher{

    // Variable to store an array of ciphers
    private BaseCipher[] ciphers;


    /**
     * A constructor that takes an array of type BaseCipher
     * @param ciphers -- an array of type BaseCipher
     */
    public SuperCipher(BaseCipher[] ciphers){

        super("SuperCipher");
        this.ciphers = ciphers;

    }


    /**
     * A method to indicate if a SuperCipher is valid if
     * and only if each base cipher is valid.
     * @return boolean indicating if a SuperCipher is valid
     */
    public boolean isValid(){

        for (int i = 0; i < ciphers.length; i++){
            if (!ciphers[i].isValid()){
                return false;
            }
        }

        return true;
    }


    /**
     * A method to encrypt a string using ciphers provided
     * to the constructor in the provided order.
     * @param text -- a string containing a decrypted word
     * @return a string containing the encrypted word
     */
    public String encrypt(String text){

        String encrypted_word = "";

        for (int i = 0; i < ciphers.length; i++){
            encrypted_word = ciphers[i].encrypt(text);
            text = encrypted_word;
        }

        return encrypted_word;

    }


    /**
     * A method to decrypt a string by reversing ciphers
     * provided to the constructor in the provided order
     * @param text -- a string containing an encrypted word
     * @return a string containing the decrypted word.
     */
    public String decrypt(String text){

        String decrypted_word = text;

        for (int i = (ciphers.length-1); i >= 0; i--){
            decrypted_word = ciphers[i].decrypt(decrypted_word);
        }

        return decrypted_word;

    }


    /**
     * A method which returns a String in a given format
     * @return string in a given format
     */
    public String toString(){

        StringBuilder result = new StringBuilder("SuperCipher(");

        for (int i = 0; i< ciphers.length; i++){

            result.append(ciphers[i].toString());
            if (i != ciphers.length - 1){
                result.append(" | ");
            }

        }

        result.append(")");

        return result.toString();

    }


    /**
     * A method that returns a boolean indicating if chain of ciphers
     * match based on length and given position.
     * @param object -- another SuperCipher object
     * @return a boolean indicating if a superCipher is equal to another superCipher
     */
    public boolean equals(Object object){

        if (object instanceof SuperCipher){

            SuperCipher new_object = (SuperCipher) object;

            for (int i = 0; i < ciphers.length; i++){
                if(i == new_object.ciphers.length || !new_object.ciphers[i].equals(this.ciphers[i])){
                    return false;
                }
            }

        }

        return true;

    }

}
