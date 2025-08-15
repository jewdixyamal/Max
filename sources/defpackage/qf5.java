package defpackage;

import java.io.File;

/* renamed from: qf5  reason: default package */
public final class qf5 extends lz {
    public final pk c;
    public final rf5 d;
    public final av0 e;
    public rx f;
    public long g;
    public long h;

    public qf5(l20 l20, pk pkVar, rf5 rf5, av0 av0) {
        super(l20);
        this.c = pkVar;
        this.d = rf5;
        this.e = av0;
    }

    public final void a() {
        this.g = 0;
        this.h = 0;
        b(this.f, new Exception("cancelled"));
        try {
            this.e.f(this);
        } catch (Throwable unused) {
        }
    }

    public final void c(rx rxVar, File file) {
        super.c(rxVar, file);
        try {
            this.e.f(this);
        } catch (Throwable unused) {
        }
    }

    public final qy9 d() {
        qy9 d2 = super.d();
        if (d2 != null) {
            return d2;
        }
        rx rxVar = this.f;
        if (rxVar != null) {
            return rxVar;
        }
        this.f = new rx();
        this.e.d(this);
        l20 l20 = this.a;
        s10 s10 = l20.j;
        long j = s10.a;
        k4a k4a = (k4a) this.c;
        this.g = ome.d(k4a.z(), new wg5(s10.c, l20.r, ((p7b) k4a.y()).a.o(), j, 0), false, 0, 12);
        return this.f;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [one, java.lang.Object] */
    @uae
    public void onEvent(ah5 ah5) {
        if (this.g == ah5.a) {
            ? obj = new Object();
            l20 l20 = this.a;
            obj.b = l20.r;
            s10 s10 = l20.j;
            obj.j = s10.a;
            obj.k = s10.c;
            obj.g = ah5.b;
            obj.h = true;
            pne pne = new pne(obj);
            this.h = pne.o;
            this.d.a(pne);
        }
    }

    @uae
    public void onEvent(oi0 oi0) {
        if (this.g == oi0.a) {
            b(this.f, new Exception(oi0.b.b));
            try {
                this.e.f(this);
            } catch (Throwable unused) {
            }
        }
    }

    @uae
    public void onEvent(hn4 hn4) {
        if (this.h == hn4.a) {
            b(this.f, new Exception("DownloadErrorEvent"));
            try {
                this.e.f(this);
            } catch (Throwable unused) {
            }
        }
    }

    @uae
    public void onEvent(fn4 fn4) {
        if (this.h == fn4.a) {
            c(this.f, new File(fn4.c));
        }
    }
}
