package Upload.Directory.Model;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Roles {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="role_id")
    private int roleId;
@Column(name = "role")
    private String role;
@Column(name = "uname")
    private String userName;

public Roles(){}

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
