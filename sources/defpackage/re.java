package defpackage;

import android.view.View;

/* renamed from: re  reason: default package */
public final class re implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ re(int i, View view, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006c, code lost:
        defpackage.v3c.i(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006f, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.wbd a() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.b
            v47 r0 = (defpackage.v47) r0
            wbd r1 = new wbd
            r1.<init>()
            ilc r0 = r0.a
            sy4 r2 = new sy4
            java.lang.String r3 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;"
            r4 = 28
            r2.<init>((int) r4, (java.lang.Object) r3)
            r3 = 0
            android.database.Cursor r0 = r0.o(r2, r3)
        L_0x0019:
            boolean r2 = r0.moveToNext()     // Catch:{ all -> 0x002c }
            if (r2 == 0) goto L_0x002e
            r2 = 0
            int r2 = r0.getInt(r2)     // Catch:{ all -> 0x002c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x002c }
            r1.add(r2)     // Catch:{ all -> 0x002c }
            goto L_0x0019
        L_0x002c:
            r5 = move-exception
            goto L_0x006a
        L_0x002e:
            defpackage.v3c.i(r0, r3)
            wbd r0 = defpackage.z7.a(r1)
            ky7 r1 = r0.a
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0069
            java.lang.Object r1 = r5.b
            v47 r1 = (defpackage.v47) r1
            q36 r1 = r1.h
            java.lang.String r2 = "Required value was null."
            if (r1 == 0) goto L_0x005f
            java.lang.Object r5 = r5.b
            v47 r5 = (defpackage.v47) r5
            q36 r5 = r5.h
            if (r5 == 0) goto L_0x0055
            r5.n()
            goto L_0x0069
        L_0x0055:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r2.toString()
            r5.<init>(r0)
            throw r5
        L_0x005f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = r2.toString()
            r5.<init>(r0)
            throw r5
        L_0x0069:
            return r0
        L_0x006a:
            throw r5     // Catch:{ all -> 0x006b }
        L_0x006b:
            r1 = move-exception
            defpackage.v3c.i(r0, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.re.a():wbd");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x007d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r1 = r19
            r2 = 5000(0x1388, double:2.4703E-320)
            r4 = 30000(0x7530, double:1.4822E-319)
            r6 = -1
            r0 = 2
            r8 = 0
            r9 = 1
            r10 = 0
            int r11 = r1.a
            switch(r11) {
                case 0: goto L_0x0549;
                case 1: goto L_0x0506;
                case 2: goto L_0x04fc;
                case 3: goto L_0x0466;
                case 4: goto L_0x045c;
                case 5: goto L_0x0425;
                case 6: goto L_0x0401;
                case 7: goto L_0x03cb;
                case 8: goto L_0x03c1;
                case 9: goto L_0x035e;
                case 10: goto L_0x0347;
                case 11: goto L_0x02e9;
                case 12: goto L_0x02e1;
                case 13: goto L_0x029f;
                case 14: goto L_0x0293;
                case 15: goto L_0x0237;
                case 16: goto L_0x01cd;
                case 17: goto L_0x01c3;
                case 18: goto L_0x01b7;
                case 19: goto L_0x0186;
                case 20: goto L_0x016a;
                case 21: goto L_0x0151;
                case 22: goto L_0x0110;
                case 23: goto L_0x0100;
                case 24: goto L_0x00f8;
                case 25: goto L_0x00ee;
                case 26: goto L_0x00e6;
                case 27: goto L_0x00ca;
                case 28: goto L_0x00c2;
                default: goto L_0x0011;
            }
        L_0x0011:
            java.lang.Object r0 = r1.b
            v47 r0 = (defpackage.v47) r0
            ilc r0 = r0.a
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.i
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r0.readLock()
            r2.lock()
            java.lang.Object r0 = r1.b     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007d }
            v47 r0 = (defpackage.v47) r0     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007d }
            boolean r0 = r0.b()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007d }
            if (r0 != 0) goto L_0x0036
        L_0x002a:
            r2.unlock()
            java.lang.Object r0 = r1.b
            v47 r0 = (defpackage.v47) r0
            r0.getClass()
            goto L_0x00b6
        L_0x0036:
            java.lang.Object r0 = r1.b     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007d }
            v47 r0 = (defpackage.v47) r0     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007d }
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007d }
            boolean r0 = r0.compareAndSet(r9, r10)     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007d }
            if (r0 != 0) goto L_0x0043
            goto L_0x002a
        L_0x0043:
            java.lang.Object r0 = r1.b     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007d }
            v47 r0 = (defpackage.v47) r0     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007d }
            ilc r0 = r0.a     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007d }
            boolean r0 = r0.k()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007d }
            if (r0 == 0) goto L_0x0050
            goto L_0x002a
        L_0x0050:
            java.lang.Object r0 = r1.b     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007d }
            v47 r0 = (defpackage.v47) r0     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007d }
            ilc r0 = r0.a     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007d }
            xde r0 = r0.h()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007d }
            k36 r3 = r0.getWritableDatabase()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007d }
            r3.n()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007d }
            wbd r0 = r19.a()     // Catch:{ all -> 0x0078 }
            r3.r0()     // Catch:{ all -> 0x0078 }
            r3.S()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007d }
        L_0x006b:
            r2.unlock()
            java.lang.Object r2 = r1.b
            v47 r2 = (defpackage.v47) r2
            r2.getClass()
            goto L_0x0083
        L_0x0076:
            r0 = move-exception
            goto L_0x00b7
        L_0x0078:
            r0 = move-exception
            r3.S()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007d }
            throw r0     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007d }
        L_0x007d:
            wz4 r0 = defpackage.wz4.a     // Catch:{ all -> 0x0076 }
            goto L_0x006b
        L_0x0080:
            wz4 r0 = defpackage.wz4.a     // Catch:{ all -> 0x0076 }
            goto L_0x006b
        L_0x0083:
            boolean r2 = r0.isEmpty()
            r2 = r2 ^ r9
            if (r2 == 0) goto L_0x00b6
            java.lang.Object r1 = r1.b
            v47 r1 = (defpackage.v47) r1
            rqc r2 = r1.k
            monitor-enter(r2)
            rqc r1 = r1.k     // Catch:{ all -> 0x00b0 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00b0 }
        L_0x0097:
            r3 = r1
            nqc r3 = (defpackage.nqc) r3     // Catch:{ all -> 0x00b0 }
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x00b0 }
            if (r4 == 0) goto L_0x00b2
            java.lang.Object r3 = r3.next()     // Catch:{ all -> 0x00b0 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x00b0 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x00b0 }
            t47 r3 = (defpackage.t47) r3     // Catch:{ all -> 0x00b0 }
            r3.a(r0)     // Catch:{ all -> 0x00b0 }
            goto L_0x0097
        L_0x00b0:
            r0 = move-exception
            goto L_0x00b4
        L_0x00b2:
            monitor-exit(r2)
            goto L_0x00b6
        L_0x00b4:
            monitor-exit(r2)
            throw r0
        L_0x00b6:
            return
        L_0x00b7:
            r2.unlock()
            java.lang.Object r1 = r1.b
            v47 r1 = (defpackage.v47) r1
            r1.getClass()
            throw r0
        L_0x00c2:
            java.lang.Object r0 = r1.b
            bu6 r0 = (defpackage.bu6) r0
            r0.requestLayout()
            return
        L_0x00ca:
            java.lang.Object r0 = r1.b
            vq7 r0 = (defpackage.vq7) r0
            java.lang.Object r1 = r0.o
            yh6 r1 = (defpackage.yh6) r1
            java.util.concurrent.atomic.AtomicReference r1 = r1.a
            java.lang.Object r1 = r1.getAndSet(r8)
            if (r1 == 0) goto L_0x00e5
            java.lang.Object r1 = r0.b
            android.os.Handler r1 = (android.os.Handler) r1
            java.lang.Object r0 = r0.o
            yh6 r0 = (defpackage.yh6) r0
            r1.removeCallbacks(r0)
        L_0x00e5:
            return
        L_0x00e6:
            java.lang.Object r0 = r1.b
            bm7 r0 = (defpackage.bm7) r0
            r0.cancel(r9)
            return
        L_0x00ee:
            java.lang.Object r0 = r1.b
            vd8 r0 = (defpackage.vd8) r0
            r0.v0 = r10
            r0.E()
            return
        L_0x00f8:
            java.lang.Object r0 = r1.b
            androidx.fragment.app.c r0 = (androidx.fragment.app.c) r0
            r0.A(r9)
            return
        L_0x0100:
            java.lang.Object r0 = r1.b
            androidx.fragment.app.a r0 = (androidx.fragment.app.a) r0
            w06 r1 = r0.X0
            if (r1 == 0) goto L_0x010f
            w06 r0 = r0.a0()
            r0.getClass()
        L_0x010f:
            return
        L_0x0110:
            java.lang.Object r0 = r1.b
            x30 r0 = (defpackage.x30) r0
            java.lang.Object r0 = r0.b
            ax7 r0 = (defpackage.ax7) r0
            cta r1 = defpackage.cta.FOLDERS_INIT_TO_RENDER
            qi9 r2 = r0.e
            java.lang.Object r3 = r2.f(r1)
            bta r3 = (defpackage.bta) r3
            if (r3 == 0) goto L_0x0150
            long r3 = r3.e
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0150
            java.lang.Object r1 = r2.f(r1)
            bta r1 = (defpackage.bta) r1
            if (r1 == 0) goto L_0x0150
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r8 = r1.b
            long r8 = r3 - r8
            r1.e = r8
            cta r1 = defpackage.cta.CHATS_INIT_TO_RENDER
            java.lang.Object r1 = r2.f(r1)
            bta r1 = (defpackage.bta) r1
            if (r1 == 0) goto L_0x014d
            long r1 = r1.e
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x014d
            goto L_0x0150
        L_0x014d:
            r0.f(r3)
        L_0x0150:
            return
        L_0x0151:
            bc7[] r0 = one.me.folders.list.FoldersListScreen.Z
            java.lang.Object r0 = r1.b
            one.me.folders.list.FoldersListScreen r0 = (one.me.folders.list.FoldersListScreen) r0
            r0.getClass()
            bc7[] r1 = one.me.folders.list.FoldersListScreen.Z
            r1 = r1[r10]
            q7c r2 = r0.Y
            java.lang.Object r0 = r2.T0(r0, r1)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r0.Y()
            return
        L_0x016a:
            java.lang.Object r0 = r1.b
            androidx.biometric.FingerprintDialogFragment r0 = (androidx.biometric.FingerprintDialogFragment) r0
            android.content.Context r1 = r0.d0()
            if (r1 != 0) goto L_0x0175
            goto L_0x0185
        L_0x0175:
            androidx.biometric.BiometricViewModel r2 = r0.D1
            r2.h(r9)
            androidx.biometric.BiometricViewModel r0 = r0.D1
            int r2 = defpackage.g0c.fingerprint_dialog_touch_sensor
            java.lang.String r1 = r1.getString(r2)
            r0.g(r1)
        L_0x0185:
            return
        L_0x0186:
            java.lang.Object r1 = r1.b
            zb5 r1 = (defpackage.zb5) r1
            int r2 = r1.L0
            android.animation.ValueAnimator r3 = r1.K0
            if (r2 == r9) goto L_0x0193
            if (r2 == r0) goto L_0x0196
            goto L_0x01b6
        L_0x0193:
            r3.cancel()
        L_0x0196:
            r2 = 3
            r1.L0 = r2
            java.lang.Object r1 = r3.getAnimatedValue()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            float[] r0 = new float[r0]
            r0[r10] = r1
            r1 = 0
            r0[r9] = r1
            r3.setFloatValues(r0)
            r0 = 500(0x1f4, float:7.0E-43)
            long r0 = (long) r0
            r3.setDuration(r0)
            r3.start()
        L_0x01b6:
            return
        L_0x01b7:
            java.lang.Object r0 = r1.b
            y15 r0 = (defpackage.y15) r0
            java.lang.Object r0 = r0.b
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            r0.set(r9)
            return
        L_0x01c3:
            java.lang.Object r0 = r1.b
            es4 r0 = (defpackage.es4) r0
            r0.z0 = r8
            r0.drawableStateChanged()
            return
        L_0x01cd:
            java.lang.Object r0 = r1.b
            ml4 r0 = (defpackage.ml4) r0
            java.util.ArrayList r2 = r0.a
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x020d
            long r2 = android.os.SystemClock.elapsedRealtime()
            r6 = r10
        L_0x01de:
            java.util.ArrayList r7 = r0.a
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x020d
            java.util.ArrayList r7 = r0.a
            java.lang.Object r7 = r7.get(r6)
            il4 r7 = (defpackage.il4) r7
            long r11 = r7.c
            long r13 = r2 - r4
            int r8 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r8 >= 0) goto L_0x020b
            android.os.Handler r7 = r7.a
            android.os.Looper r7 = r7.getLooper()
            r7.quit()
            java.util.ArrayList r7 = r0.a
            r7.remove(r6)
            int r7 = r0.e
            int r7 = r7 - r9
            r0.e = r7
            int r6 = r6 + -1
        L_0x020b:
            int r6 = r6 + r9
            goto L_0x01de
        L_0x020d:
            java.util.ArrayList r2 = r0.a
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0221
            java.util.ArrayList r2 = r0.c
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x021e
            goto L_0x0221
        L_0x021e:
            r0.h = r10
            goto L_0x0236
        L_0x0221:
            jm9 r2 = defpackage.tu0.l
            w4d r2 = r2.f
            java.lang.Object r2 = r2.b
            khe r2 = (defpackage.khe) r2
            java.lang.Object r2 = r2.getValue()
            java.util.concurrent.ScheduledExecutorService r2 = (java.util.concurrent.ScheduledExecutorService) r2
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2.schedule(r1, r4, r3)
            r0.h = r9
        L_0x0236:
            return
        L_0x0237:
            java.lang.Object r0 = r1.b
            ll4 r0 = (defpackage.ll4) r0
            java.util.LinkedList r2 = r0.a
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0279
            long r2 = android.os.SystemClock.elapsedRealtime()
            java.util.LinkedList r6 = r0.a
            int r6 = r6.size()
            r7 = r10
        L_0x024e:
            if (r7 >= r6) goto L_0x0279
            java.util.LinkedList r8 = r0.a
            java.lang.Object r8 = r8.get(r7)
            il4 r8 = (defpackage.il4) r8
            long r11 = r8.c
            long r13 = r2 - r4
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L_0x0277
            android.os.Handler r8 = r8.a
            android.os.Looper r8 = r8.getLooper()
            r8.quit()
            java.util.LinkedList r8 = r0.a
            r8.remove(r7)
            int r8 = r0.e
            int r8 = r8 - r9
            r0.e = r8
            int r7 = r7 + -1
            int r6 = r6 + -1
        L_0x0277:
            int r7 = r7 + r9
            goto L_0x024e
        L_0x0279:
            java.util.LinkedList r2 = r0.a
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x028d
            java.util.LinkedList r2 = r0.c
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x028a
            goto L_0x028d
        L_0x028a:
            r0.h = r10
            goto L_0x0292
        L_0x028d:
            defpackage.he.e(r1, r4)
            r0.h = r9
        L_0x0292:
            return
        L_0x0293:
            java.lang.Object r0 = r1.b
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            ij4 r1 = r0.o1
            android.app.Dialog r0 = r0.w1
            r1.onDismiss(r0)
            return
        L_0x029f:
            java.lang.Object r0 = r1.b
            bg4 r0 = (defpackage.bg4) r0
            java.lang.Object r2 = r0.b
            monitor-enter(r2)
            java.lang.Object r0 = r1.b     // Catch:{ all -> 0x02de }
            bg4 r0 = (defpackage.bg4) r0     // Catch:{ all -> 0x02de }
            java.lang.Object r3 = r0.X     // Catch:{ all -> 0x02de }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x02de }
            java.lang.Object r4 = r0.o     // Catch:{ all -> 0x02de }
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ all -> 0x02de }
            r0.X = r4     // Catch:{ all -> 0x02de }
            r0.o = r3     // Catch:{ all -> 0x02de }
            monitor-exit(r2)     // Catch:{ all -> 0x02de }
            int r0 = r4.size()
        L_0x02bb:
            if (r10 >= r0) goto L_0x02d2
            java.lang.Object r2 = r1.b
            bg4 r2 = (defpackage.bg4) r2
            java.lang.Object r2 = r2.X
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r2 = r2.get(r10)
            ag4 r2 = (defpackage.ag4) r2
            k0 r2 = (defpackage.k0) r2
            r2.n()
            int r10 = r10 + r9
            goto L_0x02bb
        L_0x02d2:
            java.lang.Object r0 = r1.b
            bg4 r0 = (defpackage.bg4) r0
            java.lang.Object r0 = r0.X
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            return
        L_0x02de:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x02de }
            throw r0
        L_0x02e1:
            java.lang.Object r0 = r1.b
            k56 r0 = (defpackage.k56) r0
            r0.invoke()
            return
        L_0x02e9:
            java.lang.String r2 = "%s: worker finished; %d workers left"
            java.lang.Class<md4> r3 = defpackage.md4.class
            java.lang.Object r0 = r1.b
            r1 = r0
            md4 r1 = (defpackage.md4) r1
            java.util.concurrent.BlockingQueue r0 = r1.o     // Catch:{ all -> 0x0300 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0300 }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x0300 }
            if (r0 == 0) goto L_0x0302
            r0.run()     // Catch:{ all -> 0x0300 }
            goto L_0x030b
        L_0x0300:
            r0 = move-exception
            goto L_0x0329
        L_0x0302:
            int r0 = defpackage.md4.s0     // Catch:{ all -> 0x0300 }
            java.lang.String r0 = "%s: Worker has nothing to run"
            java.lang.String r4 = r1.a     // Catch:{ all -> 0x0300 }
            defpackage.ta5.d(r3, r4, r0)     // Catch:{ all -> 0x0300 }
        L_0x030b:
            java.util.concurrent.atomic.AtomicInteger r0 = r1.Y
            int r0 = r0.decrementAndGet()
            java.util.concurrent.BlockingQueue r4 = r1.o
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x031d
            r1.b()
            goto L_0x0328
        L_0x031d:
            int r4 = defpackage.md4.s0
            java.lang.String r1 = r1.a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            defpackage.ta5.e(r3, r2, r1, r0)
        L_0x0328:
            return
        L_0x0329:
            java.util.concurrent.atomic.AtomicInteger r4 = r1.Y
            int r4 = r4.decrementAndGet()
            java.util.concurrent.BlockingQueue r5 = r1.o
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x033b
            r1.b()
            goto L_0x0346
        L_0x033b:
            int r5 = defpackage.md4.s0
            java.lang.String r1 = r1.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            defpackage.ta5.e(r3, r2, r1, r4)
        L_0x0346:
            throw r0
        L_0x0347:
            java.lang.Object r0 = r1.b
            ru.ok.messages.messages.widgets.Chronometer r0 = (ru.ok.messages.messages.widgets.Chronometer) r0
            boolean r1 = r0.x0
            if (r1 == 0) goto L_0x035d
            long r1 = android.os.SystemClock.elapsedRealtime()
            r0.k(r1)
            r1 = 1000(0x3e8, double:4.94E-321)
            re r3 = r0.G0
            r0.postDelayed(r3, r1)
        L_0x035d:
            return
        L_0x035e:
            bc7[] r0 = one.me.chats.list.ChatsListWidget.M0
            java.lang.Object r0 = r1.b
            one.me.chats.list.ChatsListWidget r0 = (one.me.chats.list.ChatsListWidget) r0
            nx2 r1 = r0.p0()
            q0e r1 = r1.G0
            java.lang.Object r1 = r1.getValue()
            mt2 r1 = (defpackage.mt2) r1
            boolean r1 = r1.b
            if (r1 != 0) goto L_0x03c0
            nx2 r1 = r0.p0()
            w7c r1 = r1.H0
            j0e r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            mt2 r1 = (defpackage.mt2) r1
            java.util.List r1 = r1.a
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x03c0
            nx2 r1 = r0.p0()
            w7c r1 = r1.K0
            j0e r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x03c0
            nx2 r1 = r0.p0()
            w7c r1 = r1.L0
            j0e r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x03c0
            dta r1 = new dta
            r1.<init>(r10)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            ax7 r0 = r0.L0
            r0.b(r1)
        L_0x03c0:
            return
        L_0x03c1:
            cfa r0 = defpackage.cfa.a
            java.lang.Object r1 = r1.b
            nfa r1 = (defpackage.nfa) r1
            r1.setAppearance(r0)
            return
        L_0x03cb:
            java.lang.Object r0 = r1.b
            oe1 r0 = (defpackage.oe1) r0
            java.util.ArrayList r4 = r0.i
            java.util.Iterator r4 = r4.iterator()
        L_0x03d5:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x03eb
            java.lang.Object r5 = r4.next()
            ne1 r5 = (defpackage.ne1) r5
            cp1 r5 = (defpackage.cp1) r5
            dp1 r5 = r5.l
            a4c r6 = r0.a
            r5.a(r6)
            goto L_0x03d5
        L_0x03eb:
            me1 r4 = r0.e
            r4.getClass()
            jbg r0 = r4.k     // Catch:{ IllegalStateException -> 0x03f6 }
            r0.postDelayed(r1, r2)     // Catch:{ IllegalStateException -> 0x03f6 }
            goto L_0x0400
        L_0x03f6:
            r0 = move-exception
            java.lang.String r1 = r4.j
            java.lang.String r2 = "OpenGL tread died, is it fine?"
            a4c r3 = r4.a
            r3.reportException(r1, r2, r0)
        L_0x0400:
            return
        L_0x0401:
            java.lang.Object r1 = r1.b
            er0 r1 = (defpackage.er0) r1
            r1.c = r10
            java.lang.Object r2 = r1.e
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r2
            dnf r3 = r2.M
            if (r3 == 0) goto L_0x041b
            boolean r3 = r3.f()
            if (r3 == 0) goto L_0x041b
            int r0 = r1.b
            r1.b(r0)
            goto L_0x0424
        L_0x041b:
            int r3 = r2.L
            if (r3 != r0) goto L_0x0424
            int r0 = r1.b
            r2.L(r0)
        L_0x0424:
            return
        L_0x0425:
            java.util.concurrent.ConcurrentHashMap r0 = defpackage.vo0.x
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x042f:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0447
            java.lang.Object r4 = r0.next()
            java.lang.Thread r4 = (java.lang.Thread) r4
            boolean r5 = r4.isAlive()
            if (r5 != 0) goto L_0x042f
            java.util.concurrent.ConcurrentHashMap r5 = defpackage.vo0.x
            r5.remove(r4)
            goto L_0x042f
        L_0x0447:
            java.util.concurrent.ConcurrentHashMap r0 = defpackage.vo0.x
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0459
            java.lang.Object r0 = r1.b
            vo0 r0 = (defpackage.vo0) r0
            re r0 = r0.p
            defpackage.he.e(r0, r2)
            goto L_0x045b
        L_0x0459:
            defpackage.vo0.y = r10
        L_0x045b:
            return
        L_0x045c:
            int r0 = defpackage.f6b.w0
            java.lang.Object r0 = r1.b
            f6b r0 = (defpackage.f6b) r0
            r0.setHalfScreen(r8)
            return
        L_0x0466:
            java.lang.Object r0 = r1.b
            yl7 r0 = (defpackage.yl7) r0
            boolean r2 = r0.z0
            if (r2 != 0) goto L_0x0470
            goto L_0x04f3
        L_0x0470:
            boolean r2 = r0.x0
            i90 r3 = r0.a
            if (r2 == 0) goto L_0x0489
            r0.x0 = r10
            r3.getClass()
            long r4 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            r3.e = r4
            r3.g = r6
            r3.f = r4
            r2 = 1056964608(0x3f000000, float:0.5)
            r3.h = r2
        L_0x0489:
            long r4 = r3.g
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x04a0
            long r4 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r8 = r3.g
            int r2 = r3.i
            long r11 = (long) r2
            long r8 = r8 + r11
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x04a0
            goto L_0x04a6
        L_0x04a0:
            boolean r2 = r0.e()
            if (r2 != 0) goto L_0x04a9
        L_0x04a6:
            r0.z0 = r10
            goto L_0x04f3
        L_0x04a9:
            boolean r2 = r0.y0
            android.view.View r4 = r0.c
            if (r2 == 0) goto L_0x04c7
            r0.y0 = r10
            long r13 = android.os.SystemClock.uptimeMillis()
            r17 = 0
            r18 = 0
            r15 = 3
            r16 = 0
            r11 = r13
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r11, r13, r15, r16, r17, r18)
            r4.onTouchEvent(r2)
            r2.recycle()
        L_0x04c7:
            long r8 = r3.f
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x04f4
            long r5 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            float r2 = r3.a(r5)
            r7 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r7 = r7 * r2
            float r7 = r7 * r2
            r8 = 1082130432(0x40800000, float:4.0)
            float r2 = r2 * r8
            float r2 = r2 + r7
            long r7 = r3.f
            long r7 = r5 - r7
            r3.f = r5
            float r5 = (float) r7
            float r5 = r5 * r2
            float r2 = r3.d
            float r5 = r5 * r2
            int r2 = (int) r5
            android.widget.ListView r0 = r0.B0
            r0.scrollListBy(r2)
            java.util.WeakHashMap r0 = defpackage.zmf.a
            r4.postOnAnimation(r1)
        L_0x04f3:
            return
        L_0x04f4:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Cannot compute scroll delta before calling start()"
            r0.<init>(r1)
            throw r0
        L_0x04fc:
            e5f r0 = defpackage.e5f.a
            java.lang.Object r1 = r1.b
            ry1 r1 = (defpackage.ry1) r1
            r1.resumeWith(r0)
            return
        L_0x0506:
            java.lang.Object r0 = r1.b
            r2 = r0
            wf r2 = (defpackage.wf) r2
            monitor-enter(r2)
            java.lang.Object r0 = r1.b     // Catch:{ all -> 0x0546 }
            wf r0 = (defpackage.wf) r0     // Catch:{ all -> 0x0546 }
            r0.a = r10     // Catch:{ all -> 0x0546 }
            java.lang.Object r3 = r0.o     // Catch:{ all -> 0x0546 }
            hc9 r3 = (defpackage.hc9) r3     // Catch:{ all -> 0x0546 }
            long r3 = r3.now()     // Catch:{ all -> 0x0546 }
            long r5 = r0.b     // Catch:{ all -> 0x0546 }
            long r3 = r3 - r5
            r5 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x053d
            java.lang.Object r0 = r1.b     // Catch:{ all -> 0x0546 }
            wf r0 = (defpackage.wf) r0     // Catch:{ all -> 0x0546 }
            java.lang.Object r0 = r0.Y     // Catch:{ all -> 0x0546 }
            pn0 r0 = (defpackage.pn0) r0     // Catch:{ all -> 0x0546 }
            if (r0 == 0) goto L_0x0544
            boolean r1 = r0.X     // Catch:{ all -> 0x0546 }
            if (r1 == 0) goto L_0x0539
            xn0 r0 = r0.Y     // Catch:{ all -> 0x0546 }
            if (r0 == 0) goto L_0x0544
            r0.h()     // Catch:{ all -> 0x0546 }
            goto L_0x0544
        L_0x0539:
            r0.clear()     // Catch:{ all -> 0x0546 }
            goto L_0x0544
        L_0x053d:
            java.lang.Object r0 = r1.b     // Catch:{ all -> 0x0546 }
            wf r0 = (defpackage.wf) r0     // Catch:{ all -> 0x0546 }
            r0.a()     // Catch:{ all -> 0x0546 }
        L_0x0544:
            monitor-exit(r2)     // Catch:{ all -> 0x0546 }
            return
        L_0x0546:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0546 }
            throw r0
        L_0x0549:
            java.lang.Object r0 = r1.b
            se r0 = (defpackage.se) r0
            r0.unscheduleSelf(r1)
            r0.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.re.run():void");
    }

    public /* synthetic */ re(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
