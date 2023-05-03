/*
 * CSCI 1913
 * Project 2
 * Author: Bryan Lee Yen Sheng
 * */


/**
 * A class that handles repeated encryption or decryption over sequences of strings.
 */
public class EncryptUtils {

    /**
     * A functino that takes a BaseCipher variable and an array of strings, and then
     * encrypting each string in the array.
     * @param basecipher -- BaseCipher object
     * @param arr_of_strings -- Array of strings
     * @return a new array of strings after encryption
     */
    public static String[] encryptMany(BaseCipher basecipher , String[] arr_of_strings){

        String[] new_encrypt = new String[arr_of_strings.length];

        for (int i = 0; i < arr_of_strings.length; i++){
            new_encrypt[i] = basecipher.encrypt(arr_of_strings[i]) ;
        }

        return new_encrypt;
    }


    /**
     * A function that takes a BaseCipher variable and an array of strings, and then
     * decrypting each string in the array.
     * @param basecipher -- BaseCipher object
     * @param arr_of_strings -- Array of strings
     * @return a new array of strings after encryption
     */
    public static String[] decryptMany(BaseCipher basecipher, String[] arr_of_strings){

        String[] new_decrypt = new String[arr_of_strings.length];

        for (int i = 0; i < arr_of_strings.length; i++){
            new_decrypt[i] = basecipher.decrypt(arr_of_strings[i]) ;
        }

        return new_decrypt;
    }
}
