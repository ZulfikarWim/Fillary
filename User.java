package Fillary;

//Arsa Maulana Adhyasta (235150201111030)
//Aang Maulana (235150200111036)
//Muhammad Zulfikar Raditya Wimbyarto (235150201111034)
//Ahmad Muzaki Ulumuddin (235150207111040)

public class User {
    protected String username;
    protected String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            System.out.println("Login successful");
            return true;
        } else {
            System.out.println("Login failed");
            return false;
        }
    }

    public void logout() {
        System.out.println("Logout successful");
    }
}

