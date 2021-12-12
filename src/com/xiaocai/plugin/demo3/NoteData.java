package com.xiaocai.plugin.demo3;

/**
 * @ClassName NoteData
 * @Description TODO
 * @Author xiaocai
 * @Date 2021/12/12
 */
public class NoteData {
    /**
     * 笔记标题
     */
    private String title;
    /**
     * 笔记内容
     */
    private String mark;
    /**
     * 标记的源码
     */
    private String content;
    /**
     * 源码所在的文件名
     */
    private String fileName;
    /**
     * 源码所在的文件类型
     */
    private String fileType;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
}
