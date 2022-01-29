package bank;

import java.util.*;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
       users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            users.get(user).add(account);
        }

    }

    public User findByPassport(String passport) {
       return users.keySet().stream()
                .filter(u -> u.getPassport().equals(passport))
                .findFirst()
                .orElse(null);

    }

    public Account findByRequisite(String passport, String requisite) {
        Account rsl = null;
        User user = findByPassport(passport);
        for (var account: users.get(user)) {
            if (account.getRequisite().equals(requisite) && user != null) {
                rsl = account;
            }
        }
        return rsl;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        var srcAccount = findByRequisite(srcPassport, srcRequisite);
        var destAccount = findByRequisite(destPassport, destRequisite);

        if (srcAccount == null && destAccount == null ) {
            return rsl;
        }

        if (srcAccount.getBalance() >= amount && destAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            rsl = true;
        }
        return rsl;
    }
}