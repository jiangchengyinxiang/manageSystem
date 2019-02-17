package backService.dept;

/**
 * @Title
 * @description 部门
 * @author huishen
 * @version 1.0
 * @createAt 2017年9月22日 下午3:27:16
 * @Copyright: Copyright (c) 2017 bjsszt. All Rights Reserved
 */
public class SysDept {
	/**
	 * 部门ID
	 */
	private Integer id;

	/**
	 *部门名称
	 */
	private String name;
	/**
	 *部门全名称
	 */
	private String fullname;

	/**
	 *部门负责人
	 */
	private String contactPerson;
	/**
	 *部门电话
	 */
	private String contactTel;
	/**
	 *部门地址
	 */
	private String address;
	/**
	 *部门介绍
	 */
	private String descr;
	/**
	 *排序编码
	 */
	private Integer ordernumber;
	//左值
	private Integer lft;
	//右值
	private Integer rgt;

	//部门等级
	private Integer level;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname == null ? null : fullname.trim();
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson == null ? null : contactPerson.trim();
	}

	public String getContactTel() {
		return contactTel;
	}

	public void setContactTel(String contactTel) {
		this.contactTel = contactTel == null ? null : contactTel.trim();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr == null ? null : descr.trim();
	}

	public Integer getOrdernumber() {
		return ordernumber;
	}

	public void setOrdernumber(Integer ordernumber) {
		this.ordernumber = ordernumber;
	}

	public Integer getLft() {
		return lft;
	}

	public void setLft(Integer lft) {
		this.lft = lft;
	}

	public Integer getRgt() {
		return rgt;
	}

	public void setRgt(Integer rgt) {
		this.rgt = rgt;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

}
