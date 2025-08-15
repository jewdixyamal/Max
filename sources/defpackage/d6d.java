package defpackage;

import android.graphics.Bitmap;
import android.view.Surface;

/* renamed from: d6d  reason: default package */
public final class d6d implements wqc {
    public final wqc a;
    public final int b;
    public long c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ e6d f;

    public d6d(e6d e6d, wqc wqc, int i) {
        this.f = e6d;
        this.a = wqc;
        this.b = i;
    }

    public final Surface a() {
        return this.a.a();
    }

    public final int c() {
        return this.a.c();
    }

    public final p54 d() {
        return this.a.d();
    }

    public final void e() {
        e6d e6d = this.f;
        e6d.l.decrementAndGet();
        if (e6d.b ? this.e : e6d.n == e6d.a.size() - 1) {
            this.a.e();
        } else if (e6d.l.get() == 0) {
            e6d.g.d(new u3c(12, this));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f() {
        /*
            r7 = this;
            wqc r0 = r7.a
            p54 r0 = r0.d()
            defpackage.fm9.l(r0)
            long r1 = r7.c
            long r3 = r0.Z
            long r1 = r1 + r3
            e6d r3 = r7.f
            boolean r4 = r3.b
            r5 = 4
            r6 = 1
            if (r4 == 0) goto L_0x0048
            long r3 = r3.x
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0020
            boolean r1 = r7.d
            if (r1 == 0) goto L_0x0048
        L_0x0020:
            e6d r1 = r7.f
            boolean r1 = r1.y
            r2 = 0
            if (r1 == 0) goto L_0x0047
            boolean r1 = r7.d
            if (r1 != 0) goto L_0x0047
            java.nio.ByteBuffer r1 = r0.X
            r1.getClass()
            r1.limit(r2)
            r0.b = r5
            wqc r0 = r7.a
            boolean r0 = r0.f()
            defpackage.fm9.k(r0)
            r7.d = r6
            e6d r7 = r7.f
            java.util.concurrent.atomic.AtomicInteger r7 = r7.l
            r7.decrementAndGet()
        L_0x0047:
            return r2
        L_0x0048:
            boolean r1 = r0.f(r5)
            if (r1 == 0) goto L_0x00a0
            e6d r1 = r7.f
            java.util.concurrent.atomic.AtomicInteger r1 = r1.l
            r1.decrementAndGet()
            e6d r1 = r7.f
            int r2 = r1.n
            zw6 r1 = r1.a
            int r1 = r1.size()
            int r1 = r1 - r6
            if (r2 < r1) goto L_0x0068
            e6d r1 = r7.f
            boolean r1 = r1.b
            if (r1 == 0) goto L_0x00a0
        L_0x0068:
            int r1 = r7.b
            if (r1 != r6) goto L_0x0080
            e6d r1 = r7.f
            boolean r2 = r1.b
            if (r2 != 0) goto L_0x0080
            boolean r1 = r1.q
            if (r1 == 0) goto L_0x0080
            wqc r0 = r7.a
            boolean r0 = r0.f()
            defpackage.fm9.k(r0)
            goto L_0x0087
        L_0x0080:
            r0.v()
            r1 = 0
            r0.Z = r1
        L_0x0087:
            e6d r0 = r7.f
            java.util.concurrent.atomic.AtomicInteger r0 = r0.l
            int r0 = r0.get()
            if (r0 != 0) goto L_0x009f
            e6d r0 = r7.f
            bie r0 = r0.g
            u3c r1 = new u3c
            r2 = 12
            r1.<init>(r2, r7)
            r0.d(r1)
        L_0x009f:
            return r6
        L_0x00a0:
            wqc r7 = r7.a
            boolean r7 = r7.f()
            defpackage.fm9.k(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d6d.f():boolean");
    }

    public final int g(Bitmap bitmap, uue uue) {
        if (this.f.b) {
            long j = -9223372036854775807L;
            while (true) {
                if (!uue.hasNext()) {
                    break;
                }
                long next = uue.next();
                if (this.c + next <= this.f.x) {
                    j = next;
                } else if (!this.f.y) {
                    return 2;
                } else {
                    if (j != -9223372036854775807L) {
                        p44 p44 = new p44(uue.a(), j);
                        this.e = true;
                        uue = p44;
                    } else if (this.e) {
                        return 2;
                    } else {
                        this.e = true;
                        e();
                        return 3;
                    }
                }
            }
        }
        return this.a.g(bitmap, uue.a());
    }

    public final boolean h(long j) {
        long j2 = this.c + j;
        e6d e6d = this.f;
        if (!e6d.b || j2 < e6d.x) {
            return this.a.h(j);
        }
        if (!this.f.y || this.e) {
            return false;
        }
        this.e = true;
        e();
        return false;
    }
}
