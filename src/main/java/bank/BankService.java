package bank;

import java.util.*;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
       users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent() && !users.get(user.get()).contains(account)) {
            users.get(user.get()).add(account);
        }

    }

    public Optional<User> findByPassport(String passport) {
       return users.keySet().stream()
                .filter(u -> u.getPassport().equals(passport))
                .findFirst();

    }

    /**
     * Поиск счета у пользователя по реквизитам
     * Требует передачи паспортных данных, а не пользователя
     * @param passport паспортные данные искомого клиента
     * @param requisite реквизиты искомого счета
     * @return возвращает найденный счет или null
     */

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        return user.flatMap(value -> this.users.get(value).stream()
                .filter(account -> account.getRequisite().equals(requisite))
                .findFirst());

    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        var srcAccount = findByRequisite(srcPassport, srcRequisite);
        var destAccount = findByRequisite(destPassport, destRequisite);

        if (srcAccount.isPresent() && destAccount.isPresent() && srcAccount.get().getBalance() >= amount) {
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}