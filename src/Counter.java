

public class Counter {

    private int value;

    public Counter(int value) {
        this.value = value;
    }


    public void count(int add){
        value = value + add;
        System.out.println("Added. New Value is: " + value);
        if(value > 150){
            setLimit(add);
        }
    }


    public void undo(int subtract) {
        value = value - subtract;
        System.out.println("Subtracted. New value is: " + value);
    }


    public void setLimit(int reset){
            System.out.println("Limit is exceeded.");
            value = value - reset;
            System.out.println("The value has been set back to: " + value);
    }



    public int getValue() {
        return value;
    }
}
