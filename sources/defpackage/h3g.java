package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: h3g  reason: default package */
public final class h3g implements o3g {
    public final long a;
    public final long b;
    public final Context c;
    public final int d;

    public h3g(long j, long j2, Context context, y7d y7d) {
        this.a = j;
        this.b = j2;
        this.c = context;
        this.d = (int) ((qyc) y7d).q(PmsKey.f133webappdskeyscount, (long) 100);
    }

    public final Boolean a(String str, String str2) {
        SharedPreferences c2 = c();
        if (c2.contains(str)) {
            c2.edit().putString(str, str2).apply();
        } else if (c2.getAll().size() == this.d) {
            return Boolean.FALSE;
        } else {
            c2.edit().putString(str, str2).apply();
        }
        return Boolean.TRUE;
    }

    public final String b(String str) {
        return c().getString(str, (String) null);
    }

    public final SharedPreferences c() {
        return this.c.getApplicationContext().getSharedPreferences("webapp_ds_" + this.b + "_" + this.a, 0);
    }

    public final Boolean clear() {
        SharedPreferences c2 = c();
        if (c2.getAll().isEmpty()) {
            return Boolean.FALSE;
        }
        c2.edit().clear().apply();
        return Boolean.TRUE;
    }

    public final Boolean remove(String str) {
        SharedPreferences c2 = c();
        if (!c2.contains(str)) {
            return Boolean.FALSE;
        }
        c2.edit().remove(str).apply();
        return Boolean.TRUE;
    }
}
