package idv.wangyj.timed.task.springbootthreadtask.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * 单线程的 定时器:
 * 要使springboot Scheduled 定时器生效，要在主类中添加  @EnableScheduling 注解
 * 日志输出采用slf4j+logback 可以在日志中看到对应的线程，log4j却不能
 * @see org.springframework.scheduling.annotation.Scheduled
 * @see org.springframework.scheduling.annotation.EnableScheduling
 */

@Component
public class SingleThreadTaskService {
    public static  final Logger logger=LoggerFactory.getLogger(SingleThreadTaskService.class);

    private SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    @Scheduled(cron = "0/5 * * * * ?")//5秒执行一次
    public void showTask1(){
        logger.info(">>>>>single thread task>>>>>>showTask1>>>>>>>"+simpleDateFormat.format(new Date()));
    }

    @Scheduled(cron="0/4 * * * * ?")
    public void showTask2(){
        logger.info(">>>>>single thread task>>>>>>>showTask2>>>>>>"+simpleDateFormat.format(new Date()));
    }

    @Scheduled(cron="0/3 * * * * ?")
    public void showTask3(){
        logger.info(">>>>>single thread task>>>>>>>showTask3>>>>>>"+simpleDateFormat.format(new Date()));
    }
}
