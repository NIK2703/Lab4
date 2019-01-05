public class Main {

    public static void main(String[] args) {
        // пример 4
        Q q = new Q();
        new Producer(q);
        new Consumer(q);

        System.out.println("Для остановки нажмите Ctrl-C");

// пример 3
//            CallMe target = new CallMe();
//            Caller ob1 = new Caller(    target, "Добро пожаловать");
//        Caller ob2 = new Caller(    target, " в синхронизированный ");
//        Caller ob3 = new Caller(    target, "мир!");
//
//        try{
//            ob1.t.join();
//            ob2.t.join();
//            ob3.t.join();
//        } catch(InterruptedException e){
//            System.out.println("Прервано.");
//        }

        // пример 2
        //ThreadDemo n = new ThreadDemo();

        // пример 1
//        MyThread t1 = new MyThread("One");
//        MyThread t2 = new MyThread("Two");
//        t1.start();
//        t2.start();
        //t1.setRunning();
       // t2.setRunning();
    }
}
