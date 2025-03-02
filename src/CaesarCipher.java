public class CaesarCipher {
    public String caesarCipherEncryption(String plainText, int key) {
        StringBuilder sb = new StringBuilder();
        String result= "";
        for(int i=0; i<plainText.length(); i++) {
            char currentChar = plainText.charAt(i);
            char cipheredChar;
            if(Character.isUpperCase(currentChar)) {
                cipheredChar = (char) (((currentChar - 'A' + key) % 26) + 'A');
            } else if(Character.isLowerCase(currentChar)) {
                cipheredChar = (char) (((currentChar - 'a' + key) % 26) + 'a');
            } else {
                cipheredChar = currentChar;
            }
            sb.append(cipheredChar);
        }
        result = sb.toString();
        return result;
    }

    public String caesarCipherDecryption(String cipheredText, int key) {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < cipheredText.length(); j++) {
            char currentChar = cipheredText.charAt(j);
            if (Character.isLowerCase(currentChar)) {
                currentChar -= (char) key;
                if (currentChar < 'a') {
                    currentChar += 26;
                }
            } else if (Character.isUpperCase(currentChar)) {
                currentChar -= (char) key;
                if (currentChar < 'A') {
                    currentChar += 26;
                }
            } else {
                sb.append(currentChar);
            }
            sb.append(currentChar);
        }
        return (sb.toString());
    }
    public void caesarCipherDecryption(String cipheredText) {
        for(int i=1; i<26; i++) {
            StringBuilder sb = new StringBuilder();
            System.out.print("Try " + i + " : ");
            for(int j=0; j<cipheredText.length(); j++) {
                char currentChar = cipheredText.charAt(j);
                if(Character.isLowerCase(currentChar)) {
                    currentChar -= (char) i;
                    if(currentChar < 'a') {
                        currentChar += 26;
                    }
                } else if(Character.isUpperCase(currentChar)) {
                    currentChar -= (char) i;
                    if(currentChar < 'A') {
                        currentChar += 26;
                    }
                } else {
                    sb.append(currentChar);
                }
                sb.append(currentChar);
            }
            String result = sb.toString();
            System.out.println(result);
        }
    }
}
