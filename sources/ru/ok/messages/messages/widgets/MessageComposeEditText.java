package ru.ok.messages.messages.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import one.me.android.OneMeApplication;

public class MessageComposeEditText extends ax4 {
    public static final /* synthetic */ int w0 = 0;

    public MessageComposeEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, vsb.editTextStyle);
        ((OneMeApplication) ((eke) context.getApplicationContext())).getClass();
        ay4 ay4 = (ay4) jyc.a.getAccessor().c(ay4.class);
        if (!ay4.e) {
            addTextChangedListener(new py4(0, ay4));
        }
        ((y8a) vl.b()).b();
        setReplaceTextSmiles(vl.o.a().c.g.getBoolean("app.messages.replace.emoji", false));
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        editorInfo.contentMimeTypes = new String[]{"image/jpeg", "image/png", "image/gif"};
        return new k17(onCreateInputConnection, new z16(29, this));
    }

    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        return (i == 4 && keyEvent.getAction() == 0) ? super.onKeyPreIme(i, keyEvent) : super.onKeyPreIme(i, keyEvent);
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        getParent().requestDisallowInterceptTouchEvent(true);
    }

    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
    }

    public void setListener(lt8 lt8) {
    }

    public void setMIUITextSelectListener(mt8 mt8) {
    }

    public void setTextSelectListener(nt8 nt8) {
    }
}
