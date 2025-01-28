package lab9B.prob12;

import javax.swing.text.html.Option;
import java.util.Optional;

public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        return Optional.ofNullable(instance).orElseGet(LazySingleton::new);
    }

    public static LazySingleton getInstanceWithNull() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        LazySingleton inst = LazySingleton.getInstance();
        System.out.println("inst: " + inst);
    }


}
