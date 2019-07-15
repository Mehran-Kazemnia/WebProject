package Files;

import java.io.*;

public class UsersIO {

    public void saveUser(User user){
        File dir=new File("./");
        for (int i = 1; ; i++) {
            File file=new File(dir.getAbsolutePath()+"user"+i+".userdat");
            if (!file.exists()){
                try {
                    file.createNewFile();
                    WriteObjectToFile(user,file.getAbsolutePath());
                    return;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
        }

    }

    public void WriteObjectToFile(Object serObj,String filepath) {

        try {

            FileOutputStream fileOut = new FileOutputStream(filepath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }




    public Object ReadObjectFromFile(String filepath) {

        try {

            FileInputStream fileIn = new FileInputStream(filepath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            Object obj = objectIn.readObject();

            System.out.println("The Object has been read from the file");
            objectIn.close();
            return obj;

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
