package idv.wangyj.timed.task.javatimedtask;

import idv.wangyj.timed.task.javatimedtask.job.ScheduleExcutorServiceJob;
import idv.wangyj.timed.task.javatimedtask.job.TimerJob;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaTimedTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaTimedTaskApplication.class, args);

        //启动完成后执行 TimerJob
        TimerJob.run("王源骏");
       // ScheduleExcutorServiceJob.run();
    }
}
