package lt.baltictalents._test;

import java.util.Arrays;

public class kdClass {
    public static void main(String[] args){
        Zmogus[] zmones = {new Zmogus("v1"), new Zmogus("v2")};

        Zmogus[] zmones2 = new Zmogus[3];
        System.out.println("before: " + Arrays.toString(zmones2));
        Zmogus zm = new Zmogus("v3");
        zmones2[0] = zm;
        zmones2[1] = new Zmogus("v4");
        zmones2[2] = null;
        System.out.println("after: " + Arrays.toString(zmones2));
    }
}

class Zmogus{
    String vardas;

    public Zmogus(String vardas) {
        this.vardas = vardas;
    }

    @Override
    public String toString() {
        return "Zmogus{" +
                "vardas='" + vardas + '\'' +
                '}';
    }
}