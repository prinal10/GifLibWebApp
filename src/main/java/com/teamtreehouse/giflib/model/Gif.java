package com.teamtreehouse.giflib.model;


import java.time.LocalDate;

public class Gif {

    private String mName;
    private int mCategoryId;
    private LocalDate mDateUploaded;
    private String mUserName;
    private boolean mFavorite;

    public Gif(String name, int categoryId ,LocalDate dateUploaded, String userName, boolean favorite) {
        mName = name;
        mDateUploaded = dateUploaded;
        mUserName = userName;
        mFavorite = favorite;
        mCategoryId = categoryId;
    }

    public String getName() {

        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public LocalDate getDateUploaded() {
        return mDateUploaded;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        mDateUploaded = dateUploaded;
    }

    public String getUserName() {
        return mUserName;
    }

    public void setUserName(String userName) {
        mUserName = userName;
    }

    public boolean isFavorite() {
        return mFavorite;
    }

    public void setFavorite(boolean favorite) {
        mFavorite = favorite;
    }

    public int getCategoryId() {
        return mCategoryId;
    }

    public void setCategoryId(int categoryId) {
        mCategoryId = categoryId;
    }
}
