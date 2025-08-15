package defpackage;

import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.util.Map;

/* renamed from: ob4  reason: default package */
public final class ob4 implements lu6 {
    public final lu6 a;
    public final lu6 b;
    public final t2b c;
    public final ye d = new ye(1, this);
    public final Map e;

    public ob4(ye yeVar, we weVar, t2b t2b, Map map) {
        this.a = yeVar;
        this.b = weVar;
        this.c = t2b;
        this.e = map;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        r0 = (defpackage.lu6) r1.get(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.l43 a(defpackage.g05 r3, int r4, defpackage.pqb r5, defpackage.ju6 r6) {
        /*
            r2 = this;
            r6.getClass()
            r3.o0()
            ou6 r0 = r3.c
            if (r0 == 0) goto L_0x000e
            ou6 r1 = defpackage.ou6.c
            if (r0 != r1) goto L_0x0023
        L_0x000e:
            java.io.InputStream r1 = r3.n()
            if (r1 == 0) goto L_0x0023
            je7 r0 = defpackage.pu6.d
            ou6 r0 = defpackage.i24.o(r1)     // Catch:{ IOException -> 0x001d }
            r3.c = r0
            goto L_0x0023
        L_0x001d:
            r2 = move-exception
            defpackage.nu0.H(r2)
            r2 = 0
            throw r2
        L_0x0023:
            java.util.Map r1 = r2.e
            if (r1 == 0) goto L_0x0034
            java.lang.Object r0 = r1.get(r0)
            lu6 r0 = (defpackage.lu6) r0
            if (r0 == 0) goto L_0x0034
            l43 r2 = r0.a(r3, r4, r5, r6)
            return r2
        L_0x0034:
            ye r2 = r2.d
            l43 r2 = r2.a(r3, r4, r5, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ob4.a(g05, int, pqb, ju6):l43");
    }

    public final CloseableStaticBitmap b(g05 g05, ju6 ju6) {
        o43 a2 = this.c.a(g05, ju6.a);
        try {
            a2.getClass();
            hx6 hx6 = hx6.d;
            g05.o0();
            int i = g05.o;
            g05.o0();
            CloseableStaticBitmap of = CloseableStaticBitmap.of(a2, (pqb) hx6, i, g05.X);
            of.putExtra(HasExtraData.KEY_IS_ROUNDED, Boolean.FALSE);
            return of;
        } finally {
            o43.S(a2);
        }
    }
}
