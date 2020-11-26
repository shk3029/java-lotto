package step4.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import step4.controller.LottoTicketMaker;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoTest {

    @Test
    @DisplayName("로또 갯수 대로 입력되는지")
    public void 로또_갯수_대로_입력되는지() {
        int manualLottoQty = 1;

        Amount amount = Amount.of(14000);
        Numbers numbers = Numbers.of("1,2,3,7,8,9");

        LottoTicketMaker lottoTicketMaker = LottoTicketMaker.of(amount, manualLottoQty, numbers.getLottoNumber());
        Lottos lottos = lottoTicketMaker.getLottoTicket();
        assertThat(lottos.getLottos().size()).isEqualTo(14);
    }
}
