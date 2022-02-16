package com.myactivity.hotelbookingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcv;
    myadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Chef Connect");
        getWindow().setStatusBarColor(getResources().getColor(R.color.white));
        getWindow().setNavigationBarColor(getResources().getColor(R.color.white));
        rcv = (RecyclerView) findViewById(R.id.recview);

        adapter = new myadapter(dataqueue(),getApplicationContext());
        rcv.setAdapter(adapter);

        //LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        //rcv.setLayoutManager(layoutManager);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        rcv.setLayoutManager(gridLayoutManager);
    }

    public ArrayList<Model> dataqueue()
    {
        ArrayList<Model> holder=new ArrayList<>();

        Model ob1=new Model();
        ob1.setHeader("Ghaziabad, Uttar Pradesh");
        ob1.setDesc("Harsh Kumar");
        ob1.setImgname(R.drawable.h1);
        holder.add(ob1);

        Model ob2=new Model();
        ob2.setHeader("Noida, Uttar Pradesh");
        ob2.setDesc("Shivam Kumar");
        ob2.setImgname(R.drawable.h2);
        holder.add(ob2);

        Model ob3=new Model();
        ob3.setHeader("Jaipur, Rajisthan");
        ob3.setDesc("Ritik");
        ob3.setImgname(R.drawable.h3);
        holder.add(ob3);

        Model ob4=new Model();
        ob4.setHeader("Delhi");
        ob4.setDesc("Nitish");
        ob4.setImgname(R.drawable.h4);
        holder.add(ob4);

        Model ob5=new Model();
        ob5.setHeader("Ghaziabad, Uttar Pradesh");
        ob5.setDesc("Nidhi");
        ob5.setImgname(R.drawable.h5);
        holder.add(ob5);

        Model ob6=new Model();
        ob6.setHeader("Jaipur, Rajisthan");
        ob6.setDesc("Vishal");
        ob6.setImgname(R.drawable.h6);
        holder.add(ob6);

        Model ob7=new Model();
        ob7.setHeader("Mumbai");
        ob7.setDesc("Mahendra");
        ob7.setImgname(R.drawable.h7);
        holder.add(ob7);

        Model ob8=new Model();
        ob8.setHeader("Madhya Pradesh");
        ob8.setDesc("Shakti");
        ob8.setImgname(R.drawable.h8);
        holder.add(ob8);

        Model ob9=new Model();
        ob9.setHeader("Bihar");
        ob9.setDesc("Amit");
        ob9.setImgname(R.drawable.h9);
        holder.add(ob9);

        Model ob10=new Model();
        ob10.setHeader("Meerut, Uttar Pradesh");
        ob10.setDesc("Shakshi");
        ob10.setImgname(R.drawable.h10);
        holder.add(ob10);

     /*   Model ob11=new Model();
        ob11.setHeader("Node JS Programming");
        ob11.setDesc("Web based Programming");
        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob11);
      */


        return holder;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.mainmenu,menu);
        MenuItem item=menu.findItem(R.id.search_menu);

     //   SearchView searchView=(SearchView)item.getActionView();

     //   searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
        //    @Override
        //    public boolean onQueryTextSubmit(String query) {
                return false;
            }

          //  @Override
            public boolean onQueryTextChange(String newText)
            {
                adapter.getFilter().filter(newText);
                return false;
            }
     //   });

    //    return super.onCreateOptionsMenu(menu);
  //  }
}