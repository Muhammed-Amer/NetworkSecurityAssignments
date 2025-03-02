public class Main {
    public static void main(String[] args) {
        CaesarCipher cc = new CaesarCipher();
//        String result = cc.caesarCipherEncryption("meet me", 3); // phhw ph
//        System.out.println(result);

        System.out.println(cc.caesarCipherDecryption("phhw ph", 3));

    }
}