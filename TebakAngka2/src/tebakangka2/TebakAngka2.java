package tebakangka2;

import java.util.Random;
import java.util.Scanner;
        

public class TebakAngka2 {   
    
    public static void main(String[] args) {
    
        Random acak = new Random();
        Scanner input = new Scanner (System.in);
        int angkaJwb = acak.nextInt(100) + 1;
        int tebakan;
        int score = 100;
        int coba = 0;
        boolean benar = false;
        
        while (benar == false) {
            System.out.println("Tebak angka dari 1-100 : ");
            tebakan = input.nextInt();
            
            if (score == 0) {
                System.out.println("Yahh kesempatan kamu udah abis :(");
                break;
            }
            if (tebakan < angkaJwb) {
                System.out.println("Tebakanmu terlalu kecil");
                coba++;
                score -=2;
            }
            if (tebakan > angkaJwb) {
                System.out.println("Tebakanmu terlalu besar");
                coba++;
                score -=2;
            }
            if (tebakan == angkaJwb) {
                System.out.println("Yeyyy tebakanmu tepat!!! :D");
                benar = true;
            }   
        }
        System.out.println("Score kamu adalah : "+score);
        if (coba <= 5) {
            if (score != 0) {
                score += 50;
                System.out.println("Yey kamu dapat bonus 50 point!!!");
                System.out.println("Score kamu adalah : "+score);
            }
        }

        System.out.println("Kamu udah nyoba "+coba+" kali");
    }
}