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
		//Button����¼��ĵڶ��ַ�ʽ
		/*button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Log.d("zsp", "ʦ�����������ˡ�����");
				Toast.makeText(getApplicationContext(), "ʦ������������", 1).show();
				
			}
		});*/
		//�����ַ���

		button.setOnClickListener(this);
		button2.setOnClickListener(this);
		button3.setOnClickListener(this);
	}

	//Button����¼��ĵ�һ�ַ���
	/*public void onClick(View view) {
		Log.d("zsp", "��ʦ�֣�ʦ��������ץ���ˡ�������");
		Toast.makeText(getApplicationContext(), "��ʦ�֣�ʦ��������ץ���ˡ�������", 1).show();
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
		//Log.d("zsp", "��ɮ�����ˡ�����");
		//Toast.makeText(getApplicationContext(), "��ɮ������", 1).show();
		switch (v.getId()) {
		case R.id.buttonId:
			Log.d("zsp", "���������ʥ");
			Toast.makeText(getApplicationContext(), "���Ǻ��", 1).show();
			
			break;
		case R.id.button2Id:
			Log.d("zsp", "���ǰ˽�");
			Toast.makeText(getApplicationContext(), "���ǰ˽�", 1).show();
			break;
		case R.id.button3Id:
			Log.d("zsp", "����ɳɮ");
			Toast.makeText(getApplicationContext(), "����ɳɮ", 1).show();
			break;
		default:
			break;
		}
	
	}
}
