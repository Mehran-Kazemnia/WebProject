package Files;

import javax.jws.soap.SOAPBinding;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchEngine {
    private static final String filepath = "a";
    private UsersIO io = new UsersIO();
    private User[] users = new User[100];
    private File[] webContent = new File[30];
    private static int webContentCnt = 0;
    private static int userCounter = 0;

    public SearchEngine() {
        //getAllFiles();
    }

    private void getAllFiles() {
        Object object;
        File dir = new File(filepath);
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {

            if (files[i].getName().toLowerCase().endsWith(".userdat")) {
                object = io.ReadObjectFromFile(files[i].getAbsolutePath());
                if (object instanceof User) {
                    users[userCounter] = (User) object;
                    userCounter++;
                }
            }
            if (files[i].getName().toLowerCase().endsWith(".html")) {
              webContent[webContentCnt]=files[i];
              webContentCnt++;
            }

        }
    }

    public User[] getUsers() {
        return users;
    }

    public static int getUserCounter() {
        return userCounter;
    }

    public User getUser(String username){
        for (int i = 0; i < userCounter; i++) {
            if (users[i].getUsername().equals(username))return users[i];
        }
        return new User();
    }

    public boolean isUserValid(String username){
        User user=getUser(username);
        if (user.getUsername().equals("None"))return false;
        return true;
    }

    public boolean isUserValid(String username,String password){
        User user=getUser(username);
        if (user.getUsername().equals("None")|| !user.getPassword().equals(password))return false;
        return true;
    }

    public File[] searchByWord(String word){
        File[] tempFiles=new File[webContentCnt];
        int cnt=0;
        for (int i = 0; i < webContentCnt; i++) {
            if (getText(webContent[i]).contains(word)){
                tempFiles[cnt]=webContent[i];
                cnt++;
            }
        }
        File[] foundFiles=new File[cnt];
        for (int i = 0; i < cnt; i++) {
            foundFiles[i]=tempFiles[i];

        }
        return foundFiles;

    }

    public String getText(File file){
        String bufferText="";
        try {

            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                bufferText+=scanner.nextLine();
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return bufferText;
    }
}
