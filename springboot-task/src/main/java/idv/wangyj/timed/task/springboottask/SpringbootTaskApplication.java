package idv.wangyj.timed.task.springboottask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling//开启spring boot 定时日志
@SpringBootApplication
public class SpringbootTaskApplication {

    private static final Logger logger=LoggerFactory.getLogger(SpringbootTaskApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTaskApplication.class, args);
        logger.info(">>>>>>>>>>>>>>>>>>>This is @Slf4j 日志" );
    }
}
