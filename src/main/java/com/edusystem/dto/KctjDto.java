package com.edusystem.dto;

/**
 * 推荐的课程 用来接入ES使用的返回值类
 * 后面加入了推荐 ，要将课程信息持久化
 * 故会在entity里加上与此类相同的kctj类
 * @author 花菜
 * @date 2021/5/19 18:09
 */
public class KctjDto {
    private Long id;
    private Double score;
    private Double hour;
    private String booknum;
    private Double price;
    private Double studynum;
    private String link;
    private String hard;
    private String title;
    private String content;



    public KctjDto(Long id , Double score, Double hour, String booknum, Double price, Double studynum, String link, String hard, String title, String content) {
        this.id = id;
        this.score = score;
        this.hour = hour;
        this.booknum = booknum;
        this.price = price;
        this.studynum = studynum;
        this.link = link;
        this.hard = hard;
        this.title = title;
        this.content = content;
    }
    public KctjDto(Double score, Double hour, String booknum, Double price, Double studynum, String link, String hard, String title, String content) {
        this.score = score;
        this.hour = hour;
        this.booknum = booknum;
        this.price = price;
        this.studynum = studynum;
        this.link = link;
        this.hard = hard;
        this.title = title;
        this.content = content;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Double getHour() {
        return hour;
    }

    public void setHour(Double hour) {
        this.hour = hour;
    }

    public String getBooknum() {
        return booknum;
    }

    public void setBooknum(String booknum) {
        this.booknum = booknum;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getStudynum() {
        return studynum;
    }

    public void setStudynum(Double studynum) {
        this.studynum = studynum;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getHard() {
        return hard;
    }

    public void setHard(String hard) {
        this.hard = hard;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
