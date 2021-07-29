package com.example.task.activity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.example.task.R;
import com.example.task.adapter.SalesAdapter;
import com.example.task.database.Task;
import com.example.task.model.Model;
import java.util.ArrayList;

public class Task1 extends AppCompatActivity {

    SalesAdapter adapter;
    ArrayList<Model> list = new ArrayList<>();
    RecyclerView rcvList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1);
        rcvList = findViewById(R.id.rcv_list);
        setAdapter();

    }

    void setAdapter() {

        list.addAll(new Task(this).getList());
        adapter = new SalesAdapter(list, this);
        rcvList.setAdapter(adapter);
        rcvList.setLayoutManager(new LinearLayoutManager(this));

    }
}