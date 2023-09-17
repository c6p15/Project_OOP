import java.util.Scanner;

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
            System.out.println(this.Name+" attacks "+target.Name+" for "+this.Damage+" DMG!!");
        }else if(this.Health == 0){
            System.out.println(this.Name+" has already dead.");
        }else if(this.Stamina != 1){
            System.out.println(this.Name+" has no stamina.");
        }else{
            System.out.println("ERROR.");
        }
        

    }

    public void castspell(){
        if (this.Stamina == 1 && this.Health != 0){
            this.Health = this.Health + 3;
            this.Stamina--;
            System.out.println(this.Name+" uses spell to heal themself.");
        }else if(this.Health == 0){
            System.out.println(this.Name+" has already dead.");
        }else if(this.Stamina != 1){
            System.out.println(this.Name+" has no stamina.");
        }else{
            System.out.println("ERROR.");
        }
    }

    public void ShowDetail(){
        System.out.println("Name : "+this.Name);
        System.out.println("HP : "+this.Health);
        System.out.println("Activity : "+this.Stamina);
    }

    public void action(character target){
        System.out.println("| 1 = attack | 2 = use spell |");
        System.out.println("What are you gonna do");
        Scanner user_action = new Scanner(System.in);
        int action = user_action.nextInt();
        if(action == 1){
            this.attack(target);
        }else if (action == 2){
            this.castspell();
        }

        this.ShowDetail();
        target.ShowDetail();
    }
}


class Enemy extends character{

    Enemy(String name,int health,int damage,int round){
        super(name,health,damage,round);
        
        Stamina = 1;
    }
}
