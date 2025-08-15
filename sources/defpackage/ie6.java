package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.work.WorkRequest;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ie6  reason: default package */
public final class ie6 implements Handler.Callback {
    public static final Status A0 = new Status(4, "The user must be signed in to make this API call.", (PendingIntent) null, (ph3) null);
    public static final Object B0 = new Object();
    public static ie6 C0;
    public static final Status z0 = new Status(4, "Sign-out occurred while this API call was in progress.", (PendingIntent) null, (ph3) null);
    public final Context X;
    public final ee6 Y;
    public final l7b Z;
    public long a = WorkRequest.MIN_BACKOFF_MILLIS;
    public boolean b = false;
    public moe c;
    public reg o;
    public final AtomicInteger s0 = new AtomicInteger(1);
    public final AtomicInteger t0 = new AtomicInteger(0);
    public final ConcurrentHashMap u0 = new ConcurrentHashMap(5, 0.75f, 1);
    public final xs v0 = new xs(0);
    public final xs w0 = new xs(0);
    public final fc9 x0;
    public volatile boolean y0 = true;

    public ie6(Context context, Looper looper) {
        ee6 ee6 = ee6.d;
        this.X = context;
        fc9 fc9 = new fc9(looper, (Handler.Callback) this, 2);
        Looper.getMainLooper();
        this.x0 = fc9;
        this.Y = ee6;
        this.Z = new l7b(17);
        PackageManager packageManager = context.getPackageManager();
        if (np8.k == null) {
            np8.k = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (np8.k.booleanValue()) {
            this.y0 = false;
        }
        fc9.sendMessage(fc9.obtainMessage(6));
    }

    public static Status c(zk zkVar, ph3 ph3) {
        return new Status(17, rh4.k("API: ", (String) zkVar.b.b, " is not available on this device. Connection failed with: ", String.valueOf(ph3)), ph3.c, ph3);
    }

    public static ie6 f(Context context) {
        ie6 ie6;
        HandlerThread handlerThread;
        synchronized (B0) {
            if (C0 == null) {
                synchronized (jkg.h) {
                    try {
                        handlerThread = jkg.j;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            jkg.j = handlerThread2;
                            handlerThread2.start();
                            handlerThread = jkg.j;
                        }
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = ee6.c;
                C0 = new ie6(applicationContext, looper);
            }
            ie6 = C0;
        }
        return ie6;
    }

    public final boolean a() {
        if (this.b) {
            return false;
        }
        xmc xmc = (xmc) wmc.h().a;
        if (xmc != null && !xmc.b) {
            return false;
        }
        int i = ((SparseIntArray) this.Z.b).get(203400000, -1);
        return i == -1 || i == 0;
    }

    public final boolean b(ph3 ph3, int i) {
        PendingIntent pendingIntent;
        boolean z;
        PendingIntent pendingIntent2;
        Boolean bool;
        ee6 ee6 = this.Y;
        Context context = this.X;
        ee6.getClass();
        synchronized (c37.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = c37.a;
            pendingIntent = null;
            if (!(context2 == null || (bool = c37.b) == null)) {
                if (context2 == applicationContext) {
                    z = bool.booleanValue();
                }
            }
            c37.b = null;
            boolean isInstantApp = applicationContext.getPackageManager().isInstantApp();
            c37.b = Boolean.valueOf(isInstantApp);
            c37.a = applicationContext;
            z = isInstantApp;
        }
        if (z) {
            return false;
        }
        int i2 = ph3.b;
        if (i2 == 0 || (pendingIntent2 = ph3.c) == null) {
            Intent a2 = ee6.a(i2, context, (String) null);
            if (a2 != null) {
                pendingIntent = PendingIntent.getActivity(context, 0, a2, 201326592);
            }
            pendingIntent2 = pendingIntent;
        }
        if (pendingIntent2 == null) {
            return false;
        }
        int i3 = ph3.b;
        int i4 = GoogleApiActivity.b;
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent2);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", true);
        ee6.f(context, i3, PendingIntent.getActivity(context, 0, intent, teg.a | 134217728));
        return true;
    }

    public final kdg d(de6 de6) {
        ConcurrentHashMap concurrentHashMap = this.u0;
        zk zkVar = de6.X;
        kdg kdg = (kdg) concurrentHashMap.get(zkVar);
        if (kdg == null) {
            kdg = new kdg(this, de6);
            concurrentHashMap.put(zkVar, kdg);
        }
        if (kdg.d.j()) {
            this.w0.add(zkVar);
        }
        kdg.j();
        return kdg;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [w82, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(defpackage.qne r7, int r8, defpackage.de6 r9) {
        /*
            r6 = this;
            if (r8 == 0) goto L_0x007a
            zk r9 = r9.X
            boolean r0 = r6.a()
            if (r0 != 0) goto L_0x000b
            goto L_0x0047
        L_0x000b:
            wmc r0 = defpackage.wmc.h()
            java.lang.Object r0 = r0.a
            xmc r0 = (defpackage.xmc) r0
            r1 = 1
            if (r0 == 0) goto L_0x0049
            boolean r2 = r0.b
            if (r2 == 0) goto L_0x0047
            java.util.concurrent.ConcurrentHashMap r2 = r6.u0
            java.lang.Object r2 = r2.get(r9)
            kdg r2 = (defpackage.kdg) r2
            if (r2 == 0) goto L_0x0044
            ok r3 = r2.d
            boolean r4 = r3 instanceof com.google.android.gms.common.internal.a
            if (r4 == 0) goto L_0x0047
            com.google.android.gms.common.internal.a r3 = (com.google.android.gms.common.internal.a) r3
            vig r4 = r3.F0
            if (r4 == 0) goto L_0x0044
            boolean r4 = r3.c()
            if (r4 != 0) goto L_0x0044
            wh3 r0 = defpackage.w82.b(r2, r3, r8)
            if (r0 == 0) goto L_0x0047
            int r3 = r2.n
            int r3 = r3 + r1
            r2.n = r3
            boolean r1 = r0.c
            goto L_0x0049
        L_0x0044:
            boolean r1 = r0.c
            goto L_0x0049
        L_0x0047:
            r8 = 0
            goto L_0x0069
        L_0x0049:
            w82 r0 = new w82
            r2 = 0
            if (r1 == 0) goto L_0x0054
            long r4 = java.lang.System.currentTimeMillis()
            goto L_0x0055
        L_0x0054:
            r4 = r2
        L_0x0055:
            if (r1 == 0) goto L_0x005b
            long r2 = android.os.SystemClock.elapsedRealtime()
        L_0x005b:
            r0.<init>()
            r0.o = r6
            r0.a = r8
            r0.X = r9
            r0.b = r4
            r0.c = r2
            r8 = r0
        L_0x0069:
            if (r8 == 0) goto L_0x007a
            ukg r7 = r7.a
            fc9 r6 = r6.x0
            r6.getClass()
            xm0 r9 = new xm0
            r9.<init>(r6)
            r7.b(r9, r8)
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ie6.e(qne, int, de6):void");
    }

    public final void g(ph3 ph3, int i) {
        if (!b(ph3, i)) {
            fc9 fc9 = this.x0;
            fc9.sendMessage(fc9.obtainMessage(5, i, 0, ph3));
        }
    }

    /* JADX WARNING: type inference failed for: r1v22, types: [de6, reg] */
    /* JADX WARNING: type inference failed for: r6v3, types: [de6, reg] */
    /* JADX WARNING: type inference failed for: r1v23, types: [de6, reg] */
    public final boolean handleMessage(Message message) {
        kdg kdg;
        pe5[] g;
        int i = message.what;
        fc9 fc9 = this.x0;
        ConcurrentHashMap concurrentHashMap = this.u0;
        long j = 300000;
        switch (i) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j = WorkRequest.MIN_BACKOFF_MILLIS;
                }
                this.a = j;
                fc9.removeMessages(12);
                for (zk obtainMessage : concurrentHashMap.keySet()) {
                    fc9.sendMessageDelayed(fc9.obtainMessage(12, obtainMessage), this.a);
                }
                break;
            case 2:
                au1.r(message.obj);
                throw null;
            case 3:
                for (kdg kdg2 : concurrentHashMap.values()) {
                    fp3.i(kdg2.o.x0);
                    kdg2.m = null;
                    kdg2.j();
                }
                break;
            case 4:
            case 8:
            case 13:
                udg udg = (udg) message.obj;
                kdg kdg3 = (kdg) concurrentHashMap.get(udg.c.X);
                if (kdg3 == null) {
                    kdg3 = d(udg.c);
                }
                boolean j2 = kdg3.d.j();
                peg peg = udg.a;
                if (j2 && this.t0.get() != udg.b) {
                    peg.a(z0);
                    kdg3.o();
                    break;
                } else {
                    kdg3.l(peg);
                    break;
                }
                break;
            case 5:
                int i2 = message.arg1;
                ph3 ph3 = (ph3) message.obj;
                Iterator it = concurrentHashMap.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        kdg = (kdg) it.next();
                        if (kdg.i == i2) {
                        }
                    } else {
                        kdg = null;
                    }
                }
                if (kdg == null) {
                    Log.wtf("GoogleApiManager", wg0.g(i2, "Could not find API instance ", " while trying to fail enqueued calls."), new Exception());
                    break;
                } else {
                    int i3 = ph3.b;
                    if (i3 != 13) {
                        kdg.b(c(kdg.e, ph3));
                        break;
                    } else {
                        this.Y.getClass();
                        int i4 = pe6.e;
                        StringBuilder m = au1.m("Error resolution was canceled by the user, original error message: ", ph3.b(i3), ": ");
                        m.append(ph3.o);
                        kdg.b(new Status(17, m.toString(), (PendingIntent) null, (ph3) null));
                        break;
                    }
                }
            case 6:
                Context context = this.X;
                if (context.getApplicationContext() instanceof Application) {
                    se0.a((Application) context.getApplicationContext());
                    se0 se0 = se0.X;
                    jdg jdg = new jdg(this);
                    se0.getClass();
                    synchronized (se0) {
                        se0.c.add(jdg);
                    }
                    AtomicBoolean atomicBoolean = se0.b;
                    boolean z = atomicBoolean.get();
                    AtomicBoolean atomicBoolean2 = se0.a;
                    if (!z) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean2.set(true);
                        }
                    }
                    if (!atomicBoolean2.get()) {
                        this.a = 300000;
                        break;
                    }
                }
                break;
            case 7:
                d((de6) message.obj);
                break;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    kdg kdg4 = (kdg) concurrentHashMap.get(message.obj);
                    fp3.i(kdg4.o.x0);
                    if (kdg4.k) {
                        kdg4.j();
                        break;
                    }
                }
                break;
            case 10:
                xs xsVar = this.w0;
                xsVar.getClass();
                qs qsVar = new qs(xsVar);
                while (qsVar.hasNext()) {
                    kdg kdg5 = (kdg) concurrentHashMap.remove((zk) qsVar.next());
                    if (kdg5 != null) {
                        kdg5.o();
                    }
                }
                xsVar.clear();
                break;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    kdg kdg6 = (kdg) concurrentHashMap.get(message.obj);
                    ie6 ie6 = kdg6.o;
                    fp3.i(ie6.x0);
                    boolean z2 = kdg6.k;
                    if (z2) {
                        if (z2) {
                            ie6 ie62 = kdg6.o;
                            fc9 fc92 = ie62.x0;
                            zk zkVar = kdg6.e;
                            fc92.removeMessages(11, zkVar);
                            ie62.x0.removeMessages(9, zkVar);
                            kdg6.k = false;
                        }
                        kdg6.b(ie6.Y.b(ie6.X, fe6.a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", (PendingIntent) null, (ph3) null) : new Status(22, "API failed to connect while resuming due to an unknown error.", (PendingIntent) null, (ph3) null));
                        kdg6.d.b("Timing out connection while resuming.");
                        break;
                    }
                }
                break;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                if (concurrentHashMap.containsKey(message.obj)) {
                    kdg kdg7 = (kdg) concurrentHashMap.get(message.obj);
                    fp3.i(kdg7.o.x0);
                    ok okVar = kdg7.d;
                    if (okVar.isConnected() && kdg7.h.isEmpty()) {
                        aab aab = kdg7.f;
                        if (((Map) aab.a).isEmpty() && ((Map) aab.b).isEmpty()) {
                            okVar.b("Timing out service connection.");
                            break;
                        } else {
                            kdg7.g();
                            break;
                        }
                    }
                }
                break;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                au1.r(message.obj);
                throw null;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ldg ldg = (ldg) message.obj;
                if (concurrentHashMap.containsKey(ldg.a)) {
                    kdg kdg8 = (kdg) concurrentHashMap.get(ldg.a);
                    if (kdg8.l.contains(ldg) && !kdg8.k) {
                        if (kdg8.d.isConnected()) {
                            kdg8.d();
                            break;
                        } else {
                            kdg8.j();
                            break;
                        }
                    }
                }
                break;
            case 16:
                ldg ldg2 = (ldg) message.obj;
                if (concurrentHashMap.containsKey(ldg2.a)) {
                    kdg kdg9 = (kdg) concurrentHashMap.get(ldg2.a);
                    if (kdg9.l.remove(ldg2)) {
                        ie6 ie63 = kdg9.o;
                        ie63.x0.removeMessages(15, ldg2);
                        ie63.x0.removeMessages(16, ldg2);
                        LinkedList linkedList = kdg9.c;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        Iterator it2 = linkedList.iterator();
                        while (true) {
                            boolean hasNext = it2.hasNext();
                            pe5 pe5 = ldg2.b;
                            if (!hasNext) {
                                int size = arrayList.size();
                                for (int i5 = 0; i5 < size; i5++) {
                                    peg peg2 = (peg) arrayList.get(i5);
                                    linkedList.remove(peg2);
                                    peg2.b(new UnsupportedApiCallException(pe5));
                                }
                                break;
                            } else {
                                peg peg3 = (peg) it2.next();
                                if ((peg3 instanceof odg) && (g = ((odg) peg3).g(kdg9)) != null) {
                                    int length = g.length;
                                    int i6 = 0;
                                    while (true) {
                                        if (i6 < length) {
                                            if (!s36.l(g[i6], pe5)) {
                                                i6++;
                                            } else if (i6 >= 0) {
                                                arrayList.add(peg3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case LangUtils.HASH_SEED /*17*/:
                moe moe = this.c;
                if (moe != null) {
                    if (moe.a > 0 || a()) {
                        if (this.o == null) {
                            this.o = new de6(this.X, reg.v0, (nk) ooe.b, ce6.c);
                        }
                        this.o.d(moe);
                    }
                    this.c = null;
                    break;
                }
                break;
            case 18:
                tdg tdg = (tdg) message.obj;
                int i7 = (tdg.c > 0 ? 1 : (tdg.c == 0 ? 0 : -1));
                y99 y99 = tdg.a;
                int i8 = tdg.b;
                if (i7 != 0) {
                    moe moe2 = this.c;
                    if (moe2 != null) {
                        List list = moe2.b;
                        if (moe2.a != i8 || (list != null && list.size() >= tdg.d)) {
                            fc9.removeMessages(17);
                            moe moe3 = this.c;
                            if (moe3 != null) {
                                if (moe3.a > 0 || a()) {
                                    if (this.o == null) {
                                        this.o = new de6(this.X, reg.v0, (nk) ooe.b, ce6.c);
                                    }
                                    this.o.d(moe3);
                                }
                                this.c = null;
                            }
                        } else {
                            moe moe4 = this.c;
                            if (moe4.b == null) {
                                moe4.b = new ArrayList();
                            }
                            moe4.b.add(y99);
                        }
                    }
                    if (this.c == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(y99);
                        this.c = new moe(i8, arrayList2);
                        fc9.sendMessageDelayed(fc9.obtainMessage(17), tdg.c);
                        break;
                    }
                } else {
                    moe moe5 = new moe(i8, Arrays.asList(new y99[]{y99}));
                    if (this.o == null) {
                        this.o = new de6(this.X, reg.v0, (nk) ooe.b, ce6.c);
                    }
                    this.o.d(moe5);
                    break;
                }
                break;
            case 19:
                this.b = false;
                break;
            default:
                return false;
        }
        return true;
    }
}
