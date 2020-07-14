package club.banyuan.entity;

public class Administrator {
    String adminName;
    String adminPwd;

    public Administrator() {
    }

    public Administrator(String adminName, String adminPwd) {
        this.adminName = adminName;
        this.adminPwd = adminPwd;
    }

    public String getAdministratorName() {
        return adminName;
    }

    public void setAdministratorName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdministratorPwd() {
        return adminPwd;
    }

    public void setAdministratorPwd(String adminPwd) {
        this.adminPwd = adminPwd;
    }
}
