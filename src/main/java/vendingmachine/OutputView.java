package vendingmachine;

public class OutputView {

    public void printMachineCoin() {
        System.out.println("자판기가 보유한 동전");
        for (Coin coin : Coin.values()) {
            System.out.println(coin.getAmount() + "원 - " + coin.getCount() + "개");
        }
    }

    public void printMoney(int money) {
        System.out.println("투입 금액: " + money + "원");
    }
}
