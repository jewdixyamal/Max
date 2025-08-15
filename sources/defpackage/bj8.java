package defpackage;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import java.util.Iterator;

/* renamed from: bj8  reason: default package */
public abstract class bj8 extends Service {
    public ue X;
    public jc4 Y;
    public sh0 Z;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper());
    public final us c = new qpd(0);
    public aj8 o;

    public final void a(qh8 qh8) {
        qh8 qh82;
        boolean z = true;
        fm9.e("session is already released", !qh8.a.i());
        synchronized (this.a) {
            qh82 = (qh8) this.c.get(qh8.a.i);
            if (qh82 != null) {
                if (qh82 != qh8) {
                    z = false;
                }
            }
            fm9.e("Session ID should be unique", z);
            this.c.put(qh8.a.i, qh8);
        }
        if (qh82 == null) {
            oaf.W(this.b, new v05((Object) this, (Object) c(), (Object) qh8, 15));
        }
    }

    public final sh0 b() {
        sh0 sh0;
        synchronized (this.a) {
            try {
                if (this.Z == null) {
                    this.Z = new sh0(5, (Object) this);
                }
                sh0 = this.Z;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sh0;
    }

    public final ue c() {
        ue ueVar;
        synchronized (this.a) {
            try {
                if (this.X == null) {
                    if (this.Y == null) {
                        er0 er0 = new er0(getApplicationContext());
                        fm9.k(!er0.c);
                        jc4 jc4 = new jc4(er0);
                        er0.c = true;
                        this.Y = jc4;
                    }
                    this.X = new ue(this, this.Y, b());
                }
                ueVar = this.X;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ueVar;
    }

    public final boolean d(qh8 qh8) {
        boolean containsKey;
        synchronized (this.a) {
            containsKey = this.c.containsKey(qh8.a.i);
        }
        return containsKey;
    }

    public abstract qh8 e(oh8 oh8);

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(defpackage.qh8 r9, boolean r10) {
        /*
            r8 = this;
            ue r2 = r8.c()
            java.lang.Object r8 = r2.c
            bj8 r8 = (defpackage.bj8) r8
            boolean r8 = r8.d(r9)
            r0 = 1
            if (r8 == 0) goto L_0x0082
            a98 r8 = r2.b(r9)
            if (r8 == 0) goto L_0x0082
            mue r1 = r8.x0()
            boolean r1 = r1.q()
            if (r1 != 0) goto L_0x0082
            int r8 = r8.getPlaybackState()
            if (r8 == r0) goto L_0x0082
            int r8 = r2.a
            int r8 = r8 + r0
            r2.a = r8
            java.lang.Object r0 = r2.i
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r9)
            bm7 r0 = (defpackage.bm7) r0
            if (r0 == 0) goto L_0x0043
            boolean r1 = r0.isDone()
            if (r1 == 0) goto L_0x0043
            java.lang.Object r0 = defpackage.fm9.C(r0)     // Catch:{ ExecutionException -> 0x0043 }
            a98 r0 = (defpackage.a98) r0     // Catch:{ ExecutionException -> 0x0043 }
            goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            if (r0 == 0) goto L_0x005c
            r0.K()
            z88 r0 = r0.c
            boolean r1 = r0.isConnected()
            if (r1 == 0) goto L_0x0056
            zw6 r0 = r0.V0()
            goto L_0x005a
        L_0x0056:
            ls5 r0 = defpackage.zw6.b
            ffc r0 = defpackage.ffc.X
        L_0x005a:
            r4 = r0
            goto L_0x0061
        L_0x005c:
            ls5 r0 = defpackage.zw6.b
            ffc r0 = defpackage.ffc.X
            goto L_0x005a
        L_0x0061:
            ui0 r5 = new ui0
            r0 = 9
            r5.<init>((java.lang.Object) r2, (int) r8, (java.lang.Object) r9, (int) r0)
            android.os.Handler r8 = new android.os.Handler
            q3b r0 = r9.c()
            android.os.Looper r0 = r0.z1()
            r8.<init>(r0)
            nd8 r7 = new nd8
            r1 = 0
            r0 = r7
            r3 = r9
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            defpackage.oaf.W(r8, r7)
            goto L_0x0085
        L_0x0082:
            r2.d(r0)
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj8.f(qh8, boolean):void");
    }

    public final boolean g(qh8 qh8, boolean z) {
        try {
            f(qh8, c().i(qh8, z));
            return true;
        } catch (IllegalStateException e) {
            if (oaf.a < 31 || !zi8.a(e)) {
                throw e;
            }
            z04.v("Failed to start foreground", e);
            this.b.post(new nn6(14, this));
            return false;
        }
    }

    public final void h(qh8 qh8) {
        synchronized (this.a) {
            fm9.e("session not found", this.c.containsKey(qh8.a.i));
            this.c.remove(qh8.a.i);
        }
        oaf.W(this.b, new vs5(c(), 23, qh8));
    }

    public final IBinder onBind(Intent intent) {
        String action;
        aj8 aj8;
        qh8 e;
        cj8 cj8;
        if (intent == null || (action = intent.getAction()) == null) {
            return null;
        }
        if (action.equals("androidx.media3.session.MediaSessionService")) {
            synchronized (this.a) {
                aj8 = this.o;
                fm9.l(aj8);
            }
            return aj8;
        } else if (!action.equals("android.media.browse.MediaBrowserService") || (e = e(new oh8(new vi8("android.media.session.MediaController", -1, -1), 0, 0, false, (nh8) null, Bundle.EMPTY))) == null) {
            return null;
        } else {
            a(e);
            ii8 ii8 = e.a;
            synchronized (ii8.a) {
                try {
                    if (ii8.w == null) {
                        ai8 ai8 = ii8.k.a.h.j.a.c;
                        cj8 cj82 = new cj8(ii8);
                        cj82.a(ai8);
                        ii8.w = cj82;
                    }
                    cj8 = ii8.w;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            return cj8.onBind(new Intent("android.media.browse.MediaBrowserService"));
        }
    }

    public void onCreate() {
        super.onCreate();
        synchronized (this.a) {
            this.o = new aj8(this);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        synchronized (this.a) {
            try {
                aj8 aj8 = this.o;
                if (aj8 != null) {
                    aj8.c.clear();
                    aj8.d.removeCallbacksAndMessages((Object) null);
                    for (kr6 c2 : aj8.f) {
                        try {
                            c2.c(0);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.o = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        qh8 qh8;
        qh8 qh82;
        Intent intent2 = intent;
        if (intent2 == null) {
            return 1;
        }
        sh0 b2 = b();
        Uri data = intent.getData();
        Object obj = null;
        if (data != null) {
            synchronized (qh8.b) {
                try {
                    Iterator it = qh8.c.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            qh82 = null;
                            break;
                        }
                        qh82 = (qh8) it.next();
                        if (oaf.a(qh82.a.b, data)) {
                            break;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            qh8 = qh82;
        } else {
            qh8 = null;
        }
        b2.getClass();
        if ("android.intent.action.MEDIA_BUTTON".equals(intent.getAction())) {
            if (qh8 == null) {
                qh8 = e(new oh8(new vi8("android.media.session.MediaController", -1, -1), 0, 0, false, (nh8) null, Bundle.EMPTY));
                if (qh8 == null) {
                    return 1;
                }
                a(qh8);
            }
            ii8 ii8 = qh8.a;
            ii8.l.post(new vs5(ii8, 22, intent2));
        } else if (qh8 != null && "androidx.media3.session.CUSTOM_NOTIFICATION_ACTION".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            Object obj2 = extras != null ? extras.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION") : null;
            String str = obj2 instanceof String ? (String) obj2 : null;
            if (str == null) {
                return 1;
            }
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                obj = extras2.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS");
            }
            Bundle bundle = obj instanceof Bundle ? (Bundle) obj : Bundle.EMPTY;
            ue c2 = c();
            a98 b3 = c2.b(qh8);
            if (b3 != null) {
                oaf.W(new Handler(qh8.c().z1()), new md8(c2, qh8, str, bundle, b3));
            }
        }
        return 1;
    }
}
