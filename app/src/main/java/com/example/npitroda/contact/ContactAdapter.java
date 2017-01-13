package com.example.npitroda.contact;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by NPitroda on 1/13/2017.
 */

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {

    private List<ContactInfo> contactList;

    public ContactAdapter(List<ContactInfo> contactList)
    {
        this.contactList=contactList;
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view,parent,false);
        return new ContactViewHolder(itemView);


    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {

        ContactInfo ci = contactList.get(position);
        holder.vName.setText(ci.name);
        holder.vEmail.setText(ci.email);
        holder.vSurname.setText(ci.surname);
        holder.vTitle.setText(ci.name+" "+ci.surname);


    }




    public static class ContactViewHolder extends RecyclerView.ViewHolder {

        protected TextView vName;
        protected TextView vSurname;
        protected TextView vEmail;
        protected TextView vTitle;

        public ContactViewHolder(View v)
        {
            super(v);
            this.vName = (TextView) v.findViewById(R.id.txtName);
            this.vSurname = (TextView) v.findViewById(R.id.txtSurname);
            this.vEmail = (TextView) v.findViewById(R.id.txtEmail);
            this.vTitle = (TextView) v.findViewById(R.id.title);

        }

    }

}
