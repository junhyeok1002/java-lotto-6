package lotto;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        String input = input_money();
        int money = String_to_Int(input);
        int lotto_num = Affordable_LottoNum(money);
        System.out.print(lotto_num);
    }
    private static String input_money(){               // input을 String으로 받아 반환
        System.out.print("구입금액을 입력해 주세요.\n");
        String input = Console.readLine();
        return input;
    }
    private static int String_to_Int(String str){      // Input을 String으로 받아서 Int로 반환
        try{
            return Integer.parseInt(str);
        }catch (NumberFormatException e){  // 변환 포멧 안맞으면 IllegalArgumentException 발생
            throw new IllegalArgumentException();
        }
    }
    private static int Affordable_LottoNum(Integer money) { // money를 받아 구매할 로또 개수 반환
        if (money % 1000 != 0){            // 나누어 떨어지지 않으면 IllegalArgumentException 발생
            throw new IllegalArgumentException();
        }
        return money / 1000;
    }



}
