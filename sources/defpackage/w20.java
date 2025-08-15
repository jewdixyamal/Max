package defpackage;

import java.io.File;

/* renamed from: w20  reason: default package */
public final class w20 extends lz {
    public final rf5 c;
    public final av0 d;
    public rx e;
    public volatile long f;

    public w20(l20 l20, rf5 rf5, av0 av0) {
        super(l20);
        this.c = rf5;
        this.d = av0;
    }

    public final void a() {
        this.f = 0;
        b(this.e, new Exception("cancelled"));
        try {
            this.d.f(this);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [one, java.lang.Object] */
    public final qy9 d() {
        qy9 d2 = super.d();
        if (d2 != null) {
            return d2;
        }
        rx rxVar = this.e;
        if (rxVar != null) {
            return rxVar;
        }
        this.e = new rx();
        this.d.d(this);
        ? obj = new Object();
        l20 l20 = this.a;
        obj.b = l20.r;
        i10 i10 = l20.e;
        obj.d = i10.a;
        obj.g = i10.b;
        obj.h = true;
        pne pne = new pne(obj);
        this.f = pne.o;
        this.c.a(pne);
        return this.e;
    }

    @uae
    public void onEvent(hn4 hn4) {
        if (this.f == hn4.a) {
            b(this.e, new Exception("DownloadErrorEvent"));
            try {
                this.d.f(this);
            } catch (Throwable unused) {
            }
        }
    }

    @uae
    public void onEvent(fn4 fn4) {
        if (this.f == fn4.a) {
            this.e.e(new File(fn4.c));
            this.e.b();
            try {
                this.d.f(this);
            } catch (Throwable unused) {
            }
        }
    }
}
