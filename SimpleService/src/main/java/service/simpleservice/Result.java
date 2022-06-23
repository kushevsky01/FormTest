package service.simpleservice;

public class Result {
    private final String command;
    private final Double a;
    private final Double b;
    private final Double result;

    public Result(String command, Double a, Double b, Double result){
        this.command = command;
        this.a = a;
        this.b = b;
        this.result = result;
    }


    public String getValue() {
        return command;
    }


    public Double getCmd() {
        return a;
    }

    public Double getCmd1() {
        return b;
    }

    public Double getResult() {
        return result;
    }
}
