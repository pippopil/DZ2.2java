public class main {
    public static void main(String[] args) {
        int initialAccount = 100;
        int replenishmentAmount = 45000;
        int bonusAccount;
        int bonus = replenishmentAmount / 100;
        int fixedAmount = 1000;
        if (replenishmentAmount > fixedAmount) {
            bonusAccount = initialAccount + replenishmentAmount + bonus;
        } else {
            bonusAccount = initialAccount + replenishmentAmount;

        }
        System.out.println(bonusAccount);


    }
}
