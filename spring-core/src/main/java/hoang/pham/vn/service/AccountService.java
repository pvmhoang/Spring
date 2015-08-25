package hoang.pham.vn.service;

import hoang.pham.vn.model.Account;

/**
 * Created by hoangpvm on 8/25/2015.
 */
public interface AccountService {
    public void transferMoney(
            long sourceAccountId, long targetAccountId, double amount);
    public void depositMoney(long accountId, double amount) throws Exception;
    public Account getAccount(long accountId);
}
