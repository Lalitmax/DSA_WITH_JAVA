/*
 Acces Modifiesr   within class    within package     outside package by subclass only    outside package
   Private       |     Y         |       N         |               N                    |       N
                 |               |                 |                                    |
                 |               |                 |                                    |       
   Default       |     Y         |       Y         |               N                    |       N
                 |               |                 |                                    |
   Protected     |     Y         |       Y         |               Y                    |       N
                 |               |                 |                                    |
   Public        |     Y         |       Y         |               Y                    |       Y
                 |               |                 |                                    |
 */

public class Access_modifiers {
    public static void main(String args[]) {

        BankAcount bk = new BankAcount();
        bk.username = "lalitmax";
        bk.setPassword("ghjjjjjjjjjjjj");

    }
}

class BankAcount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
        // System.out.println(password);
    }
}