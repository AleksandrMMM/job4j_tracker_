package ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundExсeption {
        for (User us : users) {
            if (us.getUsername().equals(login)) {
                return us;
            } else {
                throw new UserNotFoundExсeption("user not found");
            }
        }
        return null;
    }

    public static boolean validate(User user) throws UserInvalidException, UserNotFoundExсeption {
        if (user.isValid()) {
            if (user.getUsername().length() >= 3) {
                return true;
            } else {
                throw new UserInvalidException("пользователь не валидный");
            }
        } else {
            throw new UserNotFoundExсeption("пользователь не найден");
        }

    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserNotFoundExсeption userNotFoundExсeption) {
            userNotFoundExсeption.printStackTrace();
        } catch (UserInvalidException e) {
            e.printStackTrace();
        }
    }
}

