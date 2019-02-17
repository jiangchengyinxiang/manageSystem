package backService.dict;
/**
 * 数据字典
 */
public class SysDict {
    /**
     *
     */
	private Integer id;
    /**
     *字典名称
     */
    private String text;
    /**
     *字段取值
     */
    private String value;
    /**
     *角色编码---哪些人有看这个功能的权限
     */
    private String sym;
    /**
     *描述
     */
    private String descr;
    /**
     *
     */
    private Integer orderNumber;
    /**
     *
     */
    private Integer lft;
    /**
     *
     */
    private Integer rgt;
    /**
     *
     */
    private Integer level;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getSym() {
        return sym;
    }

    public void setSym(String sym) {
        this.sym = sym == null ? null : sym.trim();
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
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
