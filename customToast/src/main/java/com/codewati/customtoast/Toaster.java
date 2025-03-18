package com.codewati.customtoast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Toaster {

    public static void shortToast(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

    public static void longToast(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
    }

    // Done toast
    public static void doneToast(Context context, String msg) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.custom_done_toast, null);

        TextView text = layout.findViewById(R.id.done_message);
        text.setText(msg);

        ImageView icon = layout.findViewById(R.id.toast_icon);
        icon.setImageResource(R.drawable.ic_done);

        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }

}
