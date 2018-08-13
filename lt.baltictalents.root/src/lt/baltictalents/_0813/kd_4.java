package lt.baltictalents._0813;

public class kd_4 {
    public static void main(String[] args) {
        OSType osIOS = OSType.IOS;
        OSType osANDROID = OSType.ANDROID;
        OSType osSYMBIAN = OSType.SYMBIAN;

        System.out.println(osIOS.getCode(osIOS.toString()) + " " + osANDROID.getCode(osANDROID.toString()) +
                " " + osSYMBIAN.getCode(osSYMBIAN.toString()));
    }
}
