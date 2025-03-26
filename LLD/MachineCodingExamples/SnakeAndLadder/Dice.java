package LLD.MachineCodingExamples.SnakeAndLadder;

public class Dice {
    private int noOfDice;

    Dice(int nod){
        noOfDice = nod;
    }

    public int rollDice() {
        int min = 1;
        int max = 6;
        return (int)(Math.random()*noOfDice*(max-min+1)) + min;
    }

    public int getNoOfDice() {
        return noOfDice;
    }

    public void setNoOfDice(int noOfDice) {
        this.noOfDice = noOfDice;
    }

}
