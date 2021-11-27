package mail_sender;

import java.util.ArrayList;

public class MailBox {
    ArrayList<MailInfo> infos = new ArrayList<>();

    public void addMailInfos(MailInfo info) {
        infos.add(info);
    }

    public String sendAll() {
        MailSender sender = new MailSender();
        for (MailInfo i : infos) {
            sender.sendMail(i);
        }
        return "Done!";
    }

}
