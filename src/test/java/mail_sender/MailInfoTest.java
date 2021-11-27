package mail_sender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailInfoTest {
    Client client1;
    Client client2;
    MailInfo info1;
    MailInfo info2;

    @BeforeEach
    void setUp() {
        client1 = new Client("Carla", 76, Gender.FEMALE, "some_mail@mail.com");
        client2 = new Client("Karl", 45, Gender.MALE, "some@mail.com");
        info1 = new MailInfo(client1, MailCode.HAPPY_BIRTHDAY);
        info2 = new MailInfo(client2, MailCode.GREETINGS);
    }

    @Test
    void getMailText() {
        assertEquals("Hi Carla!\n" +
                "Happy Birthday!", info1.getMailText());
        assertEquals("Hello, Karl!", info2.getMailText());
    }

}