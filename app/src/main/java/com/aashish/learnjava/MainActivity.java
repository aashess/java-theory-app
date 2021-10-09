package com.aashish.learnjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chOne(View view) {
        Intent intent = new Intent(this, chapterOne.class);
        startActivity(intent);
    }
    public void chTwo(View view){
        Intent intent = new Intent(this, chapterTwo.class);
        startActivity(intent);
    }
    public void chThree(View view){
        Intent intent = new Intent(this, chapterThree.class);
        startActivity(intent);
    }
    public void chTen(View view){
        Intent intent = new Intent(this, previousYearQuestionPaper.class);
        startActivity(intent);
    }
    public void chFour(View view){
        Intent intent = new Intent(this,chapterFour.class);
        startActivity(intent);
    }
    public void chFive(View view){
        Intent intent = new Intent(this, chapterFive.class);
        startActivity(intent);
    }
    public void chSix(View view){
        Intent intent= new Intent(this, chapterSix.class);
        startActivity(intent);
    }
    public void chSeven(View view){
        Intent intent= new Intent(this, chapterSeven.class);
        startActivity(intent);
    }
    public void chNine(View view){
        Intent intent=new Intent(this, chapterNine.class);
        startActivity(intent);
    }
}
