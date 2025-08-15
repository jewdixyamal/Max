package defpackage;

import one.me.rlottie.RLottieDrawable;

/* renamed from: t3c  reason: default package */
public final class t3c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RLottieDrawable b;

    public /* synthetic */ t3c(RLottieDrawable rLottieDrawable, int i) {
        this.a = i;
        this.b = rLottieDrawable;
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x0142 A[Catch:{ Exception -> 0x010f }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0151 A[Catch:{ Exception -> 0x010f }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a1 A[Catch:{ Exception -> 0x010f }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a4 A[Catch:{ Exception -> 0x010f }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c1 A[Catch:{ Exception -> 0x010f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r1 = r20
            int r0 = r1.a
            switch(r0) {
                case 0: goto L_0x0308;
                case 1: goto L_0x02f5;
                case 2: goto L_0x02be;
                case 3: goto L_0x02a2;
                default: goto L_0x0007;
            }
        L_0x0007:
            one.me.rlottie.RLottieDrawable r0 = r1.b
            boolean r0 = r0.c1
            if (r0 == 0) goto L_0x0018
            lm9 r0 = one.me.rlottie.RLottie.getLogger()
            java.lang.String r1 = "RLottieDrawable. Load frame isRecycled"
            r0.i(r1)
            goto L_0x02a1
        L_0x0018:
            one.me.rlottie.RLottieDrawable r0 = r1.b
            boolean r0 = r0.canLoadFrames()
            if (r0 != 0) goto L_0x003d
            lm9 r0 = one.me.rlottie.RLottie.getLogger()
            java.lang.String r2 = "RLottieDrawable. Load frame !canLoadFrames()"
            r0.i(r2)
            one.me.rlottie.RLottieDrawable r0 = r1.b
            java.util.concurrent.CountDownLatch r0 = r0.M0
            if (r0 == 0) goto L_0x0032
            r0.countDown()
        L_0x0032:
            android.os.Handler r0 = one.me.rlottie.RLottieDrawable.H1
            one.me.rlottie.RLottieDrawable r1 = r1.b
            t3c r1 = r1.n1
            r0.post(r1)
            goto L_0x02a1
        L_0x003d:
            one.me.rlottie.RLottieDrawable r0 = r1.b
            android.graphics.Bitmap r0 = r0.K0
            if (r0 != 0) goto L_0x005a
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ all -> 0x0052 }
            int r2 = r0.a     // Catch:{ all -> 0x0052 }
            int r3 = r0.b     // Catch:{ all -> 0x0052 }
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0052 }
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r3, r4)     // Catch:{ all -> 0x0052 }
            r0.K0 = r2     // Catch:{ all -> 0x0052 }
            goto L_0x005a
        L_0x0052:
            r0 = move-exception
            lm9 r2 = one.me.rlottie.RLottie.getLogger()
            r2.o(r0)
        L_0x005a:
            one.me.rlottie.RLottieDrawable r0 = r1.b
            android.graphics.Bitmap r0 = r0.K0
            if (r0 == 0) goto L_0x0286
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x00a1 }
            java.util.HashMap r0 = r0.u0     // Catch:{ Exception -> 0x00a1 }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x00a1 }
            if (r0 != 0) goto L_0x00a1
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x00a1 }
            java.util.HashMap r0 = r0.u0     // Catch:{ Exception -> 0x00a1 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ Exception -> 0x00a1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x00a1 }
        L_0x0076:
            boolean r2 = r0.hasNext()     // Catch:{ Exception -> 0x00a1 }
            if (r2 == 0) goto L_0x009a
            java.lang.Object r2 = r0.next()     // Catch:{ Exception -> 0x00a1 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ Exception -> 0x00a1 }
            one.me.rlottie.RLottieDrawable r3 = r1.b     // Catch:{ Exception -> 0x00a1 }
            long r3 = r3.d1     // Catch:{ Exception -> 0x00a1 }
            java.lang.Object r5 = r2.getKey()     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x00a1 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ Exception -> 0x00a1 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x00a1 }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x00a1 }
            one.me.rlottie.RLottieDrawable.setLayerColor(r3, r5, r2)     // Catch:{ Exception -> 0x00a1 }
            goto L_0x0076
        L_0x009a:
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x00a1 }
            java.util.HashMap r0 = r0.u0     // Catch:{ Exception -> 0x00a1 }
            r0.clear()     // Catch:{ Exception -> 0x00a1 }
        L_0x00a1:
            one.me.rlottie.RLottieDrawable r0 = r1.b
            int[] r2 = r0.s0
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x00bf
            long r6 = r0.d1
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00bf
            one.me.rlottie.RLottieDrawable r0 = r1.b
            long r6 = r0.d1
            one.me.rlottie.RLottieDrawable r0 = r1.b
            int[] r0 = r0.s0
            one.me.rlottie.RLottieDrawable.replaceColors(r6, r0)
            one.me.rlottie.RLottieDrawable r0 = r1.b
            r0.s0 = r3
        L_0x00bf:
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x010f }
            boolean r0 = r0.T0     // Catch:{ Exception -> 0x010f }
            r2 = 2
            r6 = 1
            if (r0 == 0) goto L_0x00c9
            r7 = r2
            goto L_0x00ca
        L_0x00c9:
            r7 = r6
        L_0x00ca:
            java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x010f }
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x010f }
            boolean r8 = r0.i1     // Catch:{ Exception -> 0x010f }
            r9 = 0
            if (r8 == 0) goto L_0x0112
            vo0 r8 = r0.s1     // Catch:{ Exception -> 0x010f }
            if (r8 == 0) goto L_0x0112
            int r10 = r0.S0     // Catch:{ Exception -> 0x0105 }
            int r10 = r10 / r7
            android.graphics.Bitmap r0 = r0.K0     // Catch:{ Exception -> 0x0105 }
            int r8 = r8.f(r0, r10)     // Catch:{ Exception -> 0x0105 }
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x0103 }
            vo0 r0 = r0.s1     // Catch:{ Exception -> 0x0103 }
            boolean r0 = r0.g()     // Catch:{ Exception -> 0x0103 }
            if (r0 != 0) goto L_0x012e
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x0103 }
            boolean r10 = r0.v1     // Catch:{ Exception -> 0x0103 }
            if (r10 == 0) goto L_0x012e
            long r10 = r0.d1     // Catch:{ Exception -> 0x0103 }
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x012e
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x0103 }
            long r10 = r0.d1     // Catch:{ Exception -> 0x0103 }
            one.me.rlottie.RLottieDrawable.destroy(r10)     // Catch:{ Exception -> 0x0103 }
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x0103 }
            r0.d1 = r4     // Catch:{ Exception -> 0x0103 }
            goto L_0x012e
        L_0x0103:
            r0 = move-exception
            goto L_0x0107
        L_0x0105:
            r0 = move-exception
            r8 = r9
        L_0x0107:
            lm9 r10 = one.me.rlottie.RLottie.getLogger()     // Catch:{ Exception -> 0x010f }
            r10.o(r0)     // Catch:{ Exception -> 0x010f }
            goto L_0x012e
        L_0x010f:
            r0 = move-exception
            goto L_0x027e
        L_0x0112:
            long r11 = r0.d1     // Catch:{ Exception -> 0x010f }
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x010f }
            int r13 = r0.S0     // Catch:{ Exception -> 0x010f }
            android.graphics.Bitmap r14 = r0.K0     // Catch:{ Exception -> 0x010f }
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x010f }
            int r15 = r0.a     // Catch:{ Exception -> 0x010f }
            int r8 = r0.b     // Catch:{ Exception -> 0x010f }
            android.graphics.Bitmap r0 = r0.K0     // Catch:{ Exception -> 0x010f }
            int r17 = r0.getRowBytes()     // Catch:{ Exception -> 0x010f }
            r18 = 1
            r16 = r8
            int r8 = one.me.rlottie.RLottieDrawable.getFrame(r11, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x010f }
        L_0x012e:
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x010f }
            vo0 r0 = r0.s1     // Catch:{ Exception -> 0x010f }
            r10 = -1
            r11 = 3
            if (r0 == 0) goto L_0x01a2
            boolean r0 = r0.g()     // Catch:{ Exception -> 0x010f }
            if (r0 == 0) goto L_0x01a2
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x010f }
            boolean r8 = r0.u1     // Catch:{ Exception -> 0x010f }
            if (r8 != 0) goto L_0x014b
            r0.u1 = r6     // Catch:{ Exception -> 0x010f }
            android.os.Handler r8 = one.me.rlottie.RLottieDrawable.H1     // Catch:{ Exception -> 0x010f }
            t3c r0 = r0.q1     // Catch:{ Exception -> 0x010f }
            r8.post(r0)     // Catch:{ Exception -> 0x010f }
        L_0x014b:
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x010f }
            boolean r8 = r0.v1     // Catch:{ Exception -> 0x010f }
            if (r8 == 0) goto L_0x01a1
            long r12 = r0.d1     // Catch:{ Exception -> 0x010f }
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0180
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x010f }
            ho9 r4 = r0.m1     // Catch:{ Exception -> 0x010f }
            java.lang.Object r4 = r4.c     // Catch:{ Exception -> 0x010f }
            java.io.File r4 = (java.io.File) r4     // Catch:{ Exception -> 0x010f }
            java.lang.String r12 = r4.toString()     // Catch:{ Exception -> 0x010f }
            one.me.rlottie.RLottieDrawable r4 = r1.b     // Catch:{ Exception -> 0x010f }
            ho9 r5 = r4.m1     // Catch:{ Exception -> 0x010f }
            r5.getClass()     // Catch:{ Exception -> 0x010f }
            int r13 = r4.a     // Catch:{ Exception -> 0x010f }
            int r14 = r4.b     // Catch:{ Exception -> 0x010f }
            int[] r15 = new int[r11]     // Catch:{ Exception -> 0x010f }
            java.lang.Object r4 = r5.b     // Catch:{ Exception -> 0x010f }
            r16 = r4
            int[] r16 = (int[]) r16     // Catch:{ Exception -> 0x010f }
            int r4 = r5.a     // Catch:{ Exception -> 0x010f }
            r17 = r4
            long r4 = one.me.rlottie.RLottieDrawable.create(r12, (java.lang.String) null, r13, r14, r15, false, r16, false, r17)     // Catch:{ Exception -> 0x010f }
            r0.d1 = r4     // Catch:{ Exception -> 0x010f }
        L_0x0180:
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x010f }
            long r12 = r0.d1     // Catch:{ Exception -> 0x010f }
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x010f }
            int r14 = r0.S0     // Catch:{ Exception -> 0x010f }
            android.graphics.Bitmap r15 = r0.K0     // Catch:{ Exception -> 0x010f }
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x010f }
            int r4 = r0.a     // Catch:{ Exception -> 0x010f }
            int r5 = r0.b     // Catch:{ Exception -> 0x010f }
            android.graphics.Bitmap r0 = r0.K0     // Catch:{ Exception -> 0x010f }
            int r18 = r0.getRowBytes()     // Catch:{ Exception -> 0x010f }
            r19 = 1
            r16 = r4
            r17 = r5
            int r8 = one.me.rlottie.RLottieDrawable.getFrame(r12, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x010f }
            goto L_0x01a2
        L_0x01a1:
            r8 = r10
        L_0x01a2:
            if (r8 != r10) goto L_0x01c1
            lm9 r0 = one.me.rlottie.RLottie.getLogger()     // Catch:{ Exception -> 0x010f }
            java.lang.String r2 = "RLottieDrawable. Load frame result == -1"
            r0.i(r2)     // Catch:{ Exception -> 0x010f }
            android.os.Handler r0 = one.me.rlottie.RLottieDrawable.H1     // Catch:{ Exception -> 0x010f }
            one.me.rlottie.RLottieDrawable r2 = r1.b     // Catch:{ Exception -> 0x010f }
            t3c r2 = r2.n1     // Catch:{ Exception -> 0x010f }
            r0.post(r2)     // Catch:{ Exception -> 0x010f }
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x010f }
            java.util.concurrent.CountDownLatch r0 = r0.M0     // Catch:{ Exception -> 0x010f }
            if (r0 == 0) goto L_0x02a1
            r0.countDown()     // Catch:{ Exception -> 0x010f }
            goto L_0x02a1
        L_0x01c1:
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x010f }
            android.graphics.Bitmap r4 = r0.K0     // Catch:{ Exception -> 0x010f }
            r0.J0 = r4     // Catch:{ Exception -> 0x010f }
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x010f }
            int r4 = r0.X     // Catch:{ Exception -> 0x010f }
            if (r4 < 0) goto L_0x01f9
            boolean r5 = r0.Y     // Catch:{ Exception -> 0x010f }
            if (r5 == 0) goto L_0x01f9
            int r2 = r0.S0     // Catch:{ Exception -> 0x010f }
            if (r2 <= r4) goto L_0x01e7
            int r2 = r2 - r7
            if (r2 < r4) goto L_0x01de
            r0.S0 = r2     // Catch:{ Exception -> 0x010f }
            r0.F0 = r9     // Catch:{ Exception -> 0x010f }
            goto L_0x028f
        L_0x01de:
            r0.F0 = r6     // Catch:{ Exception -> 0x010f }
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x010f }
            one.me.rlottie.RLottieDrawable.c(r0)     // Catch:{ Exception -> 0x010f }
            goto L_0x028f
        L_0x01e7:
            int r2 = r2 + r7
            if (r2 >= r4) goto L_0x01f0
            r0.S0 = r2     // Catch:{ Exception -> 0x010f }
            r0.F0 = r9     // Catch:{ Exception -> 0x010f }
            goto L_0x028f
        L_0x01f0:
            r0.F0 = r6     // Catch:{ Exception -> 0x010f }
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x010f }
            one.me.rlottie.RLottieDrawable.c(r0)     // Catch:{ Exception -> 0x010f }
            goto L_0x028f
        L_0x01f9:
            if (r4 < 0) goto L_0x0227
            boolean r5 = r0.Y     // Catch:{ Exception -> 0x010f }
            if (r5 == 0) goto L_0x0227
            int r2 = r0.S0     // Catch:{ Exception -> 0x010f }
            if (r2 <= r4) goto L_0x0215
            int r2 = r2 - r7
            if (r2 < r4) goto L_0x020c
            r0.S0 = r2     // Catch:{ Exception -> 0x010f }
            r0.F0 = r9     // Catch:{ Exception -> 0x010f }
            goto L_0x028f
        L_0x020c:
            r0.F0 = r6     // Catch:{ Exception -> 0x010f }
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x010f }
            one.me.rlottie.RLottieDrawable.c(r0)     // Catch:{ Exception -> 0x010f }
            goto L_0x028f
        L_0x0215:
            int r2 = r2 + r7
            if (r2 >= r4) goto L_0x021e
            r0.S0 = r2     // Catch:{ Exception -> 0x010f }
            r0.F0 = r9     // Catch:{ Exception -> 0x010f }
            goto L_0x028f
        L_0x021e:
            r0.F0 = r6     // Catch:{ Exception -> 0x010f }
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x010f }
            one.me.rlottie.RLottieDrawable.c(r0)     // Catch:{ Exception -> 0x010f }
            goto L_0x028f
        L_0x0227:
            int r5 = r0.S0     // Catch:{ Exception -> 0x010f }
            int r5 = r5 + r7
            if (r4 < 0) goto L_0x022d
            goto L_0x0231
        L_0x022d:
            int[] r4 = r0.c     // Catch:{ Exception -> 0x010f }
            r4 = r4[r9]     // Catch:{ Exception -> 0x010f }
        L_0x0231:
            if (r5 >= r4) goto L_0x0246
            int r2 = r0.B0     // Catch:{ Exception -> 0x010f }
            if (r2 != r11) goto L_0x0241
            r0.F0 = r6     // Catch:{ Exception -> 0x010f }
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x010f }
            int r2 = r0.D0     // Catch:{ Exception -> 0x010f }
            int r2 = r2 + r6
            r0.D0 = r2     // Catch:{ Exception -> 0x010f }
            goto L_0x028f
        L_0x0241:
            r0.S0 = r5     // Catch:{ Exception -> 0x010f }
            r0.F0 = r9     // Catch:{ Exception -> 0x010f }
            goto L_0x028f
        L_0x0246:
            int r4 = r0.B0     // Catch:{ Exception -> 0x010f }
            if (r4 != r6) goto L_0x0260
            r0.S0 = r9     // Catch:{ Exception -> 0x010f }
            r0.F0 = r9     // Catch:{ Exception -> 0x010f }
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x010f }
            boolean r2 = r0.w0     // Catch:{ Exception -> 0x010f }
            if (r2 == 0) goto L_0x0258
            r0.v0 = r3     // Catch:{ Exception -> 0x010f }
            r0.w0 = r9     // Catch:{ Exception -> 0x010f }
        L_0x0258:
            int r2 = r0.C0     // Catch:{ Exception -> 0x010f }
            if (r2 <= 0) goto L_0x028f
            int r2 = r2 - r6
            r0.C0 = r2     // Catch:{ Exception -> 0x010f }
            goto L_0x028f
        L_0x0260:
            if (r4 != r2) goto L_0x0276
            r0.S0 = r9     // Catch:{ Exception -> 0x010f }
            r0.F0 = r6     // Catch:{ Exception -> 0x010f }
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x010f }
            int r2 = r0.D0     // Catch:{ Exception -> 0x010f }
            int r2 = r2 + r6
            r0.D0 = r2     // Catch:{ Exception -> 0x010f }
            boolean r2 = r0.w0     // Catch:{ Exception -> 0x010f }
            if (r2 == 0) goto L_0x028f
            r0.v0 = r3     // Catch:{ Exception -> 0x010f }
            r0.w0 = r9     // Catch:{ Exception -> 0x010f }
            goto L_0x028f
        L_0x0276:
            r0.F0 = r6     // Catch:{ Exception -> 0x010f }
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x010f }
            one.me.rlottie.RLottieDrawable.c(r0)     // Catch:{ Exception -> 0x010f }
            goto L_0x028f
        L_0x027e:
            lm9 r2 = one.me.rlottie.RLottie.getLogger()
            r2.o(r0)
            goto L_0x028f
        L_0x0286:
            lm9 r0 = one.me.rlottie.RLottie.getLogger()
            java.lang.String r2 = "RLottieDrawable. Load frame background bitmap is null"
            r0.i(r2)
        L_0x028f:
            android.os.Handler r0 = one.me.rlottie.RLottieDrawable.H1
            one.me.rlottie.RLottieDrawable r2 = r1.b
            t3c r2 = r2.o1
            r0.post(r2)
            one.me.rlottie.RLottieDrawable r0 = r1.b
            java.util.concurrent.CountDownLatch r0 = r0.M0
            if (r0 == 0) goto L_0x02a1
            r0.countDown()
        L_0x02a1:
            return
        L_0x02a2:
            one.me.rlottie.RLottieDrawable r0 = r1.b
            java.lang.Runnable r1 = r0.G0
            r2 = 0
            if (r1 == 0) goto L_0x02ae
            defpackage.vo0.c()
            r0.G0 = r2
        L_0x02ae:
            r1 = 0
            r0.p1 = r1
            r0.i()
            java.lang.Runnable r1 = r0.whenCacheDone
            if (r1 == 0) goto L_0x02bd
            r1.run()
            r0.whenCacheDone = r2
        L_0x02bd:
            return
        L_0x02be:
            one.me.rlottie.RLottieDrawable r0 = r1.b
            boolean r0 = r0.c1
            if (r0 != 0) goto L_0x02f4
            one.me.rlottie.RLottieDrawable r0 = r1.b
            boolean r2 = r0.N0
            if (r2 != 0) goto L_0x02f4
            boolean r0 = r0.canLoadFrames()
            if (r0 == 0) goto L_0x02f4
            one.me.rlottie.RLottieDrawable r0 = r1.b
            java.lang.Runnable r2 = r0.G0
            if (r2 != 0) goto L_0x02f4
            r2 = 1
            r0.p1 = r2
            il4 r0 = one.me.rlottie.RLottieDrawable.lottieCacheGenerateQueue
            if (r0 != 0) goto L_0x02e0
            one.me.rlottie.RLottieDrawable.createCacheGenQueue()
        L_0x02e0:
            int r0 = defpackage.vo0.B
            int r0 = r0 + r2
            defpackage.vo0.B = r0
            il4 r0 = one.me.rlottie.RLottieDrawable.lottieCacheGenerateQueue
            one.me.rlottie.RLottieDrawable r2 = r1.b
            u3c r3 = new u3c
            r4 = 0
            r3.<init>(r4, r1)
            r2.G0 = r3
            r0.b(r3)
        L_0x02f4:
            return
        L_0x02f5:
            one.me.rlottie.RLottieDrawable r0 = r1.b
            r1 = 1
            r0.P0 = r1
            r0.invalidateInternal()
            r0.i()
            java.lang.Runnable r0 = r0.k1
            if (r0 == 0) goto L_0x0307
            r0.run()
        L_0x0307:
            return
        L_0x0308:
            r0 = 0
            one.me.rlottie.RLottieDrawable r1 = r1.b
            r1.H0 = r0
            r1.i()
            java.lang.Runnable r0 = r1.k1
            if (r0 == 0) goto L_0x0317
            r0.run()
        L_0x0317:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t3c.run():void");
    }
}
