package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import defpackage.rjc;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
public abstract class BasePendingResult<R extends rjc> extends pag {
    public static final yu0 n = new yu0(11);
    public final Object e = new Object();
    public final CountDownLatch f = new CountDownLatch(1);
    public final ArrayList g = new ArrayList();
    public final AtomicReference h = new AtomicReference();
    public rjc i;
    public Status j;
    public volatile boolean k;
    public boolean l;
    public boolean m = false;

    public BasePendingResult(mdg mdg) {
        super(14);
        new fc9(mdg != null ? mdg.a.Y : Looper.getMainLooper(), 2);
        new WeakReference(mdg);
    }

    public final void O(wsa wsa) {
        synchronized (this.e) {
            try {
                if (R()) {
                    wsa.a(this.j);
                } else {
                    this.g.add(wsa);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract rjc P(Status status);

    public final void Q(Status status) {
        synchronized (this.e) {
            try {
                if (!R()) {
                    S(P(status));
                    this.l = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean R() {
        return this.f.getCount() == 0;
    }

    public final void S(rjc rjc) {
        synchronized (this.e) {
            try {
                if (!this.l) {
                    R();
                    fp3.p("Results have already been set", !R());
                    fp3.p("Result has already been consumed", !this.k);
                    this.i = rjc;
                    this.j = rjc.a();
                    this.f.countDown();
                    ArrayList arrayList = this.g;
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((wsa) arrayList.get(i2)).a(this.j);
                    }
                    arrayList.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
