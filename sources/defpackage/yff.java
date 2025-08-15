package defpackage;

import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: yff  reason: default package */
public final class yff implements sf6 {
    public final bgf a;
    public final AtomicLong b = new AtomicLong();
    public final long c;
    public final b8b d;

    public yff(bgf bgf, b8b b8b, long j) {
        this.a = bgf;
        this.c = j;
        this.d = b8b;
    }

    public final Surface a() {
        SparseArray sparseArray = ((rf4) this.a).d.g;
        fm9.k(oaf.l(sparseArray, 1));
        return ((r27) sparseArray.get(1)).a.j();
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [ww6, pw6] */
    public final void b(lv4 lv4, long j, qy5 qy5, boolean z) {
        int i;
        List list;
        long b2 = lv4.b(j);
        AtomicLong atomicLong = this.b;
        if (qy5 != null) {
            int i2 = qy5.w % 180;
            int i3 = qy5.u;
            int i4 = qy5.t;
            int i5 = i2 == 0 ? i4 : i3;
            if (i2 != 0) {
                i3 = i4;
            }
            lsd lsd = new lsd(i5, i3);
            String str = qy5.n;
            str.getClass();
            if (ia9.i(str)) {
                i = 2;
            } else if (str.equals("video/raw")) {
                i = 3;
            } else if (ia9.k(str)) {
                i = 1;
            } else {
                throw new IllegalArgumentException("MIME type not supported ".concat(str));
            }
            zw6 zw6 = lv4.g.b;
            b8b b8b = this.d;
            if (b8b == null) {
                list = zw6.j(zw6);
            } else {
                ? pw6 = new pw6(4);
                pw6.e(zw6);
                pw6.a(b8b);
                list = pw6.j();
            }
            i63 i63 = qy5.A;
            i63.getClass();
            ((rf4) this.a).c(i, list, new t26(i63, lsd.a, lsd.b, qy5.x, atomicLong.get() + this.c));
        }
        atomicLong.addAndGet(b2);
    }

    public final int c() {
        v2 v2Var = ((rf4) this.a).d.k;
        if (v2Var != null) {
            return v2Var.k();
        }
        return 0;
    }

    public final void e() {
        ((rf4) this.a).f();
    }

    public final int g(Bitmap bitmap, uue uue) {
        rf4 rf4 = (rf4) this.a;
        if (!rf4.k.e()) {
            return 2;
        }
        if (i63.g(rf4.p)) {
            fm9.e("VideoFrameProcessor configured for HDR output, but either received SDR input, or is on an API level that doesn't support gainmaps. SDR to HDR tonemapping is not supported.", oaf.a >= 34 && bitmap.hasGainmap());
        }
        t26 t26 = rf4.q;
        t26.getClass();
        v2 v2Var = rf4.d.k;
        fm9.l(v2Var);
        v2Var.o(bitmap, new t26(t26.a, t26.b, t26.c, t26.d, t26.e), uue);
        return 1;
    }

    public final boolean h(long j) {
        return ((rf4) this.a).b();
    }
}
