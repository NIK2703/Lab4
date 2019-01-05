public class MyThread extends Thread {
    String name = null;
    boolean isRunning = true;

    public MyThread(String name){
        this.name = name;
    }

    public void run(){
        while(isRunning) {
            Log.toConsole(this.name);
        }
    }

    void setRunning(){
        if(isRunning)  isRunning = false;
        else isRunning = true;
    }


}
