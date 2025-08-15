package defpackage;

import java.util.Queue;

/* renamed from: h9d  reason: default package */
public final class h9d extends g9d {
    public g9d A0;
    public final Queue z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h9d(defpackage.h8d r20) {
        /*
            r19 = this;
            r15 = r19
            r0 = r20
            long r1 = r0.a
            java.lang.Object r3 = r0.m
            r13 = r3
            java.util.Queue r13 = (java.util.Queue) r13
            java.lang.Object r3 = r13.peek()
            g9d r3 = (defpackage.g9d) r3
            bw8 r3 = r3.o
            java.lang.Object r4 = r13.peek()
            g9d r4 = (defpackage.g9d) r4
            z07 r4 = r4.X
            long r5 = r0.d
            boolean r7 = r0.e
            java.lang.Object r8 = r13.peek()
            g9d r8 = (defpackage.g9d) r8
            int r8 = r8.t0
            java.lang.String r9 = r0.h
            java.lang.Object r10 = r13.peek()
            g9d r10 = (defpackage.g9d) r10
            long r10 = r10.v0
            java.lang.Object r12 = r13.peek()
            g9d r12 = (defpackage.g9d) r12
            java.lang.String r12 = r12.w0
            java.lang.Object r14 = r13.peek()
            g9d r14 = (defpackage.g9d) r14
            r16 = r13
            long r13 = r14.x0
            ng4 r0 = r0.k
            r17 = r0
            r0 = r19
            r18 = r16
            r15 = r17
            r0.<init>(r1, r3, r4, r5, r7, r8, r9, r10, r12, r13, r15)
            r3 = r18
            r0.z0 = r3
            java.lang.Object r1 = r3.poll()
            g9d r1 = (defpackage.g9d) r1
            r0.A0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h9d.<init>(h8d):void");
    }

    public final void x() {
        super.x();
        Queue queue = this.z0;
        if (!queue.isEmpty()) {
            h8d h8d = new h8d(this.c, queue, 2);
            h8d.d = this.u0;
            h8d.f = this.x0;
            h8d.e = this.Z;
            h8d.h = this.s0;
            h8d.k = this.y0;
            u().a(new h9d(h8d));
        }
    }

    public final bu8 y() {
        g9d g9d = this.A0;
        g9d.a = this.a;
        bu8 y = g9d.y();
        y.H = this.A0.y0;
        return y;
    }

    public final long z(long j, e52 e52) {
        g9d g9d = this.A0;
        g9d.a = this.a;
        boolean z = g9d instanceof m9d;
        ng4 ng4 = this.y0;
        String str = this.w0;
        long j2 = this.v0;
        long j3 = e52.a;
        if (z) {
            m9d m9d = (m9d) g9d;
            l9d l9d = new l9d(j3, (o2) m9d.B0.get(0));
            l9d.p = m9d.D0;
            l9d.m = m9d.z0;
            l9d.n = m9d.A0;
            l9d.b = m9d.o;
            l9d.c = m9d.X;
            l9d.e = m9d.Z;
            l9d.o = m9d.C0;
            l9d.h = m9d.s0;
            l9d.d = m9d.Y;
            l9d.i = j2;
            l9d.j = str;
            l9d.g = m9d.t0;
            l9d.f = m9d.x0;
            l9d.k = ng4;
            e9d b = l9d.b();
            this.A0 = b;
            b.a = this.a;
            return b.z(j, e52);
        } else if (g9d instanceof e9d) {
            e9d e9d = (e9d) g9d;
            d9d d9d = new d9d(j3, e9d.B0);
            d9d.m = e9d.z0;
            d9d.n = e9d.A0;
            d9d.b = e9d.o;
            d9d.c = e9d.X;
            d9d.e = e9d.Z;
            d9d.o = e9d.C0;
            d9d.h = e9d.s0;
            d9d.d = e9d.Y;
            d9d.i = j2;
            d9d.j = str;
            d9d.g = e9d.t0;
            d9d.f = e9d.x0;
            d9d.k = ng4;
            e9d e9d2 = new e9d(d9d);
            this.A0 = e9d2;
            e9d2.a = this.a;
            return e9d2.z(j, e52);
        } else if (!(g9d instanceof j9d)) {
            return super.z(j, e52);
        } else {
            j9d j9d = (j9d) g9d;
            i9d i9d = new i9d(j3, j9d.z0, j9d.A0);
            i9d.b = j9d.o;
            i9d.c = j9d.X;
            i9d.e = j9d.Z;
            i9d.h = j9d.s0;
            i9d.d = j9d.Y;
            i9d.i = j2;
            i9d.j = str;
            i9d.g = j9d.t0;
            i9d.n = j9d.B0;
            i9d.f = j9d.x0;
            i9d.k = ng4;
            j9d j9d2 = new j9d(i9d);
            this.A0 = j9d2;
            j9d2.a = this.a;
            return j9d2.z(j, e52);
        }
    }
}
