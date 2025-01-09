package zestaw10.Interfejsy.zad5;

public class AuthenticationTest {

    public static void main(String[] args) {

        AdminAuthentication admin = new AdminAuthentication();
        UserAuthentication user = new UserAuthentication();

        System.out.println(user.login("abc","cda"));
        System.out.println(admin.resetPassword("abc", "cda","dsa"));
        admin.logout();

        System.out.println(user.login("abc","cda"));
        System.out.println(user.resetPassword("abc", "cda","dsa"));
        user.logout();


    }



}
