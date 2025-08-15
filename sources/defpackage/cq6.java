package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: cq6  reason: default package */
public final class cq6 implements zl4, fq6 {
    public final f2a X;
    public final AtomicBoolean Y = new AtomicBoolean();
    public long Z;
    public final je7 a;
    public final String b;
    public final File c;
    public final xtc o;

    public cq6(f2a f2a, khe khe, File file, xtc xtc) {
        this.a = khe;
        this.b = "";
        this.c = file;
        this.o = xtc;
        this.X = f2a;
    }

    public final void a() {
        if (!this.Y.get()) {
            this.o.b(new aq6(this, 1));
        }
    }

    public final void b() {
        if (!this.Y.get()) {
            this.o.b(new aq6(this, 0));
        }
    }

    public final void c(boolean z) {
        if (this.Y.compareAndSet(false, true)) {
            xtc xtc = this.o;
            if (!xtc.h()) {
                xtc.g();
            }
            if (z) {
                hm9.m("dq6", "cancelDownload", new Object[0]);
                ((iq6) this.a.getValue()).a(this.c, (String) null);
            }
        }
    }

    public final void d() {
    }

    public final void e(File file) {
        if (!this.Y.get()) {
            this.o.b(new vs5(this, 3, file));
        }
    }

    public final void f() {
        if (!this.Y.get()) {
            this.o.b(new aq6(this, 2));
        }
    }

    public final void g() {
        c(true);
    }

    public final String getDownloadContext() {
        return this.c.getAbsolutePath();
    }

    public final boolean h() {
        return this.Y.get();
    }

    public final void j(float f, long j) {
        if (!this.Y.get()) {
            this.o.b(new bq6(this, f, j, 0));
        }
    }
}
