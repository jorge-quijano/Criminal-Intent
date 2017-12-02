package com.jorgequijano.android.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by EndUser on 30/11/2017.
 */

public class Crime {
    UUID mId;
    String mTitle;
    Date mDate;
    Boolean mSolved;

    public UUID getmId() {
        return mId;
    }

    public void setmId(UUID mId) {
        this.mId = mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public Boolean getmSolved() {
        return mSolved;
    }

    public void setmSolved(Boolean mSolved) {
        this.mSolved = mSolved;
    }

    public Crime(){
        mId = UUID.randomUUID();
        mDate = new Date();
    }

}
