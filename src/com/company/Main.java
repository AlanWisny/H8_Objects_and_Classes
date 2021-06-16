

public class Main {
//
    public static void main(String[] args) {
//	Counter tally = new Counter(0);
//        tally.count(50);
//        tally.undo(5);
//       tally.count(140);


//        cashRegister Bob = new cashRegister(0, 0.00, 0, 0.00);
//        Bob.addItem(12.55);
//        Bob.addItem(5.55);
//        Bob.getTotal();
//        Bob.clear();
//        Bob.addItem(6.65);
//        Bob.getTotal();
//        Bob.undo(5.55);

//        Address mine = new Address(15, 0,"Waldorp", "DH", "NH", 2521);
//        mine.print();
//        Address yours = new Address(4,0, "w/e", "DH", "NH", 2500);
//        mine.comesBefore(yours);

//        VotingMachine election = new VotingMachine(100, 150);
//        election.voteForDemocrat();
//        election.voteForRepublican();
//        election.printTotal();

//        Letter java = new Letter("Alan", "Java");
//        java.addLine("Why are you giving me so much headache?");
//        java.addLine("I don't like to have a headache.");
//        java.getText();

//        Car humvee = new Car(0, 30);
//        humvee.addGas(50);
//        humvee.drive(150);
//        humvee.getFuel();

//        Student Alan = new Student("Alan", 0);
//        Alan.addQuizz(0);
//        Alan.getTotalScore();


        Message kip = new Message("Alan", "The Colonel Sanders");
        kip.append("Your chicken is the best bruv.");
        kip.append("I want a subscription on that ass.");
        kip.printTotal();
        System.out.println(kip.toString());
        

    }

}
