public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter( String name,int damage,int health,int weight, int dodge){
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;

        this.dodge= dodge;
    }

    int hit(Fighter enemy){
        System.out.println(this.name + " VS " + enemy.name+ " "+ this.damage + " damaged him.");
        if(enemy.isDodge()){
            System.out.println(enemy.name+ " blocked the damage.");
            return enemy.health;
        }
        if (enemy.health-this.damage <0){
            return 0;
        }
        return enemy.health-this.damage;
    }

    boolean isDodge(){
        double randomNumber= Math.random()*100;
        return randomNumber <=this.dodge;

    }

}
