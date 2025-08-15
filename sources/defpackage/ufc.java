package defpackage;

import android.app.RemoteInput;

/* renamed from: ufc  reason: default package */
public abstract class ufc {
    public static int a(Object obj) {
        return ((RemoteInput) obj).getEditChoicesBeforeSending();
    }

    public static RemoteInput.Builder b(RemoteInput.Builder builder, int i) {
        return builder.setEditChoicesBeforeSending(i);
    }
}
