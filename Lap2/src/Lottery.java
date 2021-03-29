import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lotteryNumber = (int) Math.random() * 100;

        System.out.println("Máy đã đưa ra số. Mời bạn đoán!");

        int digit1 = lotteryNumber / 10;
        int digit2 = lotteryNumber % 10;

        int playerNumber;
        
        do{
            System.out.println("Dự đoán 1 số bất kì: ");
            playerNumber = sc.nextInt();
            if (playerNumber >= 100) {
                System.out.println("Chỉ được dự đoán số có 2 chữ số! Mời bạn đoán lại");
            }
        }while(playerNumber >= 100);

        int playerDigit1 = playerNumber / 10;
        int playerDigit2 = playerNumber % 10;

        if (playerNumber == lotteryNumber) {
            System.out.println("Bạn đã trúng giải nhất 10.000$");
        }
        else if (playerDigit1 == lotteryNumber || playerDigit1 == lotteryNumber) {
            System.out.println("Bạn đã trúng giải khuyến khích 1000$");
        }
        else {
            System.out.println("Chúc bạn may mắn lần sau");       
        }


    }
}
