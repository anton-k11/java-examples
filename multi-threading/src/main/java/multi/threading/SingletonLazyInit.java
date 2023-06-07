package multi.threading;

public class SingletonLazyInit {

    private static volatile SingletonLazyInit instance = null;

    private SingletonLazyInit() {}

    public static SingletonLazyInit getInstance() {
      if (instance == null) {
        synchronized(SingletonLazyInit.class) {
          if (instance == null) {
            instance = new SingletonLazyInit();
          }
        }
      }

      return instance;
    }
  
}
