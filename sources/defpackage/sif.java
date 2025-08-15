package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.sdk.camerax.vms.processor.VideoMessageProcessorException;

/* renamed from: sif  reason: default package */
public final class sif implements lee {
    public final zh6 X;
    public final CopyOnWriteArraySet Y = new CopyOnWriteArraySet();
    public final LinkedHashMap Z = new LinkedHashMap();
    public final String a;
    public final AtomicBoolean b = new AtomicBoolean();
    public final pif c;
    public final Handler o;
    public final float[] s0 = new float[16];
    public final float[] t0 = new float[16];
    public fjf u0;
    public boolean v0;
    public int w0;
    public boolean x0;

    public sif(Size size) {
        eu4 eu4 = eu4.d;
        String name = sif.class.getName();
        this.a = name;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, name, "init, preview=" + size + ", dr=" + eu4 + ", stencil=" + null + ", isStencilRecyclable=" + true, (Throwable) null);
        }
        c54.s(eu4);
        pif pif = new pif(this, size, eu4);
        this.c = pif;
        pif.start();
        Handler handler = new Handler(pif.getLooper());
        this.o = handler;
        Throwable th = (Throwable) pif.o.get();
        if (th != null) {
            release();
            throw (!(th instanceof VideoMessageProcessorException) ? new RuntimeException("Failed to create video message processor", th) : th);
        } else {
            this.X = new zh6(handler);
        }
    }

    public static final void d(sif sif, Size size, eu4 eu4) {
        String str = sif.a;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, str, "initRendererOnGl, previewSize=" + size + ", dynamicRange=" + eu4, (Throwable) null);
        }
        sif.e();
        if (!sif.v0) {
            fjf fjf = sif.u0;
            if (fjf == null) {
                sif.u0 = new fjf(size, eu4);
                return;
            }
            throw new IllegalStateException(("Renderer already created, " + fjf).toString());
        }
        throw new IllegalStateException("GL is already RELEASED!".toString());
    }

    public static void g(sif sif, k56 k56, k56 k562, int i) {
        String str;
        if ((i & 4) != 0) {
            k562 = null;
        }
        sif.getClass();
        if (!sif.o.post(new fre(sif, 10, k56))) {
            if (k562 == null || (str = (String) k562.invoke()) == null) {
                str = "";
            }
            hm9.p(sif.a, zr6.i("postToGl, failed to post '", str, "' to the GL thread!"), (Throwable) null);
        }
    }

    public final void a(see see) {
        String str = this.a;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, str, "onInputSurface, request=" + see, (Throwable) null);
        }
        if (this.b.get()) {
            see.d();
            return;
        }
        eu4 eu4 = see.c;
        c54.s(eu4);
        if (!this.o.post(new fre(this, 10, new a81(see, this, eu4, 15)))) {
            hm9.p(this.a, "postToGl, failed to post 'onInputSurface' to the GL thread!", (Throwable) null);
            see.d();
        }
    }

    public final void c(kee kee) {
        String str = this.a;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            Size size = kee.o;
            ir6.d(us7, str, "onOutputSurface, surfaceOutput=" + kee + ", size=" + size, (Throwable) null);
        }
        if (this.b.get()) {
            kee.close();
            return;
        }
        khf khf = new khf(kee, 3, this);
        e09 e09 = new e09(0, kee, kee.class, "close", "close()V", 0, 13);
        if (!this.o.post(new fre(this, 10, khf))) {
            hm9.p(this.a, "postToGl, failed to post 'onOutputSurface' to the GL thread!", (Throwable) null);
            e09.invoke();
        }
    }

    public final void e() {
        Thread currentThread = Thread.currentThread();
        pif pif = this.c;
        if (!tpa.f(currentThread, pif)) {
            throw new IllegalStateException(("Illegal thread=" + currentThread + ", expected=" + pif).toString());
        }
    }

    public final void f() {
        String str = this.a;
        hm9.m0(str, "maybeReleaseGl", new Object[0]);
        e();
        if (this.v0 && this.w0 == 0) {
            LinkedHashMap linkedHashMap = this.Z;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                kee kee = (kee) entry.getKey();
                hm9.m0(str, "close surface output=" + kee + ", surface=" + ((Surface) entry.getValue()), new Object[0]);
                kee.close();
            }
            linkedHashMap.clear();
            fjf fjf = this.u0;
            if (fjf != null) {
                fjf.q();
            }
            this.u0 = null;
            this.c.quitSafely();
        }
    }

    public final void h(Bitmap bitmap, boolean z) {
        String str = this.a;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            String J = ay7.J(bitmap);
            ir6.d(us7, str, "setStencil, " + J + ", recycle_after_consume=" + z, (Throwable) null);
        }
        g(this, new h39(this, bitmap, z), new bse(13), 2);
    }

    public final void release() {
        hm9.m0(this.a, "release", new Object[0]);
        this.Y.clear();
        if (!this.b.getAndSet(true)) {
            g(this, new rzd(12, this), (k56) null, 6);
        }
    }
}
