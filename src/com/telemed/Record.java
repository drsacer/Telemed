package com.telemed;

import java.util.Date;

public class Record {
    User user;
    int pressureSystolic;
    int pressureDiastolic;
    Date timestamp;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getPressureSystolic() {
        return pressureSystolic;
    }

    public void setPressureSystolic(int pressureSystolic) {
        this.pressureSystolic = pressureSystolic;
    }

    public int getPressureDiastolic() {
        return pressureDiastolic;
    }

    public void setPressureDiastolic(int pressureDiastolic) {
        this.pressureDiastolic = pressureDiastolic;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
