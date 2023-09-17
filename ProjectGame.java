import java.util.Random;

class ProjectGame{
    public static void main(String[] args) {
        character c1 = new character("John", 10, 2,0);
        Enemy e1 = new Enemy("Jane", 10, 2,1);

        Random rand = new Random();
        int rand_round = rand.nextInt(2);
        

        System.out.println(rand_round);
        if(rand_round == 0){
            System.out.println(c1.Name+" Attack first!");
            while(c1.Health != 0 && e1.Health != 0){

                c1.ShowDetail();
                e1.ShowDetail();

                c1.attack(e1);
                e1.attack(c1);

                c1.ShowDetail();
                e1.ShowDetail();

                c1.Stamina = 1;
                e1.Stamina = 1;
                System.out.println("Both has regain the stamina.");
            }
            if(e1.Health <= 0){
                System.out.println(c1.Name+" has won the battle.");
                
            }else if(c1.Health <= 0){
                System.out.println(e1.Name+" has won the battle.");
            }

        }else{
            System.out.println(e1.Name+" Attack first!");
            while(c1.Health != 0 && e1.Health != 0){

                e1.ShowDetail();
                c1.ShowDetail();

                e1.attack(e1);
                c1.attack(c1);

                e1.ShowDetail();
                c1.ShowDetail();
                
                c1.Stamina = 1;
                e1.Stamina = 1;
                System.out.println("Both has regain the stamina.");
            }
            if(e1.Health <= 0){
                System.out.println(c1.Name+" has won the battle.");
            }else if(c1.Health <= 0){
                System.out.println(e1.Name+" has won the battle.");
            }
        
    }
}}
