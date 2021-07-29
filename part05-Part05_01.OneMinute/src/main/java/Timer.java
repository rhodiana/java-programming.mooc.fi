/**
 *
 * @author Rhodiana
 */
public class Timer {
    private ClockHand hundredths;
    private ClockHand seconds;
    
    public Timer() {
        this.hundredths = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    
    public String toString() {
        return seconds.toString() + ":" + hundredths.toString();
    }
    
    public void advance() {
        if(this.hundredths.value() == 99){
            this.seconds.advance();
        }
        this.hundredths.advance();
    }
}
