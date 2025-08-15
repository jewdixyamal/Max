package defpackage;

import android.graphics.BitmapFactory;
import android.net.Uri;

/* renamed from: v24  reason: default package */
public final class v24 implements ao0 {
    public static final jde o = c37.u(new xc3(1));
    public final qm7 a;
    public final q24 b;
    public final BitmapFactory.Options c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public v24(android.content.Context r3) {
        /*
            r2 = this;
            jde r0 = o
            java.lang.Object r0 = r0.get()
            qm7 r0 = (defpackage.qm7) r0
            defpackage.fm9.l(r0)
            h94 r1 = new h94
            r1.<init>(r3)
            r3 = 0
            r2.<init>(r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v24.<init>(android.content.Context):void");
    }

    public final bm7 B(byte[] bArr) {
        return ((mc9) this.a).a(new u24(this, 0, bArr));
    }

    public final bm7 u(Uri uri) {
        return ((mc9) this.a).a(new u24(this, 1, uri));
    }

    public v24(qm7 qm7, h94 h94, BitmapFactory.Options options) {
        this.a = qm7;
        this.b = h94;
        this.c = options;
    }
}
