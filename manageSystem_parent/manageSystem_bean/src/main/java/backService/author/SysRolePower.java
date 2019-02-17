package backService.author;

/**
 * 角色功能表
 */
public class SysRolePower {
    private Integer id;
    /**
     * 权限编码
     */
    private String roleSym;
    /**
     * 功能编码
     */
    private String powerSym;



    private String powerName;

    private String roleName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPowerSym() {
        return powerSym;
    }

    public void setPowerSym(String powerSym) {
        this.powerSym = powerSym == null ? null : powerSym.trim();
    }

    public String getRoleSym() {
        return roleSym;
    }

    public void setRoleSym(String roleSym) {
        this.roleSym = roleSym == null ? null : roleSym.trim();
    }

    public String getPowerName() {
        return powerName;
    }

    public void setPowername(String powerName) {
        this.powerName = powerName == null ? null : powerName.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }
}