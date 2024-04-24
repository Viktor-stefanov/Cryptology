# lowercase a in ASCII corresponds to 61
# span of lowercase letters 61 - (61+18)
# uppercase A corresponds to 41

# naive solution
def caesar_cipher(plaintext, key):
    cipher_text = []
    for char in plaintext:
        if char.isalpha():
            shift = 65 if char.isupper() else 97
            char = chr((ord(char) - shift + key) % 26 + shift)
        cipher_text.append(char)
    
    return "".join(cipher_text)


if __name__ == "__main__":
    text = "My very secret message"
    key = -15
    encrypted_text = caesar_cipher(text, key)
    print(encrypted_text)
