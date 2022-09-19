package Strategy.FileEncryption;

import java.nio.file.Files;

public class CipherFactory {

    public static Cipher getCipher(long size){  // size in MB
        System.out.println(size);
        if (size > 5){
            return new SwapToDiskCipher();
        } else {
            return new InMemoryCipher();
        }
    }
}

