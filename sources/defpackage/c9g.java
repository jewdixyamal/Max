package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;

/* renamed from: c9g  reason: default package */
public abstract class c9g {
    public static final ColorDrawable a = new ColorDrawable(0);

    public static Drawable a(Drawable drawable, wnc wnc, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            Paint paint = bitmapDrawable.getPaint();
            wnc.getClass();
            onc onc = new onc(resources, bitmap, paint);
            b(onc, wnc);
            return onc;
        } else if (drawable instanceof NinePatchDrawable) {
            tnc tnc = new tnc((NinePatchDrawable) drawable);
            b(tnc, wnc);
            return tnc;
        } else if (drawable instanceof ColorDrawable) {
            qnc qnc = new qnc(((ColorDrawable) drawable).getColor());
            b(qnc, wnc);
            return qnc;
        } else {
            ta5.m("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
    }

    public static void b(nnc nnc, wnc wnc) {
        nnc.b(wnc.b);
        nnc.m(wnc.c);
        nnc.a(wnc.f, wnc.e);
        nnc.i(wnc.g);
        nnc.k();
        nnc.e(wnc.h);
        nnc.g();
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable c(android.graphics.drawable.Drawable r3, defpackage.wnc r4, android.content.res.Resources r5) {
        /*
            defpackage.f46.I()     // Catch:{ all -> 0x0034 }
            if (r3 == 0) goto L_0x003e
            if (r4 == 0) goto L_0x003e
            int r0 = r4.a     // Catch:{ all -> 0x0034 }
            r1 = 2
            if (r0 == r1) goto L_0x000d
            goto L_0x003e
        L_0x000d:
            boolean r0 = r3 instanceof defpackage.g06     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0036
            r0 = r3
            g06 r0 = (defpackage.g06) r0     // Catch:{ all -> 0x0034 }
        L_0x0014:
            android.graphics.drawable.Drawable r1 = r0.j()     // Catch:{ all -> 0x0034 }
            if (r1 == r0) goto L_0x0023
            boolean r2 = r1 instanceof defpackage.dq4     // Catch:{ all -> 0x0034 }
            if (r2 != 0) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            r0 = r1
            dq4 r0 = (defpackage.dq4) r0     // Catch:{ all -> 0x0034 }
            goto L_0x0014
        L_0x0023:
            android.graphics.drawable.ColorDrawable r1 = a     // Catch:{ all -> 0x0034 }
            android.graphics.drawable.Drawable r1 = r0.f(r1)     // Catch:{ all -> 0x0034 }
            android.graphics.drawable.Drawable r4 = a(r1, r4, r5)     // Catch:{ all -> 0x0034 }
            r0.f(r4)     // Catch:{ all -> 0x0034 }
            defpackage.f46.I()
            return r3
        L_0x0034:
            r3 = move-exception
            goto L_0x0042
        L_0x0036:
            android.graphics.drawable.Drawable r3 = a(r3, r4, r5)     // Catch:{ all -> 0x0034 }
            defpackage.f46.I()
            return r3
        L_0x003e:
            defpackage.f46.I()
            return r3
        L_0x0042:
            defpackage.f46.I()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c9g.c(android.graphics.drawable.Drawable, wnc, android.content.res.Resources):android.graphics.drawable.Drawable");
    }

    public static Drawable d(Drawable drawable, wnc wnc) {
        try {
            if (!(drawable == null || wnc == null)) {
                if (wnc.a == 1) {
                    snc snc = new snc(drawable);
                    b(snc, wnc);
                    snc.z0 = wnc.d;
                    snc.invalidateSelf();
                    f46.I();
                    return snc;
                }
            }
            f46.I();
            return drawable;
        } finally {
            f46.I();
        }
    }

    public static Drawable e(Drawable drawable, rsc rsc) {
        f46.I();
        if (drawable == null || rsc == null) {
            f46.I();
            return drawable;
        }
        psc psc = new psc(drawable, rsc);
        f46.I();
        return psc;
    }
}
