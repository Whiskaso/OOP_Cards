public class main {

    public static void main(String[] args) {
        BuissnesCard b1 = new BuissnesCard("Andrzej", "Kowalski", 555555555, "Katowice");
        BankCard bc1 = new BankCard("Zenon", "Kowalski", 555534434, "Warszawa", "32321");

        BuissnesCard b4 = new BuissnesCard("Andrzej", "Kowalski", 555555555, "Katowice");
        BuissnesCard b5 = new BuissnesCard("Andrzej", "Kowalski", 111111111, "Katowice");

        BankCard bc2 = new BankCard("Zenon", "Kowalski", 555534434, "Warszawa", "32321");
        BankCard bc3 = new BankCard("Zenon", "Kowalski", 555534432, "Warszawa", "32321");


        if (b1 == b4){
            System.out.println("Number are the same");
        } else {
            System.out.println("Not equal numbers");
        }

        // checking if objects are the same
        System.out.println(b1 == b4);
        System.out.println(b1.equals(b4));

        // hashcode are the same
        System.out.println(b1.hashCode());
        System.out.println(b4.hashCode());

        // hashcode are different because of different number
        System.out.println(b4.hashCode());
        System.out.println(b5.hashCode());

        // hashcodes for bankcard with generated methods by InteliJ
        System.out.println(bc1.hashCode());
        System.out.println(bc2.hashCode());
        System.out.println(bc3.hashCode());

        // checking method toString
        System.out.println(b1);
        System.out.println(bc1);
    }
}
