package defpackage;

import java.nio.ByteBuffer;

/* renamed from: lhe  reason: default package */
public final class lhe implements m60 {
    public final Object b;
    public final vud c = new vud();

    public lhe(Object obj) {
        this.b = obj;
    }

    public final ByteBuffer a() {
        ByteBuffer a;
        synchronized (this.b) {
            a = this.c.a();
        }
        return a;
    }

    public final void b(ByteBuffer byteBuffer) {
        synchronized (this.b) {
            this.c.b(byteBuffer);
        }
    }

    public final void c() {
        synchronized (this.b) {
            this.c.c();
        }
    }

    public final boolean d() {
        boolean d;
        synchronized (this.b) {
            d = this.c.d();
        }
        return d;
    }

    public final j60 e(j60 j60) {
        j60 e;
        synchronized (this.b) {
            e = this.c.e(j60);
        }
        return e;
    }

    public final long f(long j) {
        long g;
        synchronized (this.b) {
            g = this.c.g(j);
        }
        return g;
    }

    public final void flush() {
        synchronized (this.b) {
            this.c.flush();
        }
    }

    public final boolean isActive() {
        boolean isActive;
        synchronized (this.b) {
            isActive = this.c.isActive();
        }
        return isActive;
    }

    public final void reset() {
        synchronized (this.b) {
            this.c.reset();
        }
    }
}
