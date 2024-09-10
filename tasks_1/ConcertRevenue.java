public class ConcertRevenue {
    public static double getTotalRevenue(int ticketsSold, double pricePerTicket) {
        return ticketsSold * pricePerTicket;
    }

    public static void main(String[] args) {
        int ticketsSold = 200;
        double pricePerTicket = 25.75;
        double totalRevenue = getTotalRevenue(ticketsSold, pricePerTicket);
        System.out.println("Выручка от продажи билетов составляет: " + totalRevenue + " рублей");
    }
}
