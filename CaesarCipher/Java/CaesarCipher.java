public class CaesarCipher {
    public static void main(String[] args) {
        String cipherText = CaesarCipher.encrypt("My very secret message...", 1);
        System.out.println(cipherText);
    }

    public static String encrypt(String plainText, int key) {
        StringBuilder cipherText = new StringBuilder();
        for (char letter : plainText.toCharArray()) {
            if (Character.isLetter(letter)) {
                char base = Character.isUpperCase(letter) ? 'A' : 'a';
                cipherText.append((char) (((letter - base + key) % 26) + base)); // smart way to 'wray around' ASCII letters
            } else {
                cipherText.append(letter);
            }
        }

        return cipherText.toString();
    }
} 
