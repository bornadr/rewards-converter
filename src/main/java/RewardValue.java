public class RewardValue {
    final private int miles;
    private double cash;

    public RewardValue(int miles){

        this.miles = miles;
    }

    public RewardValue(double cash){
        this.cash = cash;

        miles = (int) Math.round(cash*0.0035);
    }

    public float getMilesValue(){
        return miles;
    }

    public double getCashValue(){
        return cash;
    }


}
