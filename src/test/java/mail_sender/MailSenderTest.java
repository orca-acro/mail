package mail_sender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailSenderTest {
    Client client1;
    Client client2;
    MailInfo info1;
    MailInfo info2;
    MailSender sender;

    @BeforeEach
    void setUp() {
        client1 = new Client("Carla", 76, Gender.FEMALE, "some_mail@mail.com");
        client2 = new Client("Karl", 45, Gender.MALE, "some@mail.com");
        info1 = new MailInfo(client1, MailCode.HAPPY_BIRTHDAY);
        info2 = new MailInfo(client2, MailCode.GREETINGS);
        sender = new MailSender();

    }

    @Test
    void sendMail() {
        sender.sendMail(info1);
        assertEquals("Mail: HAPPY_BIRTHDAY send to: some_mail@mail.com.", sender.sendMail(info1));
        sender.sendMail(info2);
        assertEquals("Mail: GREETINGS send to: some@mail.com.", sender.sendMail(info2));

    }

}