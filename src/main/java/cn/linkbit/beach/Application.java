
package cn.linkbit.beach;

import cn.linkbit.beach.liseners.AppilicationStopped;
import cn.linkbit.beach.liseners.AppilicationSessionExpire;
import cn.linkbit.beach.liseners.AppilicationStartUp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableAutoConfiguration
@EnableScheduling
@ComponentScan
@SpringBootApplication

public class Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.addListeners(new AppilicationStartUp());
        app.addListeners(new AppilicationSessionExpire());
        app.addListeners(new AppilicationStopped());
        app.run(args);
    }

}
