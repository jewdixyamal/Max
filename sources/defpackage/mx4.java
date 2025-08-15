package defpackage;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: mx4  reason: default package */
public final class mx4 implements KeyListener {
    public final KeyListener a;
    public final oz7 b;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, oz7] */
    public mx4(KeyListener keyListener) {
        ? obj = new Object();
        this.a = keyListener;
        this.b = obj;
    }

    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.a.clearMetaKeyState(view, editable, i);
    }

    public final int getInputType() {
        return this.a.getInputType();
    }

    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean z;
        this.b.getClass();
        if (i != 67 ? i != 112 ? false : te.a(editable, keyEvent, true) : te.a(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z = true;
        } else {
            z = false;
        }
        return z || this.a.onKeyDown(view, editable, i, keyEvent);
    }

    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.a.onKeyOther(view, editable, keyEvent);
    }

    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.a.onKeyUp(view, editable, i, keyEvent);
    }
}
