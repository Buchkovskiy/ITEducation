package ITEducation.homework_w1;

import java.util.Scanner;
import ITEducation.homework_w1.*;

/**
 * Created by Администратор on 30.05.2015.
 */

public class CrossAndZero{
        static Scanner sc = new Scanner(System.in);

        public void game (CrossAndZero cz, char [] field) {
            for (int i = 0; i < 9; i++) {
                if ((i % 2) == 0) {
                    cz.takeTurn(field, 'x');
                    if ((cz.takeTurn(field, 'x')==0)||(cz.takeTurn(field, 'x')==1)||(cz.takeTurn(field, 'x')==2)){
                        continue;
                    }

                } else {
                    cz.takeTurn(field, 'o');
                    if ((cz.takeTurn(field, 'x')==0)||(cz.takeTurn(field, 'x')==1)||(cz.takeTurn(field, 'x')==2)){
                        continue;
                    }
                }
                cz.showTurn(field);
                char w = cz.checkWinner(field);
                if (w != ' ') {
                    System.out.println("Game Over. Winner - " + w);
                }
            }
        }


        //drawing field croos and zero
        public static void showTurn(char[] field) {
            for (int i = 0; i <9; i++) {
                System.out.printf("|%s|", field[i]);
                if (i==2||i==5||i==8) {
                    System.out.println("\n---------");
                }
            }
        }

        public static int takeTurn(char [] field, char player){
            int turn;
            int wrong=-1;



            System.out.println("Gamer "+player);
            if(sc.hasNextInt()){
                turn=sc.nextInt();
                if (turn > 0 && turn < 8){
                    if ((field[turn]!=' ')){
                        field[turn] = player;
                    }else{
                        System.out.println("Cell #"+turn+" occupied");
                        wrong=0;
                    }
                } else{
                    System.out.println("Introduce value doesn't correct");
                    wrong=1;
                }
            }else{
                System.out.println("Introduce value doesn't number");
                wrong=2;
            }
           return wrong;
        }

        public static char checkWinner(char[] field){
            char result=' ';
            if ((field[0]=='x'&& field[1]=='x'&& field[2]=='x')||(field[3]=='x'&& field[4]=='x'&& field[5]=='x')||(field[6]=='x'&& field[7]=='x'&& field[8]=='x')||
                (field[0]=='x'&& field[3]=='x'&& field[6]=='x')||(field[1]=='x'&& field[4]=='x'&& field[7]=='x')||(field[2]=='x'&& field[5]=='x'&& field[8]=='x')||
                (field[0]=='x'&& field[4]=='x'&& field[8]=='x')||(field[2]=='x'&& field[4]=='x'&& field[6]=='x')){
                result='x';
            }
            if ((field[0]=='o'&& field[1]=='o'&& field[2]=='o')||(field[3]=='o'&& field[4]=='o'&& field[5]=='o')||(field[6]=='o'&& field[7]=='o'&& field[8]=='o')||
                    (field[0]=='o'&& field[3]=='o'&& field[6]=='o')||(field[1]=='o'&& field[4]=='o'&& field[7]=='o')||(field[2]=='o'&& field[5]=='o'&& field[8]=='o')||
                    (field[0]=='o'&& field[4]=='o'&& field[8]=='o')||(field[2]=='o'&& field[4]=='o'&& field[6]=='o')){
                result='o';
            }
            return result;
        }

    }


