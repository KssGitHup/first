package com.level.day03button;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	Button button,button2,button3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		button=(Button) findViewById(R.id.buttonId);
		button2=(Button) findViewById(R.id.button2Id);
		button3=(Button) findViewById(R.id.button3Id);
		//Button点击事件的第二种方式
		/*button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Log.d("zsp", "师傅跟妖怪跑了。。。");
				Toast.makeText(getApplicationContext(), "师傅跟妖怪跑了", 1).show();
				
			}
		});*/
		//第三种方法

		button.setOnClickListener(this);
		button2.setOnClickListener(this);
		button3.setOnClickListener(this);
	}

	//Button点击事件的第一种方法
	/*public void onClick(View view) {
		Log.d("zsp", "大师兄，师傅被妖怪抓走了。。。。");
		Toast.makeText(getApplicationContext(), "大师兄，师傅被妖怪抓走了。。。。", 1).show();
	}*/
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		//Log.d("zsp", "唐僧动情了。。。");
		//Toast.makeText(getApplicationContext(), "唐僧动了情", 1).show();
		switch (v.getId()) {
		case R.id.buttonId:
			Log.d("zsp", "我是齐天大圣");
			Toast.makeText(getApplicationContext(), "我是猴哥", 1).show();
			
			break;
		case R.id.button2Id:
			Log.d("zsp", "我是八戒");
			Toast.makeText(getApplicationContext(), "我是八戒", 1).show();
			break;
		case R.id.button3Id:
			Log.d("zsp", "我是沙僧");
			Toast.makeText(getApplicationContext(), "我是沙僧", 1).show();
			break;
		default:
			break;
		}
	
	}
}
