public class CryptoManager
{

    /**
     * checks to see if the string passed into it is within the allowable limits for encodable ascii values,
     * null characters can't be encoded, for example.
     * @param plainText
     * @return Boolean
     */
    public static boolean stringInBounds(String plainText)
    {
        int UPPER_BOUND = 96;
        int LOWER_BOUND = 32;
        for(int i = 0; i < plainText.length(); i++)
        {
            int temp = (int) plainText.charAt(i);
            if((temp > UPPER_BOUND) || (temp < LOWER_BOUND))
            {
                System.out.println("outside range");
                return false;
            }
        }
        return true;
    }

    /**
     * Makes sure that the caesar cipher's key is within bounds
     *
     * @param key
     * @return key, but moved into bounds if it wasn't already
     */
    public static int keyCheck(int key)
    {
        while(key > 96)
        {
            key -= 64;
        }
        return key;
    }

    /**
     * Encodes a string of uppercase text with the caesar cipher, using key as the offset. It does not encode spaces,
     * because the caesar cipher, by nature, does not encode spaces
     * @param plainText
     * @param key
     * @return encrypted text
     */
    public static String encryptCaesar(String plainText, int key)
    {
        key = keyCheck(key);
        String encryptedText = "";
        char editedChar;
        for(int i = 0; i < plainText.length(); i++)
        {
            int tempCharInt = (((int) plainText.charAt(i)) + key);
            while(tempCharInt > 127 || tempCharInt < 0)
            {
                if (tempCharInt > 127)
                {
                    tempCharInt -= 64;
                }
                else
                {
                    tempCharInt+=64;
                }
            }
            editedChar = (char) tempCharInt;
            if((stringInBounds(String.valueOf(editedChar))))
            {
                encryptedText += editedChar;
            }
            else
            {
                while((int) editedChar > 95)
                {
                    editedChar = ((char) (((int) editedChar) - 64));
                }
                encryptedText += editedChar;
            }
        }
        return encryptedText;
    }
    /**
     * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset
     * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
     * to correspond to the length of plainText (or longer, because it only repeats to the end of plaintext anyway).
     * @param plainText an uppercase string to be encrypted.
     * @param bellasoStr an uppercase string that specifies the offsets, character by character.
     * @return the encrypted string
     */
    public static String encryptBellaso(String plainText, String bellasoStr)
    {
        String encryptedText = "";
        char editedChar;
        int tempCharInt;
        if(plainText.length() > bellasoStr.length())
        {
            while (plainText.length() > bellasoStr.length())
            {
                bellasoStr = bellasoStr.repeat(2);
            }
        }
        for (int i = 0; i < plainText.length(); i++)
        {
            tempCharInt = ((((int) plainText.charAt(i)) + ((int) bellasoStr.charAt(i))));
            if(tempCharInt > 95)
            {
                while (tempCharInt > 96)
                {
                    tempCharInt -= 64;
                }
            }
            else;
            if(tempCharInt < 32)
            {
                tempCharInt += 64;
            }
            editedChar = (char) tempCharInt;
            if((stringInBounds(String.valueOf(editedChar))))
            {
                encryptedText += editedChar;
            }
            else
            {
                while((int) editedChar > 96)
                {
                    editedChar = ((char) (((int) editedChar) - 64));
                }
                encryptedText += editedChar;
            }
        }
        return encryptedText;
    }
    /**
     * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
     * and each character in encryptedText is replaced by the character \"offset\" characters before it.
     * This is the inverse of the encryptCaesar method.
     * @param encryptedText an encrypted string to be decrypted.
     * @param key an integer that specifies the offset of each character
     * @return the plain text string
     */
    public static String decryptCaesar(String encryptedText, int key) {
        {
            key = keyCheck(key);
            String plainText = "";
            char editedChar;
            for(int i = 0; i < encryptedText.length(); i++)
            {
                if(encryptedText.charAt(i) != ' ')
                {
                    int tempCharInt = (((int) encryptedText.charAt(i)) - key);
                    while(tempCharInt > 127 || tempCharInt < 0)
                    {
                        if (tempCharInt > 127)
                        {
                            tempCharInt -= 64;
                        }
                        else
                        {
                            tempCharInt+=64;
                        }
                    }
                    editedChar = (char) tempCharInt;
                    if(!(stringInBounds(String.valueOf(editedChar))))
                    {
                        while((int) editedChar < 32)
                        {
                            editedChar = ((char) (((int) editedChar )+64));
                        }
                        plainText += editedChar;
                    }
                    else
                    {
                        plainText += editedChar;
                    }
                }
                else
                {
                    plainText += ' ';
                }
            }
            return plainText;
        }
    }

    /**
     * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
     * the character corresponding to the character in bellasoStr, which is repeated
     * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
     * @param encryptedText an uppercase string to be encrypted.
     * @param bellasoStr an uppercase string that specifies the offsets, character by character.
     * @return the decrypted string
     */
    public static String decryptBellaso(String encryptedText, String bellasoStr) {
        String plainText = "";
        char editedChar;
        int tempCharInt;
        while (encryptedText.length() > bellasoStr.length())
        {
            bellasoStr = bellasoStr.repeat(2);

        }
        for (int i = 0; i < encryptedText.length(); i++)

            {
                tempCharInt = (((int) encryptedText.charAt(i)) - ((int) bellasoStr.charAt(i)));
                if(tempCharInt > 96)
                {
                    while (tempCharInt > 96) {
                        tempCharInt -= 64;
                    }
                }
                if(tempCharInt < 32)
                {
                    while(tempCharInt < 32) {
                        tempCharInt += 64;

                    }
                }
                editedChar = (char) tempCharInt;
                plainText += editedChar;
            }

        return plainText;
    }


}
