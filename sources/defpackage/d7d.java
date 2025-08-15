package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: d7d  reason: default package */
public final class d7d implements pi4, SharedPreferences.OnSharedPreferenceChangeListener {
    public final q33 a;
    public final je7 b;
    public final long c;
    public final long d;
    public final q0e e;
    public final w7c f;

    public d7d(je7 je7, q33 q33) {
        this.a = q33;
        this.b = je7;
        AtomicLong atomicLong = ei4.b;
        this.c = atomicLong.incrementAndGet();
        this.d = atomicLong.incrementAndGet();
        q0e a2 = r0e.a(e());
        this.e = a2;
        this.f = new w7c(a2);
        e3 e3Var = q33 instanceof e3 ? (e3) q33 : null;
        if (e3Var != null) {
            e3Var.g.registerOnSharedPreferenceChangeListener(this);
        }
    }

    public final void b() {
        q33 q33 = this.a;
        e3 e3Var = q33 instanceof e3 ? (e3) q33 : null;
        if (e3Var != null) {
            e3Var.g.unregisterOnSharedPreferenceChangeListener(this);
        }
    }

    public final j0e c() {
        return this.f;
    }

    public final void d(b54 b54) {
        long j = b54.a;
        boolean a2 = ei4.a(j, this.c);
        je7 je7 = this.b;
        if (a2) {
            gi4.b.getClass();
            ((f64) je7.getValue()).b(m64.a(gi4.h.a), (Bundle) null);
        } else if (ei4.a(j, this.d)) {
            gi4.b.getClass();
            ((f64) je7.getValue()).b(m64.a(gi4.i.a), (Bundle) null);
        }
    }

    public final List e() {
        t33 t33 = (t33) this.a;
        String D = t33.D();
        String str = "";
        if (D == null) {
            D = str;
        }
        b54 b54 = new b54(this.c, new iqe(D), 0, new iqe("Адрес сервера"), (fp3) null, 20);
        String E = t33.E();
        if (E != null) {
            str = E;
        }
        return y53.M(b54, new b54(this.d, new iqe(str), 0, new iqe("Порт сервера"), (fp3) null, 20));
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.e.m((Object) null, e());
    }
}
