package hoang.pham.vn;

import hoang.pham.vn.config.JavaBeanConfiguration;
import hoang.pham.vn.service.AccountService;
import hoang.pham.vn.utils.Utils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hoangpvm on 8/25/2015.
 */
public class App {
    public static void main(String[] args) {
        //java config
        //javaConfigApp();
        //xml config
        //xmlConfigApp();
        //annotation configuration -->uncomment autowired,service and repository in service and dao implement
        annotationConfigApp();
    }

    static void javaConfigApp (){
        //init spring container
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(JavaBeanConfiguration.class);
        //load bean
        AccountService accountService = annotationConfigApplicationContext.getBean(AccountService.class);
        //call transfer money
        Utils.doTransferMoney(annotationConfigApplicationContext,accountService);
    }

    static void xmlConfigApp (){
        //init spring container
        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        //load bean
        AccountService accountService = xmlApplicationContext.getBean(AccountService.class);
        //call transfer money
        Utils.doTransferMoney(xmlApplicationContext,accountService);
    }

    static void annotationConfigApp (){
        //init spring container
        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("spring-annotation-config.xml");
        //load bean
        AccountService accountService = xmlApplicationContext.getBean("accountServiceImpl",AccountService.class);
        //call transfer money
        Utils.doTransferMoney(xmlApplicationContext,accountService);
    }
}
