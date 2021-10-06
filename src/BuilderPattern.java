public class BuilderPattern {

    private int userSeq;
    private String userName;
    private String userId;
    private int userAge;
    private String userEmail;

    public BuilderPattern(int userSeq, String userName, String userId, int userAge, String userEmail) {
        this.userSeq = userSeq;
        this.userName = userName;
        this.userId = userId;
        this.userAge = userAge;
        this.userEmail = userEmail;
    }

    public static class Builder {
        private int userSeq;
        private String userName;
        private String userId;
        private int userAge;
        private String userEmail;

        public Builder userSeq(int userSeq) {
            this.userSeq = userSeq;
            return this;
        }

        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder userAge(int userAge) {
            this.userAge = userAge;
            return this;
        }

        public Builder userEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }

        public BuilderPattern build() {
            //필수 멤버변수에 값이 할당되지 않으면 예외처리
            if(userSeq == 0 || userName == null || userId == null || userAge == 0 || userEmail == null) {
                throw new IllegalStateException("Cannot create BuilderPattern");
            }

            return new BuilderPattern(userSeq, userName, userId, userAge, userEmail);
        }
    }
}
