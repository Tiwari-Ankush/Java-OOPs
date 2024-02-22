class Account {
    public String name; // Public member accessible from anywhere
    protected String email; // Protected member accessible within the same package and subclasses
    private String password; // Private member accessible only within this class

    // Constructor to initialize the account with a name and email
    public Account(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Method to set the password
    public void setPassword(String password) {
        this.password = password;
    }

    // Method to retrieve the password (for demonstration purposes)
    public String getPassword() {
        return this.password;
    }

    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        // We should not display the password for security reasons
        // System.out.println("Password: " + password); // Uncommenting this would
        // result in a compilation error
    }
}

public class access01 {
    public static void main(String[] args) {
        // Create an Account object
        Account a1 = new Account("Ankush Tiwari", "hello@ankushtiwari.com");

        // Set password using public method
        a1.setPassword("abcd");

        // Access and modify public members
        a1.name = "Ankush Kumar Tiwari";
        a1.email = "hello@ankushtiwari.co";

        // Display account information
        a1.displayAccountInfo();

        // Retrieving the password (for demonstration purposes)
        // We are accessing password using a public method, not directly
        String retrievedPassword = a1.getPassword();
        System.out.println("Retrieved Password: " + retrievedPassword);
    }
}
