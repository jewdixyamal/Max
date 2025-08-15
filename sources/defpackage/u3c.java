package defpackage;

/* renamed from: u3c  reason: default package */
public final /* synthetic */ class u3c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u3c(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:187:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
            r2 = 1
            r3 = 2
            int r4 = r7.a
            switch(r4) {
                case 0: goto L_0x03c6;
                case 1: goto L_0x03be;
                case 2: goto L_0x03b4;
                case 3: goto L_0x03ac;
                case 4: goto L_0x039a;
                case 5: goto L_0x0363;
                case 6: goto L_0x0359;
                case 7: goto L_0x0351;
                case 8: goto L_0x0349;
                case 9: goto L_0x0341;
                case 10: goto L_0x0339;
                case 11: goto L_0x032b;
                case 12: goto L_0x02b6;
                case 13: goto L_0x02ae;
                case 14: goto L_0x0265;
                case 15: goto L_0x0241;
                case 16: goto L_0x0239;
                case 17: goto L_0x0227;
                case 18: goto L_0x013c;
                case 19: goto L_0x012c;
                case 20: goto L_0x00fb;
                case 21: goto L_0x00f3;
                case 22: goto L_0x00eb;
                case 23: goto L_0x00c8;
                case 24: goto L_0x00c0;
                case 25: goto L_0x00b8;
                case 26: goto L_0x0083;
                case 27: goto L_0x002b;
                case 28: goto L_0x0023;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r7 = r7.b
            tle r7 = (defpackage.tle) r7
            r7.getClass()
            java.lang.String r0 = defpackage.tle.B0
            java.lang.String r1 = "handleIntent: close and re-create session"
            defpackage.hm9.k(r0, r1)
            je7 r7 = r7.x0
            java.lang.Object r7 = r7.getValue()
            yle r7 = (defpackage.yle) r7
            r7.i()
            return
        L_0x0023:
            java.lang.Object r7 = r7.b
            b8c r7 = (defpackage.b8c) r7
            r7.d()
            return
        L_0x002b:
            java.lang.Object r7 = r7.b
            pje r7 = (defpackage.pje) r7
            r7.a(r3)
            android.content.Context r0 = r7.a     // Catch:{ Exception -> 0x0082 }
            java.lang.String r1 = defpackage.c37.q()     // Catch:{ Exception -> 0x0082 }
            java.lang.String r2 = r0.getPackageName()     // Catch:{ Exception -> 0x0082 }
            boolean r2 = r1.equals(r2)     // Catch:{ Exception -> 0x0082 }
            if (r2 == 0) goto L_0x0045
            java.lang.String r1 = "tracer"
            goto L_0x005f
        L_0x0045:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0082 }
            java.lang.String r3 = "tracer-"
            r2.<init>(r3)     // Catch:{ Exception -> 0x0082 }
            r3 = 58
            r4 = 45
            java.lang.String r1 = r1.replace(r3, r4)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r1 = android.net.Uri.encode(r1)     // Catch:{ Exception -> 0x0082 }
            r2.append(r1)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x0082 }
        L_0x005f:
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0082 }
            java.io.File r0 = r0.getCacheDir()     // Catch:{ Exception -> 0x0082 }
            r2.<init>(r0, r1)     // Catch:{ Exception -> 0x0082 }
            defpackage.m6d.y(r2)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r0 = "tags"
            java.io.File r0 = defpackage.lk5.J(r2, r0)     // Catch:{ Exception -> 0x0082 }
            java.util.ArrayList r1 = r7.e     // Catch:{ Exception -> 0x0082 }
            monitor-enter(r1)     // Catch:{ Exception -> 0x0082 }
            java.util.ArrayList r7 = r7.e     // Catch:{ all -> 0x007f }
            java.util.List r7 = defpackage.x53.D0(r7)     // Catch:{ all -> 0x007f }
            monitor-exit(r1)     // Catch:{ Exception -> 0x0082 }
            defpackage.dy7.d(r0, r7)     // Catch:{ Exception -> 0x0082 }
            goto L_0x0082
        L_0x007f:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ Exception -> 0x0082 }
            throw r7     // Catch:{ Exception -> 0x0082 }
        L_0x0082:
            return
        L_0x0083:
            java.lang.Object r7 = r7.b
            jhe r7 = (defpackage.jhe) r7
            fd7 r0 = r7.f
            java.lang.String r1 = "Need to call openCaptureSession before using this API."
            defpackage.c54.o(r0, r1)
            q40 r0 = r7.b
            java.lang.Object r1 = r0.b
            monitor-enter(r1)
            java.lang.Object r0 = r0.o     // Catch:{ all -> 0x00b5 }
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0     // Catch:{ all -> 0x00b5 }
            r0.add(r7)     // Catch:{ all -> 0x00b5 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b5 }
            fd7 r0 = r7.f
            java.lang.Object r0 = r0.a
            ph4 r0 = (defpackage.ph4) r0
            java.lang.Object r0 = r0.a
            android.hardware.camera2.CameraCaptureSession r0 = (android.hardware.camera2.CameraCaptureSession) r0
            r0.close()
            java.util.concurrent.Executor r0 = r7.c
            u3c r1 = new u3c
            r2 = 25
            r1.<init>(r2, r7)
            r0.execute(r1)
            return
        L_0x00b5:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00b5 }
            throw r7
        L_0x00b8:
            java.lang.Object r7 = r7.b
            ihe r7 = (defpackage.ihe) r7
            r7.g(r7)
            return
        L_0x00c0:
            java.lang.Object r7 = r7.b
            u00 r7 = (defpackage.u00) r7
            r7.f()
            return
        L_0x00c8:
            java.lang.Object r7 = r7.b
            nw4 r7 = (defpackage.nw4) r7
            java.lang.Object r7 = r7.o
            xs4 r7 = (defpackage.xs4) r7
            if (r7 == 0) goto L_0x00ea
            java.util.Collection r7 = r7.values()
            java.util.Iterator r7 = r7.iterator()
        L_0x00da:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00ea
            java.lang.Object r0 = r7.next()
            iee r0 = (defpackage.iee) r0
            r0.c()
            goto L_0x00da
        L_0x00ea:
            return
        L_0x00eb:
            java.lang.Object r7 = r7.b
            java.util.concurrent.CountDownLatch r7 = (java.util.concurrent.CountDownLatch) r7
            r7.countDown()
            return
        L_0x00f3:
            java.lang.Object r7 = r7.b
            f9e r7 = (defpackage.f9e) r7
            r7.b()
            return
        L_0x00fb:
            java.lang.Object r7 = r7.b
            svd r7 = (defpackage.svd) r7
            android.view.Surface r0 = r7.v0
            if (r0 == 0) goto L_0x011b
            java.util.concurrent.CopyOnWriteArrayList r2 = r7.a
            java.util.Iterator r2 = r2.iterator()
        L_0x0109:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x011b
            java.lang.Object r3 = r2.next()
            n75 r3 = (defpackage.n75) r3
            t75 r3 = r3.a
            r3.m2(r1)
            goto L_0x0109
        L_0x011b:
            android.graphics.SurfaceTexture r2 = r7.u0
            if (r2 == 0) goto L_0x0122
            r2.release()
        L_0x0122:
            if (r0 == 0) goto L_0x0127
            r0.release()
        L_0x0127:
            r7.u0 = r1
            r7.v0 = r1
            return
        L_0x012c:
            java.lang.Object r7 = r7.b
            g03 r7 = (defpackage.g03) r7
            java.lang.Object r0 = r7.c
            ard r0 = (defpackage.ard) r0
            pgf r0 = r0.o
            long r1 = r7.b
            r0.h(r1)
            return
        L_0x013c:
            java.lang.Object r7 = r7.b
            l7b r7 = (defpackage.l7b) r7
            r7.getClass()
            java.lang.Object r0 = r7.b     // Catch:{ Exception -> 0x0226 }
            khe r0 = (defpackage.khe) r0     // Catch:{ Exception -> 0x0226 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x0226 }
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0     // Catch:{ Exception -> 0x0226 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0226 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ Exception -> 0x0226 }
            java.util.Map r0 = defpackage.mz7.d0(r0)     // Catch:{ Exception -> 0x0226 }
            java.io.DataOutputStream r4 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x0226 }
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x0226 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0226 }
            java.lang.Object r7 = r7.c     // Catch:{ Exception -> 0x0226 }
            k56 r7 = (defpackage.k56) r7     // Catch:{ Exception -> 0x0226 }
            java.lang.Object r7 = r7.invoke()     // Catch:{ Exception -> 0x0226 }
            java.io.File r7 = (java.io.File) r7     // Catch:{ Exception -> 0x0226 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x0226 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0226 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0226 }
            r4.writeInt(r2)     // Catch:{ all -> 0x01ac }
            int r7 = r0.size()     // Catch:{ all -> 0x01ac }
            r4.writeInt(r7)     // Catch:{ all -> 0x01ac }
            java.util.Set r7 = r0.entrySet()     // Catch:{ all -> 0x01ac }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x01ac }
        L_0x0182:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x01ac }
            if (r0 == 0) goto L_0x021c
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x01ac }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x01ac }
            java.lang.Object r5 = r0.getKey()     // Catch:{ all -> 0x01ac }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x01ac }
            r4.writeUTF(r5)     // Catch:{ all -> 0x01ac }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x01ac }
            boolean r5 = r0 instanceof java.lang.Boolean     // Catch:{ all -> 0x01ac }
            if (r5 == 0) goto L_0x01af
            r4.writeInt(r3)     // Catch:{ all -> 0x01ac }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01ac }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01ac }
            r4.writeBoolean(r0)     // Catch:{ all -> 0x01ac }
            goto L_0x0182
        L_0x01ac:
            r7 = move-exception
            goto L_0x0220
        L_0x01af:
            boolean r5 = r0 instanceof java.lang.Integer     // Catch:{ all -> 0x01ac }
            if (r5 == 0) goto L_0x01c1
            r5 = 3
            r4.writeInt(r5)     // Catch:{ all -> 0x01ac }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x01ac }
            int r0 = r0.intValue()     // Catch:{ all -> 0x01ac }
            r4.writeInt(r0)     // Catch:{ all -> 0x01ac }
            goto L_0x0182
        L_0x01c1:
            boolean r5 = r0 instanceof java.lang.Long     // Catch:{ all -> 0x01ac }
            if (r5 == 0) goto L_0x01d3
            r5 = 4
            r4.writeInt(r5)     // Catch:{ all -> 0x01ac }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x01ac }
            long r5 = r0.longValue()     // Catch:{ all -> 0x01ac }
            r4.writeLong(r5)     // Catch:{ all -> 0x01ac }
            goto L_0x0182
        L_0x01d3:
            boolean r5 = r0 instanceof java.lang.Float     // Catch:{ all -> 0x01ac }
            if (r5 == 0) goto L_0x01e5
            r5 = 5
            r4.writeInt(r5)     // Catch:{ all -> 0x01ac }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x01ac }
            float r0 = r0.floatValue()     // Catch:{ all -> 0x01ac }
            r4.writeFloat(r0)     // Catch:{ all -> 0x01ac }
            goto L_0x0182
        L_0x01e5:
            boolean r5 = r0 instanceof java.lang.Double     // Catch:{ all -> 0x01ac }
            if (r5 == 0) goto L_0x01f7
            r5 = 6
            r4.writeInt(r5)     // Catch:{ all -> 0x01ac }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x01ac }
            double r5 = r0.doubleValue()     // Catch:{ all -> 0x01ac }
            r4.writeDouble(r5)     // Catch:{ all -> 0x01ac }
            goto L_0x0182
        L_0x01f7:
            boolean r5 = r0 instanceof java.lang.String     // Catch:{ all -> 0x01ac }
            if (r5 == 0) goto L_0x0205
            r4.writeInt(r2)     // Catch:{ all -> 0x01ac }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01ac }
            r4.writeUTF(r0)     // Catch:{ all -> 0x01ac }
            goto L_0x0182
        L_0x0205:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x01ac }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ac }
            r1.<init>()     // Catch:{ all -> 0x01ac }
            java.lang.String r2 = "Write unknown type of value "
            r1.append(r2)     // Catch:{ all -> 0x01ac }
            r1.append(r0)     // Catch:{ all -> 0x01ac }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01ac }
            r7.<init>(r0)     // Catch:{ all -> 0x01ac }
            throw r7     // Catch:{ all -> 0x01ac }
        L_0x021c:
            defpackage.v3c.i(r4, r1)     // Catch:{ Exception -> 0x0226 }
            goto L_0x0226
        L_0x0220:
            throw r7     // Catch:{ all -> 0x0221 }
        L_0x0221:
            r0 = move-exception
            defpackage.v3c.i(r4, r7)     // Catch:{ Exception -> 0x0226 }
            throw r0     // Catch:{ Exception -> 0x0226 }
        L_0x0226:
            return
        L_0x0227:
            java.lang.Object r7 = r7.b
            ey1 r7 = (defpackage.ey1) r7
            java.lang.Object r7 = r7.b
            e70 r7 = (defpackage.e70) r7
            r7.q = r2
            int r0 = r7.g
            if (r0 != r3) goto L_0x0238
            r7.a()
        L_0x0238:
            return
        L_0x0239:
            java.lang.Object r7 = r7.b
            rod r7 = (defpackage.rod) r7
            r7.g()
            return
        L_0x0241:
            java.lang.Object r7 = r7.b
            er0 r7 = (defpackage.er0) r7
            r7.c = r0
            java.lang.Object r0 = r7.e
            com.google.android.material.sidesheet.SideSheetBehavior r0 = (com.google.android.material.sidesheet.SideSheetBehavior) r0
            dnf r1 = r0.i
            if (r1 == 0) goto L_0x025b
            boolean r1 = r1.f()
            if (r1 == 0) goto L_0x025b
            int r0 = r7.b
            r7.b(r0)
            goto L_0x0264
        L_0x025b:
            int r1 = r0.h
            if (r1 != r3) goto L_0x0264
            int r7 = r7.b
            r0.y(r7)
        L_0x0264:
            return
        L_0x0265:
            java.lang.Object r7 = r7.b
            o23 r7 = (defpackage.o23) r7
            java.lang.Object r0 = r7.o
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            monitor-enter(r0)
            java.lang.Object r1 = r7.a     // Catch:{ all -> 0x02ab }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ all -> 0x02ab }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x02ab }
            java.lang.Object r2 = r7.b     // Catch:{ all -> 0x02ab }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x02ab }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02ab }
            r3.<init>()     // Catch:{ all -> 0x02ab }
            java.lang.Object r4 = r7.o     // Catch:{ all -> 0x02ab }
            java.util.ArrayDeque r4 = (java.util.ArrayDeque) r4     // Catch:{ all -> 0x02ab }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x02ab }
        L_0x0287:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x02ab }
            if (r5 == 0) goto L_0x029e
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x02ab }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x02ab }
            r3.append(r5)     // Catch:{ all -> 0x02ab }
            java.lang.Object r5 = r7.c     // Catch:{ all -> 0x02ab }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x02ab }
            r3.append(r5)     // Catch:{ all -> 0x02ab }
            goto L_0x0287
        L_0x029e:
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x02ab }
            android.content.SharedPreferences$Editor r7 = r1.putString(r2, r7)     // Catch:{ all -> 0x02ab }
            r7.commit()     // Catch:{ all -> 0x02ab }
            monitor-exit(r0)     // Catch:{ all -> 0x02ab }
            return
        L_0x02ab:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x02ab }
            throw r7
        L_0x02ae:
            java.lang.Object r7 = r7.b
            cd6 r7 = (defpackage.cd6) r7
            r7.k()
            return
        L_0x02b6:
            java.lang.Object r7 = r7.b
            d6d r7 = (defpackage.d6d) r7
            r7.getClass()
            e6d r1 = r7.f     // Catch:{ RuntimeException -> 0x02f4 }
            boolean r1 = r1.u     // Catch:{ RuntimeException -> 0x02f4 }
            if (r1 == 0) goto L_0x02c4
            goto L_0x032a
        L_0x02c4:
            e6d r1 = r7.f     // Catch:{ RuntimeException -> 0x02f4 }
            r1.h()     // Catch:{ RuntimeException -> 0x02f4 }
            long r3 = r7.c     // Catch:{ RuntimeException -> 0x02f4 }
            e6d r1 = r7.f     // Catch:{ RuntimeException -> 0x02f4 }
            long r5 = r1.w     // Catch:{ RuntimeException -> 0x02f4 }
            long r3 = r3 + r5
            r7.c = r3     // Catch:{ RuntimeException -> 0x02f4 }
            e6d r1 = r7.f     // Catch:{ RuntimeException -> 0x02f4 }
            xt r1 = r1.o     // Catch:{ RuntimeException -> 0x02f4 }
            r1.release()     // Catch:{ RuntimeException -> 0x02f4 }
            e6d r1 = r7.f     // Catch:{ RuntimeException -> 0x02f4 }
            r1.m = r0     // Catch:{ RuntimeException -> 0x02f4 }
            int r3 = r1.n     // Catch:{ RuntimeException -> 0x02f4 }
            int r3 = r3 + r2
            r1.n = r3     // Catch:{ RuntimeException -> 0x02f4 }
            zw6 r1 = r1.a     // Catch:{ RuntimeException -> 0x02f4 }
            int r1 = r1.size()     // Catch:{ RuntimeException -> 0x02f4 }
            if (r3 != r1) goto L_0x02f6
            e6d r1 = r7.f     // Catch:{ RuntimeException -> 0x02f4 }
            r1.n = r0     // Catch:{ RuntimeException -> 0x02f4 }
            int r0 = r1.s     // Catch:{ RuntimeException -> 0x02f4 }
            int r0 = r0 + r2
            r1.s = r0     // Catch:{ RuntimeException -> 0x02f4 }
            goto L_0x02f6
        L_0x02f4:
            r0 = move-exception
            goto L_0x031f
        L_0x02f6:
            e6d r0 = r7.f     // Catch:{ RuntimeException -> 0x02f4 }
            zw6 r1 = r0.a     // Catch:{ RuntimeException -> 0x02f4 }
            int r0 = r0.n     // Catch:{ RuntimeException -> 0x02f4 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ RuntimeException -> 0x02f4 }
            lv4 r0 = (defpackage.lv4) r0     // Catch:{ RuntimeException -> 0x02f4 }
            e6d r1 = r7.f     // Catch:{ RuntimeException -> 0x02f4 }
            vt r2 = r1.d     // Catch:{ RuntimeException -> 0x02f4 }
            android.os.Looper r3 = android.os.Looper.myLooper()     // Catch:{ RuntimeException -> 0x02f4 }
            r3.getClass()     // Catch:{ RuntimeException -> 0x02f4 }
            e6d r4 = r7.f     // Catch:{ RuntimeException -> 0x02f4 }
            md3 r5 = r4.e     // Catch:{ RuntimeException -> 0x02f4 }
            xt r0 = r2.B(r0, r3, r4, r5)     // Catch:{ RuntimeException -> 0x02f4 }
            r1.o = r0     // Catch:{ RuntimeException -> 0x02f4 }
            e6d r0 = r7.f     // Catch:{ RuntimeException -> 0x02f4 }
            xt r0 = r0.o     // Catch:{ RuntimeException -> 0x02f4 }
            r0.start()     // Catch:{ RuntimeException -> 0x02f4 }
            goto L_0x032a
        L_0x031f:
            e6d r7 = r7.f
            r1 = 1000(0x3e8, float:1.401E-42)
            androidx.media3.transformer.ExportException r0 = androidx.media3.transformer.ExportException.a(r0, r1)
            r7.d(r0)
        L_0x032a:
            return
        L_0x032b:
            bc7[] r0 = one.me.sdk.gallery.selectalbum.SelectAlbumWidget.Y
            java.lang.Object r7 = r7.b
            one.me.sdk.gallery.selectalbum.SelectAlbumWidget r7 = (one.me.sdk.gallery.selectalbum.SelectAlbumWidget) r7
            f6b r7 = r7.n0()
            r7.k()
            return
        L_0x0339:
            java.lang.Object r7 = r7.b
            ru.ok.tamtam.workmanager.SdkCoroutineWorker r7 = (ru.ok.tamtam.workmanager.SdkCoroutineWorker) r7
            ru.ok.tamtam.workmanager.SdkCoroutineWorker.b(r7)
            return
        L_0x0341:
            java.lang.Object r7 = r7.b
            wu1 r7 = (defpackage.wu1) r7
            r7.a()
            return
        L_0x0349:
            java.lang.Object r7 = r7.b
            zuc r7 = (defpackage.zuc) r7
            r7.c()
            return
        L_0x0351:
            java.lang.Object r7 = r7.b
            znc r7 = (defpackage.znc) r7
            r7.A()
            return
        L_0x0359:
            java.lang.Object r7 = r7.b
            ymc r7 = (defpackage.ymc) r7
            org.webrtc.VideoFrame$TextureBuffer r7 = r7.a
            r7.release()
            return
        L_0x0363:
            java.lang.Object r7 = r7.b
            djb r7 = (defpackage.djb) r7
            java.lang.Object r7 = r7.c
            wj4 r7 = (defpackage.wj4) r7
            boolean r0 = r7.b
            if (r0 != 0) goto L_0x0399
            java.lang.Object r0 = r7.g
            adc r0 = (defpackage.adc) r0
            n05 r1 = r0.F
            java.util.Objects.toString(r1)
            zm4 r1 = r0.a0
            r1.e()
            java.lang.Object r1 = r1.k
            bm7 r1 = (defpackage.bm7) r1
            bm7 r1 = defpackage.kq0.w(r1)
            v05 r2 = new v05
            java.lang.Object r3 = r7.d
            see r3 = (defpackage.see) r3
            java.io.Serializable r4 = r7.e
            bue r4 = (defpackage.bue) r4
            r5 = 26
            r2.<init>((java.lang.Object) r7, (java.lang.Object) r3, (java.lang.Object) r4, (int) r5)
            q6d r7 = r0.e
            r1.d(r2, r7)
        L_0x0399:
            return
        L_0x039a:
            java.lang.Object r7 = r7.b
            n05 r7 = (defpackage.n05) r7
            bj6 r0 = defpackage.xi4.a
            java.lang.Class<androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk> r1 = androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class
            vrb r0 = r0.e(r1)
            if (r0 == 0) goto L_0x03ab
            defpackage.adc.r(r7)
        L_0x03ab:
            return
        L_0x03ac:
            java.lang.Object r7 = r7.b
            ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl r7 = (ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl) r7
            ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl.onRecordStarted$lambda$5(r7)
            return
        L_0x03b4:
            java.lang.Object r7 = r7.b
            u6c r7 = (defpackage.u6c) r7
            androidx.recyclerview.widget.RecyclerView r7 = r7.d
            r7.Y()
            return
        L_0x03be:
            java.lang.Object r7 = r7.b
            f4c r7 = (defpackage.f4c) r7
            r7.w()
            return
        L_0x03c6:
            java.lang.Object r7 = r7.b
            t3c r7 = (defpackage.t3c) r7
            one.me.rlottie.RLottieDrawable r7 = r7.b
            vo0 r0 = r7.s1     // Catch:{ all -> 0x03d3 }
            if (r0 == 0) goto L_0x03d3
            r0.b()     // Catch:{ all -> 0x03d3 }
        L_0x03d3:
            android.os.Handler r0 = one.me.rlottie.RLottieDrawable.H1
            t3c r7 = r7.r1
            r0.post(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u3c.run():void");
    }
}
