
//  P8.21 Design a class that models an e-ail msg.



public class Message {
    private String sender = "";
    private String recipient = "";
    private String Text = "";

    public Message(String sender, String recipient) {
        this.sender = sender;
        this.recipient = recipient;
    }

    public void append(String line) {
        this.Text = Text + "\n" + line;
    }


    public void printTotal() {
        System.out.println("From: " +sender+ "\nTo: " + recipient);
        System.out.println(Text);

    }

    @Override
    public String toString() {
        return "Message{" +
                "sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", Text='" + Text + '\'' +
                '}';
    }
//    public String toString() {
//
//        return String.format("From: " +sender+ "\nTo: " + recipient + Text);
//    }


    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getFullText() {
        return this.Text;
    }
}
