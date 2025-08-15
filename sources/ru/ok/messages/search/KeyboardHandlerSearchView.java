package ru.ok.messages.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;

public class KeyboardHandlerSearchView extends o0d {
    private pc7 listener;

    public KeyboardHandlerSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        return (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) ? super.dispatchKeyEventPreIme(keyEvent) : super.dispatchKeyEventPreIme(keyEvent);
    }

    public void setListener(pc7 pc7) {
    }

    public KeyboardHandlerSearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public KeyboardHandlerSearchView(Context context) {
        super(context, (AttributeSet) null);
    }
}
