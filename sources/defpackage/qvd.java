package defpackage;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* renamed from: qvd  reason: default package */
public final class qvd extends vh0 {
    public final Object i;
    public final xjc j;
    public final lhe k;
    public final uy l = new uy(4, (byte) 0);
    public final ArrayDeque m = new ArrayDeque();
    public nv7 n;
    public nv7 o;
    public long p;
    public long q;
    public long r;
    public float s;
    public long t;
    public boolean u;

    public qvd(xjc xjc) {
        this.j = xjc;
        Object obj = new Object();
        this.i = obj;
        this.k = new lhe(obj);
        n();
    }

    public final ByteBuffer a() {
        ByteBuffer a = m() ? this.k.a() : super.a();
        synchronized (this.i) {
            try {
                if (!this.m.isEmpty()) {
                    if (this.l.f() <= this.p || d()) {
                        au1.r(this.m.remove());
                        l(this.l.h());
                        throw null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a;
    }

    public final void b(ByteBuffer byteBuffer) {
        int i2;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j2 = this.t;
        j60 j60 = this.b;
        long a0 = oaf.a0(j2, 1000000, ((long) j60.a) * ((long) j60.d), RoundingMode.FLOOR);
        float b = this.j.b(a0);
        synchronized (this.i) {
            if (b != this.s) {
                nv7 nv7 = this.o;
                long b2 = nv7.b(nv7.b - 1);
                nv7 nv72 = this.n;
                long b3 = a0 - nv72.b(nv72.b - 1);
                this.n.a(a0);
                nv7 nv73 = this.o;
                if (m()) {
                    lhe lhe = this.k;
                    synchronized (lhe.b) {
                        b3 = lhe.c.g(b3);
                    }
                }
                nv73.a(b3 + b2);
                this.s = b;
                if (m()) {
                    lhe lhe2 = this.k;
                    synchronized (lhe2.b) {
                        vud vud = lhe2.c;
                        if (vud.c != b) {
                            vud.c = b;
                            vud.i = true;
                        }
                    }
                    lhe lhe3 = this.k;
                    synchronized (lhe3.b) {
                        vud vud2 = lhe3.c;
                        if (vud2.d != b) {
                            vud2.d = b;
                            vud2.i = true;
                        }
                    }
                }
                this.k.flush();
                this.u = false;
                super.a();
            }
        }
        int limit = byteBuffer.limit();
        long a = this.j.a(a0);
        if (a != -9223372036854775807L) {
            long j3 = a - a0;
            j60 j602 = this.b;
            i2 = (int) oaf.a0(j3, ((long) j602.a) * ((long) j602.d), 1000000, RoundingMode.CEILING);
            int i3 = this.b.d;
            int i4 = i3 - (i2 % i3);
            if (i4 != i3) {
                i2 += i4;
            }
            byteBuffer2.limit(Math.min(limit, byteBuffer.position() + i2));
        } else {
            i2 = -1;
        }
        long position = (long) byteBuffer.position();
        if (m()) {
            this.k.b(byteBuffer2);
            if (i2 != -1 && ((long) byteBuffer.position()) - position == ((long) i2)) {
                this.k.c();
                this.u = true;
            }
        } else {
            ByteBuffer k2 = k(byteBuffer.remaining());
            if (byteBuffer.hasRemaining()) {
                k2.put(byteBuffer2);
            }
            k2.flip();
        }
        this.t = (((long) byteBuffer.position()) - position) + this.t;
        o();
        byteBuffer2.limit(limit);
    }

    public final boolean d() {
        return super.d() && this.k.d();
    }

    public final long f(long j2) {
        long j3 = 0;
        double d = 0.0d;
        while (j3 < j2) {
            xjc xjc = this.j;
            long a = xjc.a(j3);
            if (a == -9223372036854775807L) {
                a = Long.MAX_VALUE;
            }
            d += ((double) (Math.min(a, j2) - j3)) / ((double) xjc.b(j3));
            j3 = a;
        }
        return Math.round(d);
    }

    public final j60 g(j60 j60) {
        return this.k.e(j60);
    }

    public final void h() {
        n();
        this.k.flush();
    }

    public final void i() {
        if (!this.u) {
            this.k.c();
            this.u = true;
        }
    }

    public final void j() {
        n();
        this.k.reset();
    }

    public final void l(long j2) {
        long j3;
        int i2 = this.n.b - 1;
        while (i2 > 0 && this.n.b(i2) > j2) {
            i2--;
        }
        nv7 nv7 = this.n;
        if (i2 == nv7.b - 1) {
            if (this.q < nv7.b(i2)) {
                this.q = this.n.b(i2);
                this.r = this.o.b(i2);
            }
            j3 = j2 - this.q;
            if (m()) {
                lhe lhe = this.k;
                synchronized (lhe.b) {
                    j3 = lhe.c.g(j3);
                }
            }
        } else {
            int i3 = i2 + 1;
            j3 = Math.round((((double) (this.o.b(i3) - this.o.b(i2))) / ((double) (this.n.b(i3) - this.n.b(i2)))) * ((double) (j2 - this.q)));
        }
        this.q = j2;
        this.r += j3;
    }

    public final boolean m() {
        boolean z;
        synchronized (this.i) {
            z = this.s != 1.0f;
        }
        return z;
    }

    public final void n() {
        synchronized (this.i) {
            nv7 nv7 = new nv7(1);
            this.n = nv7;
            this.o = new nv7(1);
            nv7.a(0);
            this.o.a(0);
            this.p = 0;
            this.q = 0;
            this.r = 0;
            this.s = 1.0f;
        }
        this.t = 0;
        this.u = false;
    }

    public final void o() {
        long j2;
        synchronized (this.i) {
            if (m()) {
                lhe lhe = this.k;
                synchronized (lhe.b) {
                    vud vud = lhe.c;
                    long j3 = vud.n;
                    tud tud = vud.j;
                    tud.getClass();
                    j2 = j3 - ((long) ((tud.l * tud.c) * 2));
                }
                j60 j60 = this.b;
                long a0 = oaf.a0(j2, 1000000, ((long) j60.a) * ((long) j60.d), RoundingMode.FLOOR);
                nv7 nv7 = this.n;
                this.p = nv7.b(nv7.b - 1) + a0;
            } else {
                long j4 = this.t;
                j60 j602 = this.b;
                this.p = oaf.a0(j4, 1000000, ((long) j602.a) * ((long) j602.d), RoundingMode.FLOOR);
            }
        }
    }
}
