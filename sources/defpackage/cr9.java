package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: cr9  reason: default package */
public abstract class cr9 {
    public final sx3 a;
    public final je7 b;
    public x77 c;
    public a66 d;

    public cr9(sx3 sx3, je7 je7) {
        this.a = sx3;
        this.b = je7;
    }

    public final void a() {
        x77 x77 = this.c;
        if (x77 != null) {
            x77.cancel((CancellationException) null);
        }
        this.c = null;
        ar9 ar9 = (ar9) this;
        ReentrantLock reentrantLock = ar9.f;
        reentrantLock.lock();
        try {
            ar9.e.c();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long b() {
        int i = ft4.o;
        z7d z7d = ((p7b) ((m7b) this.b.getValue())).b;
        z7d.getClass();
        return z7.S(z7d.q(PmsKey.f97noncontactcollectioninterval, TimeUnit.SECONDS.toMillis(10)), kt4.MILLISECONDS);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(defpackage.gi9 r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.br9
            if (r0 == 0) goto L_0x0013
            r0 = r11
            br9 r0 = (defpackage.br9) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            br9 r0 = new br9
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            e5f r3 = defpackage.e5f.a
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r5) goto L_0x0030
            cr9 r9 = r0.o
            defpackage.od2.a0(r11)     // Catch:{ Error -> 0x002e, all -> 0x002c }
            goto L_0x0090
        L_0x002c:
            r10 = move-exception
            goto L_0x0075
        L_0x002e:
            r9 = move-exception
            goto L_0x0091
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0038:
            defpackage.od2.a0(r11)
            java.lang.Class r11 = r9.getClass()
            java.lang.String r11 = r11.getName()
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L_0x0048
            goto L_0x005f
        L_0x0048:
            boolean r6 = r2.c()
            if (r6 == 0) goto L_0x005f
            us7 r6 = defpackage.us7.X
            r7 = 31
            java.lang.String r7 = defpackage.gi9.k(r10, r4, r4, r7)
            java.lang.String r8 = "request ids "
            java.lang.String r7 = r8.concat(r7)
            r2.d(r6, r11, r7, r4)
        L_0x005f:
            boolean r11 = r10.i()
            if (r11 == 0) goto L_0x0066
            return r3
        L_0x0066:
            a66 r11 = r9.d     // Catch:{ Error -> 0x002e, all -> 0x002c }
            if (r11 == 0) goto L_0x0090
            r0.o = r9     // Catch:{ Error -> 0x002e, all -> 0x002c }
            r0.Z = r5     // Catch:{ Error -> 0x002e, all -> 0x002c }
            java.lang.Object r9 = r11.invoke(r10, r0)     // Catch:{ Error -> 0x002e, all -> 0x002c }
            if (r9 != r1) goto L_0x0090
            return r1
        L_0x0075:
            r9.a()
            boolean r10 = r10 instanceof java.util.concurrent.CancellationException
            if (r10 == 0) goto L_0x007d
            return r3
        L_0x007d:
            ar9 r9 = (defpackage.ar9) r9
            r9.a()
            zq9 r10 = new zq9
            r10.<init>(r9, r4)
            r11 = 3
            sx3 r0 = r9.a
            vxd r10 = defpackage.j47.T(r0, r4, r4, r10, r11)
            r9.c = r10
        L_0x0090:
            return r3
        L_0x0091:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cr9.c(gi9, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
