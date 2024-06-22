public class Match {
    Fighter f1;
    Fighter f2;

    int minWeight;
    int maxWeight;

    Match(Fighter f1,Fighter f2, int minWeight,int maxWeight){
        this.f1 =f1;
        this.f2 =f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;

    }
    public void run(){
        if(isCheck()){
            while(this.f1.health>0 && this.f2.health >0){
                System.out.println("*******NEW ROUND******");
                this.f2.health=this.f1.hit(f2);
                //System.out.println(this.f2.health);
                if(isWin()){
                    break;
                }
                this.f1.health = this.f2.hit(f1);

                 if(isWin()){
                    break;
                }
                 System.out.println(this.f1.name + " health " +this.f1.health);
                 System.out.println(this.f2.name + " health " +this.f2.health);
            }
        }
        else{
            System.out.println("Fighters conditions are not match");
        }
    }

    boolean isCheck(){
        return(this.f1.weight>=minWeight && this.f1.weight <=maxWeight)&&(this.f2.weight>=minWeight && this.f2.weight<=maxWeight);
    }

    boolean isWin(){
        if (f1.health ==0){
            System.out.println(f2.name+ " won!");
            return true;
        }
        if (f2.health==0){
            System.out.println(f1.name+ " won!");
            return true;
        }
        return false;
    }
}
