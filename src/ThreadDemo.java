public class ThreadDemo {

    ThreadDemo() {
        NewThread n1 = new NewThread("один", 10, 500);
        NewThread n2  = new NewThread("два", 5, 200);
        NewThread n3  = new NewThread("три", 5, 1000);

        System.out.println("Поток один запущен: "+ n1.t.isAlive());
        System.out.println("Поток два запущен: "+ n2.t.isAlive());
        System.out.println("Поток три запущен: "+ n3.t.isAlive());

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(100);
            }
            n1.t.join();
            n2.t.join();
            n3.t.join();
            System.out.println("Главный поток завершён.");
        } catch (InterruptedException e) {
            System.out.println("Главный поток уже завершён.");
        }
    }

}
