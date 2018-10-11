package idv.wangyj.timed.task.javatimedtask.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.java2d.pipe.SpanShapeRenderer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerJob {
    private static final Logger logger=LoggerFactory.getLogger(TimerJob.class);

    private static  SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    public static void run(String name){
        TimerTask timerTask1=new TimerTask() {
            @Override
            public void run() {
                logger.info(">>timerTask1>>"+name+">>>java.util.Timer>>>>>>>>>>>执行定时任务："+simpleDateFormat.format(new Date()));
            }
        };

        java.util.Timer timer1=new java.util.Timer();
        timer1.schedule(timerTask1,10,1000);//延迟10毫秒后，每个一秒执行一次


        TimerTask timerTask2=new TimerTask() {
            @Override
            public void run() {
                logger.info("**timerTask2**"+name+"***java.util.Timer**********执行定时任务："+simpleDateFormat.format(new Date()));
            }
        };

        Timer timer2=new Timer();
        timer2.schedule(timerTask2,10,2000);

        TimerTask timerTask3=new TimerTask() {
            @Override
            public void run() {
                logger.info("++timerTask3++"+name+"+++java.util.Timer+++++++++++执行定时任务："+simpleDateFormat.format(new Date()));
            }
        };

        timer2.schedule(timerTask3,10,2000);
    }
}
