public class Q {
    int n;
    boolean vakueSet = false;

    synchronized int get(){
        while (!vakueSet) try{
            wait();
        } catch (InterruptedException e){
            System.out.println("Перехвачено InterruptedException");
        }
            System.out.println("Получено: "+ n);
            vakueSet = false;
            notify();
            return n;
    }

    synchronized void  put(int n){
        while (vakueSet) try{
            wait();
        } catch (InterruptedException e){
            System.out.println("Перехвачено InterruptedException");
        }

        this.n = n;
        vakueSet =true;
        System.out.println("Отправлено: "+ n);
        notify();
    }
}
