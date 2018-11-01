package com.example.user.myandroid;

import android.graphics.BitmapFactory;
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
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText etname;
    EditText etpassword;
    Button btnadd;
    ListView listView;
    ArrayList<String> arraylist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview2);



        etname=findViewById(R.id.etname);
        etpassword=findViewById(R.id.etpassword);
        btnadd=findViewById(R.id.btnadd);
        listView=findViewById(R.id.listview);

       final  ListAdapter adapter=new ListAdapter(this);
        listView.setAdapter(adapter);

        btnadd.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String check=etname.getText().toString();
                    if(check.equals(""))
                        Toast.makeText(MainActivity.this,"이름을 입력해 주세요", Toast.LENGTH_SHORT).show();
                    else{
                        String result="이름:"+check+" 비밀번호:" +etpassword.getText().toString();
                        adapter.add(BitmapFactory.decodeResource(getResources(),R.drawable.ic_launcher_background),check,etpassword.getText().toString(),Calendar.getInstance().getTime().toString());
                        adapter.notifyDataSetChanged();
                }
            }
        });


/*
        LayoutInflater layoutInflater = getLayoutInflater();
        LinearLayout toastView = (LinearLayout) layoutInflater.inflate(R.layout.mytoast, null);

        Button a1=(Button)findViewById(R.id.btnplus);
        Button a2=(Button)findViewById(R.id.btnminus);
        Button a3=(Button)findViewById(R.id.btnmul);
        Button a4=(Button)findViewById(R.id.btnmod);
        final Button.OnClickListener react = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText op1=(EditText)findViewById(R.id.op1);
                EditText op2=(EditText)findViewById(R.id.op2);
                int result=0;

                switch (v.getId()){
                    case (R.id.btnplus):
                            result = Integer.parseInt(op1.getText().toString()) + Integer.parseInt(op2.getText().toString());
                    break;

                    case (R.id.btnminus):
                        result = Integer.parseInt(op1.getText().toString()) - Integer.parseInt(op2.getText().toString());
                        break;
                    case (R.id.btnmul):
                        result = Integer.parseInt(op1.getText().toString()) * Integer.parseInt(op2.getText().toString());
                        break;
                    case(R.id.btnmod):
                        result = Integer.parseInt(op1.getText().toString()) % Integer.parseInt(op2.getText().toString());
                        break;

                }



                TextView res=(TextView)findViewById(R.id.result);
                res.setText(Integer.toString(result));

        };


    };
        a1.setOnClickListener(react);
        a2.setOnClickListener(react);
        a3.setOnClickListener(react);
        a4.setOnClickListener(react);
*/
/* Button btn=(Button)findViewById(R.id.addButton);

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
                lv.setAdapter(adapters);*/

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
