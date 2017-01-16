package com.example.npitroda.contact;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recList =  (RecyclerView) findViewById(R.id.cardList);
        recList.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);

        final List<ContactInfo> contactList =  createList(30);
        ContactAdapter ci = new ContactAdapter(contactList);
        recList.setAdapter(ci);

        recList.addOnItemTouchListener(new RecyclerItemClickListener(getApplicationContext(), new RecyclerItemClickListener.OnItemClickListener() {

            @Override
            public void onClick(View view, int position) {
                ContactInfo contact = contactList.get(position);
                Toast.makeText(getApplicationContext(), contact.getName() + " is selected!", Toast.LENGTH_SHORT).show();

                showMessage("Email Id for "+contact.getName()+" is "+contact.getEmail());
            }



        }));

    }

    public void showMessage(String s)
    {
        Intent i = new Intent(this,Main2Activity.class);
        i.putExtra("Value1",s);
        startActivity(i);
    }

    private List<ContactInfo> createList(int size) {

        List<ContactInfo> result = new ArrayList<ContactInfo>();
        for (int i=1; i <= size; i++) {
            ContactInfo ci = new ContactInfo();
            ci.name = ContactInfo.NAME_PREFIX + i;
            ci.surname = ContactInfo.SURNAME_PREFIX + i;
            ci.email = ContactInfo.EMAIL_PREFIX + i + "@test.com";

            result.add(ci);

        }

        return result;
    }


}
