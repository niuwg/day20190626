package cn.bdqn.pojo;

public class School {
	private Integer id;
	private String school_name;
	private Integer school_type_id;
	private String school_section;
	private String pic;
	private Integer createdBy;
	private String creationTime;
	private Integer modifyBy;
	private String modifyDate;
	private Column col;
	private String categoryName;
	private String school_jianjie;
	private Dictionary dictionary;
	
	public String getSchool_jianjie() {
		return school_jianjie;
	}
	public void setSchool_jianjie(String school_jianjie) {
		this.school_jianjie = school_jianjie;
	}
	public Dictionary getDictionary() {
		return dictionary;
	}
	public void setDictionary(Dictionary dictionary) {
		this.dictionary = dictionary;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Column getCol() {
		return col;
	}
	public void setCol(Column col) {
		this.col = col;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSchool_name() {
		return school_name;
	}
	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}
	public Integer getSchool_type_id() {
		return school_type_id;
	}
	public void setSchool_type_id(Integer school_type_id) {
		this.school_type_id = school_type_id;
	}
	public String getSchool_section() {
		return school_section;
	}
	public void setSchool_section(String school_section) {
		this.school_section = school_section;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public Integer getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}
	public Integer getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}
	public String getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}
}
