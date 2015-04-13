package com.tagit.todolist_demo;

import java.util.ArrayList;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends ActionBarActivity {

	EditText text;
	Button add;
	ListView listview;
	ArrayList<String> list;
	ArrayAdapter<String> adapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		text = (EditText)findViewById(R.id.editTextTodo);
		add  = (Button)findViewById(R.id.btnAddTodo);
		listview = (ListView)findViewById(R.id.listViewTodo);
		
		list = new ArrayList<String>();
		adapter = new ArrayAdapter<String>(getBaseContext(),android.R.layout.simple_list_item_1,list);
		listview.setAdapter(adapter);
		
	}
	
	
	public void Add(String todo)
	{
		if(todo.length()>0)
		{
			list.add(todo);
			adapter.notifyDataSetChanged();
			text.setText("");
		}
	}

	
}
