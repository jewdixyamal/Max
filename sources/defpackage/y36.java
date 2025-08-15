package defpackage;

import android.graphics.drawable.Animatable;

/* renamed from: y36  reason: default package */
public final class y36 implements ft7, ev3 {
    public final /* synthetic */ ii0 a = new Object();
    public final xs b = ay7.d("WrappingUtils");
    public int c = 6;

    public final void a(String str, ru6 ru6, Animatable animatable) {
        this.a.getClass();
    }

    public final void b(String str) {
        new Throwable();
        if (!x53.c0(this.b, str)) {
            "Fresco:".concat(str);
        }
    }

    public final void c(String str, String str2, Throwable th) {
        if (!x53.c0(this.b, str)) {
            String concat = "Fresco:".concat(str);
            String m = th instanceof x36 ? "" : xxc.m(th);
            hm9.m0(concat, str2 + m, new Object[0]);
        }
    }

    public final void d(String str, Throwable th) {
        String concat = "Fresco:".concat("ControllerListener");
        hm9.p(concat, "onFailure " + str, th);
    }

    public final void e(Object obj, String str) {
        this.a.getClass();
    }

    public final void f(String str, String str2) {
        c(str, str2, new Throwable());
    }

    public final void g(String str) {
        this.a.getClass();
    }

    public final void h(String str, ru6 ru6) {
        this.a.getClass();
    }

    public final boolean i(int i) {
        return this.c <= i;
    }

    public final void j(int i) {
        this.c = i;
    }

    public final void k(String str, Throwable th) {
        String concat = "Fresco:".concat("ControllerListener");
        hm9.p(concat, "onIntermediateImageFailed " + str, th);
    }

    public final void w(String str, String str2, Throwable th) {
        if (!x53.c0(this.b, str)) {
            String concat = "Fresco:".concat(str);
            String m = th instanceof x36 ? "" : xxc.m(th);
            hm9.m0(concat, str2 + m, new Object[0]);
        }
    }

    public final void e(String str, String str2, Throwable th) {
        if (!x53.c0(this.b, str)) {
            hm9.r("Fresco:".concat(str), th, str2, new Object[0]);
        }
    }

    public final void d(String str, String str2, Throwable th) {
        if (!x53.c0(this.b, str)) {
            String concat = "Fresco:".concat(str);
            String m = th instanceof x36 ? "" : xxc.m(th);
            hm9.m(concat, str2 + m, new Object[0]);
        }
    }

    public final void e(String str, String str2) {
        e(str, str2, new Throwable());
    }

    public final void w(String str, String str2) {
        w(str, str2, new Throwable());
    }

    public final void d(String str, String str2) {
        d(str, str2, new Throwable());
    }
}
