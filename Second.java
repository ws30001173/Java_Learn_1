import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Second {
  public static void main(String[] args) {
    Main myObj1 = new Main(5);
    System.out.println(myObj1.x);

    // java.time package
    LocalDateTime now = LocalDateTime.now();
    System.out.println("Before formatting: " + now);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
    String formattedDateTime = now.format(formatter);
    System.out.println("After formatting: " + formattedDateTime);
  }
}