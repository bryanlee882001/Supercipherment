# Superencipherment
Superencipherment encrypts and decrypts words using three base encryption algorithms. This project emphasizes on three core ideas: Classic String cipher algorithms, java objects, and polymorphism. Superencipherment is the idea of creating secure ciphers by combining many simpler ciphers together. By taking three ciphers and combining them in different ways, we can actually create ciphers that are difficult to decrypt. By utilizing polymorphism, I made all three cipher objects subclasses of parent "Supercipher" class. This allows us to have SuperCipher variables refer to all three ciphers. <br />
<br/>

These three algorithms include: 


# Encryption Algorithm 1: CaesarCipher
The Caesar cipher is a classic piece of cryptography history. It’s classified as a “rotation” cipher. This means that the algorithm works by replacing each letter with a different letter by “rotating” it around the alphabet. For example the string “abe” rotated by 3 would be “deh” (’a’ +3 = ’d’, ’b’ +3 = ’e’, and ’e’ +3 = ’h’). This process works for letters later in the alphabet by “rotating” around the alphabet: (’z’ +1 = ’a’, ’x’+5 = ’c’, etc.) While relatively simple, this cipher can be difficult to decode without knowing exactly how far the letters were rotated. <br/> <br/>

<img width="795" alt="CaesarCipher" src="https://user-images.githubusercontent.com/63344458/236076140-a53b0df1-02a3-46d6-8af0-ce94aead3381.png">
<br/>

# Encryption Algorithm 3: Word Replacement Cipher 
Even Odd Cipher is a “Scramble” cipher, that disguises text by shuffling the letters up. The idea is quite simple, first list all the even letters, then list all the odd letters.


# Encryption Algorithm 3: Word Replacement Cipher 
The word replacement cipher is relatively simple, it swaps each occurrence of one word for a pre-chosen replacement. 
This cipher is great at disguising secret text when code words are well chosen, and really shines when a relatively long list of code words is adopted. This is also quite hard to decode, as there is often no pattern or rhyme to these replacements, making them hard to automat- ically detect or undo. 
