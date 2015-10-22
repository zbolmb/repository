public class RandomSmithoreEvent extends RandomEvent {
    
    public RandomSmithoreEvent() {
        super("A WANDERING SPACE TRAVELER REPAID YOUR HOSPITALITY BY LEAVING TWO BARS OF SMITHORE.");
    }
    
    @Override
    protected String generate() {
        Configurations.curPlayer.smithore += 2;
        
        return msg;
    }
}
