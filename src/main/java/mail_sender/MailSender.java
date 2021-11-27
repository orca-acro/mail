package mail_sender;

public class MailSender {
    public String sendMail(MailInfo info) {
        String email = info.getClient().getEmail();
        MailCode type = info.getType();
        return "Mail: " + type + " send to: " + email + ".";
    }
}
