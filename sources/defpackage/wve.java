package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;

/* renamed from: wve  reason: default package */
public final class wve {
    public final int a;
    public volatile boolean b;
    public final aj9 c = bj9.a();
    public final je7 d;
    public final je7 e;
    public final String f;
    public tve g;
    public AsynchronousSocketChannel h;
    public final khe i;
    public final khe j;

    public wve(khe khe, je7 je7, int i2) {
        this.a = i2;
        this.d = khe;
        this.e = je7;
        this.f = wve.class.getName();
        this.i = new khe(new zja(je7, 29, this));
        this.j = new khe(new ile(6, je7));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.uve
            if (r0 == 0) goto L_0x0013
            r0 = r5
            uve r0 = (defpackage.uve) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            uve r0 = new uve
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            wve r4 = r0.o
            defpackage.od2.a0(r5)     // Catch:{ all -> 0x0029 }
            goto L_0x0045
        L_0x0029:
            r5 = move-exception
            goto L_0x0069
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            defpackage.od2.a0(r5)
            tve r5 = r4.g     // Catch:{ all -> 0x0029 }
            if (r5 == 0) goto L_0x0045
            r0.o = r4     // Catch:{ all -> 0x0029 }
            r0.Z = r3     // Catch:{ all -> 0x0029 }
            java.lang.Object r5 = r5.e(r0)     // Catch:{ all -> 0x0029 }
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            r5 = 0
            r4.b = r5     // Catch:{ all -> 0x0029 }
            je7 r5 = r4.e
            java.lang.Object r5 = r5.getValue()
            ct0 r5 = (defpackage.ct0) r5
            java.nio.ByteBuffer r0 = r4.c()
            r5.b(r0)
            je7 r5 = r4.e
            java.lang.Object r5 = r5.getValue()
            ct0 r5 = (defpackage.ct0) r5
            java.nio.ByteBuffer r4 = r4.d()
            r5.b(r4)
            e5f r4 = defpackage.e5f.a
            return r4
        L_0x0069:
            je7 r0 = r4.e
            java.lang.Object r0 = r0.getValue()
            ct0 r0 = (defpackage.ct0) r0
            java.nio.ByteBuffer r1 = r4.c()
            r0.b(r1)
            je7 r0 = r4.e
            java.lang.Object r0 = r0.getValue()
            ct0 r0 = (defpackage.ct0) r0
            java.nio.ByteBuffer r4 = r4.d()
            r0.b(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wve.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v27, types: [xi9] */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:76|74|75|82|83|84|85|(1:87)|88|89) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:88:0x018d */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b5 A[SYNTHETIC, Splitter:B:39:0x00b5] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f4 A[Catch:{ all -> 0x0170 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0130 A[Catch:{ Exception -> 0x0142, all -> 0x013f }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0144 A[SYNTHETIC, Splitter:B:62:0x0144] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0172 A[SYNTHETIC, Splitter:B:77:0x0172] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x018a A[Catch:{ all -> 0x018d }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:72:0x016c=Splitter:B:72:0x016c, B:88:0x018d=Splitter:B:88:0x018d, B:82:0x017f=Splitter:B:82:0x017f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.String r18, kotlin.coroutines.Continuation r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof defpackage.vve
            if (r2 == 0) goto L_0x0017
            r2 = r1
            vve r2 = (defpackage.vve) r2
            int r3 = r2.v0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.v0 = r3
            goto L_0x001c
        L_0x0017:
            vve r2 = new vve
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.t0
            tx3 r3 = defpackage.tx3.a
            int r4 = r2.v0
            e5f r5 = defpackage.e5f.a
            java.lang.String r6 = "Required value was null."
            r7 = 443(0x1bb, float:6.21E-43)
            r8 = 4
            r9 = 3
            r10 = 2
            r11 = 1
            r12 = 0
            if (r4 == 0) goto L_0x0094
            if (r4 == r11) goto L_0x0083
            if (r4 == r10) goto L_0x0064
            if (r4 == r9) goto L_0x004f
            if (r4 == r8) goto L_0x003f
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003f:
            java.lang.Object r0 = r2.X
            java.lang.Exception r0 = (java.lang.Exception) r0
            java.lang.Object r2 = r2.o
            xi9 r2 = (defpackage.xi9) r2
            defpackage.od2.a0(r1)     // Catch:{ all -> 0x004c }
            goto L_0x016c
        L_0x004c:
            r0 = move-exception
            goto L_0x0190
        L_0x004f:
            java.lang.Object r0 = r2.Y
            javax.net.ssl.SSLEngine r0 = (javax.net.ssl.SSLEngine) r0
            java.lang.Object r4 = r2.X
            xi9 r4 = (defpackage.xi9) r4
            java.lang.Object r7 = r2.o
            wve r7 = (defpackage.wve) r7
            defpackage.od2.a0(r1)     // Catch:{ all -> 0x0060 }
            goto L_0x0124
        L_0x0060:
            r0 = move-exception
            r2 = r4
            goto L_0x017f
        L_0x0064:
            wve r0 = r2.s0
            javax.net.ssl.SSLEngine r4 = r2.Z
            java.lang.Object r10 = r2.Y
            xi9 r10 = (defpackage.xi9) r10
            java.lang.Object r13 = r2.X
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r2.o
            wve r14 = (defpackage.wve) r14
            defpackage.od2.a0(r1)     // Catch:{ all -> 0x007e }
            r16 = r14
            r14 = r13
            r13 = r16
            goto L_0x00ec
        L_0x007e:
            r0 = move-exception
            r2 = r10
            r7 = r14
            goto L_0x017f
        L_0x0083:
            java.lang.Object r0 = r2.Y
            xi9 r0 = (defpackage.xi9) r0
            java.lang.Object r4 = r2.X
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r13 = r2.o
            wve r13 = (defpackage.wve) r13
            defpackage.od2.a0(r1)
            r1 = r0
            goto L_0x00ab
        L_0x0094:
            defpackage.od2.a0(r1)
            aj9 r1 = r0.c
            r2.o = r0
            r4 = r18
            r2.X = r4
            r2.Y = r1
            r2.v0 = r11
            java.lang.Object r13 = r1.d(r2)
            if (r13 != r3) goto L_0x00aa
            return r3
        L_0x00aa:
            r13 = r0
        L_0x00ab:
            boolean r0 = r13.b     // Catch:{ all -> 0x018e }
            if (r0 == 0) goto L_0x00b5
            aj9 r1 = (defpackage.aj9) r1
            r1.e(r12)
            return r5
        L_0x00b5:
            je7 r0 = r13.d     // Catch:{ all -> 0x017c }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x017c }
            javax.net.ssl.SSLContext r0 = (javax.net.ssl.SSLContext) r0     // Catch:{ all -> 0x017c }
            javax.net.ssl.SSLEngine r0 = r0.createSSLEngine(r4, r7)     // Catch:{ all -> 0x017c }
            r0.setUseClientMode(r11)     // Catch:{ all -> 0x017c }
            int r14 = r4.hashCode()     // Catch:{ all -> 0x017c }
            android.net.TrafficStats.setThreadStatsTag(r14)     // Catch:{ all -> 0x017c }
            bse r14 = new bse     // Catch:{ all -> 0x017c }
            r15 = 3
            r14.<init>(r15)     // Catch:{ all -> 0x017c }
            r2.o = r13     // Catch:{ all -> 0x017c }
            r2.X = r4     // Catch:{ all -> 0x017c }
            r2.Y = r1     // Catch:{ all -> 0x017c }
            r2.Z = r0     // Catch:{ all -> 0x017c }
            r2.s0 = r13     // Catch:{ all -> 0x017c }
            r2.v0 = r10     // Catch:{ all -> 0x017c }
            java.lang.Object r10 = defpackage.ema.C(r14, r2)     // Catch:{ all -> 0x017c }
            if (r10 != r3) goto L_0x00e4
            return r3
        L_0x00e4:
            r14 = r4
            r4 = r0
            r0 = r13
            r16 = r10
            r10 = r1
            r1 = r16
        L_0x00ec:
            java.nio.channels.AsynchronousSocketChannel r1 = (java.nio.channels.AsynchronousSocketChannel) r1     // Catch:{ all -> 0x0170 }
            r0.h = r1     // Catch:{ all -> 0x0170 }
            java.nio.channels.AsynchronousSocketChannel r0 = r13.h     // Catch:{ all -> 0x0170 }
            if (r0 == 0) goto L_0x0172
            java.net.InetSocketAddress r1 = new java.net.InetSocketAddress     // Catch:{ all -> 0x0170 }
            r1.<init>(r14, r7)     // Catch:{ all -> 0x0170 }
            r2.o = r13     // Catch:{ all -> 0x0170 }
            r2.X = r10     // Catch:{ all -> 0x0170 }
            r2.Y = r4     // Catch:{ all -> 0x0170 }
            r2.Z = r12     // Catch:{ all -> 0x0170 }
            r2.s0 = r12     // Catch:{ all -> 0x0170 }
            r2.v0 = r9     // Catch:{ all -> 0x0170 }
            sy1 r7 = new sy1     // Catch:{ all -> 0x0170 }
            kotlin.coroutines.Continuation r9 = defpackage.v3c.u(r2)     // Catch:{ all -> 0x0170 }
            r7.<init>(r11, r9)     // Catch:{ all -> 0x0170 }
            r7.n()     // Catch:{ all -> 0x0170 }
            fv r9 = defpackage.fv.c     // Catch:{ all -> 0x0170 }
            r0.connect(r1, r7, r9)     // Catch:{ all -> 0x0170 }
            java.lang.Object r0 = r7.m()     // Catch:{ all -> 0x0170 }
            if (r0 != r3) goto L_0x011d
            goto L_0x011e
        L_0x011d:
            r0 = r5
        L_0x011e:
            if (r0 != r3) goto L_0x0121
            return r3
        L_0x0121:
            r0 = r4
            r4 = r10
            r7 = r13
        L_0x0124:
            je7 r1 = r7.e     // Catch:{ Exception -> 0x0142 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ Exception -> 0x0142 }
            ct0 r1 = (defpackage.ct0) r1     // Catch:{ Exception -> 0x0142 }
            java.nio.channels.AsynchronousSocketChannel r9 = r7.h     // Catch:{ Exception -> 0x0142 }
            if (r9 == 0) goto L_0x0144
            tve r6 = new tve     // Catch:{ Exception -> 0x0142 }
            r6.<init>(r1, r0, r9)     // Catch:{ Exception -> 0x0142 }
            r7.g = r6     // Catch:{ Exception -> 0x0142 }
            r7.b = r11     // Catch:{ Exception -> 0x0142 }
            aj9 r4 = (defpackage.aj9) r4
            r4.e(r12)
            return r5
        L_0x013f:
            r0 = move-exception
            r2 = r4
            goto L_0x0190
        L_0x0142:
            r0 = move-exception
            goto L_0x014e
        L_0x0144:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0142 }
            java.lang.String r1 = r6.toString()     // Catch:{ Exception -> 0x0142 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0142 }
            throw r0     // Catch:{ Exception -> 0x0142 }
        L_0x014e:
            java.lang.String r1 = r7.f     // Catch:{ all -> 0x013f }
            java.lang.String r5 = "Got exception during connecting"
            defpackage.hm9.p(r1, r5, r0)     // Catch:{ all -> 0x013f }
            r1 = 0
            r7.b = r1     // Catch:{ all -> 0x013f }
            tve r1 = r7.g     // Catch:{ all -> 0x013f }
            if (r1 == 0) goto L_0x016b
            r2.o = r4     // Catch:{ all -> 0x013f }
            r2.X = r0     // Catch:{ all -> 0x013f }
            r2.Y = r12     // Catch:{ all -> 0x013f }
            r2.v0 = r8     // Catch:{ all -> 0x013f }
            java.lang.Object r1 = r1.e(r2)     // Catch:{ all -> 0x013f }
            if (r1 != r3) goto L_0x016b
            return r3
        L_0x016b:
            r2 = r4
        L_0x016c:
            throw r0     // Catch:{ all -> 0x004c }
        L_0x016d:
            r2 = r10
        L_0x016e:
            r7 = r13
            goto L_0x017f
        L_0x0170:
            r0 = move-exception
            goto L_0x016d
        L_0x0172:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x0170 }
            r0.<init>(r1)     // Catch:{ all -> 0x0170 }
            throw r0     // Catch:{ all -> 0x0170 }
        L_0x017c:
            r0 = move-exception
            r2 = r1
            goto L_0x016e
        L_0x017f:
            java.lang.String r1 = r7.f     // Catch:{ all -> 0x004c }
            java.lang.String r3 = "Got exception during initialize and connect raw channel"
            defpackage.hm9.p(r1, r3, r0)     // Catch:{ all -> 0x004c }
            java.nio.channels.AsynchronousSocketChannel r1 = r7.h     // Catch:{ all -> 0x018d }
            if (r1 == 0) goto L_0x018d
            r1.close()     // Catch:{ all -> 0x018d }
        L_0x018d:
            throw r0     // Catch:{ all -> 0x004c }
        L_0x018e:
            r0 = move-exception
            r2 = r1
        L_0x0190:
            aj9 r2 = (defpackage.aj9) r2
            r2.e(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wve.b(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final ByteBuffer c() {
        return (ByteBuffer) this.i.getValue();
    }

    public final ByteBuffer d() {
        return (ByteBuffer) this.j.getValue();
    }

    public final Object e(ByteBuffer byteBuffer, hu3 hu3) {
        tve tve = this.g;
        if (tve != null) {
            return tve.n(new sv0(byteBuffer), hu3);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
