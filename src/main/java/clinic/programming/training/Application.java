package clinic.programming.training;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

public class Application {

  public int countWords(String words) {
    String[] separateWords = StringUtils.split(words, ' ');
    return (separateWords == null) ? 0 : separateWords.length;
  }

  public void greet() {
    List<String> greetings = new ArrayList<>();
    for (String greeting : greetings) {
      System.out.println("Greeting: " + greeting);
    }
  }
    public Application() {
        System.out.println ("Inside Application");
    }

    public int squared(int num) {
        num *= num;
        return num;
  }

    private static final Logger logger = getLogger(Application.class);

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
    	Application app = new Application();
        app.greet();
        String test = "lasdj";
        logger.info("Hello world");
        logger.error("error");
        logger.debug("Print: {} ", test);
        int count = app.countWords("I have four words");
        System.out.println("Word count: " + count);
    }

}
