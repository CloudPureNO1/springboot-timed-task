package idv.wangyj.timed.task.springbootthreadtask.job;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import java.util.concurrent.Executors;
/**
 * 添加多线程配置类，实现多线程（使原本SingleThreadTaskService 单线程的定时器，变成多线程）
 * 所有线程放在同一个线程池中，不同的定时任务使用不同的线程
 * @see SingleThreadTaskService
 */
@Configuration
public class MultiThreadTaskConfig implements SchedulingConfigurer {
    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        taskRegistrar.setScheduler(Executors.newScheduledThreadPool(5));
    }
}
