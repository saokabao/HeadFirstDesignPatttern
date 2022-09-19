package Strategy.FileEncryption;

public class SwapToDiskCipher implements Cipher{
    public void performAction(){
        System.out.println("File size is too high, doing encryption piece by piece.");
    }
}
