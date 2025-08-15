package defpackage;

import android.content.Context;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: kf4  reason: default package */
public final class kf4 implements jd6 {
    public final o9g a;
    public final id6 b;
    public final va8 c;
    public final crd d;
    public final bkb e;
    public final nx0 f;
    public final SparseArray g = new SparseArray();
    public boolean h;
    public final er0 i;
    public final uy j;
    public final uy k;
    public i63 l;
    public EGLDisplay m;
    public EGLSurface n;
    public int o = -1;

    public kf4(Context context, va8 va8, crd crd, ScheduledExecutorService scheduledExecutorService, o9g o9g, sg9 sg9) {
        ExecutorService executorService;
        this.a = o9g;
        this.b = sg9;
        this.c = va8;
        this.d = crd;
        this.e = new bkb(context);
        boolean z = true;
        this.i = new er0(false, 1);
        this.j = new uy(1);
        this.k = new uy(1);
        z = scheduledExecutorService != null ? false : z;
        if (z) {
            int i2 = oaf.a;
            executorService = Executors.newSingleThreadExecutor(new pd3(2, "Effect:DefaultVideoCompositor:GlThread"));
        } else {
            scheduledExecutorService.getClass();
            executorService = scheduledExecutorService;
        }
        nx0 nx0 = new nx0(executorService, z, (wff) new q64(5, (Object) o9g));
        this.f = nx0;
        nx0.v(new ff4(this, 0));
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [ww6, pw6] */
    public final synchronized ffc a() {
        if (this.i.f() == 0) {
            ls5 ls5 = zw6.b;
            return ffc.X;
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            if (((jf4) this.g.valueAt(i2)).a.isEmpty()) {
                ls5 ls52 = zw6.b;
                return ffc.X;
            }
        }
        ? pw6 = new pw6(4);
        if4 if4 = (if4) ((jf4) this.g.get(this.o)).a.element();
        pw6.a(if4);
        for (int i3 = 0; i3 < this.g.size(); i3++) {
            if (this.g.keyAt(i3) != this.o) {
                jf4 jf4 = (jf4) this.g.valueAt(i3);
                if (jf4.a.size() != 1 || jf4.b) {
                    Iterator it = jf4.a.iterator();
                    long j2 = Long.MAX_VALUE;
                    if4 if42 = null;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if4 if43 = (if4) it.next();
                        long j3 = if43.c;
                        long abs = Math.abs(j3 - if4.c);
                        if (abs < j2) {
                            if42 = if43;
                            j2 = abs;
                        }
                        if (j3 > if4.c || (!it.hasNext() && jf4.b)) {
                            if42.getClass();
                            pw6.a(if42);
                        }
                    }
                    if42.getClass();
                    pw6.a(if42);
                } else {
                    ls5 ls53 = zw6.b;
                    return ffc.X;
                }
            }
        }
        ffc j4 = pw6.j();
        if (j4.o == this.g.size()) {
            return j4;
        }
        return ffc.X;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0096, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b() {
        /*
            r7 = this;
            monitor-enter(r7)
            ffc r0 = r7.a()     // Catch:{ all -> 0x0038 }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x000d
            monitor-exit(r7)
            return
        L_0x000d:
            int r1 = r7.o     // Catch:{ all -> 0x0038 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x0038 }
            if4 r1 = (defpackage.if4) r1     // Catch:{ all -> 0x0038 }
            ww6 r2 = new ww6     // Catch:{ all -> 0x0038 }
            r2.<init>()     // Catch:{ all -> 0x0038 }
            r3 = 0
        L_0x001b:
            int r4 = r0.size()     // Catch:{ all -> 0x0038 }
            if (r3 >= r4) goto L_0x003a
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x0038 }
            if4 r4 = (defpackage.if4) r4     // Catch:{ all -> 0x0038 }
            hd6 r4 = r4.b     // Catch:{ all -> 0x0038 }
            lsd r5 = new lsd     // Catch:{ all -> 0x0038 }
            int r6 = r4.c     // Catch:{ all -> 0x0038 }
            int r4 = r4.d     // Catch:{ all -> 0x0038 }
            r5.<init>(r6, r4)     // Catch:{ all -> 0x0038 }
            r2.d(r5)     // Catch:{ all -> 0x0038 }
            int r3 = r3 + 1
            goto L_0x001b
        L_0x0038:
            r0 = move-exception
            goto L_0x0097
        L_0x003a:
            crd r3 = r7.d     // Catch:{ all -> 0x0038 }
            ffc r2 = r2.j()     // Catch:{ all -> 0x0038 }
            lsd r2 = r3.j(r2)     // Catch:{ all -> 0x0038 }
            er0 r3 = r7.i     // Catch:{ all -> 0x0038 }
            va8 r4 = r7.c     // Catch:{ all -> 0x0038 }
            int r5 = r2.b()     // Catch:{ all -> 0x0038 }
            int r2 = r2.a()     // Catch:{ all -> 0x0038 }
            r3.e(r4, r5, r2)     // Catch:{ all -> 0x0038 }
            er0 r2 = r7.i     // Catch:{ all -> 0x0038 }
            hd6 r2 = r2.h()     // Catch:{ all -> 0x0038 }
            long r3 = r1.c     // Catch:{ all -> 0x0038 }
            uy r1 = r7.j     // Catch:{ all -> 0x0038 }
            r1.e(r3)     // Catch:{ all -> 0x0038 }
            bkb r1 = r7.e     // Catch:{ all -> 0x0038 }
            r1.q(r0, r2)     // Catch:{ all -> 0x0038 }
            long r0 = defpackage.mr0.p()     // Catch:{ all -> 0x0038 }
            uy r5 = r7.k     // Catch:{ all -> 0x0038 }
            r5.e(r0)     // Catch:{ all -> 0x0038 }
            id6 r0 = r7.b     // Catch:{ all -> 0x0038 }
            r0.a(r7, r2, r3)     // Catch:{ all -> 0x0038 }
            android.util.SparseArray r0 = r7.g     // Catch:{ all -> 0x0038 }
            int r1 = r7.o     // Catch:{ all -> 0x0038 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0038 }
            jf4 r0 = (defpackage.jf4) r0     // Catch:{ all -> 0x0038 }
            r1 = 1
            r7.f(r0, r1)     // Catch:{ all -> 0x0038 }
            r7.d()     // Catch:{ all -> 0x0038 }
            boolean r1 = r7.h     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x0095
            java.util.ArrayDeque r0 = r0.a     // Catch:{ all -> 0x0038 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0095
            o9g r0 = r7.a     // Catch:{ all -> 0x0038 }
            r0.z()     // Catch:{ all -> 0x0038 }
        L_0x0095:
            monitor-exit(r7)
            return
        L_0x0097:
            monitor-exit(r7)     // Catch:{ all -> 0x0038 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kf4.b():void");
    }

    public final void c(long j2) {
        this.f.v(new gf4(this, j2, 0));
    }

    public final synchronized void d() {
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            if (this.g.keyAt(i2) != this.o) {
                e((jf4) this.g.valueAt(i2));
            }
        }
    }

    public final synchronized void e(jf4 jf4) {
        int i2;
        jf4 jf42 = (jf4) this.g.get(this.o);
        if (!jf42.a.isEmpty() || !jf42.b) {
            if4 if4 = (if4) jf42.a.peek();
            long j2 = if4 != null ? if4.c : -9223372036854775807L;
            ArrayDeque arrayDeque = jf4.a;
            hf4 hf4 = new hf4(j2);
            arrayDeque.getClass();
            k77 k77 = new k77(arrayDeque, hf4);
            if (k77 instanceof Collection) {
                i2 = ((Collection) k77).size();
            } else {
                Iterator it = k77.iterator();
                long j3 = 0;
                while (true) {
                    p1 p1Var = (p1) it;
                    if (!p1Var.hasNext()) {
                        break;
                    }
                    p1Var.next();
                    j3++;
                }
                i2 = s5c.Y(j3);
            }
            f(jf4, Math.max(i2 - 1, 0));
            return;
        }
        f(jf4, jf4.a.size());
    }

    public final synchronized void f(jf4 jf4, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if4 if4 = (if4) jf4.a.remove();
            if4.a.c(if4.c);
        }
    }
}
