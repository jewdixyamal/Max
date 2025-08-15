package defpackage;

import android.graphics.Bitmap;
import androidx.media3.transformer.ExportException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: xt6  reason: default package */
public final class xt6 implements xt {
    public final boolean a;
    public final lv4 b;
    public final ao0 c;
    public final wt d;
    public final ScheduledExecutorService e;
    public wqc f;
    public int g;
    public volatile int h;

    public xt6(lv4 lv4, wt wtVar, v24 v24, boolean z) {
        this.a = z;
        boolean z2 = true;
        fm9.k(lv4.e != -9223372036854775807L);
        fm9.k(lv4.f == -2147483647 ? false : z2);
        this.b = lv4;
        this.d = wtVar;
        this.c = v24;
        this.e = Executors.newSingleThreadScheduledExecutor();
        this.g = 0;
    }

    public final int a(fm5 fm5) {
        if (this.g == 2) {
            fm5.b = this.h;
        }
        return this.g;
    }

    public final void b(Bitmap bitmap, qy5 qy5) {
        try {
            wqc wqc = this.f;
            if (wqc == null) {
                this.f = this.d.c(qy5);
                this.e.schedule(new wt6(this, bitmap, qy5, 0), 10, TimeUnit.MILLISECONDS);
                return;
            }
            lv4 lv4 = this.b;
            int g2 = wqc.g(bitmap, new li3((float) lv4.f, 0, lv4.e));
            if (g2 == 1) {
                this.h = 100;
                this.f.e();
            } else if (g2 == 2) {
                this.e.schedule(new wt6(this, bitmap, qy5, 1), 10, TimeUnit.MILLISECONDS);
            } else if (g2 == 3) {
                this.h = 100;
            } else {
                throw new IllegalStateException();
            }
        } catch (ExportException e2) {
            this.d.d(e2);
        } catch (RuntimeException e3) {
            this.d.d(ExportException.a(e3, 1000));
        }
    }

    public final cx6 e() {
        return kfc.s0;
    }

    public final void release() {
        this.g = 0;
        this.e.shutdownNow();
    }

    public final void start() {
        this.g = 2;
        lv4 lv4 = this.b;
        long j = lv4.e;
        wt wtVar = this.d;
        wtVar.f(j);
        wtVar.b(1);
        ib8 ib8 = lv4.a.b;
        ib8.getClass();
        fm9.b(this.c.u(ib8.a), new qqd(15, (Object) this), this.e);
    }
}
