import java.time.LocalDateTime; // Date and Time, Format
import java.time.format.DateTimeFormatter;
import java.util.ArrayList; // Dynamic arrayList
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher; // text search pattern
import java.util.regex.Pattern;

class Packages_time_util {

  public static void main(String[] args) {

    // java.time.LocalDateTime package
    LocalDateTime now = LocalDateTime.now();
    System.out.println("Before formatting: " + now);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
    String formattedDateTime = now.format(formatter);
    System.out.println("After formatting: " + formattedDateTime);

    // java.util.ArrayList package(index number)
    ArrayList<String> Names = new ArrayList<String>();
    Names.add("John");
    Names.add("Jane");
    Names.add("Jack");
    Names.get(0);
    Names.set(0, "Jenny");
    // Get the iterator object and loop through the list
    Iterator<String> it = Names.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }

    // names.remove(0); names.clear(); names.size();
    System.out.println(Names);
    for (String name : Names) {
      System.out.println(name);
    }

    // java.util.HashMap package(key, value)
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    capitalCities.put("USA", "Washington DC");
    capitalCities.put("England", "London");
    capitalCities.put("France", "Paris");
    System.out.println(capitalCities);
  }
}

// Try, Catch
class HandleError {
  static void checkAge(int age) {
    if (age < 18) {
      throw new IllegalArgumentException("Access denied");// create custom error
    } else {
      System.out.println("Access granted");
    }
  }

  public static void main(String[] args) {
    /*
     * testing a block of code being executed
     * if try error occurs to handle error
     * execute code regardless of the result
     */
    try {
      int[] numbers = { 1, 2, 3 };
      System.out.println(numbers[10]);
    } catch (Exception e) {
      System.out.println("Error: " + e);
    } finally {
      System.out.println("The 'try catch' is finished.");
    }
    checkAge(15);
  }
}

// text search and text replace
class RegularExpression {
  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("Visit W3Schools");
    boolean matchFound = matcher.find();
    if (matchFound) {
      System.out.println("Match found");
    } else {
      System.out.println("No match found");
    }
  }
}
