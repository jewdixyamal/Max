package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.play.core.appupdate.internal.zzy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ykg  reason: default package */
public final class ykg {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final o97 b;
    public final String c;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public boolean g;
    public final Intent h;
    public final WeakReference i;
    public final ajg j = new ajg(1, this);
    public final AtomicInteger k = new AtomicInteger(0);
    public hkg l;
    public IInterface m;

    public ykg(Context context, o97 o97) {
        Intent intent = fkg.f;
        this.a = context;
        this.b = o97;
        this.c = "AppUpdateService";
        this.h = intent;
        this.i = new WeakReference((Object) null);
    }

    public static void b(ykg ykg, pjg pjg) {
        IInterface iInterface = ykg.m;
        ArrayList arrayList = ykg.d;
        o97 o97 = ykg.b;
        if (iInterface == null && !ykg.g) {
            o97.b("Initiate binding to the service.", new Object[0]);
            arrayList.add(pjg);
            hkg hkg = new hkg(1, ykg);
            ykg.l = hkg;
            ykg.g = true;
            if (!ykg.a.bindService(ykg.h, hkg, 1)) {
                o97.b("Failed to bind to the service.", new Object[0]);
                ykg.g = false;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzy zzy = new zzy();
                    qne qne = ((pjg) it.next()).a;
                    if (qne != null) {
                        qne.c(zzy);
                    }
                }
                arrayList.clear();
            }
        } else if (ykg.g) {
            o97.b("Waiting to bind to the service.", new Object[0]);
            arrayList.add(pjg);
        } else {
            pjg.run();
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

    public final void c(qne qne) {
        synchronized (this.f) {
            this.e.remove(qne);
        }
        a().post(new gkg(0, this));
    }

    public final void d() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((qne) it.next()).c(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
