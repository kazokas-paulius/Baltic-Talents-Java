package lt.baltictalents._0808.nd_0808;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args){
        cekiukas(12, 4.74);
    }

    private static void cekiukas(int kiekis, double kaina){
        double PVM = 21.0;

        double suma = kiekis * kaina;
        BigDecimal sumaSuPVM = new BigDecimal(suma + (suma * PVM / 100));
        BigDecimal sumaBePVM = new BigDecimal(suma - (suma * PVM / 100));
        BigDecimal vienetoKainaBePVM = new BigDecimal(suma + (suma * PVM / 100) / kiekis);
        BigDecimal PVMsuma = new BigDecimal((suma + (suma * PVM / 100)) - (suma - (suma * PVM / 100)));

        System.out.println("Kiekis: " + kiekis + "\n" + "Suma su PVM: " +  sumaSuPVM.setScale(2, RoundingMode.CEILING));
    }
}
