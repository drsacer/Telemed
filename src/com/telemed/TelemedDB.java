package com.telemed;

import java.util.List;

public interface TelemedDB {
    public void registerNewUser(User u);

    public List<Record> getAllRecordForUser(User u);
    public User findUser(String username, String password);

}
