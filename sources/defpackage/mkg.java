package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.play.core.review.internal.zzu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: mkg  reason: default package */
public final class mkg {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final qm4 b;
    public final String c;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public boolean g;
    public final Intent h;
    public final WeakReference i;
    public final ajg j = new ajg(0, this);
    public final AtomicInteger k = new AtomicInteger(0);
    public hkg l;
    public IInterface m;

    public mkg(Context context, qm4 qm4, Intent intent) {
        this.a = context;
        this.b = qm4;
        this.c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
        this.h = intent;
        this.i = new WeakReference((Object) null);
    }

    public static void b(mkg mkg, sig sig) {
        IInterface iInterface = mkg.m;
        ArrayList arrayList = mkg.d;
        qm4 qm4 = mkg.b;
        if (iInterface == null && !mkg.g) {
            qm4.b("Initiate binding to the service.", new Object[0]);
            arrayList.add(sig);
            hkg hkg = new hkg(0, mkg);
            mkg.l = hkg;
            mkg.g = true;
            if (!mkg.a.bindService(mkg.h, hkg, 1)) {
                qm4.b("Failed to bind to the service.", new Object[0]);
                mkg.g = false;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzu zzu = new zzu();
                    qne qne = ((sig) it.next()).a;
                    if (qne != null) {
                        qne.c(zzu);
                    }
                }
                arrayList.clear();
            }
        } else if (mkg.g) {
            qm4.b("Waiting to bind to the service.", new Object[0]);
            arrayList.add(sig);
        } else {
            sig.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = n;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    hashMap.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((qne) it.next()).c(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
