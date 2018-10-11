package idv.wangyj.timed.task.springboottask.job;

import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class MyLog4jTaskService {
    public static  final Logger logger=Logger.getLogger(MyLog4jTaskService.class);

    @Scheduled(cron = "0/6 * * * * ?")
    public void showMsg(){
        logger.info("============log4j 输出的定时任务日志==========="+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
    }

    @Scheduled(cron = "0/7 * * * * ?")
    public void showMsg2(){
        logger.info("======------log4j 输出的定时任务日志==========="+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
    }
    @Scheduled(cron = "0/8 * * * * ?")
    public void showMsg3(){
        logger.info("======******log4j 输出的定时任务日志==========="+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
    }
}
