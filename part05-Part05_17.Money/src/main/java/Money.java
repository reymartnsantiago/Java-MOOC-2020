
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public Money plus(Money addition) {
        int total = this.euros + addition.euros;
        return new Money(total, this.cents);
    }

    public boolean lessThan(Money compared) {
        return this.euros < compared.euros;
    }

    public Money minus(Money decreaser) {
        int newEuros=0;
        
            newEuros = (this.euros)-decreaser.euros;
           
           
        int newCents = 50;
       if(newEuros<0){
           newEuros=0;
           newCents=0;
       }
        
               return new Money(newEuros, newCents);
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
