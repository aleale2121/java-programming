
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

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int newEuros = addition.euros() + this.euros;
        int newCents = addition.cents + this.cents;
        return new Money(newEuros, newCents);

    }

    public boolean lessThan(Money compared) {
        double thisTotal = this.euros*100 + this.cents;
        double comparedTOTAL = compared.euros()*100 + compared.cents;
        return thisTotal < comparedTOTAL;
    }

    public Money minus(Money decreaser) {
        int newEuros = this.euros - decreaser.euros();
        int newCents = this.cents - decreaser.cents();

        if (newCents < 0) {
            newCents += 100;
            newEuros -= 1;
        }

        if (newEuros < 0) {
            return new Money(0, 0);
        } else {
            return new Money(newEuros, newCents);
        }

    }
}
