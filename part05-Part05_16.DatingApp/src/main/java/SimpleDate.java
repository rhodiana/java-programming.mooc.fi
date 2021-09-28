
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance() {
        if(this.day > 29) {
            this.day=0;
            if(this.month > 11) {
                this.month = 0;
                this.year++;
            }    
            this.month++;
        }
        this.day++;
    }
    
    public void advance(int howManyDays) {
        int extraYears = howManyDays/30/12;
        int extraMonths = howManyDays/30;
        int extraDays = howManyDays%30;
        this.year = this.year + extraYears;
        while(extraMonths>11) {
            this.year++;
            extraMonths = extraMonths - 12;
        }
        this.month = this.month + extraMonths;
        
        while(extraDays>0){
            this.advance();
            extraDays--;
        }
    }
    
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day,this.month, this.year);
        
        newDate.advance(days);
        
        return newDate;
    }

}
