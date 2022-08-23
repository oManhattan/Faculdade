public class LazySingletone {
    
    private static LazySingletone singletone;

    private LazySingletone() { }

    public static LazySingletone getInstance() {
        return singletone = (singletone == null) ? new LazySingletone() : singletone;
    }
}
