package Utils;


import Pages.DashBoardPage;
import Pages.LoginPage;

public class PageInitializer {
    public static LoginPage login;
    public static DashBoardPage dashboardPage;



    public static void initializePageObjects(){
        login = new LoginPage();
        dashboardPage = new DashBoardPage();

    }
}