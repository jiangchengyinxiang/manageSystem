package backService.user;

/**
 * 用户角色表
 */
public class SysUser {
    /**
     * 用户ID
     */
	private Integer id;
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 用户密码
     */
    private String userPwd;
    /**
     * 角色编码
     */
    private String roleSym;
    /**
     * 角色名称
     */
    private String roleName;
    /**
     *
     */
    private Integer personId;
    /**
     *
     */
    private String personName;
    /**
     * 部门ID
     */
    private Integer deptId;
    /**
     * 部门名称
     */
    private String deptName;
    /**
     * 用户ID
     */
    private Integer stts;
    /**
     * 用户介绍
     */
    private String descr;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getRoleSym() {
		return roleSym;
	}

	public void setRoleSym(String roleSym) {
		this.roleSym = roleSym;
	}

	public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName == null ? null : personName.trim();
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public Integer getStts() {
        return stts;
    }

    public void setStts(Integer stts) {
        this.stts = stts;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }
}