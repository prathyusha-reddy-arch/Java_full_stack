package corejava.lambda;

public interface GenericPrinter<T> {
    void print(T t);

    //in java 8
    public static void doSomething(){

    }

    public default void doSomething1(){

    }
}
