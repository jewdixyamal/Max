package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.provider.MediaStore;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: fz6  reason: default package */
public final class fz6 implements hq7, sx3 {
    public static final String E0 = hq7.class.getSimpleName();
    public final ConcurrentHashMap A0;
    public final ConcurrentHashMap B0;
    public vxd C0;
    public final Object D0;
    public final je7 X;
    public final q0e Y;
    public final t03 Z;
    public final /* synthetic */ ContextScope a;
    public final ox3 b;
    public final kke c;
    public final ContentResolver o;
    public final q0e s0 = r0e.a(new b86(y76.a, 0, false, false));
    public final q0e t0;
    public final t03 u0;
    public final q0e v0;
    public final ac w0;
    public final AtomicInteger x0;
    public x77 y0;
    public final AtomicInteger z0;

    /* JADX WARNING: type inference failed for: r5v13, types: [l84, java.lang.Object] */
    public fz6(Context context, ox3 ox3, kke kke, je7 je7) {
        this.a = j1e.a(f46.a().plus(((w9a) kke).b()));
        this.b = ox3;
        this.c = kke;
        this.o = context.getContentResolver();
        this.X = je7;
        q0e a2 = r0e.a(new b86(x76.a, 0, false, true));
        this.Y = a2;
        this.Z = new t03(new w7c(a2), 15);
        q0e a3 = r0e.a(new b86(w76.a, 0, false, true));
        this.t0 = a3;
        this.u0 = new t03(new w7c(a3), 16);
        q0e a4 = r0e.a((Object) null);
        this.v0 = a4;
        this.w0 = new ac(new t03(a4, 11), 25, this);
        this.x0 = new AtomicInteger(0);
        this.z0 = new AtomicInteger(-1);
        this.A0 = new ConcurrentHashMap();
        this.B0 = new ConcurrentHashMap();
        f04 f04 = new f04(this);
        for (Uri registerContentObserver : y53.M(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, MediaStore.Video.Media.EXTERNAL_CONTENT_URI, MediaStore.Images.Media.INTERNAL_CONTENT_URI, MediaStore.Video.Media.INTERNAL_CONTENT_URI)) {
            try {
                this.o.registerContentObserver(registerContentObserver, true, f04);
            } catch (Throwable th) {
                this.b.g(hz4.a, th);
            }
        }
        bkg bkg = new bkg(14, this);
        es3 es3 = new es3(26, this);
        ox3 ox32 = this.b;
        kke kke2 = this.c;
        ? obj = new Object();
        obj.a = this;
        obj.b = ox32;
        obj.c = bkg;
        obj.d = es3;
        hm9.m("l84", "init", new Object[0]);
        j47.T(this, ((w9a) kke2).c().plus(ox32), (vx3) null, new fy7(obj, (Continuation) null), 2);
        this.D0 = new Object();
    }

    public static final Object a(a86 a86, fz6 fz6, Continuation continuation) {
        return j47.t0(((w9a) fz6.c).b(), new dz6(a86, fz6, (Continuation) null), continuation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r2 = (java.util.List) r2.A0.get(r3.a);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(defpackage.b86 r3) {
        /*
            r2 = this;
            int r0 = r3.b
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.util.concurrent.ConcurrentHashMap r2 = r2.A0
            a86 r0 = r3.a
            java.lang.Object r2 = r2.get(r0)
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L_0x0013
            return r1
        L_0x0013:
            int r2 = r2.size()
            int r3 = r3.b
            if (r2 >= r3) goto L_0x001c
            r1 = 1
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz6.b(b86):boolean");
    }

    public final List c(a86 a86) {
        List list = (List) this.A0.get(a86);
        return list == null ? nz4.a : list;
    }

    public final Object d(b86 b86, int i, Continuation continuation) {
        return j47.t0(((w9a) this.c).b(), new uy6(b86, i, this, (Continuation) null), continuation);
    }

    public final void e() {
        vxd vxd;
        synchronized (this.D0) {
            try {
                hm9.m(E0, "onContentChanged()", new Object[0]);
                vxd vxd2 = this.C0;
                if (!(vxd2 == null || !vxd2.isActive() || (vxd = this.C0) == null)) {
                    vxd.cancel((CancellationException) null);
                }
                this.C0 = j47.T(this, this.b, (vx3) null, new vy6(this, (Continuation) null), 2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        x77 x77 = this.y0;
        AtomicInteger atomicInteger = this.x0;
        String str = E0;
        Boolean bool = null;
        if (x77 != null) {
            int i = atomicInteger.get();
            x77 x772 = this.y0;
            Boolean valueOf = x772 != null ? Boolean.valueOf(x772.isActive()) : null;
            x77 x773 = this.y0;
            if (x773 != null) {
                bool = Boolean.valueOf(x773.isCompleted());
            }
            hm9.m(str, "prefetch " + i + " is not null, prefetchJob.isActive = " + valueOf + ", prefetchJob.isCompleted = " + bool, new Object[0]);
        } else if (!((eua) this.X.getValue()).c()) {
            hm9.m(str, "permission is not granted", new Object[0]);
        } else {
            int incrementAndGet = atomicInteger.incrementAndGet();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            hm9.m(str, "prefetch " + incrementAndGet + " start", new Object[0]);
            vxd T = j47.T(this, this.b, (vx3) null, new zy6(this, incrementAndGet, (Continuation) null), 2);
            T.invokeOnCompletion(new fy6(elapsedRealtime, incrementAndGet));
            this.y0 = T;
        }
    }

    public final lx3 getCoroutineContext() {
        return this.a.getCoroutineContext();
    }
}
