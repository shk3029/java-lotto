package step2.view;

import java.util.Scanner;

public class InputView {

    public static final Scanner scanner = new Scanner(System.in);

    public static int inputMessageLottoAmount() {
        System.out.println("구입 금액을 입력해 주세요");
        return scanner.nextInt();
    }


}
