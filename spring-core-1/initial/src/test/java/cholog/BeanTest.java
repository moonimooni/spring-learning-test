package cholog;

import cholog.bean.AutowiredBean;
import cholog.bean.SpringBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;

import static cholog.utils.ContextUtils.getApplicationContext;
import static org.assertj.core.api.Assertions.assertThat;

public class BeanTest {

    @Test
    @DisplayName("Register Bean With Component")
    void registerBean() {
        ApplicationContext context = getApplicationContext();
        SpringBean springBean = context.getBean(SpringBean.class);
        assertThat(springBean).isNotNull();
    }

    @Test
    @DisplayName("Register Bean With Autowired or constructor injection")
    void autowiredBean() {
        ApplicationContext context = getApplicationContext();
        AutowiredBean autowiredBean = context.getBean(AutowiredBean.class);
        assertThat(autowiredBean.sayHello()).isEqualTo("Hello");
    }
}
