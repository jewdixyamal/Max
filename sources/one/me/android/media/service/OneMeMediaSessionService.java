package one.me.android.media.service;

import android.content.Intent;
import android.os.Bundle;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/android/media/service/OneMeMediaSessionService;", "Lbj8;", "<init>", "()V", "media_release"}, k = 1, mv = {2, 0, 0})
public final class OneMeMediaSessionService extends bj8 {
    public qh8 s0;
    public ContextScope t0;

    public final qh8 e(oh8 oh8) {
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            qh8 qh8 = this.s0;
            ir6.d(us7, "OneMeMediaSessionService", "onGetSession, controllerInfo=" + oh8 + ", mediaSession=" + qh8, (Throwable) null);
        }
        return this.s0;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [a66, ffe] */
    /* JADX WARNING: type inference failed for: r10v0, types: [java.lang.Object, oz7] */
    public final void onCreate() {
        qh8 qh8;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, "OneMeMediaSessionService", "onCreate", (Throwable) null);
        }
        super.onCreate();
        ir6 ir62 = hm9.m;
        if (ir62 != null && ir62.c()) {
            ir62.d(us7.X, "OneMeMediaSessionService", "createMediaSession", (Throwable) null);
        }
        x65 x65 = new x65(this);
        wj8 wj8 = (wj8) u88.a.getAccessor().c(wj8.class);
        fm9.k(!x65.v);
        wj8.getClass();
        x65.d = new lc4(2, wj8);
        u75 a = x65.a();
        u35 u35 = new u35();
        i74 i74 = a.D0;
        i74.getClass();
        i74.Y.a(u35);
        try {
            Bundle bundle = Bundle.EMPTY;
            ls5 ls5 = zw6.b;
            qh8 = new qh8(this, a, ffc.X, new Object(), bundle, bundle, new imc(new v24(this)));
        } catch (RuntimeException e) {
            hm9.p("OneMeMediaSessionService", "Failed to create media session", e);
            a.release();
            qh8 = null;
        }
        this.s0 = qh8;
        if (qh8 != null) {
            hde a2 = f46.a();
            u88 u88 = u88.a;
            Class<kke> cls = kke.class;
            ContextScope a3 = j1e.a(a2.plus(((w9a) ((kke) u88.getAccessor().c(cls))).c().getImmediate()));
            this.t0 = a3;
            j47.T(a3, ((w9a) ((kke) u88.getAccessor().c(cls))).b(), (vx3) null, new ffe(2, (Continuation) null), 2);
        }
    }

    public final void onDestroy() {
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, "OneMeMediaSessionService", "onDestroy", (Throwable) null);
        }
        ContextScope contextScope = this.t0;
        if (contextScope != null) {
            j1e.i(contextScope, (CancellationException) null);
        }
        this.t0 = null;
        qh8 qh8 = this.s0;
        if (qh8 != null) {
            qh8.c().release();
            try {
                synchronized (qh8.b) {
                    qh8.c.remove(qh8.a.i);
                }
                qh8.a.r();
            } catch (Exception unused) {
            }
            this.s0 = null;
        }
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, "OneMeMediaSessionService", "onStartCommand, intent=" + intent + ", flags=" + i + ", startId=" + i2, (Throwable) null);
        }
        super.onStartCommand(intent, i, i2);
        return 1;
    }

    public final void onTaskRemoved(Intent intent) {
        stopSelf();
    }
}
