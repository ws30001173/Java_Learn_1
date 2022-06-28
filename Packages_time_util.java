import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

class Packages_time_util {

  public static void main(String[] args) {

    // java.time.LocalDateTime package
    LocalDateTime now = LocalDateTime.now();
    System.out.println("Before formatting: " + now);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
    String formattedDateTime = now.format(formatter);
    System.out.println("After formatting: " + formattedDateTime);

    // java.util.ArrayList package
    ArrayList<String> Names = new ArrayList<String>();
    Names.add("John");
    Names.add("Jane");
    Names.add("Jack");
    Names.get(0);
    Names.set(0, "Jenny");
    // names.remove(0); names.clear(); names.size();
    System.out.println(Names);
    for (String name : Names) {
      System.out.println(name);
    }
  }
}
