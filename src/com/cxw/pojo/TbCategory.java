package com.cxw.pojo;

public class TbCategory {
    private Long categoryId;

    private String categoryName;

    private String isParent;

    private Long parentId;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public String getIsParent() {
        return isParent;
    }

    public void setIsParent(String isParent) {
        this.isParent = isParent == null ? null : isParent.trim();
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
}