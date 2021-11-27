package mail_sender;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;

@AllArgsConstructor
@Getter
public class MailInfo {
    private Client client;
    private MailCode type;

    public String getMailText() {
        String text = type.generateText();
        HashMap<String, String> template = new HashMap<String, String>();
        template.put("%NAME%", client.getName());
        for (String key : template.keySet()) {
            text = text.replace(key, template.get(key));
        }
        return text;
    }
}
