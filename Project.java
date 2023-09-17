
class character{
    protected String Name;
    protected int Health;
    protected int Damage;
    protected int Round;
    protected int Stamina;

    character(String name,int health,int damage,int round){
        this.Name = name;
        this.Health = health;
        this.Damage = damage;
        this.Round = round;

        Stamina = 1;
    }
    
    
    
    public void attack(character target){
        if (this.Stamina == 1 && this.Health != 0){
            target.Health = target.Health - this.Damage;
            this.Stamina--;
            System.out.println(this.Name+" attack "+target.Name+" for "+this.Damage+" points");
        }else if(this.Health == 0){
            System.out.println(this.Name+" has been dead.");
        }else if(this.Stamina != 1){
            System.out.println(this.Name+" has no energy.");
        }else{
            System.out.println("ERROR");
        }
        

    }

    public void ShowDetail(){
        System.out.println("Name : "+this.Name);
        System.out.println("HP : "+this.Health);
        System.out.println("Activity : "+this.Stamina);
    }
}


class Enemy extends character{

    Enemy(String name,int health,int damage,int round){
        super(name,health,damage,round);
        
        Stamina = 1;
    }

    public void ShowDetail(){
        System.out.println(this.Name);
        System.out.println("HP : "+this.Health);
        System.out.println("Activity : "+this.Stamina);
    }
}
