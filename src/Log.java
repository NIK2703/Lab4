import java.util.Date;
import java.util.*;
import java.text.*;


public class Log {
    static public void toConsole(String msg){
        Date now = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd, HH:mm:ss:SSS");
        System.out.format("[%s} %s \n", df.format(now), msg);
    }
}
