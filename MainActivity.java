package com.example.pro5;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog.Builder;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    EditText rollno,name,marks;
    Button insert,delete,update,viewa,viewall;
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       rollno=(EditText)findViewById(R.id.Rollno);
       name=(EditText)findViewById(R.id.Name);
       marks=(EditText)findViewById(R.id.Marks);
       insert=(Button)findViewById(R.id.Insert);
       delete=(Button)findViewById(R.id.Delete);
       update=(Button)findViewById(R.id.Update);
       viewa=(Button)findViewById(R.id.View);
       viewall=(Button)findViewById(R.id.ViewAll);
insert.setOnClickListener(this);
delete.setOnClickListener(this);
update.setOnClickListener(this);
viewa.setOnClickListener(this);
viewall.setOnClickListener(this);
        db=SQLiteDatabase.openOrCreateDatabase("Studentdb",null);
        db.execSQL("create table if not exists student(rollno varchar,name varchar,marks varchar);");
    }
    public void onClick(View view){
        if(view==insert){
            if(rollno.getText().toString().trim().length()==0||name.getText().toString().trim().length()==0||marks.getText().toString().trim().length()==0){
                showMessage("Error", "Please enter all values");
                return;
            }
        }
    }
}
