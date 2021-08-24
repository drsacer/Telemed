package com.telemed;

import java.util.ArrayList;
import java.util.List;

public class TelemedMemDB {
    List<User> userList = new ArrayList<User>();
    List<Record> recordList = new ArrayList<Record>();


    public TelemedMemDB() {
        User adminUser = new User("Admin", "Admin", 40);
        adminUser.setAdminUser(true);
        adminUser.setUsername("admin");
        adminUser.setPassword("admin123");
        userList.add(adminUser);
    }

    void addRecord(Record r) {
        recordList.add(r);
    }

    public List<Record> getAllRecordForUser(User u) {
        List<Record> list = new ArrayList<Record>();

        for (Record r: recordList) {
            if(r.getUser().equals(u))
                list.add(r);
        }
        return list;
    }

    public User findUser(String username, String password) {
        for (User u : userList){
            if(u.getUsername().equals(username) && u.getPassword().equals(password))
                return u;

        }
        return null;
    }

    public void registerNewUser(User u) {
        userList.add(u);
    }
}
