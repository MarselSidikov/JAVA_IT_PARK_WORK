
public class Human extends Thread {
    private final BonusCard bonusCard;
    private String who;

    public Human(String who, BonusCard bonusCard) {
        this.who = who;
        this.bonusCard = bonusCard;
    }

    public void shopping(int bonuses) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
        // bonusCard - мьютекс (вики)
        synchronized (bonusCard) {
            if (bonusCard.getBonuses() >= bonuses) {
                System.out.println(who + " is gonna buy something");
                if (bonusCard.use(bonuses)) {
                    System.out.println(who + "bought something");
                } else {
                    System.out.println("Sorry, Honey, no money");
                }
            }
        }
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            shopping(7);
        }
    }
}
