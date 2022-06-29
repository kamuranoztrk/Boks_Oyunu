public class Main {
    public static void main(String[] args) {
    Fighter ali = new Fighter("Ali", 15, 100, 80, 60);
    Fighter veli = new Fighter("Veli" , 10, 90, 90, 40);
    Match m = new Match(ali, veli, 80, 100);
    m.run();
    }
}
