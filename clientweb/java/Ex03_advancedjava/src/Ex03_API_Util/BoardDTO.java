package Ex03_API_Util;

import java.util.Date;

public class BoardDTO {
    private int num;
    private String title;
    private String content;
    private String writer;
    private Date date;

    public BoardDTO(){}
    public BoardDTO(int num, String title, String content, String writer, Date date) {
        this.num = num;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
    }
    public BoardDTO(int num, String title, String content, String writer) {
        this.num = num;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = new Date();
    }

    public int getNum() {
        return this.num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return this.content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getWriter() {
        return this.writer;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }
    public Date getDate() {
        return this.date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    @Override
    public String toString() {
        return "{" +
            " num='" + getNum() + "'" +
            ", title='" + getTitle() + "'" +
            ", content='" + getContent() + "'" +
            ", writer='" + getWriter() + "'" +
            ", date='" + getDate() + "'" +
            "}";
    }
}
