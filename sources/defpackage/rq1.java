package defpackage;

import ru.ok.android.externcalls.sdk.audio.Logger;

/* renamed from: rq1  reason: default package */
public final class rq1 implements Logger {
    public final void d(String str, String str2) {
        hm9.m(str, str2, new Object[0]);
    }

    public final void e(String str, String str2, Throwable th) {
        hm9.p(str, str2, th);
    }

    public final void i(String str, String str2) {
        hm9.G(str, str2, (Throwable) null);
    }

    public final void v(String str, String str2) {
        hm9.h0(str, str2, new Object[0]);
    }

    public final void w(String str, String str2) {
        hm9.m0(str, str2, new Object[0]);
    }

    public final void d(String str, String str2, Throwable th) {
        hm9.l(str, str2, th);
    }

    public final void e(String str, String str2) {
        hm9.p(str, str2, (Throwable) null);
    }

    public final void i(String str, String str2, Throwable th) {
        hm9.G(str, str2, (Throwable) null);
    }

    public final void v(String str, String str2, Throwable th) {
        ir6 ir6 = hm9.m;
        if (ir6 != null) {
            us7 us7 = us7.o;
            if (str2 == null) {
                str2 = "";
            }
            ir6.b(ir6, us7, str, str2, (Object[]) null, th, 8);
        }
    }

    public final void w(String str, String str2, Throwable th) {
        hm9.l0(str, str2, th);
    }

    public final void w(String str, Throwable th) {
        hm9.m0(str, th.getMessage(), new Object[0]);
    }
}
