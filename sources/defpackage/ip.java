package defpackage;

import android.content.SharedPreferences;

/* renamed from: ip  reason: default package */
public final /* synthetic */ class ip implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ jp a;
    public final /* synthetic */ z16 b;

    public /* synthetic */ ip(jp jpVar, z16 z16) {
        this.a = jpVar;
        this.b = z16;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        jp jpVar = this.a;
        jpVar.getClass();
        if (str != null && str.equals("app.messages.calls.menu.item")) {
            ((ox7) this.b.b).X.m((Object) null, Boolean.valueOf(jpVar.d("app.messages.calls.menu.item", true)));
        }
    }
}
