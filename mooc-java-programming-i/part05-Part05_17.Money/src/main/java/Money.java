
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

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents); // create a new Money object that has the correct worth
        // return the new Money object
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (!(compared.euros < 0) && !(compared.cents < 0)) {
            if (this.euros < compared.euros) {
                return true;
            }

            if (this.euros < compared.euros && this.cents < compared.cents) {
                return true;
            }

            if (this.euros == compared.euros && this.cents < compared.cents) {
                return true;
            }
        }
        return false;
    }

    public Money minus(Money decreaser) {
        Money decreasedMoney = new Money(this.euros - decreaser.euros, this.cents - decreaser.cents);
        if (decreaser.cents > this.cents) {
            int newEuro = this.euros - 1;
            int newCents = this.cents + 100;
            decreasedMoney = new Money(newEuro - decreaser.euros, newCents - decreaser.cents);
        }

        if (decreasedMoney.euros < 0) {
            decreasedMoney = new Money(0, 0);
        }

        return decreasedMoney;
    }
}
