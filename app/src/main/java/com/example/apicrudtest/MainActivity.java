package com.example.apicrudtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText idText, nameText,priceText,descText;
    Button insBtn, updBtn, delBtn, viewBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idText = (EditText)findViewById(R.id.IdText);
        nameText = (EditText)findViewById(R.id.nameText);
        priceText = (EditText)findViewById(R.id.priceText);
        descText = (EditText)findViewById(R.id.descText);
        insBtn = (Button)findViewById(R.id.insBtn);
        updBtn = (Button)findViewById(R.id.updBtn);
        delBtn = (Button)findViewById(R.id.delBtn);
        viewBtn = (Button)findViewById(R.id.viewBtn);

        addAction();
        editAction();
        deleteAction();
        showAllAction();




    }

    public void showMessage(String title,String Message){
        AlertDialog.Builder builder = new 	AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();

    }
    public void addAction(){
        insBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Product product = Product.generateInsertObject(
                                nameText.getText().toString(),
                                Integer.parseInt(priceText.getText().toString()),
                                descText.getText().toString());
                        new ApiConnect(MainActivity.this,product).execute(ApiConnect.INSERT_ACTION+"");
                    }
                }
        );

    }
    public void showAllAction() {
        viewBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        new ApiConnect(MainActivity.this).execute(ApiConnect.VIEW_ACTION+"");
                    }
                }
        );

    }
    public void editAction(){
        updBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Product product = Product.generateUpdateObject(
                                Integer.parseInt(idText.getText().toString()),
                                nameText.getText().toString(),
                                Integer.parseInt(priceText.getText().toString()),
                                descText.getText().toString());
                        new ApiConnect(MainActivity.this,product).execute(ApiConnect.UPDATE_ACTION+"");
                    }
                }
        );
    }

    public void deleteAction(){
        delBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Product product = Product.generateDeleteObject(
                                Integer.parseInt(idText.getText().toString()));
                        new ApiConnect(MainActivity.this,product).execute(ApiConnect.DELETE_ACTION+"");
                    }
                }
        );
    }

}
