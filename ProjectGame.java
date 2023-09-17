import java.util.Random;
import java.util.Scanner;

class ProjectGame{
    public static void main(String[] args) {


        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String username = input1.nextLine();
        Scanner input2 = new Scanner(System.in);
        System.out.print("Who/What you want to fight : ");
        String enemyname = input2.nextLine();

        /*user_input.close();*/

        character c1 = new character(username, 10, 2,0);
        Enemy e1 = new Enemy(enemyname, 10, 2,1);

        Random rand = new Random();
        int rand_round = rand.nextInt(2);
        
        if(rand_round == 0){
            System.out.println(c1.Name+" Attack first!");
            while(c1.Health != 0 && e1.Health != 0){

                c1.action(e1);
                if(e1.Health <= 0){
                    System.out.println(e1.Name+" died");
                    System.out.println(c1.Name+" has won the battle.");
                    break;
                }
                e1.attack(c1);
                if(c1.Health <= 0){
                    System.out.println(c1.Name+" died");
                    System.out.println(e1.Name+" has won the battle.");
                    break;
                }

                c1.Stamina = 1;
                e1.Stamina = 1;
                System.out.println("Both has regain the stamina.");
            }
            
        }else{
            System.out.println(e1.Name+" Attack first!");
            while(c1.Health != 0 && e1.Health != 0){

                e1.attack(c1);
                if(c1.Health <= 0){
                    System.out.println(c1.Name+" died");
                    System.out.println(e1.Name+" has won the battle.");
                    break;
                }
                c1.action(e1);
                if(e1.Health <= 0){
                    System.out.println(e1.Name+" died");
                    System.out.println(c1.Name+" has won the battle.");
                    break;
                }

                c1.Stamina = 1;
                e1.Stamina = 1;
                System.out.println("Both has regain the stamina.");
                
            }
        }
    }
}

