package defpackage;

import android.content.Context;
import android.util.ArrayMap;
import java.util.HashMap;

/* renamed from: t33  reason: default package */
public final class t33 extends hyc {
    public final boolean l = false;
    public volatile Boolean m = null;

    public t33(Context context, cj4 cj4, mi5 mi5) {
        super(context, mi5);
        this.j = cj4;
    }

    public final String D() {
        return g("server.host", this.l ? "api.oneme.ru" : null);
    }

    public final String E() {
        return g("server.port", this.l ? "443" : null);
    }

    public final long F() {
        return f("app.stats.session.id", 0);
    }

    public final boolean G() {
        if (this.m == null) {
            this.m = Boolean.valueOf(this.g.getBoolean("ok_push_disabled", false));
        }
        try {
            return this.m.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public final void c() {
        String D = D();
        String E = E();
        boolean d = d("server.useTls", true);
        ne7 ne7 = this.g;
        String string = ne7.getString("server.loginError", (String) null);
        String string2 = ne7.getString("device.id", (String) null);
        String string3 = ne7.getString("user.Phone.Code", (String) null);
        String g = g("user.Phone", (String) null);
        String string4 = ne7.getString("app.lastSuccessProxy", (String) null);
        String string5 = ne7.getString("app.currentProxyList", (String) null);
        int i = ne7.getInt("app.currentProxyListTtl", 299);
        String str = string5;
        boolean z = ne7.getBoolean("app.debugHostRotation", false);
        boolean z2 = ne7.getBoolean("app.debugUaDnsEmulation", false);
        String r = r();
        boolean z3 = z2;
        String string6 = ne7.getString("user.systemLang", (String) null);
        String string7 = ne7.getString("app.tenor.anon.id", "");
        boolean z4 = z;
        long j = ne7.getLong("app.last.push.state.time", 0);
        this.j.getClass();
        bcf bcf = bcf.a;
        bcf.b().getClass();
        long F = F();
        bcf bcf2 = bcf;
        ArrayMap arrayMap = new ArrayMap(1);
        ((HashMap) ne7.getAll()).forEach(new r33(0, arrayMap));
        super.c();
        m("server.host", D);
        m("server.port", E);
        j("server.useTls", d);
        m("server.loginError", string);
        m("device.id", string2);
        m("user.Phone.Code", string3);
        m("user.Phone", g);
        m("app.lastSuccessProxy", string4);
        m("app.currentProxyList", str);
        k(i, "app.currentProxyListTtl");
        j("app.debugHostRotation", z4);
        j("app.debugUaDnsEmulation", z3);
        m("user.lang", r);
        m("user.systemLang", string6);
        m("app.tenor.anon.id", string7);
        String str2 = "app.last.push.state.time";
        l(str2, Long.valueOf(j));
        this.j.getClass();
        bcf2.b().getClass();
        l("app.stats.session.id", Long.valueOf(F));
        arrayMap.forEach(new s33(0, this));
    }

    public final boolean d(String str, boolean z) {
        return this.g.getBoolean(str, z);
    }
}
