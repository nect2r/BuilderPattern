public class TelescopingConstructorPattern {

    private int userSeq;
    private String userName;
    private String userId;
    private int userAge;
    private String userEmail;

    public TelescopingConstructorPattern(int userSeq) {
        this.userSeq = userSeq;
    }

    public TelescopingConstructorPattern(int userSeq, String userName) {
        this.userSeq = userSeq;
        this.userName = userName;
    }

    public TelescopingConstructorPattern(int userSeq, String userName, String userId) {
        this.userSeq = userSeq;
        this.userName = userName;
        this.userId = userId;
    }

    public TelescopingConstructorPattern(int userSeq, String userName, String userId, int userAge) {
        this.userSeq = userSeq;
        this.userName = userName;
        this.userId = userId;
        this.userAge = userAge;
    }

    public TelescopingConstructorPattern(int userSeq, String userName, String userId, int userAge, String userEmail) {
        this.userSeq = userSeq;
        this.userName = userName;
        this.userId = userId;
        this.userAge = userAge;
        this.userEmail = userEmail;
    }

}