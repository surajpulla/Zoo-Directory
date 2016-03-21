package com.example.suraj.zoodirectory;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.os.Bundle;
import android.app.Activity;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.content.Intent;

import javax.xml.datatype.Duration;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
//http://www.androidinterview.com/android-custom-listview-with-image-and-text-using-arrayadapter/
      final   String [] animals={"Lion","Elephant","Rhinoceros","Alligator","Cheetah","Tiger"};
        Integer[] imgid={
                R.mipmap.lion,
                R.mipmap.elephant,
                R.mipmap.rhino,
                R.mipmap.alligator,
                R.mipmap.cheetah,
                R.mipmap.tiger,
        };
        ListAdapter zooAdapter= new CustomAdapter(this,animals,imgid);
        ListView zooListView =(ListView) findViewById(R.id.zooListView);
        zooListView.setAdapter(zooAdapter);

        zooListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String animal = String.valueOf(parent.getItemAtPosition(position));
                       final Intent animalNameIntent = new Intent(getApplicationContext(), individual_animal.class);
                        animalNameIntent.putExtra("animalName", animal);
                        animalNameIntent.putExtra("imgPosition", position);

                        if(position==animals.length-1) {
                            //start Dialog
                                AlertDialog.Builder adb = new AlertDialog.Builder(
                                  MainActivity.this);
                                adb.setTitle("Warning: Animal is Really Scary!!!");
                                adb.setMessage(" Are you sure you want to proceed?");

                             adb.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                 public void onClick(DialogInterface dialog, int which) {
                                     // continue with delete
                                     Toast.makeText(getApplicationContext(), "Yes clicked", Toast.LENGTH_LONG).show();

                                     startActivity(animalNameIntent);




                                 }
                             });
                                        adb.setNegativeButton("No", new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog, int which) {
                                                // continue with delete
                                                  Toast.makeText(getApplicationContext(), "Wise Choice", Toast.LENGTH_LONG).show();

                                            }
                                        });


                             adb.show();
                }
                                        //end Dialog
                    else {
//                            String animal = String.valueOf(parent.getItemAtPosition(position));
                                        Toast.makeText(MainActivity.this, animal, Toast.LENGTH_SHORT).show();

                                      //  Intent animalNameIntent = new Intent(getApplicationContext(), individual_animal.class);
//                                        animalNameIntent.putExtra("animalName", animal);
//                                        animalNameIntent.putExtra("imgPosition", position);
                                        startActivity(animalNameIntent);
                                    }

                    }

                    //Strat
                    //stop

                }
        );
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast.makeText(getApplicationContext(),"Settings selected",Toast.LENGTH_SHORT ).show();
            return true;
        }

        if (id == R.id.action_zooInfo) {
            Toast.makeText(getApplicationContext(),"Zoo Info",Toast.LENGTH_SHORT ).show();
            Intent i=new Intent(this,zooinfo.class);
            startActivity(i);
            return true;
        }
        if (id == R.id.action_uninstall) {
            Uri packageURI = Uri.parse("package:com.example.suraj.zoodirectory");
            Intent uninstallIntent = new Intent(Intent.ACTION_DELETE, packageURI);
            startActivity(uninstallIntent);

            Toast.makeText(getApplicationContext(),"Uninstall",Toast.LENGTH_SHORT ).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
