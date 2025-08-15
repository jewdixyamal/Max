package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* renamed from: ii8  reason: default package */
public class ii8 {
    public final zw6 A;
    public final Bundle B;
    public final Object a = new Object();
    public final Uri b;
    public final fi8 c;
    public final m68 d;
    public final oz7 e;
    public final Context f;
    public final sj8 g;
    public final si8 h;
    public final String i;
    public final obd j;
    public final qh8 k;
    public final Handler l;
    public final ao0 m;
    public final ci8 n;
    public final Handler o;
    public final boolean p;
    public final boolean q;
    public m4b r;
    public x4b s;
    public final PendingIntent t;
    public gi8 u;
    public w4d v;
    public cj8 w;
    public boolean x;
    public final long y;
    public boolean z;

    static {
        new sad(1);
    }

    public ii8(qh8 qh8, Context context, u75 u75, ffc ffc, oz7 oz7, Bundle bundle, Bundle bundle2, imc imc) {
        z04.J("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + oaf.e + "]");
        this.k = qh8;
        this.f = context;
        this.i = "";
        this.t = null;
        this.A = ffc;
        this.e = oz7;
        this.B = bundle2;
        this.m = imc;
        this.p = true;
        this.q = true;
        sj8 sj8 = new sj8(this);
        this.g = sj8;
        this.o = new Handler(Looper.getMainLooper());
        Looper looper = u75.E0;
        Handler handler = new Handler(looper);
        this.l = handler;
        this.r = m4b.F;
        this.c = new fi8(this, looper);
        this.d = new m68(this, looper);
        Uri build = new Uri.Builder().scheme(ii8.class.getName()).appendPath("").appendPath(String.valueOf(SystemClock.elapsedRealtime())).build();
        this.b = build;
        this.j = new obd(Process.myUid(), 1004001300, 4, context.getPackageName(), sj8, bundle);
        this.h = new si8(this, build, handler);
        u75 u752 = u75;
        ffc ffc2 = ffc;
        x4b x4b = new x4b(u752, ffc2, mh8.d, mh8.e, bundle2);
        this.s = x4b;
        oaf.W(handler, new vs5(this, 20, x4b));
        this.y = CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS;
        this.n = new ci8(this, 2);
        oaf.W(handler, new ci8(this, 3));
    }

    public static boolean j(oh8 oh8) {
        return oh8 != null && oh8.b == 0 && Objects.equals(oh8.a.a.a, "com.android.systemui");
    }

    public final boolean a(KeyEvent keyEvent, boolean z2) {
        wg3 wg3;
        oh8 e2 = this.k.a.e();
        e2.getClass();
        int keyCode = keyEvent.getKeyCode();
        if ((keyCode == 85 || keyCode == 79) && z2) {
            keyCode = 87;
        }
        if (keyCode == 126) {
            wg3 = new wg3(this, e2, 6);
        } else if (keyCode != 127) {
            if (keyCode != 272) {
                if (keyCode != 273) {
                    switch (keyCode) {
                        case 85:
                            if (!this.s.u()) {
                                wg3 = new wg3(this, e2, 5);
                                break;
                            } else {
                                wg3 = new wg3(this, e2, 4);
                                break;
                            }
                        case 86:
                            wg3 = new wg3(this, e2, 3);
                            break;
                        case 87:
                            break;
                        case 88:
                            break;
                        case 89:
                            wg3 = new wg3(this, e2, 2);
                            break;
                        case 90:
                            wg3 = new wg3(this, e2, 1);
                            break;
                        default:
                            return false;
                    }
                }
                wg3 = new wg3(this, e2, 9);
            }
            wg3 = new wg3(this, e2, 8);
        } else {
            wg3 = new wg3(this, e2, 7);
        }
        oaf.W(this.l, new v05((Object) this, (Object) wg3, (Object) e2, 13));
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002a A[Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002b A[Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(defpackage.oh8 r4, defpackage.hi8 r5) {
        /*
            r3 = this;
            sj8 r0 = r3.g
            m5d r1 = r0.e     // Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }
            cd6 r1 = r1.B(r4)     // Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }
            if (r1 == 0) goto L_0x0011
            int r3 = r1.i()     // Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }
            goto L_0x002c
        L_0x000f:
            r3 = move-exception
            goto L_0x0034
        L_0x0011:
            m5d r1 = r0.e     // Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }
            boolean r1 = r1.E(r4)     // Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }
            r2 = 0
            if (r1 != 0) goto L_0x0027
            si8 r3 = r3.h     // Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }
            m5d r3 = r3.e     // Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }
            boolean r3 = r3.E(r4)     // Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }
            if (r3 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r3 = r2
            goto L_0x0028
        L_0x0027:
            r3 = 1
        L_0x0028:
            if (r3 != 0) goto L_0x002b
            return
        L_0x002b:
            r3 = r2
        L_0x002c:
            nh8 r1 = r4.d     // Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }
            if (r1 == 0) goto L_0x004f
            r5.a(r1, r3)     // Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }
            goto L_0x004f
        L_0x0034:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Exception in "
            r5.<init>(r0)
            java.lang.String r4 = r4.toString()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            defpackage.z04.d0(r4, r3)
            goto L_0x004f
        L_0x004a:
            m5d r3 = r0.e
            r3.L(r4)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ii8.b(oh8, hi8):void");
    }

    public final void c(hi8 hi8) {
        zw6 y2 = this.g.e.y();
        for (int i2 = 0; i2 < y2.size(); i2++) {
            b((oh8) y2.get(i2), hi8);
        }
        try {
            hi8.a(this.h.h, 0);
        } catch (RemoteException e2) {
            z04.v("Exception in using media1 API", e2);
        }
    }

    public final Handler d() {
        return this.l;
    }

    public final oh8 e() {
        zw6 y2 = this.g.H0().y();
        for (int i2 = 0; i2 < y2.size(); i2++) {
            oh8 oh8 = (oh8) y2.get(i2);
            if (h(oh8)) {
                return oh8;
            }
        }
        return null;
    }

    public final void f(k3b k3b) {
        this.c.a(false, false);
        c(new ea8(k3b));
        try {
            qi8 qi8 = this.h.h;
            ui4 ui4 = this.r.q;
            qi8.p();
        } catch (RemoteException e2) {
            z04.v("Exception in using media1 API", e2);
        }
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [k1, java.lang.Object] */
    public final void g(oh8 oh8, boolean z2) {
        if (o()) {
            boolean z3 = this.s.t1(16) && this.s.R0() != null;
            boolean z4 = this.s.t1(31) || this.s.t1(20);
            oh8 s2 = s(oh8);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            fm9.k(!false);
            sparseBooleanArray.append(1, true);
            fm9.k(!false);
            k3b k3b = new k3b(new tm5(sparseBooleanArray));
            if (z3 || !z4) {
                if (!z3) {
                    z04.c0("Play requested without current MediaItem, but playback resumption prevented by missing available commands");
                }
                oaf.I(this.s);
                if (z2) {
                    p(s2);
                    return;
                }
                return;
            }
            this.e.getClass();
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
            ? obj = new Object();
            obj.m(unsupportedOperationException);
            obj.d(new h76(obj, 0, new td(this, s2, z2, k3b)), new xq1(2, this));
        }
    }

    public final boolean h(oh8 oh8) {
        return Objects.equals(oh8.a.a.a, this.f.getPackageName()) && oh8.b != 0 && new Bundle(oh8.e).getBoolean("androidx.media3.session.MediaNotificationManager", false);
    }

    public final boolean i() {
        boolean z2;
        synchronized (this.a) {
            z2 = this.x;
        }
        return z2;
    }

    public final bm7 k(oh8 oh8, ffc ffc) {
        return this.e.h(this.k, s(oh8), ffc);
    }

    public final mh8 l(oh8 oh8) {
        zw6 zw6 = null;
        if (!this.z || !j(oh8)) {
            this.e.getClass();
            k3b k3b = mh8.e;
            z9d z9d = mh8.d;
            mh8 mh8 = new mh8(z9d, k3b, (zw6) null);
            if (h(oh8)) {
                boolean z2 = true;
                this.z = true;
                x4b x4b = this.s;
                x4b.c = this.k.a.A;
                if (x4b.X.a(17) == k3b.a(17)) {
                    z2 = false;
                }
                x4b x4b2 = this.s;
                x4b2.o = z9d;
                x4b2.X = k3b;
                si8 si8 = this.h;
                if (z2) {
                    oaf.W(si8.f.l, new li8(si8, x4b2, 0));
                } else {
                    si8.S(x4b2);
                }
            }
            return mh8;
        }
        z9d z9d2 = mh8.d;
        z9d z9d3 = this.s.o;
        z9d3.getClass();
        k3b k3b2 = this.s.X;
        k3b2.getClass();
        zw6 zw62 = this.s.c;
        if (zw62 != null) {
            zw6 = zw6.j(zw62);
        }
        return new mh8(z9d3, k3b2, zw6);
    }

    public final ew6 m(oh8 oh8) {
        s(oh8);
        this.e.getClass();
        return fm9.F(new sad(-6));
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean n(defpackage.oh8 r10, android.content.Intent r11) {
        /*
            r9 = this;
            android.os.Bundle r0 = r11.getExtras()
            r1 = 0
            if (r0 == 0) goto L_0x0016
            java.lang.String r2 = "android.intent.extra.KEY_EVENT"
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L_0x0016
            android.os.Parcelable r0 = r0.getParcelable(r2)
            android.view.KeyEvent r0 = (android.view.KeyEvent) r0
            goto L_0x0017
        L_0x0016:
            r0 = r1
        L_0x0017:
            android.content.ComponentName r2 = r11.getComponent()
            java.lang.String r11 = r11.getAction()
            java.lang.String r3 = "android.intent.action.MEDIA_BUTTON"
            boolean r11 = java.util.Objects.equals(r11, r3)
            r3 = 0
            if (r11 == 0) goto L_0x00ea
            android.content.Context r11 = r9.f
            if (r2 == 0) goto L_0x003a
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r4 = r11.getPackageName()
            boolean r2 = java.util.Objects.equals(r2, r4)
            if (r2 == 0) goto L_0x00ea
        L_0x003a:
            if (r0 == 0) goto L_0x00ea
            int r2 = r0.getAction()
            if (r2 == 0) goto L_0x0044
            goto L_0x00ea
        L_0x0044:
            r9.u()
            oz7 r2 = r9.e
            r2.getClass()
            int r2 = r0.getKeyCode()
            int r4 = defpackage.oaf.a
            r5 = 21
            r6 = 1
            if (r4 < r5) goto L_0x005f
            boolean r11 = defpackage.ei8.a(r11)
            if (r11 == 0) goto L_0x005f
            r11 = r6
            goto L_0x0060
        L_0x005f:
            r11 = r3
        L_0x0060:
            int r4 = r10.b
            r5 = 85
            r7 = 79
            m68 r8 = r9.d
            if (r2 == r7) goto L_0x0082
            if (r2 == r5) goto L_0x0082
            java.lang.Object r10 = r8.b
            v05 r10 = (defpackage.v05) r10
            if (r10 == 0) goto L_0x007c
            r8.removeCallbacks(r10)
            java.lang.Object r10 = r8.b
            v05 r10 = (defpackage.v05) r10
            r8.b = r1
            r1 = r10
        L_0x007c:
            if (r1 == 0) goto L_0x00c3
            defpackage.oaf.W(r8, r1)
            goto L_0x00c3
        L_0x0082:
            if (r11 != 0) goto L_0x00ae
            if (r4 != 0) goto L_0x00ae
            int r11 = r0.getRepeatCount()
            if (r11 == 0) goto L_0x008d
            goto L_0x00ae
        L_0x008d:
            java.lang.Object r11 = r8.b
            v05 r11 = (defpackage.v05) r11
            if (r11 == 0) goto L_0x009c
            if (r11 == 0) goto L_0x009a
            r8.removeCallbacks(r11)
            r8.b = r1
        L_0x009a:
            r10 = r6
            goto L_0x00c4
        L_0x009c:
            v05 r9 = new v05
            r11 = 14
            r9.<init>((java.lang.Object) r8, (java.lang.Object) r10, (java.lang.Object) r0, (int) r11)
            r8.b = r9
            int r10 = android.view.ViewConfiguration.getDoubleTapTimeout()
            long r10 = (long) r10
            r8.postDelayed(r9, r10)
            return r6
        L_0x00ae:
            java.lang.Object r10 = r8.b
            v05 r10 = (defpackage.v05) r10
            if (r10 == 0) goto L_0x00be
            r8.removeCallbacks(r10)
            java.lang.Object r10 = r8.b
            v05 r10 = (defpackage.v05) r10
            r8.b = r1
            r1 = r10
        L_0x00be:
            if (r1 == 0) goto L_0x00c3
            defpackage.oaf.W(r8, r1)
        L_0x00c3:
            r10 = r3
        L_0x00c4:
            boolean r11 = r9.z
            if (r11 != 0) goto L_0x00e5
            si8 r9 = r9.h
            if (r2 == r5) goto L_0x00ce
            if (r2 != r7) goto L_0x00d4
        L_0x00ce:
            if (r10 == 0) goto L_0x00d4
            r9.C()
            return r6
        L_0x00d4:
            if (r4 == 0) goto L_0x00e4
            bi8 r9 = r9.j
            qz7 r9 = r9.b
            java.lang.Object r9 = r9.b
            e98 r9 = (defpackage.e98) r9
            android.media.session.MediaController r9 = r9.a
            r9.dispatchMediaButtonEvent(r0)
            return r6
        L_0x00e4:
            return r3
        L_0x00e5:
            boolean r9 = r9.a(r0, r10)
            return r9
        L_0x00ea:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ii8.n(oh8, android.content.Intent):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [k1, java.lang.Object] */
    public final boolean o() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            ? obj = new Object();
            this.o.post(new vs5(this, 18, obj));
            try {
                return ((Boolean) obj.get()).booleanValue();
            } catch (InterruptedException | ExecutionException e2) {
                throw new IllegalStateException(e2);
            }
        } else {
            w4d w4d = this.v;
            if (w4d == null) {
                return true;
            }
            w4d.getClass();
            int i2 = oaf.a;
            if (i2 < 31 || i2 >= 33) {
                return true;
            }
            bj8 bj8 = (bj8) w4d.b;
            if (!bj8.c().b) {
                return bj8.g(this.k, true);
            }
            return true;
        }
    }

    public final void p(oh8 oh8) {
        s(oh8);
        this.e.getClass();
    }

    public final ccd q(oh8 oh8, ffc ffc, int i2, long j2) {
        return oaf.g0(this.e.h(this.k, s(oh8), ffc), new fc5(i2, j2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0044, code lost:
        r0 = r8.d;
        r1 = (defpackage.v05) r0.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        if (r1 == null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        r0.removeCallbacks(r1);
        r0.b = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        r8.l.removeCallbacksAndMessages((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        defpackage.oaf.W(r8.l, new defpackage.ci8(r8, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        defpackage.z04.d0("Exception thrown while closing", r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r() {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Release "
            r0.<init>(r1)
            int r1 = java.lang.System.identityHashCode(r8)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " [AndroidXMedia3/1.4.1] ["
            r0.append(r1)
            java.lang.String r1 = defpackage.oaf.e
            r0.append(r1)
            java.lang.String r1 = "] ["
            r0.append(r1)
            java.lang.String r1 = defpackage.nc8.b()
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            defpackage.z04.J(r0)
            java.lang.Object r0 = r8.a
            monitor-enter(r0)
            boolean r1 = r8.x     // Catch:{ all -> 0x003d }
            if (r1 == 0) goto L_0x0040
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            return
        L_0x003d:
            r8 = move-exception
            goto L_0x00fa
        L_0x0040:
            r1 = 1
            r8.x = r1     // Catch:{ all -> 0x003d }
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            m68 r0 = r8.d
            java.lang.Object r1 = r0.b
            v05 r1 = (defpackage.v05) r1
            r2 = 0
            if (r1 == 0) goto L_0x0052
            r0.removeCallbacks(r1)
            r0.b = r2
        L_0x0052:
            android.os.Handler r0 = r8.l
            r0.removeCallbacksAndMessages(r2)
            android.os.Handler r0 = r8.l     // Catch:{ Exception -> 0x0063 }
            ci8 r1 = new ci8     // Catch:{ Exception -> 0x0063 }
            r3 = 0
            r1.<init>(r8, r3)     // Catch:{ Exception -> 0x0063 }
            defpackage.oaf.W(r0, r1)     // Catch:{ Exception -> 0x0063 }
            goto L_0x0069
        L_0x0063:
            r0 = move-exception
            java.lang.String r1 = "Exception thrown while closing"
            defpackage.z04.d0(r1, r0)
        L_0x0069:
            si8 r0 = r8.h
            r0.getClass()
            int r1 = defpackage.oaf.a
            ii8 r3 = r0.f
            bi8 r4 = r0.j
            r5 = 31
            if (r1 >= r5) goto L_0x00a0
            android.content.ComponentName r1 = r0.l
            if (r1 != 0) goto L_0x0084
            wh8 r1 = r4.a
            android.media.session.MediaSession r1 = r1.a
            r1.setMediaButtonReceiver(r2)
            goto L_0x00a0
        L_0x0084:
            android.content.Intent r5 = new android.content.Intent
            android.net.Uri r6 = r3.b
            java.lang.String r7 = "android.intent.action.MEDIA_BUTTON"
            r5.<init>(r7, r6)
            r5.setComponent(r1)
            android.content.Context r1 = r3.f
            int r6 = defpackage.si8.q
            r7 = 0
            android.app.PendingIntent r1 = android.app.PendingIntent.getBroadcast(r1, r7, r5, r6)
            wh8 r5 = r4.a
            android.media.session.MediaSession r5 = r5.a
            r5.setMediaButtonReceiver(r1)
        L_0x00a0:
            an r0 = r0.k
            if (r0 == 0) goto L_0x00a9
            android.content.Context r1 = r3.f
            r1.unregisterReceiver(r0)
        L_0x00a9:
            wh8 r0 = r4.a
            android.os.RemoteCallbackList r1 = r0.f
            r1.kill()
            android.media.session.MediaSession r1 = r0.a
            r1.setCallback(r2)
            uh8 r0 = r0.b
            java.util.concurrent.atomic.AtomicReference r0 = r0.c
            r0.set(r2)
            r1.release()
            sj8 r8 = r8.g
            m5d r0 = r8.e
            zw6 r0 = r0.y()
            java.util.Iterator r0 = r0.iterator()
        L_0x00cb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00df
            java.lang.Object r1 = r0.next()
            oh8 r1 = (defpackage.oh8) r1
            nh8 r1 = r1.d
            if (r1 == 0) goto L_0x00cb
            r1.onDisconnected()     // Catch:{ RemoteException -> 0x00cb }
            goto L_0x00cb
        L_0x00df:
            java.util.Set r8 = r8.f
            java.util.Iterator r8 = r8.iterator()
        L_0x00e5:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00f9
            java.lang.Object r0 = r8.next()
            oh8 r0 = (defpackage.oh8) r0
            nh8 r0 = r0.d
            if (r0 == 0) goto L_0x00e5
            r0.onDisconnected()     // Catch:{ RemoteException -> 0x00e5 }
            goto L_0x00e5
        L_0x00f9:
            return
        L_0x00fa:
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ii8.r():void");
    }

    public final oh8 s(oh8 oh8) {
        if (!this.z || !j(oh8)) {
            return oh8;
        }
        oh8 e2 = e();
        e2.getClass();
        return e2;
    }

    public final void t() {
        Handler handler = this.l;
        ci8 ci8 = this.n;
        handler.removeCallbacks(ci8);
        if (this.q) {
            long j2 = this.y;
            if (j2 <= 0) {
                return;
            }
            if (this.s.b() || this.s.a()) {
                handler.postDelayed(ci8, j2);
            }
        }
    }

    public final void u() {
        if (Looper.myLooper() != this.l.getLooper()) {
            throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
        }
    }
}
