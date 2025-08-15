package defpackage;

import java.io.File;
import java.util.Map;

/* renamed from: ycf  reason: default package */
public final class ycf extends lz {
    public final pk c;
    public final q33 d;
    public final rf5 e;
    public final av0 f;
    public rx g;
    public long h;
    public long i;

    public ycf(l20 l20, pk pkVar, q33 q33, rf5 rf5, av0 av0) {
        super(l20);
        this.c = pkVar;
        this.d = q33;
        this.e = rf5;
        this.f = av0;
    }

    public final void a() {
        this.h = 0;
        this.i = 0;
        b(this.g, new Throwable("cancelled"));
        e();
    }

    public final void c(rx rxVar, File file) {
        super.c(rxVar, file);
        e();
    }

    public final qy9 d() {
        qy9 d2 = super.d();
        if (d2 != null) {
            return d2;
        }
        rx rxVar = this.g;
        if (rxVar != null) {
            return rxVar;
        }
        this.g = new rx();
        this.f.d(this);
        l20 l20 = this.a;
        k20 k20 = l20.d;
        this.h = ((k4a) this.c).L(false, k20.a, 0, 0, 0, l20.r, false, true, k20.m);
        return this.g;
    }

    public final void e() {
        try {
            this.f.f(this);
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [one, java.lang.Object] */
    @uae
    public void onEvent(akf akf) {
        if (this.h == akf.a) {
            Map map = akf.b;
            if (map == null) {
                b(this.g, new Exception("uris empty"));
                e();
            } else if (f46.H(map) != null) {
                String H = f46.H(map);
                if (oag.t(H)) {
                    b(this.g, new Exception("download url not found"));
                    e();
                    return;
                }
                this.i = ((hyc) this.d).o();
                ? obj = new Object();
                obj.b = this.a.r;
                obj.c = akf.c;
                obj.g = H;
                obj.h = true;
                obj.n = true;
                this.e.a(new pne(obj));
            } else {
                b(this.g, new Exception("download url not found"));
                e();
            }
        }
    }

    @uae
    public void onEvent(oi0 oi0) {
        if (this.h == oi0.a) {
            b(this.g, new Exception(oi0.b.b));
            e();
        }
    }

    @uae
    public void onEvent(hn4 hn4) {
        if (this.i == hn4.a) {
            b(this.g, new Exception("DownloadErrorEvent"));
            e();
        }
    }

    @uae
    public void onEvent(fn4 fn4) {
        if (this.i == fn4.a) {
            c(this.g, new File(fn4.c));
        }
    }
}
