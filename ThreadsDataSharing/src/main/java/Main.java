public class Main {
    public static void main(String[] args) {
        BonusCard bonusCard = new BonusCard(161);
        Human husband = new Human("husband", bonusCard);
        Human wife = new Human("wife", bonusCard);
        husband.start();
        wife.start();
    }
}
