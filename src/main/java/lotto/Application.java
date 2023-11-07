package lotto;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        int lotto_num = input();
        Lotto_Wallet Lottos = new Lotto_Wallet(); // 로또 지갑 객체 생성
    }
    private static int input(){                // input 통합 부분, 재귀함수 처리
        String input = input_money();
        try {
            int money = String_to_Int(input);
            int lotto_num = Affordable_LottoNum(money);
            return lotto_num;
        }
        catch (IllegalArgumentException e){
            return input();
        }
    }
    private static String input_money(){               // input을 String으로 받아 반환
        System.out.print("구입금액을 입력해 주세요.\n");
        String input = Console.readLine();
        return input;
    }
    private static int String_to_Int(String str){      // Input을 String으로 받아서 Int로 반환
        try{
            return Integer.parseInt(str);
        }catch (NumberFormatException e){
            System.out.print("[ERROR] 로또 구입 금액은 정수여야 합니다.\n\n");
            throw new IllegalArgumentException();
        }
    }
    private static int Affordable_LottoNum(Integer money) { // money를 받아 구매할 로또 개수 반환
        if (money % 1000 != 0 || money < 0){
            System.out.print("[ERROR] 로또 구입 금액은 1,000원으로 나누어 떨어지는 양의 정수여야 합니다.\n\n");
            throw new IllegalArgumentException();
        }
        return money / 1000;
    }


    private static Lotto makeOneLotto(){
        List<Integer> numbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);
        return new Lotto(numbers);
    }



}
