import java.io.File;
import java.io.IOException;

// Create files
public class FileHandling {
  public static void main(String[] args) {
    try {
      File myObj = new File("filename.text");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
