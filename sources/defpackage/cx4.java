package defpackage;

import android.text.Editable;

/* renamed from: cx4  reason: default package */
public final class cx4 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile cx4 b;
    public static Class c;

    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new fvd(cls, charSequence) : super.newEditable(charSequence);
    }
}
