package Files;



public class User {
    private String username;
    private String password;
    private String adminMessage;
    private User[] requestingUsers = new User[50];
    private User[] acceptedUsers = new User[50];


    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
        this("None", "None");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdminMessage() {
        return adminMessage;
    }

    public User[] getRequestingUsers() {
        return requestingUsers;
    }

    public User[] getAcceptedUsers() {
        return acceptedUsers;
    }

    public void setAdminMessage(String adminMessage) {
        this.adminMessage = adminMessage;
    }

    public void receiveRequest(User applicantUser) {
        int i = 0;
        while (requestingUsers[i] != null) {
            i++;
        }
        requestingUsers[i] = applicantUser;
    }

    public void sendRequest(User receiver) {
        receiver.receiveRequest(this);
    }

    public void replyRequest(boolean answer, User repliedUser) {
        int i = 0;
        if (answer) {
            while (i < acceptedUsers.length) {
                if (acceptedUsers[i] == null) {
                    acceptedUsers[i]=repliedUser;
                    return;
                }
                i++;
            }
        } else {

            while (i < requestingUsers.length) {
                if (requestingUsers[i] != null) {
                    if (requestingUsers[i] == repliedUser) {
                        requestingUsers[i] = null;
                        return;
                    }
                }
                i++;
            }
        }
    }
}
