package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.my.tracker.obfuscated.d;
import com.my.tracker.obfuscated.p0;

/* renamed from: id0  reason: default package */
public final /* synthetic */ class id0 implements qj3, s0a, lde, km7, x3a {
    public final /* synthetic */ Object a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ id0(ld0 ld0, String str, int i, Context context) {
        this.a = ld0;
        this.o = str;
        this.b = i;
        this.c = context;
    }

    public void a(Object obj) {
        int i = this.b;
        p0 p0Var = (p0) this.a;
        ((d) this.o).a(i, p0Var, (String) this.c, (mp) obj);
    }

    public void accept(Object obj) {
        Throwable th = (Throwable) obj;
        Drawable c2 = ((ld0) this.a).c((Context) this.c);
        int i = this.b;
        c2.setBounds(0, 0, i, i);
        c2.draw((Canvas) this.o);
    }

    public void e(ez9 ez9) {
        ld0 ld0 = (ld0) this.a;
        xv6 d = xv6.d(ld0.b((String) this.o));
        int i = this.b;
        d.d = i <= 0 ? null : new jic(0.0f, i, i, 12);
        d.g = uv6.a;
        d.l = new doa(false);
        g0 a2 = s36.o().a(d.a(), (Object) null);
        a2.m(new kd0(ez9, ld0, (Context) this.c, a2), qq1.a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v43, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: xq2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00f1 A[Catch:{ all -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ff A[Catch:{ all -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0106 A[Catch:{ all -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0108 A[Catch:{ all -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0123 A[Catch:{ all -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0125 A[Catch:{ all -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0128 A[Catch:{ all -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0150 A[Catch:{ all -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0184 A[Catch:{ all -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x018d A[Catch:{ all -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0197 A[Catch:{ all -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x019b A[Catch:{ all -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0244 A[Catch:{ all -> 0x00ad }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object get() {
        /*
            r36 = this;
            r0 = r36
            r1 = 0
            r2 = 15
            java.lang.Object r3 = r0.o
            p82 r3 = (defpackage.p82) r3
            java.lang.Object r4 = r0.a
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r0.c
            java.util.Map r5 = (java.util.Map) r5
            int r0 = r0.b
            r3.getClass()
            long r6 = java.lang.System.currentTimeMillis()
            int r8 = r4.size()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r9 = "storeChatsFromServer: chats.size() = %d"
            java.lang.String r10 = "p82"
            defpackage.hm9.m(r10, r9, r8)
            gi9 r8 = new gi9
            int r9 = r4.size()
            r8.<init>((int) r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            int r11 = r4.size()
            r9.<init>(r11)
            xs r11 = new xs
            r11.<init>((int) r1)
            xs r15 = new xs
            r15.<init>((int) r1)
            xs r14 = new xs
            r14.<init>((int) r1)
            us r13 = new us
            r13.<init>(r1)
            rm4 r12 = r3.l
            java.lang.Object r12 = r12.get()
            c34 r12 = (defpackage.c34) r12
            k24 r12 = (defpackage.k24) r12
            r12.a()
            m7b r12 = r3.n     // Catch:{ all -> 0x00ad }
            p7b r12 = (defpackage.p7b) r12     // Catch:{ all -> 0x00ad }
            z7d r12 = r12.b     // Catch:{ all -> 0x00ad }
            r12.getClass()     // Catch:{ all -> 0x00ad }
            ru.ok.tamtam.android.prefs.PmsKey r1 = ru.ok.tamtam.android.prefs.PmsKey.f26chatspreloadperiod     // Catch:{ all -> 0x00ad }
            r17 = r6
            long r6 = (long) r2     // Catch:{ all -> 0x00ad }
            long r6 = r12.q(r1, r6)     // Catch:{ all -> 0x00ad }
            int r1 = (int) r6     // Catch:{ all -> 0x00ad }
            long r6 = (long) r1     // Catch:{ all -> 0x00ad }
            r19 = 86400000(0x5265c00, double:4.2687272E-316)
            long r6 = r6 * r19
            m7b r1 = r3.n     // Catch:{ all -> 0x00ad }
            p7b r1 = (defpackage.p7b) r1     // Catch:{ all -> 0x00ad }
            t33 r1 = r1.a     // Catch:{ all -> 0x00ad }
            long r19 = r1.n()     // Catch:{ all -> 0x00ad }
            java.util.Iterator r1 = r4.iterator()     // Catch:{ all -> 0x00ad }
            r21 = 0
            r23 = r21
        L_0x008b:
            boolean r12 = r1.hasNext()     // Catch:{ all -> 0x00ad }
            if (r12 == 0) goto L_0x0257
            java.lang.Object r12 = r1.next()     // Catch:{ all -> 0x00ad }
            f52 r12 = (defpackage.f52) r12     // Catch:{ all -> 0x00ad }
            if (r12 != 0) goto L_0x00b0
            java.lang.String r12 = "storeChatsFromServer: chatFromServer is null!"
            r25 = r1
            r2 = 0
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x00ad }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)     // Catch:{ all -> 0x00ad }
            r2 = 0
            defpackage.hm9.k0(r10, r2, r12, r1)     // Catch:{ all -> 0x00ad }
            r1 = r25
        L_0x00aa:
            r2 = 15
            goto L_0x008b
        L_0x00ad:
            r0 = move-exception
            goto L_0x0358
        L_0x00b0:
            r25 = r1
            ir6 r1 = defpackage.hm9.m     // Catch:{ all -> 0x00ad }
            if (r1 != 0) goto L_0x00bd
        L_0x00b6:
            r26 = r4
            r28 = r6
            r27 = r13
            goto L_0x00ef
        L_0x00bd:
            boolean r2 = r1.c()     // Catch:{ all -> 0x00ad }
            if (r2 != 0) goto L_0x00c4
            goto L_0x00b6
        L_0x00c4:
            us7 r2 = defpackage.us7.X     // Catch:{ all -> 0x00ad }
            r26 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ad }
            r27 = r13
            java.lang.String r13 = "storeChatsFromServer: Chat("
            r4.<init>(r13)     // Catch:{ all -> 0x00ad }
            r28 = r6
            long r6 = r12.a     // Catch:{ all -> 0x00ad }
            r4.append(r6)     // Catch:{ all -> 0x00ad }
            java.lang.String r6 = ","
            r4.append(r6)     // Catch:{ all -> 0x00ad }
            int r6 = r12.w0     // Catch:{ all -> 0x00ad }
            r4.append(r6)     // Catch:{ all -> 0x00ad }
            java.lang.String r6 = ")"
            r4.append(r6)     // Catch:{ all -> 0x00ad }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00ad }
            r6 = 0
            r1.d(r2, r10, r4, r6)     // Catch:{ all -> 0x00ad }
        L_0x00ef:
            if (r5 == 0) goto L_0x00ff
            long r1 = r12.a     // Catch:{ all -> 0x00ad }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x00ad }
            java.lang.Object r1 = r5.get(r1)     // Catch:{ all -> 0x00ad }
            r2 = r1
            xq2 r2 = (defpackage.xq2) r2     // Catch:{ all -> 0x00ad }
            goto L_0x0100
        L_0x00ff:
            r2 = 0
        L_0x0100:
            int r1 = r12.X0     // Catch:{ all -> 0x00ad }
            r4 = 2
            r6 = 1
            if (r1 != r4) goto L_0x0108
            r1 = r6
            goto L_0x0109
        L_0x0108:
            r1 = 0
        L_0x0109:
            if (r1 == 0) goto L_0x0125
            java.util.Map r1 = r12.o     // Catch:{ all -> 0x00ad }
            int r1 = r1.size()     // Catch:{ all -> 0x00ad }
            if (r1 != r6) goto L_0x0125
            java.util.Map r1 = r12.o     // Catch:{ all -> 0x00ad }
            long r30 = r3.K()     // Catch:{ all -> 0x00ad }
            java.lang.Long r7 = java.lang.Long.valueOf(r30)     // Catch:{ all -> 0x00ad }
            boolean r1 = r1.containsKey(r7)     // Catch:{ all -> 0x00ad }
            if (r1 == 0) goto L_0x0125
            r1 = r6
            goto L_0x0126
        L_0x0125:
            r1 = 0
        L_0x0126:
            if (r1 == 0) goto L_0x0150
            e52 r4 = r3.a     // Catch:{ all -> 0x00ad }
            if (r4 != 0) goto L_0x013b
            b82 r4 = new b82     // Catch:{ all -> 0x00ad }
            r7 = 0
            r4.<init>(r3, r7)     // Catch:{ all -> 0x00ad }
            java.lang.String r6 = "create-saved-messages"
            java.lang.Object r4 = r3.e0(r6, r4)     // Catch:{ all -> 0x00ad }
            e52 r4 = (defpackage.e52) r4     // Catch:{ all -> 0x00ad }
            goto L_0x013c
        L_0x013b:
            r7 = 0
        L_0x013c:
            java.util.concurrent.ConcurrentHashMap r4 = r3.d     // Catch:{ all -> 0x00ad }
            e52 r6 = r3.a     // Catch:{ all -> 0x00ad }
            r30 = r8
            long r7 = r6.a     // Catch:{ all -> 0x00ad }
            java.lang.Long r6 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x00ad }
            java.lang.Object r4 = r4.get(r6)     // Catch:{ all -> 0x00ad }
            l92 r4 = (defpackage.l92) r4     // Catch:{ all -> 0x00ad }
            r8 = r5
            goto L_0x0182
        L_0x0150:
            r30 = r8
            rm4 r7 = r3.l     // Catch:{ all -> 0x00ad }
            java.lang.Object r7 = r7.get()     // Catch:{ all -> 0x00ad }
            c34 r7 = (defpackage.c34) r7     // Catch:{ all -> 0x00ad }
            k24 r7 = (defpackage.k24) r7     // Catch:{ all -> 0x00ad }
            elc r7 = r7.b     // Catch:{ all -> 0x00ad }
            r8 = r5
            long r4 = r12.a     // Catch:{ all -> 0x00ad }
            l92 r4 = r7.f(r4)     // Catch:{ all -> 0x00ad }
            if (r4 != 0) goto L_0x0182
            int r5 = r12.X0     // Catch:{ all -> 0x00ad }
            r7 = 2
            if (r5 != r7) goto L_0x016d
            goto L_0x016e
        L_0x016d:
            r6 = 0
        L_0x016e:
            if (r6 == 0) goto L_0x0182
            rm4 r4 = r3.l     // Catch:{ all -> 0x00ad }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x00ad }
            c34 r4 = (defpackage.c34) r4     // Catch:{ all -> 0x00ad }
            k24 r4 = (defpackage.k24) r4     // Catch:{ all -> 0x00ad }
            elc r4 = r4.b     // Catch:{ all -> 0x00ad }
            long r5 = r12.u0     // Catch:{ all -> 0x00ad }
            l92 r4 = r4.g(r5)     // Catch:{ all -> 0x00ad }
        L_0x0182:
            if (r4 == 0) goto L_0x018d
            k92 r4 = r4.c     // Catch:{ all -> 0x00ad }
            long r5 = r4.p0     // Catch:{ all -> 0x00ad }
            r32 = r5
            long r4 = r4.q0     // Catch:{ all -> 0x00ad }
            goto L_0x0191
        L_0x018d:
            r4 = r21
            r32 = r4
        L_0x0191:
            e52 r2 = r3.b0(r12, r2)     // Catch:{ all -> 0x00ad }
            if (r1 == 0) goto L_0x0199
            r3.a = r2     // Catch:{ all -> 0x00ad }
        L_0x0199:
            if (r2 == 0) goto L_0x0244
            long r6 = r12.V0     // Catch:{ all -> 0x00ad }
            r13 = r0
            long r0 = r12.W0     // Catch:{ all -> 0x00ad }
            int r6 = (r6 > r32 ? 1 : (r6 == r32 ? 0 : -1))
            if (r6 != 0) goto L_0x01a8
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01b1
        L_0x01a8:
            long r0 = r2.a     // Catch:{ all -> 0x00ad }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00ad }
            r14.add(r0)     // Catch:{ all -> 0x00ad }
        L_0x01b1:
            long r0 = r12.v0     // Catch:{ all -> 0x00ad }
            java.util.Map r4 = r12.o     // Catch:{ all -> 0x00ad }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x00ad }
            if (r4 != 0) goto L_0x01cf
            java.util.Map r4 = r12.o     // Catch:{ all -> 0x00ad }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x00ad }
            java.lang.Object r4 = java.util.Collections.max(r4)     // Catch:{ all -> 0x00ad }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ all -> 0x00ad }
            long r4 = r4.longValue()     // Catch:{ all -> 0x00ad }
            long r0 = java.lang.Math.max(r0, r4)     // Catch:{ all -> 0x00ad }
        L_0x01cf:
            r34 = r0
            r0 = r23
            r23 = r34
            int r4 = (r23 > r0 ? 1 : (r23 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x01da
            goto L_0x01dc
        L_0x01da:
            r23 = r0
        L_0x01dc:
            long r0 = r2.a     // Catch:{ all -> 0x00ad }
            r4 = r30
            r4.a(r0)     // Catch:{ all -> 0x00ad }
            r9.add(r2)     // Catch:{ all -> 0x00ad }
            k92 r0 = r2.b     // Catch:{ all -> 0x00ad }
            long r0 = r0.a     // Catch:{ all -> 0x00ad }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00ad }
            r11.add(r0)     // Catch:{ all -> 0x00ad }
            rm4 r0 = r3.w     // Catch:{ all -> 0x00ad }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00ad }
            s8g r0 = (defpackage.s8g) r0     // Catch:{ all -> 0x00ad }
            long r5 = r2.a     // Catch:{ all -> 0x00ad }
            s9d r1 = new s9d     // Catch:{ all -> 0x00ad }
            r1.<init>(r5)     // Catch:{ all -> 0x00ad }
            r0.a(r1)     // Catch:{ all -> 0x00ad }
            boolean r0 = r2.h0()     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x021e
            boolean r0 = r2.e0()     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x021e
            int r0 = r15.c     // Catch:{ all -> 0x00ad }
            if (r0 < r13) goto L_0x0221
            k92 r0 = r2.b     // Catch:{ all -> 0x00ad }
            long r0 = r0.k     // Catch:{ all -> 0x00ad }
            long r0 = r19 - r0
            int r0 = (r0 > r28 ? 1 : (r0 == r28 ? 0 : -1))
            if (r0 >= 0) goto L_0x021e
            goto L_0x0221
        L_0x021e:
            r2 = r27
            goto L_0x024b
        L_0x0221:
            long r0 = r2.a     // Catch:{ all -> 0x00ad }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00ad }
            r15.add(r0)     // Catch:{ all -> 0x00ad }
            k92 r0 = r2.b     // Catch:{ all -> 0x00ad }
            long r0 = r0.L     // Catch:{ all -> 0x00ad }
            int r5 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r5 == 0) goto L_0x021e
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00ad }
            k92 r1 = r2.b     // Catch:{ all -> 0x00ad }
            long r1 = r1.a     // Catch:{ all -> 0x00ad }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x00ad }
            r2 = r27
            r2.put(r0, r1)     // Catch:{ all -> 0x00ad }
            goto L_0x024b
        L_0x0244:
            r13 = r0
            r0 = r23
            r2 = r27
            r4 = r30
        L_0x024b:
            r5 = r8
            r0 = r13
            r1 = r25
            r6 = r28
            r13 = r2
            r8 = r4
            r4 = r26
            goto L_0x00aa
        L_0x0257:
            r26 = r4
            r4 = r8
            r2 = r13
            r0 = r23
            java.lang.String r5 = "storeChatsFromServer end, time = %dms"
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00ad }
            long r6 = r6 - r17
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x00ad }
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch:{ all -> 0x00ad }
            defpackage.hm9.m(r10, r5, r6)     // Catch:{ all -> 0x00ad }
            rm4 r5 = r3.l     // Catch:{ all -> 0x00ad }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x00ad }
            c34 r5 = (defpackage.c34) r5     // Catch:{ all -> 0x00ad }
            k24 r5 = (defpackage.k24) r5     // Catch:{ all -> 0x00ad }
            r5.c()     // Catch:{ all -> 0x00ad }
            rm4 r5 = r3.l
            java.lang.Object r5 = r5.get()
            c34 r5 = (defpackage.c34) r5
            k24 r5 = (defpackage.k24) r5
            r5.b()
            int r5 = r26.size()
            if (r5 != 0) goto L_0x02aa
            m7b r5 = r3.n
            p7b r5 = (defpackage.p7b) r5
            t33 r5 = r5.a
            long r5 = r5.p()
            int r5 = (r5 > r21 ? 1 : (r5 == r21 ? 0 : -1))
            if (r5 != 0) goto L_0x02aa
            m7b r0 = r3.n
            p7b r0 = (defpackage.p7b) r0
            t33 r0 = r0.a
            r5 = 1
            r0.w(r5)
            goto L_0x02c1
        L_0x02aa:
            m7b r5 = r3.n
            p7b r5 = (defpackage.p7b) r5
            t33 r5 = r5.a
            long r5 = r5.p()
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x02c1
            m7b r5 = r3.n
            p7b r5 = (defpackage.p7b) r5
            t33 r5 = r5.a
            r5.w(r0)
        L_0x02c1:
            java.util.List r13 = defpackage.oag.D(r4)
            mg4 r0 = defpackage.mg4.REGULAR
            vz2 r1 = new vz2
            r5 = 1
            r18 = 0
            r6 = 0
            r17 = 0
            r12 = r1
            r7 = r14
            r14 = r5
            r5 = r15
            r15 = r6
            r16 = r0
            r19 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            av0 r6 = r3.m
            r6.c(r1)
            q0e r6 = r3.E
            r8 = 0
            r6.m(r8, r1)
            o82 r1 = r3.G
            if (r1 == 0) goto L_0x02ed
            r1.c(r9)
        L_0x02ed:
            boolean r1 = r5.isEmpty()
            java.lang.String r6 = "syncMessages"
            if (r1 != 0) goto L_0x030e
            int r1 = r5.c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r8 = "storeChatsFromServer: chatsToSync = %d"
            defpackage.hm9.m(r10, r8, r1)
            f5 r1 = new f5
            r8 = 15
            r1.<init>((java.lang.Object) r3, (java.lang.Object) r0, (java.lang.Object) r5, (int) r8)
            r3.f0(r6, r1)
        L_0x030e:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x032f
            int r0 = r5.c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "storeChatsFromServer: chatsWithScheduledMessagesForSync = %d"
            defpackage.hm9.m(r10, r1, r0)
            mg4 r0 = defpackage.mg4.DELAYED
            f5 r1 = new f5
            r5 = 15
            r1.<init>((java.lang.Object) r3, (java.lang.Object) r0, (java.lang.Object) r7, (int) r5)
            r3.f0(r6, r1)
        L_0x032f:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0352
            int r0 = r2.c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "storeChatsFromServer: pinsToSync = %d"
            defpackage.hm9.m(r10, r1, r0)
            r3.e()
            wt1 r0 = new wt1
            r1 = 7
            r0.<init>(r3, r1, r2)
            java.lang.String r1 = "syncPins"
            r3.f0(r1, r0)
        L_0x0352:
            java.lang.String r0 = "storeChatsFromServer: finished"
            defpackage.hm9.m(r10, r0, new java.lang.Object[0])
            return r4
        L_0x0358:
            rm4 r1 = r3.l
            java.lang.Object r1 = r1.get()
            c34 r1 = (defpackage.c34) r1
            k24 r1 = (defpackage.k24) r1
            r1.b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.id0.get():java.lang.Object");
    }

    public void invoke(Object obj) {
        gd gdVar = (gd) obj;
        gdVar.getClass();
        int i = this.b;
        gdVar.A((fd) this.o, (p3b) this.a, (p3b) this.c, i);
    }

    public /* synthetic */ id0(Object obj, int i, Object obj2, Object obj3) {
        this.o = obj;
        this.b = i;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ id0(Object obj, Object obj2, Object obj3, int i) {
        this.o = obj;
        this.a = obj2;
        this.c = obj3;
        this.b = i;
    }
}
