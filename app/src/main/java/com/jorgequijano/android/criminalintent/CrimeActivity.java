package com.jorgequijano.android.criminalintent;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CrimeActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment(){
        return new CrimeFragment();
    }

}