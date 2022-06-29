public class Fighter {

    String name;
    int damage;
    int health;
    int weight;
    double dodge;
    //double start;

    public Fighter(String name, int damage, int health, int weight, double dodge){
        this.name= name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        this.dodge = dodge;
    }
    public int hit(Fighter foe){
        //System.out.println("------------------");
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " kadar hasar vurdu!");

        if (foe.isDodge()){
           System.out.println(foe.name + "Gelen hasarı engelledi!");
           return foe.health;
        }
        if (foe.health - this.damage < 0){
            return 0;
        }
        return foe.health - this.damage;

    }
    public boolean isDodge() {
        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;
    }

}
