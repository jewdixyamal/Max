package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;

/* renamed from: s94  reason: default package */
public final class s94 implements cq4 {
    public final Resources a;
    public final cq4 b;
    public final cq4 c = null;

    public s94(Resources resources, j84 j84) {
        this.a = resources;
        this.b = j84;
    }

    /* JADX INFO: finally extract failed */
    public final Drawable a(l43 l43) {
        try {
            f46.I();
            if (l43 instanceof CloseableStaticBitmap) {
                CloseableStaticBitmap closeableStaticBitmap = (CloseableStaticBitmap) l43;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.a, closeableStaticBitmap.getUnderlyingBitmap());
                if (closeableStaticBitmap.getRotationAngle() == 0 || closeableStaticBitmap.getRotationAngle() == -1) {
                    if (closeableStaticBitmap.getExifOrientation() == 1 || closeableStaticBitmap.getExifOrientation() == 0) {
                        f46.I();
                        return bitmapDrawable;
                    }
                }
                ena ena = new ena(bitmapDrawable, closeableStaticBitmap.getRotationAngle(), closeableStaticBitmap.getExifOrientation());
                f46.I();
                return ena;
            }
            cq4 cq4 = this.b;
            if (cq4 != null) {
                if (cq4.b(l43)) {
                    Drawable a2 = cq4.a(l43);
                    f46.I();
                    return a2;
                }
            }
            cq4 cq42 = this.c;
            if (cq42 != null) {
                if (cq42.b(l43)) {
                    Drawable a3 = cq42.a(l43);
                    f46.I();
                    return a3;
                }
            }
            f46.I();
            return null;
        } catch (Throwable th) {
            f46.I();
            throw th;
        }
    }

    public final boolean b(l43 l43) {
        return true;
    }
}
