package mail_sender;

import lombok.Getter;

@Getter
public class Client {
    private int id;
    private String name;
    private int age;
    private Gender sex;
    private String email;

    public static class IDGenerator {
        private static int count = 0;

        public static int generateID() {
            count++;
            return count;
        }
    }

    public Client(String name, int age, Gender gender, String email) {
        this.id = IDGenerator.generateID();
        this.age = age;
        this.name = name;
        this.sex = gender;
        this.email = email;

    }

}
