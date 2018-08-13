package lt.baltictalents._0813;

public class kd_3_Main implements kd_3 {
    @Override
    public void Metodas() {

    }
    void aFoo() {
        kd_3.super.Metodas();
    }
    public static void main(String[] args) {
         kd_3_Main pav = new kd_3_Main();
         pav.Metodas();
         pav.aFoo();


    }
}
