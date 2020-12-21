package com.example.datastructures;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String p  = "queue";
    private static final String w = "size of queue";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Queue<Integer> q = new Queue<Integer>();
        q.enQueue(10);
       /* q.enQueue(20);
        q.enQueue(30);
        q.enQueue(40);
        q.swapNodes(20,40);*/

       // q.enQueue(30);
       // q.enQueue(40);

        Log.d(p, "list:  " +  q.printList());
       // Log.d(p, "size:  " +  q.size());
       // Log.d(p, "swapping:  " +  q.swapNodes(30,40));
      //  Log.d(p, "list:  " +  q.printList());
        //Log.d(p, "size" + q.size());
        //Log.d("Swapping the elements", q.swapNodes());

    }
}