public class Main {
    public static void main(String[] args) {
        int refill = 1000 ;
        int bonus = refill / 100 ;
        int bill = 100 ;
        if (refill >= 1000){
            int total_amount = bill + refill + bonus;
            System.out.println(total_amount);
        } else {
            int total_amound = bill + refill;
            System.out.println(total_amound);
        }
    }
}



