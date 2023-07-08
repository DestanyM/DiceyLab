public class Simulation {

    // create a dice instance
    private int numOfDice;
    private int numOfRolls;
    // creat a bin instance
    private Bins bins;
    //sim will loop through toss and sum
    public Simulation(int numOfDice, int numOfRolls){
        this.numOfDice = numOfDice;
        this.numOfRolls = numOfRolls;
    }
    public void runSimulation(){
        int total = 0;
        Dice runDice = new Dice(numOfDice);
        bins = new Bins(numOfDice, 6*numOfDice);
        for (int i = 0; i < numOfRolls; i++){
            total = runDice.tossAndSum();
            bins.incrementBin(total);
        }
    }

    public void Results(){
        System.out.println("The are " + numOfDice+ "dice that have been rolled for " +numOfRolls+ "times.");
        for (int i = numOfDice; i <= (6*numOfDice); i++){
            System.out.printf("%d:%,d:%.2f\n", i, bins.getBin(i), ((double)(bins.getBin(i))/numOfRolls));
        }
    }

}
