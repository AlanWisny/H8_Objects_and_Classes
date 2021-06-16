
// 8.11 Provide a class for authoring a simple letter.
// In the constructor, supply the names of the sender and the recipient.

public class Letter {
    private String from;
    private String to;
    private String fullText = " ";

    public Letter(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public void addLine(String line){
       fullText = fullText + "\n" + line;
    }


    public String getText() {
        System.out.println("Dearest " + to + ",");
        System.out.println(fullText);
        System.out.println();
        System.out.println("Sincerely, ");
        System.out.println(from);
        return from;
    }


}
