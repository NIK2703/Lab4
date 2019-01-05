public class NewThread implements Runnable {
    Thread t;
    String name = new String();
    int num;
    int delayms;

    NewThread(String name, int num, int delayms){
        this.name = name;
        t = new Thread(this, name);
        this.num = num;
        this.delayms = delayms;
        System.out.println("Поток " + name + " создан:" + t);
        t.start();

    }

    public void run() {
        try{
            for(int i = num; i>0; i--){
                System.out.println("Поток " + name + ":" +  i);
                Thread.sleep(delayms);
            }
        } catch (InterruptedException e){
            System.out.println("Поток "+ name+ " уже завершён.");
        }
        System.out.println("Поток " + name+   " завершён");
    }
}
