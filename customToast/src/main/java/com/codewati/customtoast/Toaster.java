package com.codewati.customtoast;

import static com.google.android.material.snackbar.Snackbar.*;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

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
        icon.setImageResource(R.drawable.svg_done);

        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.setGravity(Gravity.START | Gravity.CENTER_VERTICAL, 0, 0);
        toast.show();
    }

    // Alert toast
    public static void alertToast(Context context, String msg) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.custom_alert_toast, null);

        TextView text = layout.findViewById(R.id.alert_message);
        text.setText(msg);

        ImageView icon = layout.findViewById(R.id.alert_icon);
        icon.setImageResource(R.drawable.svg_cross);

        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.setGravity(Gravity.START | Gravity.CENTER_VERTICAL, 0, 0);
        toast.show();
    }

    // Warning toast
    public static void warningToast(Context context, String msg) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.custom_warning_toast, null);

        TextView text = layout.findViewById(R.id.warning_message);
        text.setText(msg);

        ImageView icon = layout.findViewById(R.id.warning_icon);
        icon.setImageResource(R.drawable.svg_warning);

        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.setGravity(Gravity.START | Gravity.CENTER_VERTICAL, 0, 0);
        toast.show();
    }

    // Info toast
    public static void infoToast(Context context, String msg) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.custom_info_toast, null);

        TextView text = layout.findViewById(R.id.info_message);
        text.setText(msg);

        ImageView icon = layout.findViewById(R.id.info_icon);
        icon.setImageResource(R.drawable.svg_info);

        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.setGravity(Gravity.START | Gravity.CENTER_VERTICAL, 0, 0);
        toast.show();
    }

    // Loading toast
    public static void loadingToast(Context context, String msg) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.custom_loading_toast, null);

        TextView text = layout.findViewById(R.id.load_message);
        text.setText(msg);

        ImageView icon = layout.findViewById(R.id.load_icon);
        icon.setImageResource(R.drawable.svg_loading);

        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.setGravity(Gravity.START | Gravity.CENTER_VERTICAL, 0, 0);
        toast.show();
    }

    // Done Snackbar
    public static void doneSnackbar(View rootView, String msg) {
        Snackbar snackbar = Snackbar.make(rootView, "", Snackbar.LENGTH_LONG);
        View customView = LayoutInflater.from(rootView.getContext()).inflate(R.layout.done_snackbar, null);

        SnackbarLayout snackBarView = (SnackbarLayout) snackbar.getView();
        snackBarView.setPadding(0, 0, 0, 0);
        snackBarView.setBackgroundColor(Color.TRANSPARENT);

        // Set message dynamically
        TextView messageView = customView.findViewById(R.id.success_msg);
        messageView.setText(msg);

        snackBarView.addView(customView, 0);
        snackbar.show();
    }

    // Alert Snackbar
    public static void alertSnackbar(View rootView, String msg) {
        Snackbar snackbar = Snackbar.make(rootView, "", Snackbar.LENGTH_LONG);
        View customView = LayoutInflater.from(rootView.getContext()).inflate(R.layout.alert_snackbar, null);

        SnackbarLayout snackBarView = (SnackbarLayout) snackbar.getView();
        snackBarView.setPadding(0, 0, 0, 0);
        snackBarView.setBackgroundColor(Color.TRANSPARENT);

        // Set message dynamically
        TextView messageView = customView.findViewById(R.id.alert_msg);
        messageView.setText(msg);

        snackBarView.addView(customView, 0);
        snackbar.show();
    }

    // Warning Snackbar
    public static void warningSnackbar(View rootView, String msg) {
        Snackbar snackbar = Snackbar.make(rootView, "", Snackbar.LENGTH_LONG);
        View customView = LayoutInflater.from(rootView.getContext()).inflate(R.layout.warning_snackbar, null);

        SnackbarLayout snackBarView = (SnackbarLayout) snackbar.getView();
        snackBarView.setPadding(0, 0, 0, 0);
        snackBarView.setBackgroundColor(Color.TRANSPARENT);

        // Set message dynamically
        TextView messageView = customView.findViewById(R.id.warning_msg);
        messageView.setText(msg);

        snackBarView.addView(customView, 0);
        snackbar.show();
    }

    // Info Snackbar
    public static void infoSnackbar(View rootView, String msg) {
        Snackbar snackbar = Snackbar.make(rootView, "", Snackbar.LENGTH_LONG);
        View customView = LayoutInflater.from(rootView.getContext()).inflate(R.layout.info_snackbar, null);

        SnackbarLayout snackBarView = (SnackbarLayout) snackbar.getView();
        snackBarView.setPadding(0, 0, 0, 0);
        snackBarView.setBackgroundColor(Color.TRANSPARENT);

        // Set message dynamically
        TextView messageView = customView.findViewById(R.id.info_msg);
        messageView.setText(msg);

        snackBarView.addView(customView, 0);
        snackbar.show();
    }

}
