package com.codepath.simpletodo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EditItemActivity extends AppCompatActivity {

    int position;
    Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        String text = getIntent().getStringExtra("text");
        position = getIntent().getIntExtra("position", 0);
        EditText editText = (EditText) findViewById(R.id.editText);
        editText.append("");
        editText.append(text);
    }

    public void onSubmit(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        Intent data = new Intent();
        data.putExtra("item", editText.getText().toString());
        data.putExtra("position", position);
        setResult(RESULT_OK, data);
        this.finish();
    }
}