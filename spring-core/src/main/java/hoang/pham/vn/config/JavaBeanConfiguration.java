package hoang.pham.vn.config;

import hoang.pham.vn.dao.AccountDao;
import hoang.pham.vn.dao.AccountDaoImpl;
import hoang.pham.vn.service.AccountService;
import hoang.pham.vn.service.AccountServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hoangpvm on 8/25/2015.
 */
@Configuration
public class JavaBeanConfiguration {

    @Bean
    public AccountDao accountDao (){
        AccountDao accountDao = new AccountDaoImpl();
        return accountDao;
    }

//    @Bean
//    public AccountService accountService () {
//        AccountServiceImpl accountService = new AccountServiceImpl();
//        accountService.setAccountDao(accountDao());
//        return accountService;
//    }
}
