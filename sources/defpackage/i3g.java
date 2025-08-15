package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.security.KeyStore;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: i3g  reason: default package */
public final class i3g implements o3g {
    public final long a;
    public final long b;
    public final Context c;
    public final kxf d;
    public final int e;
    public final String f = i3g.class.getName();

    public i3g(long j, long j2, Context context, y7d y7d) {
        StringBuilder k = au1.k(j2, "webapp_s_key_", "_");
        k.append(j);
        kxf kxf = new kxf(k.toString(), false);
        this.a = j;
        this.b = j2;
        this.c = context;
        this.d = kxf;
        this.e = (int) ((qyc) y7d).q(PmsKey.f134webappsskeyscount, (long) 10);
    }

    public final Boolean a(String str, String str2) {
        Object obj;
        SharedPreferences c2 = c();
        try {
            obj = this.d.b(str2);
        } catch (Throwable th) {
            obj = new njc(th);
        }
        if (obj instanceof njc) {
            hm9.l0(this.f, "Can't encrypt value", pjc.a(obj));
            return Boolean.FALSE;
        }
        od2.a0(obj);
        String str3 = (String) obj;
        if (c2.contains(str)) {
            c2.edit().putString(str, str3).apply();
        } else if (c2.getAll().size() == this.e) {
            return Boolean.FALSE;
        } else {
            c2.edit().putString(str, str3).apply();
        }
        return Boolean.TRUE;
    }

    public final String b(String str) {
        Object obj;
        Object obj2 = null;
        String string = c().getString(str, (String) null);
        if (string == null) {
            return null;
        }
        try {
            obj = kxf.a(this.d, string);
        } catch (Throwable th) {
            obj = new njc(th);
        }
        if (!(obj instanceof njc)) {
            obj2 = obj;
        }
        return (String) obj2;
    }

    public final SharedPreferences c() {
        return this.c.getApplicationContext().getSharedPreferences("webapp_ss_" + this.b + "_" + this.a, 0);
    }

    public final Boolean clear() {
        Object obj;
        SharedPreferences c2 = c();
        if (c2.getAll().isEmpty()) {
            return Boolean.FALSE;
        }
        kxf kxf = this.d;
        kxf.getClass();
        try {
            ((KeyStore) ((khe) kxf.o).getValue()).deleteEntry((String) kxf.a);
            obj = e5f.a;
        } catch (Throwable th) {
            obj = new njc(th);
        }
        if (pjc.a(obj) != null) {
            hm9.m0((String) kxf.c, "Can't remove secret key", new Object[0]);
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
