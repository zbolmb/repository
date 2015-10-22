public class RandomFoodEnergyEvent extends RandomEvent {
    
    public RandomFoodEnergyEvent() {
        super("YOU JUST RECEIVED A PACKAGE FROM YOUR HOME-WORLD RELATIVES CONTAINING 3 FOOD AND 2 ENERGY UNITS.");
    }
    
    @Override
    protected String generate() {
        Configurations.curPlayer.food += 3;
        Configurations.curPlayer.energy += 2;
        
        return msg;
    }
}
