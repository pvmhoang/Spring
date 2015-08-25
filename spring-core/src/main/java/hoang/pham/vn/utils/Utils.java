package hoang.pham.vn.utils;

import hoang.pham.vn.service.AccountService;
import org.springframework.context.ApplicationContext;

/**
 * Created by hoangpvm on 8/25/2015.
 */
public class Utils {

    public static final void doTransferMoney(ApplicationContext applicationContext, AccountService accountService) {
        System.out.println("Before money transfer");
        System.out.println("Account 1 balance :" + accountService.getAccount(1).getBalance());
        System.out.println("Account 2 balance :" + accountService.getAccount(2).getBalance());
        accountService.transferMoney(1, 2, 5.0);
        System.out.println("After money transfer");
        System.out.println("Account 1 balance :" + accountService.getAccount(1).getBalance());
        System.out.println("Account 2 balance :" + accountService.getAccount(2).getBalance());
    }
}
