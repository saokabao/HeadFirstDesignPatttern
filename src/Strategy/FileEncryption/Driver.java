package Strategy.FileEncryption;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Driver {

    public void execute() {
        String fileName = "/Users/ansao/Documents/find_n_purge_pass.py";
        Path path = Paths.get(fileName);

        try {
            long bytes = Files.size(path);
            Cipher c = CipherFactory.getCipher(bytes/1024);
            c.performAction();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
