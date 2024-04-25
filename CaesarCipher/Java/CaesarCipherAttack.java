import java.util.Scanner;;

public class CaesarCipherAttack {
    static String decrypt(String plainText, int key) {
        StringBuilder decryptedMessage = new StringBuilder();
        for (char letter : plainText.toCharArray()) {
            if (Character.isLetter(letter)) {
                char base = Character.isUpperCase(letter) ? 'A' : 'a';
                decryptedMessage.append( (char) ((letter - base + key) % 26 + base));
            } else {
                decryptedMessage.append(letter); // handling the special symbol scenario
            }
        }

        return decryptedMessage.toString();
    }

    public static void main(String[] args) {
        String plainText;
        int key;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the message you want to encrypt: ");
        plainText = reader.nextLine();

        System.out.println("Enter the shift (key) you wish to encrypt your message with: ");
        key = reader.nextInt();

        reader.close();


        String cipherText = CaesarCipher.encrypt(plainText, key);
        System.out.println("The ciphertext is: " + cipherText);

        for (int probableKey = 1; probableKey <= 26; probableKey++) {
            String decipheredText = CaesarCipherAttack.decrypt(plainText, probableKey);
            System.out.println("Probable decryption: " + decipheredText);
        }
    }    
}
