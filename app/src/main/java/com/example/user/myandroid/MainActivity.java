package com.example.user.myandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutInflater layoutInflater =getLayoutInflater();
        LinearLayout toastView=(LinearLayout)layoutInflater.inflate(R.layout.mytoast, null);

        Button btn=(Button)findViewById(R.id.addButton);

        final ListView lv=(ListView)findViewById(R.id.ListView);

        final ArrayList<String> AL=new ArrayList<String>();

        final ArrayAdapter<String> adapters=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,AL);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et1=(EditText)findViewById(R.id.ETname);
                EditText et2=(EditText)findViewById(R.id.ETpass);
                final CharSequence cs1=et1.getText();
                final CharSequence cs2=et2.getText();
                et1.setText(null);
                et2.setText(null);
                AL.add("이름 : "+cs1+" 비밀번호 : "+cs2);
                lv.setAdapter(adapters);
            }
        });


        /*
        TextView.OnEditorActionListener a=new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if(actionId==EditorInfo.IME_ACTION_GO) {
                    Toast.makeText(MainActivity.this,"첫번째",Toast.LENGTH_SHORT).show();
                    return true;
                }
                else if(actionId==EditorInfo.IME_ACTION_NEXT) {
                    Toast.makeText(MainActivity.this,"두번째",Toast.LENGTH_SHORT).show();
                    return true;
                    }
                    return false;
                }
            };
            eidt.setOnEditorActionListener(a);
            eidt2.setOnEditorActionListener(a);
*/





        /*
        TextView tv=(TextView)toastView.findViewById(R.id.myToastTextView);
        tv.setText("Asd");
        Button button=(Button)findViewById(R.id.b1);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "btn",Toast.LENGTH_LONG).show();
            }
        });
  */
        /*
        Toast t=new Toast(this);
        t.setView(toastView);
        t.setGravity(Gravity.CENTER, 100,50);
        t.setDuration(Toast.LENGTH_LONG);
        t.show();
*/
        /*
        Button button = (Button) findViewById(R.id.swapbutton);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edit1 = (EditText) findViewById(R.id.editText1);
                CharSequence s1 = edit1.getText();
                EditText edit2 = (EditText) findViewById(R.id.editText2);
                CharSequence s2 = edit2.getText();
                edit1.setText(s2);
                edit2.setText(s1);

            }
        };
        button.setOnClickListener(listener);*/
    }

}
