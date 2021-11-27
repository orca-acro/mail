package mail_sender;


import java.nio.file.Paths;
import java.util.Scanner;

public enum MailCode {
    HAPPY_BIRTHDAY("happy_birthday.txt"), GREETINGS("greetings.txt");

    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }

    private String getFilename() {
        return filename;
    }

    public String generateText() {
        try (Scanner file = new Scanner(Paths.get(filename))) {
            String text = file.useDelimiter("\\A").next();
            return text;
        } catch (Exception ex) {
            ex.printStackTrace();
            return "exception";
        }
    }
}
