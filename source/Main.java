public class Main {
    public static void main(String[] args) {
        boolean ticket_ordered = true;
        int percent = ticket_ordered ? 1 : 0;

        long ticket_price = 68500;
        long bonus = ticket_price / 20;

        System.out.println(bonus);
    }
}
