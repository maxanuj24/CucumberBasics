public class Cake {
    int number;

    Cake(int number){
        this.number = number;
    }
    public int getNumberOfCakes(){
        return number;
    }
    public void comsumeCake(int t){
       if(this.number>t)
           this.number-=t;
    }

}
