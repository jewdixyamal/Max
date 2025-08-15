package defpackage;

import android.content.Context;
import androidx.camera.video.internal.audio.AudioStream$AudioStreamException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* renamed from: e70  reason: default package */
public final class e70 {
    public final q6d a;
    public final AtomicReference b = new AtomicReference((Object) null);
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final qt0 d;
    public final mpd e;
    public final long f;
    public int g = 1;
    public lt0 h = lt0.b;
    public boolean i;
    public Executor j;
    public l7b k;
    public z05 l;
    public h7b m;
    public d70 n;
    public boolean o;
    public long p;
    public boolean q;
    public boolean r;
    public byte[] s;
    public double t;
    public long u = 0;
    public final int v;

    public e70(n90 n90, q6d q6d, Context context) {
        q6d q6d2 = new q6d(q6d);
        this.a = q6d2;
        this.f = TimeUnit.MILLISECONDS.toNanos(CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
        try {
            qt0 qt0 = new qt0(new h70(n90, context), n90);
            this.d = qt0;
            qt0.a(new ey1(4, this), q6d2);
            this.e = new mpd(n90);
            this.v = n90.d;
        } catch (AudioStream$AudioStreamException | IllegalArgumentException e2) {
            throw new Exception("Unable to create AudioStream", e2);
        }
    }

    public final void a() {
        Executor executor = this.j;
        l7b l7b = this.k;
        if (executor != null && l7b != null) {
            boolean z = this.r || this.o || this.q;
            if (!Objects.equals(this.b.getAndSet(Boolean.valueOf(z)), Boolean.valueOf(z))) {
                executor.execute(new u60((Object) l7b, z, 2));
            }
        }
    }

    public final void b(z05 z05) {
        z05 z052 = this.l;
        lt0 lt0 = null;
        if (z052 != null) {
            d70 d70 = this.n;
            Objects.requireNonNull(d70);
            z052.l(d70);
            this.l = null;
            this.n = null;
            this.m = null;
            this.h = lt0.b;
            d();
        }
        if (z05 != null) {
            this.l = z05;
            this.n = new d70(this, z05);
            this.m = new h7b((Object) this, 5, (Object) z05);
            try {
                bm7 j2 = z05.j();
                if (((oq1) j2).b.isDone()) {
                    lt0 = (lt0) ((oq1) j2).b.get();
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
            if (lt0 != null) {
                this.h = lt0;
                d();
            }
            this.l.f(this.a, this.n);
        }
    }

    public final void c() {
        z05 z05 = this.l;
        Objects.requireNonNull(z05);
        oq1 g2 = f8.g(new w05(z05, 1));
        h7b h7b = this.m;
        Objects.requireNonNull(h7b);
        kq0.a(g2, h7b, this.a);
    }

    public final void d() {
        int i2 = this.g;
        qt0 qt0 = this.d;
        if (i2 == 2) {
            boolean z = this.h == lt0.a;
            boolean z2 = !z;
            Executor executor = this.j;
            l7b l7b = this.k;
            if (!(executor == null || l7b == null || this.c.getAndSet(z2) == z2)) {
                executor.execute(new b(l7b, z2));
            }
            if (z) {
                if (!this.i) {
                    try {
                        qt0.start();
                        this.o = false;
                    } catch (AudioStream$AudioStreamException unused) {
                        this.o = true;
                        this.e.start();
                        this.p = System.nanoTime();
                        a();
                    }
                    this.i = true;
                    c();
                }
            } else if (this.i) {
                this.i = false;
                qt0.stop();
            }
        } else if (this.i) {
            this.i = false;
            qt0.stop();
        }
    }
}
