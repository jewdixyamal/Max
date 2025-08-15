package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: o44  reason: default package */
public final class o44 {
    public static final /* synthetic */ bc7[] j;
    public static final String k;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final w4d e = mqd.D();
    public final ContextScope f;
    public f44 g;
    public long h;
    public final AtomicInteger i;

    static {
        Class<o44> cls = o44.class;
        oi9 oi9 = new oi9(cls, "notifyJob", "getNotifyJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        j = new bc7[]{oi9};
        k = cls.getName();
    }

    public o44(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        this.d = je74;
        this.f = j1e.a(((w9a) ((kke) je75.getValue())).a().limitedParallelism(1, "notifs"));
        this.g = f44.f;
        this.i = new AtomicInteger(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.o44 r21, defpackage.f44 r22, kotlin.coroutines.Continuation r23) {
        /*
            r0 = r21
            r1 = r22
            r2 = r23
            boolean r3 = r2 instanceof defpackage.k44
            if (r3 == 0) goto L_0x0019
            r3 = r2
            k44 r3 = (defpackage.k44) r3
            int r4 = r3.Z
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.Z = r4
            goto L_0x001e
        L_0x0019:
            k44 r3 = new k44
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.X
            tx3 r4 = defpackage.tx3.a
            int r5 = r3.Z
            e5f r6 = defpackage.e5f.a
            bc7[] r7 = j
            r8 = 0
            r9 = 0
            r10 = 1
            if (r5 == 0) goto L_0x003e
            if (r5 != r10) goto L_0x0036
            o44 r0 = r3.o
            defpackage.od2.a0(r2)
            goto L_0x00c4
        L_0x0036:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003e:
            defpackage.od2.a0(r2)
            je7 r2 = r0.c
            java.lang.Object r2 = r2.getValue()
            ri4 r2 = (defpackage.ri4) r2
            r2.getClass()
            long r11 = android.os.SystemClock.elapsedRealtime()
            long r13 = r0.h
            long r11 = r11 - r13
            r13 = 2000(0x7d0, double:9.88E-321)
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 >= 0) goto L_0x00b9
            boolean r2 = r1.b
            if (r2 == 0) goto L_0x005e
            goto L_0x00b9
        L_0x005e:
            java.lang.Object[] r2 = new java.lang.Object[]{r22}
            java.lang.String r3 = k
            java.lang.String r4 = "notifyOrDelay: delay, params = %s"
            defpackage.hm9.m(r3, r4, r2)
            f44 r2 = r0.g
            f44 r3 = new f44
            gi9 r4 = r2.e
            gi9 r5 = r1.e
            r4.b(r5)
            boolean r5 = r2.c
            if (r5 == 0) goto L_0x007f
            boolean r5 = r1.c
            if (r5 == 0) goto L_0x007f
            r19 = r10
            goto L_0x0081
        L_0x007f:
            r19 = r8
        L_0x0081:
            je5 r1 = r1.d
            if (r1 != 0) goto L_0x0087
            je5 r1 = r2.d
        L_0x0087:
            r20 = r1
            boolean r1 = r2.a
            boolean r2 = r2.b
            r15 = r3
            r16 = r1
            r17 = r2
            r18 = r4
            r15.<init>(r16, r17, r18, r19, r20)
            r0.g = r3
            r1 = r7[r8]
            w4d r2 = r0.e
            java.lang.Object r1 = r2.T0(r0, r1)
            x77 r1 = (defpackage.x77) r1
            if (r1 != 0) goto L_0x00b7
            long r13 = r13 - r11
            l44 r1 = new l44
            r1.<init>(r13, r0, r9)
            r3 = 3
            kotlinx.coroutines.internal.ContextScope r4 = r0.f
            vxd r1 = defpackage.j47.T(r4, r9, r9, r1, r3)
            r3 = r7[r8]
            r2.o1(r0, r3, r1)
        L_0x00b7:
            r4 = r6
            goto L_0x00e1
        L_0x00b9:
            r3.o = r0
            r3.Z = r10
            java.lang.Object r1 = r0.b(r1, r3)
            if (r1 != r4) goto L_0x00c4
            goto L_0x00e1
        L_0x00c4:
            je7 r1 = r0.c
            java.lang.Object r1 = r1.getValue()
            ri4 r1 = (defpackage.ri4) r1
            r1.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            r0.h = r1
            f44 r1 = defpackage.f44.f
            r0.g = r1
            r1 = r7[r8]
            w4d r2 = r0.e
            r2.o1(r0, r1, r9)
            goto L_0x00b7
        L_0x00e1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o44.a(o44, f44, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(defpackage.f44 r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.i44
            if (r0 == 0) goto L_0x0013
            r0 = r13
            i44 r0 = (defpackage.i44) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            i44 r0 = new i44
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            java.lang.String r3 = k
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x004b
            if (r2 == r6) goto L_0x0046
            if (r2 == r5) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            defpackage.od2.a0(r13)
            goto L_0x00ed
        L_0x0030:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0038:
            f44 r12 = r0.X
            o44 r11 = r0.o
        L_0x003c:
            defpackage.od2.a0(r13)     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            goto L_0x00ed
        L_0x0041:
            r13 = move-exception
            goto L_0x0097
        L_0x0043:
            r11 = move-exception
            goto L_0x00f0
        L_0x0046:
            f44 r12 = r0.X
            o44 r11 = r0.o
            goto L_0x003c
        L_0x004b:
            defpackage.od2.a0(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r2 = "dispatch: "
            r13.<init>(r2)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            defpackage.hm9.m(r3, r13, new java.lang.Object[0])
            boolean r13 = r12.c     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            gi9 r2 = r12.e
            je7 r7 = r11.a
            if (r13 == 0) goto L_0x007c
            java.lang.Object r13 = r7.getValue()     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            b79 r13 = (defpackage.b79) r13     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.o = r11     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.X = r12     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.s0 = r6     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            n79 r13 = (defpackage.n79) r13     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            java.lang.Object r11 = r13.i(r0)     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            if (r11 != r1) goto L_0x00ed
            return r1
        L_0x007c:
            boolean r13 = r2.j()     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            if (r13 == 0) goto L_0x00ed
            java.lang.Object r13 = r7.getValue()     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            b79 r13 = (defpackage.b79) r13     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.o = r11     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.X = r12     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.s0 = r5     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            n79 r13 = (defpackage.n79) r13     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            java.lang.Object r11 = r13.j(r2, r0)     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            if (r11 != r1) goto L_0x00ed
            return r1
        L_0x0097:
            boolean r2 = r12.a
            if (r2 != 0) goto L_0x00d5
            boolean r2 = r13 instanceof android.os.FileUriExposedException
            if (r2 == 0) goto L_0x00d5
            java.lang.String r13 = "dispatch: FileUriExposedException, change ringtone uri to default"
            defpackage.hm9.m(r3, r13, new java.lang.Object[0])
            je7 r13 = r11.d
            java.lang.Object r13 = r13.getValue()
            hp r13 = (defpackage.hp) r13
            jp r13 = (defpackage.jp) r13
            java.lang.String r2 = "app.notification.ringtone"
            r3 = 0
            r13.m(r2, r3)
            java.lang.String r2 = "app.notification.chats.ringtone"
            r13.m(r2, r3)
            f44 r13 = new f44
            boolean r9 = r12.c
            je5 r10 = r12.d
            r6 = 1
            boolean r7 = r12.b
            gi9 r8 = r12.e
            r5 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            r0.o = r3
            r0.X = r3
            r0.s0 = r4
            java.lang.Object r11 = r11.b(r13, r0)
            if (r11 != r1) goto L_0x00ed
            return r1
        L_0x00d5:
            r11.getClass()
            java.lang.String r12 = "DebounceNotificationDispatcher"
            java.lang.String r0 = "failure"
            defpackage.hm9.p(r12, r0, r13)
            je7 r11 = r11.b
            java.lang.Object r11 = r11.getValue()
            o45 r11 = (defpackage.o45) r11
            r12 = 0
            cba r11 = (defpackage.cba) r11
            r11.c(r13, r12)
        L_0x00ed:
            e5f r11 = defpackage.e5f.a
            return r11
        L_0x00f0:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o44.b(f44, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void c(m56 m56) {
        j47.T(this.f, (lx3) null, (vx3) null, new j44(this, m56, (Continuation) null), 3);
    }
}
