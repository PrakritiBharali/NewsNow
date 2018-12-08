package com.example.android.newsnow;

public class News {
    private String mTitle;
    private String mSection;
    private String mDate;
    private String mAuthor;
    private String mUrl;

    /**
     * Construct a new {@link News} object
     * @param title headline of the news article
     * @param section the section to which the news belongs to
     * @param date date the news was published
     */
    public News (String title, String section, String date, String author, String url){
        mTitle = title;
        mSection = section;
        mDate = date;
        mAuthor = author;
        mUrl = url;
    }

    public String getTitle(){
        return mTitle;
    }

    public String getSection() {
        return mSection;
    }

    public String getDate() {
        return mDate;
    }

    public String getAuthor(){
        return mAuthor;
    }

    public String getUrl() {
        return mUrl;
    }
}
