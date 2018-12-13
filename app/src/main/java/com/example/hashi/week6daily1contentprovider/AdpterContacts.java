package com.example.hashi.week6daily1contentprovider;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

public class AdpterContacts extends CursorAdapter {
    public AdpterContacts(Context context, Cursor c, int flags) {
        super(context, c, flags);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {

        return LayoutInflater.from(context).inflate(
                R.layout.row_contact,viewGroup,false );
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        String contactName = cursor.getString(
                cursor.getColumnIndex(LocalDb.CONTACT_NAME));
        String contactPhone = cursor.getString(
                cursor.getColumnIndex(LocalDb.CONTACT_PHONE));
        TextView nameTextView = (TextView) view.findViewById(R.id.tv_name);
        TextView phoneTextView = (TextView) view.findViewById(R.id.tv_phone);
        nameTextView.setText(contactName);
        phoneTextView.setText(contactPhone);

    }
}
