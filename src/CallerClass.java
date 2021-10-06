public class CallerClass {

    public static void main(String[] args) {

        TelescopingConstructorPattern telescopingConstructorPattern = new TelescopingConstructorPattern(1,"name","id",1,"email");

        JavaBeansPattern javaBeansPattern = new JavaBeansPattern();
        javaBeansPattern.setUserSeq(1);
        javaBeansPattern.setUserName("name");
        javaBeansPattern.setUserId("id");
        javaBeansPattern.setUserAge(1);
        javaBeansPattern.setUserEmail("email");

        BuilderPattern bp = new BuilderPattern.Builder().userSeq(1).userAge(23).userName("lee").userId("nect2r").userEmail("nect2r@kakao.com").build();
    }
}