
package finalexam2016.q2;

import java.util.Arrays;
import java.util.Scanner;

public class FinalExam2016Q2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter number of teams : ");
        while(!in.hasNextInt()){
            System.out.println("Input a number please!\n");
            System.out.print("Enter number of teams : ");
            in.nextLine();
        }
        int teams = in.nextInt();
        String name[] = new String[teams];
        int score[] = new int[teams];
        
        for(int x = 0; x < score.length; x++){
            in.nextLine();
            System.out.print("Enter team "+(x+1)+" name : ");
            name[x] = in.nextLine();
            System.out.print("Enter team "+(x+1)+" score : ");
            score[x] = in.nextInt();
        }
        
        for(int pass = 1; pass < teams; pass++){
            for(int i = 0; i < teams-1; i++){
                if(score[i]<score[i+1]){
                    int temp = score[i];
                    score[i] = score[i+1];
                    score[i+1] = temp;
                    
                    String hold =  name[i];
                    name[i] = name[i+1];
                    name[i+1] = hold;
                }
            }
        }
        System.out.println("List of team with the highest team score first");
        for(int x = 0; x < score.length; x++){
            System.out.print(name[x]+" "+"("+score[x]+") | ");
        }
        System.out.println("");
    }
    
}
