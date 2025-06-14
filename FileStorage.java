package data;

import java.io.*;
import model.VoteManager;

public class FileStorage {
    private static final String FILE_NAME = "votes.ser";

    public static void save(VoteManager manager) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(manager);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static VoteManager load() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (VoteManager) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new VoteManager(); // fallback
        }
    }
}