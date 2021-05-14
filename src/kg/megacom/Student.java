package kg.megacom;

public class Student {
    String fio;
    String phoneNumber;
    boolean isPaid;

    public Student(String fio, String phoneNumber, boolean isPaid) {
        this.fio = fio;
        this.phoneNumber = phoneNumber;
        this.isPaid = isPaid;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }
}
