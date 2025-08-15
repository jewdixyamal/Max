package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.util.LruCache;
import android.util.Range;
import android.view.Surface;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: d15  reason: default package */
public final class d15 implements n05 {
    public static final Range E = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);
    public boolean A = false;
    public boolean B = false;
    public Future C;
    public int D;
    public final String a;
    public final Object b = new Object();
    public final boolean c;
    public final MediaFormat d;
    public final MediaCodec e;
    public final k05 f;
    public final u2 g;
    public final q6d h;
    public final bm7 i;
    public final lq1 j;
    public final ArrayDeque k = new ArrayDeque();
    public final ArrayDeque l = new ArrayDeque();
    public final HashSet m = new HashSet();
    public final HashSet n = new HashSet();
    public final ArrayDeque o = new ArrayDeque();
    public final bue p;
    public final pq9 q = new Object();
    public o05 r = o05.r;
    public Executor s = ju0.k();
    public Range t = E;
    public long u = 0;
    public boolean v = false;
    public Long w = null;
    public ScheduledFuture x = null;
    public b15 y = null;
    public boolean z = false;

    /* JADX WARNING: type inference failed for: r0v6, types: [pq9, java.lang.Object] */
    public d15(Executor executor, q05 q05) {
        executor.getClass();
        q05.getClass();
        LruCache lruCache = w43.a;
        try {
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType(q05.a());
            this.e = createEncoderByType;
            MediaCodecInfo codecInfo = createEncoderByType.getCodecInfo();
            this.h = new q6d(executor);
            MediaFormat b2 = q05.b();
            this.d = b2;
            bue c2 = q05.c();
            this.p = c2;
            if (q05 instanceof m90) {
                this.a = "AudioEncoder";
                this.c = false;
                this.f = new z05(this);
                u2 u2Var = new u2(codecInfo, q05.a());
                Objects.requireNonNull(((MediaCodecInfo.CodecCapabilities) u2Var.b).getAudioCapabilities());
                this.g = u2Var;
            } else if (q05 instanceof ic0) {
                this.a = "VideoEncoder";
                this.c = true;
                this.f = new c15(this);
                eff eff = new eff(codecInfo, q05.a());
                if (b2.containsKey("bitrate")) {
                    int integer = b2.getInteger("bitrate");
                    int intValue = eff.c.getBitrateRange().clamp(Integer.valueOf(integer)).intValue();
                    if (integer != intValue) {
                        b2.setInteger("bitrate", intValue);
                    }
                }
                this.g = eff;
            } else {
                throw new Exception("Unknown encoder config type");
            }
            Objects.toString(c2);
            Objects.toString(b2);
            try {
                h();
                AtomicReference atomicReference = new AtomicReference();
                this.i = kq0.w(f8.g(new dt0(atomicReference, 4)));
                lq1 lq1 = (lq1) atomicReference.get();
                lq1.getClass();
                this.j = lq1;
                i(1);
            } catch (MediaCodec.CodecException e2) {
                throw new Exception(e2);
            }
        } catch (IOException | IllegalArgumentException e3) {
            throw new Exception(e3);
        }
    }

    public final bm7 a() {
        switch (au1.s(this.D)) {
            case 0:
                return new dw6(1, new IllegalStateException("Encoder is not started yet."));
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                AtomicReference atomicReference = new AtomicReference();
                oq1 g2 = f8.g(new dt0(atomicReference, 3));
                lq1 lq1 = (lq1) atomicReference.get();
                lq1.getClass();
                this.l.offer(lq1);
                lq1.a(new kl4((Object) this, 9, (Object) lq1), this.h);
                c();
                return g2;
            case 7:
                return new dw6(1, new IllegalStateException("Encoder is in error state."));
            case 8:
                return new dw6(1, new IllegalStateException("Encoder is released."));
            default:
                throw new IllegalStateException("Unknown state: ".concat(rh4.r(this.D)));
        }
    }

    public final void b(int i2, String str, Throwable th) {
        switch (au1.s(this.D)) {
            case 0:
                d(i2, str, th);
                h();
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                i(8);
                l(new t05((Object) this, i2, (Object) str, (Object) th, 0));
                return;
            default:
                return;
        }
    }

    public final void c() {
        while (true) {
            ArrayDeque arrayDeque = this.l;
            if (!arrayDeque.isEmpty()) {
                ArrayDeque arrayDeque2 = this.k;
                if (!arrayDeque2.isEmpty()) {
                    lq1 lq1 = (lq1) arrayDeque.poll();
                    Objects.requireNonNull(lq1);
                    Integer num = (Integer) arrayDeque2.poll();
                    Objects.requireNonNull(num);
                    try {
                        f17 f17 = new f17(this.e, num.intValue());
                        if (lq1.b(f17)) {
                            this.m.add(f17);
                            kq0.w(f17.d).d(new kl4((Object) this, 7, (Object) f17), this.h);
                        } else {
                            f17.a();
                        }
                    } catch (MediaCodec.CodecException e2) {
                        b(1, e2.getMessage(), e2);
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void d(int i2, String str, Throwable th) {
        o05 o05;
        Executor executor;
        synchronized (this.b) {
            o05 = this.r;
            executor = this.s;
        }
        try {
            executor.execute(new f5(o05, i2, str, th));
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void e() {
        this.q.getClass();
        this.h.execute(new s05(this, pq9.u(), 0));
    }

    public final void f() {
        Surface surface;
        HashSet hashSet;
        if (this.z) {
            this.e.stop();
            this.z = false;
        }
        this.e.release();
        k05 k05 = this.f;
        if (k05 instanceof c15) {
            c15 c15 = (c15) k05;
            synchronized (c15.a) {
                surface = c15.b;
                c15.b = null;
                hashSet = new HashSet(c15.c);
                c15.c.clear();
            }
            if (surface != null) {
                surface.release();
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Surface) it.next()).release();
            }
        }
        i(9);
        this.j.b((Object) null);
    }

    public final void g() {
        this.e.setParameters(zr6.g(0, "request-sync"));
    }

    public final void h() {
        l05 l05;
        Executor executor;
        this.t = E;
        this.u = 0;
        this.o.clear();
        this.k.clear();
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((lq1) it.next()).c();
        }
        this.l.clear();
        this.e.reset();
        this.z = false;
        this.A = false;
        this.B = false;
        this.v = false;
        ScheduledFuture scheduledFuture = this.x;
        Surface surface = null;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.x = null;
        }
        Future future = this.C;
        if (future != null) {
            future.cancel(false);
            this.C = null;
        }
        b15 b15 = this.y;
        if (b15 != null) {
            b15.j = true;
        }
        b15 b152 = new b15(this);
        this.y = b152;
        this.e.setCallback(b152);
        this.e.configure(this.d, (Surface) null, (MediaCrypto) null, 1);
        k05 k05 = this.f;
        if (k05 instanceof c15) {
            c15 c15 = (c15) k05;
            c15.getClass();
            EncoderNotUsePersistentInputSurfaceQuirk encoderNotUsePersistentInputSurfaceQuirk = (EncoderNotUsePersistentInputSurfaceQuirk) xi4.a.e(EncoderNotUsePersistentInputSurfaceQuirk.class);
            synchronized (c15.a) {
                if (encoderNotUsePersistentInputSurfaceQuirk == null) {
                    try {
                        if (c15.b == null) {
                            surface = MediaCodec.createPersistentInputSurface();
                            c15.b = surface;
                        }
                        c15.Y.e.setInputSurface(c15.b);
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                } else {
                    Surface surface2 = c15.b;
                    if (surface2 != null) {
                        c15.c.add(surface2);
                    }
                    surface = c15.Y.e.createInputSurface();
                    c15.b = surface;
                }
                l05 = c15.o;
                executor = c15.X;
            }
            if (surface != null && l05 != null && executor != null) {
                try {
                    ((q6d) executor).execute(new kl4((Object) (tef) l05, 17, (Object) surface));
                } catch (RejectedExecutionException unused) {
                    String str = c15.Y.a;
                }
            }
        }
    }

    public final void i(int i2) {
        if (this.D != i2) {
            this.D = i2;
        }
    }

    public final void j() {
        k05 k05 = this.f;
        if (k05 instanceof z05) {
            ((z05) k05).a(false);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                arrayList.add(kq0.w(((f17) it.next()).d));
            }
            kq0.J(arrayList).d(new r05(this, 0), this.h);
        } else if (k05 instanceof c15) {
            try {
                if (xi4.a.e(SignalEosOutputBufferNotComeQuirk.class) != null) {
                    b15 b15 = this.y;
                    q6d q6d = this.h;
                    Future future = this.C;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.C = ju0.D().schedule((Runnable) new kl4((Object) q6d, 8, (Object) b15), 1000, TimeUnit.MILLISECONDS);
                }
                this.e.signalEndOfInputStream();
                this.B = true;
            } catch (MediaCodec.CodecException e2) {
                b(1, e2.getMessage(), e2);
            }
        }
    }

    public final void k() {
        this.q.getClass();
        this.h.execute(new s05(this, pq9.u(), 1));
    }

    public final void l(Runnable runnable) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.n;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(kq0.w(((e05) it.next()).X));
        }
        HashSet hashSet2 = this.m;
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            arrayList.add(kq0.w(((f17) it2.next()).d));
        }
        if (!arrayList.isEmpty()) {
            hashSet.size();
            hashSet2.size();
        }
        kq0.J(arrayList).d(new f5((Object) this, (Object) arrayList, (Object) runnable, 29), this.h);
    }
}
