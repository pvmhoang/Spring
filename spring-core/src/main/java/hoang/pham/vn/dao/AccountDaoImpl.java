package hoang.pham.vn.dao;

import hoang.pham.vn.model.Account;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hoangpvm on 8/25/2015.
 */
@Repository
public class AccountDaoImpl implements AccountDao {

    private Map<Long,Account> accountsMap = new HashMap<Long, Account>();

    {
        Account account1 = new Account();
        account1.setId(1L);
        account1.setOwnerName("Hoang");
        account1.setBalance(10.0);
        Account account2 = new Account();
        account2.setId(2L);
        account2.setOwnerName("Lam");
        account2.setBalance(20.0);
        accountsMap.put(account1.getId(), account1);
        accountsMap.put(account2.getId(), account2);
    }

    public void insert(Account account) {

    }

    /**
     * update account
     * @param account
     */
    public void update(Account account) {
        accountsMap.put(account.getId(),account);
    }

    public void update(List<Account> accounts) {

    }

    public void delete(long accountId) {

    }

    public Account find(long accountId) {
        return accountsMap.get(accountId);
    }

    public List<Account> find(List<Long> accountIds) {
        return null;
    }

    public List<Account> find(String ownerName) {
        return null;
    }

    public List<Account> find(boolean locked) {
        return null;
    }
}
