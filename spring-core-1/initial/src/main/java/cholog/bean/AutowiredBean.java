package cholog.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutowiredBean {
    private final SpringBean springBean;

    public AutowiredBean(SpringBean springBean) {
        this.springBean = springBean;
    }

    public String sayHello() {
        return springBean.hello();
    }
}
