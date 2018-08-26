package lt.baltictalents._0823;

public class InvalidParamException extends Exception{
    private String error;
    private Object[] params;

    public InvalidParamException(String error, Object[] params) {
        super(error);
        this.error = error;
        this.params = params;
    }
}
