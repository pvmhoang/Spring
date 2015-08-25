package hoang.pham.vn.dao;

import hoang.pham.vn.model.Account;

import java.util.List;

/**
 * Created by hoangpvm on 8/25/2015.
 */
public interface AccountDao {
    public void insert(Account account);
    public void update(Account account);
    public void update(List<Account> accounts);
    public void delete(long accountId);
    public Account find(long accountId);
    public List<Account> find(List<Long> accountIds);
    public List<Account> find(String ownerName);
    public List<Account> find(boolean locked);
}
