package lt.baltictalents._0813;

public enum OSType {
    IOS, ANDROID, SYMBIAN;

    String getCode(String text){
        return text.toLowerCase();
    }
}
