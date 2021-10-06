public class ValueObject {

    private int userSeq;
    private String userName;
    private String userId;
    private int userAge;
    private String userEmail;

    public int getUserSeq() {
        return userSeq;
    }

    public void setUserSeq(int userSeq) {
        this.userSeq = userSeq;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public ValueObject(int userSeq, String userName, String userId, int userAge, String userEmail) {
        this.userSeq = userSeq;
        this.userName = userName;
        this.userId = userId;
        this.userAge = userAge;
        this.userEmail = userEmail;
    }

    @Override
    public String toString() {
        return "ValueObject{" +
                "userSeq=" + userSeq +
                ", userName='" + userName + '\'' +
                ", userId='" + userId + '\'' +
                ", userAge=" + userAge +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }
}
