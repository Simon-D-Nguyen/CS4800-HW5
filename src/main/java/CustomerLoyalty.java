public class CustomerLoyalty {
    public enum LoyaltyStatus {
        Newbie,
        Regular,
        AllStar
    }


    public double applyDiscount(LoyaltyStatus status){
        return switch(status){
            case Newbie -> 1.0;
            case Regular -> 0.95;
            case AllStar -> 0.90;
        };
    }
}
