package idv.wangyj.timed.task.springbootthreadtask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling//开启定时器
@SpringBootApplication
public class SpringbootThreadTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootThreadTaskApplication.class, args);
    }
}
