# Superencipherment
Superencipherment encrypts and decrypts words using three base encryption algorithms. This project emphasizes on three core ideas: Classic String cipher algorithms, java objects, and polymorphism. Superencipherment is the idea of creating secure ciphers by combining many simpler ciphers together. By taking three ciphers and combining them in different ways, we can actually create ciphers that are difficult to decrypt. By utilizing polymorphism, I made all three cipher objects subclasses of parent "Supercipher" class. This allows us to have SuperCipher variables refer to all three ciphers. <br />
<br/>


These three algorithms include: 


# Encryption Algorithm 1: CaesarCipher
The Caesar cipher is a classic piece of cryptography history. It’s classified as a “rotation” cipher. This means that the algorithm works by replacing each letter with a different letter by “rotating” it around the alphabet. For example: the string “abe” rotated by 3 would be “deh”. This process works for letters later in the alphabet by “rotating” around the alphabet. While relatively simple, this cipher can be difficult to decode without knowing exactly how far the letters were rotated. <br/> <br/>

<img width="795" alt="CaesarCipher" src="https://user-images.githubusercontent.com/63344458/236076140-a53b0df1-02a3-46d6-8af0-ce94aead3381.png">
<br/>


# Encryption Algorithm 2: Word Replacement Cipher 
Even Odd Cipher is a “Scramble” cipher, that disguises text by shuffling the letters up. The idea is quite simple, first list all the even letters, then list all the odd letters. For example: "Hello friend!" rearranged by listing even letters first and then odd letters next would lead to: hlofin!el red". An illustration is shown below depicting how it works: <br/> <br/>

<img width="434" alt="EvenOddCipher" src="https://user-images.githubusercontent.com/63344458/236077058-87a711a7-a02d-41e2-b615-a5eddd828c11.png">


# Encryption Algorithm 3: EvenOdd Cipher 
The word replacement cipher is relatively simple, it swaps each occurrence of one word for a pre-chosen replacement. 
This cipher is great at disguising secret text when code words are well chosen, and really shines when a relatively long list of code words is adopted. This is also quite hard to decode, as there is often no pattern or rhyme to these replacements, making them hard to automatically detect or undo. 


# SuperCipher 
A SuperCipher is a cipher that is formed by applying a chain of other ciphers. It does not do any encryption; instead, it arranges other ciphers to encrypt the text.<br/><br/>
For example: <br/>
We use the phrase "I like cats a lot" <br/> <br/>
***Word Replacement Cipher:*** "I like cats a lot" becomes "I like dogs a lot" by replacing the word "cats" with "dogs". <br/>
***CaesarCipher:*** "I like dogs a lot" becomes "m pmoi hskw e" by shifting 5 steps to the right. <br/>
***EvenOdd Cipher:*** "m pmoi hskw e" becomes "mpo swepx mihk  s" by rearranging the alphabets based on even and odd indexes of the phrase. 
