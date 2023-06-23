public class Main {
    public static void main(String[] args) {

        int payticket = 25341; // Стоимость билета
        int rubles = 20; //Потраченные рубли для получения одной бонусной мили

        int mile = (payticket / rubles);  //Начисленные мили

        System.out.println(mile);

    }
}
