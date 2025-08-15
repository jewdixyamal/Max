package defpackage;

import java.util.List;
import java.util.Locale;

/* renamed from: e74  reason: default package */
public final /* synthetic */ class e74 implements km7, qj3, u98, pj8, rj8, pj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object o;

    public /* synthetic */ e74(fd fdVar, int i, long j, long j2) {
        this.a = 0;
        this.o = fdVar;
        this.c = i;
        this.b = j;
    }

    public void accept(Object obj) {
        int i = this.c;
        long j = this.b;
        Object obj2 = this.o;
        switch (this.a) {
            case 1:
                sc5 sc5 = (sc5) obj2;
                sc5.getClass();
                Locale locale = Locale.ENGLISH;
                hm9.p("sc5", "onNotifMoved: failed to move id=" + j + " to position=" + i, (Throwable) obj);
                sc5.f();
                return;
            case 2:
                md5 md5 = (md5) obj2;
                md5.getClass();
                Locale locale2 = Locale.ENGLISH;
                hm9.p("md5", "onNotifMoved: failed to move id=" + j + " to position=" + i, (Throwable) obj);
                md5.c();
                return;
            default:
                b04 b04 = (b04) obj;
                qbe qbe = (qbe) obj2;
                fm9.l(qbe.i);
                zw6 zw6 = b04.a;
                qbe.c.getClass();
                byte[] d = kj6.d(b04.c, zw6);
                wpa wpa = qbe.d;
                wpa.getClass();
                wpa.E(d.length, d);
                boolean z = false;
                qbe.a.b(wpa, d.length, 0);
                long j2 = b04.b;
                if (j2 == -9223372036854775807L) {
                    if (qbe.i.s == Long.MAX_VALUE) {
                        z = true;
                    }
                    fm9.k(z);
                } else {
                    long j3 = qbe.i.s;
                    j = j3 == Long.MAX_VALUE ? j + j2 : j2 + j3;
                }
                qbe.a.a(j, this.c, d.length, 0, (wze) null);
                return;
        }
    }

    public void c(qr6 qr6, int i) {
        qr6.P(((w98) this.o).c, i, this.c, this.b);
    }

    public void f(x4b x4b, oh8 oh8) {
        x4b.r(((sj8) this.o).J0(oh8, x4b, this.c), this.b);
    }

    public void invoke(Object obj) {
        ((gd) obj).L((fd) this.o, this.c, this.b);
    }

    public Object k(ii8 ii8, oh8 oh8, int i) {
        int i2 = this.c;
        return ii8.q(oh8, (ffc) ((List) this.o), i2 == -1 ? ii8.s.p0() : i2, i2 == -1 ? ii8.s.k() : this.b);
    }

    public /* synthetic */ e74(Object obj, int i, long j, int i2) {
        this.a = i2;
        this.o = obj;
        this.c = i;
        this.b = j;
    }

    public /* synthetic */ e74(Object obj, long j, int i, int i2) {
        this.a = i2;
        this.o = obj;
        this.b = j;
        this.c = i;
    }
}
