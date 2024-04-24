from caesar_cipher import caesar_cipher

# How to break it? Try every possible key!

#Q: What is the key space?
#B: 26 letters in the english alphabet

def attack(ciphertext):
    for key in range(1, 27): # one of those keys will give us the plaintext which is easiliy recognizable
        plaintext = caesar_cipher(ciphertext, key)
        print(f"key: {key}, plaintext: {plaintext}")


if __name__ == "__main__":
    message = "Hey, what's up guys?"
    attack(message)
