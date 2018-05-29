package com.example.android.musicstructure;

/**
 * Created by hanhbriggs on 5/23/18.
 */

public class Music {

    private String mTitle;
    private String mArtist;
    private int mImageResourceId;

    public Music(int ImageResourceId, String Title, String Artist) {
        mImageResourceId = ImageResourceId;
        mTitle = Title;
        mArtist = Artist;
    }

    public int getImageResourceId() {return mImageResourceId; }

    public String getSong(){
        return mTitle;
    }

    public String getArtist(){
        return mArtist;
    }




}
