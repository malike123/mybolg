package com.malike.bolg.model;

import java.util.Date;

public class Article {
    private Long id;

    private Long categoryid;

    private Long userid;

    private String title;

    private Long readnumber;

    private Date createtime;

    private Date editortime;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Long categoryid) {
        this.categoryid = categoryid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Long getReadnumber() {
        return readnumber;
    }

    public void setReadnumber(Long readnumber) {
        this.readnumber = readnumber;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getEditortime() {
        return editortime;
    }

    public void setEditortime(Date editortime) {
        this.editortime = editortime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}