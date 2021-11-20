package com.fztl.harsha.gamerain;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class GameActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getGame() == null ? new GRGame(this,getCode()) : getGame());
    }

    GRCode getCode(){
       return null;
    }

    GRGame getGame(){
        return null;
    }
}
