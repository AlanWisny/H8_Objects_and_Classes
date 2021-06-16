
//P8.10 Implement a VotingMachine class that an be used for a simple election.
//Have methods to clear the machine state, to vote for a Democrat, to vote for a Republican,
//and to get tallies for both parties.

public class VotingMachine {
    private int democratCount;
    private int republicanCount;


    public VotingMachine(int democratCount, int republicanCount) {
        this.democratCount = democratCount;
        this.republicanCount = republicanCount;

    }

    public void voteForDemocrat(){
        democratCount++;
    }

    public void voteForRepublican() {
        republicanCount++;
    }

    public void printTotal() {
        System.out.println("The total Democratic voters is : " + democratCount);
        System.out.println("The total Republican voters is : " + republicanCount);
    }



}
