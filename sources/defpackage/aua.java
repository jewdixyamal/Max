package defpackage;

import android.os.Build;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: aua  reason: default package */
public final class aua {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final dua d;
    public final dua e;
    public final dua f;
    public final dua g;
    public final dua h;
    public final dua i;
    public final dua j;

    public aua(je7 je7, je7 je72, je7 je73, kke kke) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        ContextScope a2 = j1e.a(((w9a) kke).b());
        dua dua = new dua(eua.k);
        this.d = dua;
        dua dua2 = new dua(eua.f);
        this.e = dua2;
        dua dua3 = new dua(eua.m);
        this.f = dua3;
        dua dua4 = new dua(new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"});
        this.g = dua4;
        dua dua5 = new dua(eua.l);
        this.h = dua5;
        dua dua6 = new dua(eua.h);
        this.i = dua6;
        dua dua7 = new dua(eua.j);
        this.j = dua7;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            od2.L(new zn5(dua, new uta(this, (Continuation) null), 5), a2);
        }
        od2.L(new zn5(dua2, new vta(this, (Continuation) null), 5), a2);
        if (i2 >= 34) {
            od2.L(new j31(dua3, dua4, new c3(this, (Continuation) null, 20), 4), a2);
        } else {
            od2.L(new zn5(dua3, new wta(this, (Continuation) null), 5), a2);
        }
        od2.L(new zn5(dua5, new xta(this, (Continuation) null), 5), a2);
        od2.L(new zn5(dua6, new yta(this, (Continuation) null), 5), a2);
        od2.L(new zn5(dua7, new zta(this, (Continuation) null), 5), a2);
    }

    public static final void a(aua aua, String str, String str2) {
        Integer d2 = ((an9) aua.c.getValue()).d();
        if (d2 != null) {
            ky7 ky7 = new ky7();
            ky7.put("pType", str);
            ky7.put("screen", d2);
            ky7.put("pStatus", str2);
            aua.d("permission_changed_state", ky7.b());
        }
    }

    public static final String b(aua aua, bua bua) {
        aua.getClass();
        return bua == bua.a ? "allowed" : "denied";
    }

    public static String c(dua dua) {
        return dua.j() ? "allowed" : "denied";
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [e47, java.lang.Object] */
    public final void d(String str, ky7 ky7) {
        ? obj = new Object();
        obj.c = "PERMISSION";
        je7 je7 = this.b;
        obj.b = ((hyc) ((q33) je7.getValue())).t();
        obj.o = str;
        obj.a = System.currentTimeMillis();
        obj.b(ky7);
        obj.X = ((t33) ((q33) je7.getValue())).F();
        ((ad) this.a.getValue()).j(obj.c());
    }
}
