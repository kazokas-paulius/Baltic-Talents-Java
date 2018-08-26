package lt.baltictalents._0823;

public class ExceptionsMain {
    public static void main(String[] args) {
        try {
            throwException();
        } catch (InvalidParamException e) {
            e.printStackTrace();
        }
    }
    private static void throwException() throws InvalidParamException {
        throw new InvalidParamException("Klaida", null);
    }
}
