package com.example.jinliyu.directshareexample;

import android.widget.TextView;

public class ContactViewBinder {

    /**
     * Binds the {@code textView} with the specified {@code contact}.
     *
     * @param contact  The contact.
     * @param textView The TextView.
     */
    public static void bind(Contact contact, TextView textView) {
        textView.setText(contact.getName());
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(contact.getIcon(), 0, 0, 0);
    }

}