package defpackage;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: ox7  reason: default package */
public final class ox7 extends pnf {
    public static final t6a t0 = new t6a(xca.a, new r6a(vca.c), wca.g, ":contact-list", wca.f);
    public static final t6a u0 = new t6a(w0c.oneme_main_calls_title, new r6a(vca.a), wca.c, ":call-list", wca.b);
    public static final t6a v0 = new t6a(w0c.oneme_main_chats_title, new q6a(new nx7(0), new g27(11)), wca.e, ":chat-list", wca.d);
    public static final t6a w0 = new t6a(w0c.oneme_main_settings_title, new q6a(new nx7(1), new g27(12)), wca.j, ":settings", wca.i);
    public final q0e X;
    public final w7c Y;
    public final z16 Z = new z16(16, this);
    public final hp b;
    public final List c;
    public t6a o;
    public final mn5 s0;

    public ox7(jp jpVar, uq0 uq0, String str) {
        Object obj;
        this.b = jpVar;
        t6a t6a = t0;
        t6a t6a2 = u0;
        t6a t6a3 = v0;
        List M = y53.M(t6a, t6a2, t6a3, w0);
        this.c = M;
        this.o = t6a3;
        q0e a = r0e.a(Boolean.valueOf(jpVar.d("app.messages.calls.menu.item", true)));
        this.X = a;
        this.Y = new w7c(a);
        this.s0 = uq0.c;
        Iterator it = M.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (tpa.f(((t6a) obj).d, str)) {
                break;
            }
        }
        t6a t6a4 = (t6a) obj;
        this.o = t6a4 != null ? t6a4 : t6a3;
        hp hpVar = this.b;
        z16 z16 = this.Z;
        jp jpVar2 = (jp) hpVar;
        jpVar2.getClass();
        ip ipVar = new ip(jpVar2, z16);
        jpVar2.m.put(z16, ipVar);
        jpVar2.g.registerOnSharedPreferenceChangeListener(ipVar);
    }

    public final void p() {
        jp jpVar = (jp) this.b;
        ne7 ne7 = jpVar.g;
        WeakHashMap weakHashMap = jpVar.m;
        z16 z16 = this.Z;
        ne7.unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) weakHashMap.get(z16));
        weakHashMap.remove(z16);
    }
}
