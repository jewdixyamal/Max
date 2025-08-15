package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: i7b  reason: default package */
public final class i7b {
    public final SharedPreferences a;

    public i7b(Context context) {
        this.a = context.getSharedPreferences("webrtc-android-sdk-pref", 0);
    }
}
