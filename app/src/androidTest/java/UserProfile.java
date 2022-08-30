public class UserProfile {
    public String uname;
    public String dob;
    public String userID;


    public UserProfile()
    {
    }

    public UserProfile(String uname,String dob, String userID)
    {
        this.uname = uname;
        this.dob = dob;
        this.userID = userID;
    }
    public String getUname()
    {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
