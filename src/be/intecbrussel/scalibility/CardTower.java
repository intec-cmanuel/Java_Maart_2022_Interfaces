package be.intecbrussel.scalibility;

public class CardTower implements Minimizable{
    public int cardsOnTheBase;

    public CardTower(int cardsOnTheBase) {
        this.cardsOnTheBase = cardsOnTheBase;
    }

    public int getCardsOnTheBase() {
        return cardsOnTheBase;
    }

    public void setCardsOnTheBase(int cardsOnTheBase) {
        this.cardsOnTheBase = cardsOnTheBase;
    }

    @Override
    public void scaleUp(int percentGrowth) {
        this.cardsOnTheBase = this.cardsOnTheBase + (this.cardsOnTheBase * percentGrowth)/100;
        if (this.cardsOnTheBase % 2 == 1) {
            this.cardsOnTheBase--;
        }
    }

    @Override
    public void scaleDown(int percentGrowth) {
        this.cardsOnTheBase = this.cardsOnTheBase - (this.cardsOnTheBase * percentGrowth)/100;
        if (this.cardsOnTheBase % 2 == 1) {
            this.cardsOnTheBase--;
        }
    }

    @Override
    public void minimize() {
        this.cardsOnTheBase = 2;
    }
}
