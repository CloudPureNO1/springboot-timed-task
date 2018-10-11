package idv.wangyj.timed.task.springboottask.job;



//import org.apache.log4j.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class MySlf4jLogbakTaskService {
 //   private static final Logger logger=Logger.getLogger(MyTaskService.class);//log4j


    /**
     * 定时任务中，采用 slf4j+logback  可以输出对应的线程  比如
     * 8-10-11 10:16:33.001  INFO 10644 --- [pool-1-thread-1] i.w.t.t.s.job.MyTaskService              : -------------springboot Scheduled timed task3-----------------2018-10-11 10:16:33
     * 2018-10-11 10:16:35.001  INFO 10644 --- [pool-1-thread-1] i.w.t.t.s.job.MyTaskService              : >>>>>>>>>>>>>>>springboot Scheduled timed task1>>>>>>>>>>>>>>2018-10-11 10:16:35
     * 2018-10-11 10:16:36.001  INFO 10644 --- [pool-1-thread-1] i.w.t.t.s.job.MyTaskService              : -------------springboot Scheduled timed task3-----------------2018-10-11 10:16:36
     * 2018-10-11 10:16:36.001  INFO 10644 --- [pool-1-thread-1] i.w.t.t.s.job.MyTaskService              : ************* springboot Scheduled timed task2***************2018-10-11 10:16:36
     * 2018-10-11 10:16:39.002  INFO 10644 --- [pool-1-thread-1] i.w.t.t.s.job.MyTaskService              : -------------springboot Scheduled timed task3-----------------2018-10-11 10:16:39
     * 2018-10-11 10:16:40.002  INFO 10644 --- [pool-1-thread-1] i.w.t.t.s.job.MyTaskService              : >>>>>>>>>>>>>>>springboot Scheduled timed task1>>>>>>>>>>>>>>2018-10-11 10:16:40
     * 2018-10-11 10:16:40.002  INFO 10644 --- [pool-1-thread-1] i.w.t.t.s.job.MyTaskService              : ************* springboot Scheduled timed task2***************2018-10-11 10:16:40
     * 2018-10-11 10:16:42.001  INFO 10644 --- [pool-1-thread-1] i.w.t.t.s.job.MyTaskService              : -------------springboot Scheduled timed task3----
     */
    private Logger logger = LoggerFactory.getLogger(MySlf4jLogbakTaskService.class);
    private SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
     @Scheduled(cron = "0/5 * * * * ?") //1秒执行一次
    public void showMsgTask(){
          logger.info(">>>>>>slf4j+logback>>>>>>>>>springboot Scheduled timed task1>>>>>>>>>>>>>>"+simpleDateFormat.format(new Date()));
    }

    @Scheduled(cron = "0/4 * * * * ?")
    public  void showMsgTask2(){
        logger.info("******slf4j+logback******* springboot Scheduled timed task2***************"+simpleDateFormat.format(new Date()));
    }

    @Scheduled(cron = "0/3 * * * * ?")
    public  void showMsgTask3(){
        logger.info("------slf4j+logback-------springboot Scheduled timed task3-----------------"+simpleDateFormat.format(new Date()));
    }
}
