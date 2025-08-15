package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.LruCache;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: ld0  reason: default package */
public final class ld0 {
    public static final int j;
    public static final jd0 k = new LruCache(20);
    public final ida a;
    public final p82 b;
    public final pd0 c;
    public final uj3 d;
    public final String e;
    public final CharSequence f;
    public final Long g;
    public final int h;
    public final boolean i;

    /* JADX WARNING: type inference failed for: r0v0, types: [jd0, android.util.LruCache] */
    static {
        int dimension = (int) Resources.getSystem().getDimension(17104901);
        if (dimension == 0) {
            dimension = Math.round(((float) 64) * Resources.getSystem().getDisplayMetrics().density);
        }
        j = dimension;
    }

    public ld0(ida ida, p82 p82, pd0 pd0, CharSequence charSequence) {
        this.h = -1;
        this.a = ida;
        this.c = pd0;
        this.f = charSequence;
        this.g = null;
        this.i = false;
        this.b = p82;
    }

    public static Bitmap a(Context context, ida ida, p82 p82, pd0 pd0, uj3 uj3, String str, String str2, ztc ztc) {
        int i2 = j;
        ld0 ld0 = str != null ? new ld0(ida, p82, pd0, str) : uj3 != null ? new ld0(ida, p82, pd0, uj3) : new ld0(ida, p82, pd0, (CharSequence) null);
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (ld0.b(str2) == null) {
            Drawable c2 = ld0.c(context);
            c2.setBounds(0, 0, i2, i2);
            c2.draw(canvas);
        } else {
            s1a r = new hb3(2, new id0(ld0, str2, i2, context)).r(ztc);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            Objects.requireNonNull(timeUnit, "unit is null");
            nd7.U(new b2a(r, 1000, timeUnit, ztc), new hd0(i2, 0, canvas), new id0((Object) canvas, (Object) ld0, (Object) context, i2), ft.d);
        }
        return createBitmap;
    }

    public final Uri b(String str) {
        String str2 = this.e;
        if (str2 != null) {
            return j47.N(str2);
        }
        kk0 kk0 = kk0.c;
        uj3 uj3 = this.d;
        if (uj3 != null) {
            return j47.N(uj3.q(str, kk0));
        }
        return null;
    }

    public final Drawable c(Context context) {
        int i2;
        uj3 uj3 = this.d;
        Bitmap bitmap = uj3 != null ? (Bitmap) k.get(Long.valueOf(uj3.n() ^ this.b.K())) : null;
        if (bitmap != null && !bitmap.isRecycled()) {
            try {
                return new BitmapDrawable(context.getResources(), bitmap.copy(bitmap.getConfig(), false));
            } catch (Throwable th) {
                hm9.l0("ld0", "couldnt use cached bitmap", th);
            }
        }
        if (this.e != null && (i2 = this.h) != -1) {
            return kt3.b(context, i2);
        }
        boolean z = this.i;
        ida ida = this.a;
        pd0 pd0 = this.c;
        if (uj3 != null) {
            return new qd0(pd0, uj3, z);
        }
        CharSequence charSequence = this.f;
        if (oag.t(charSequence)) {
            return kt3.b(context, 0);
        }
        Long l = this.g;
        if (l == null || l.longValue() == 0) {
            return new qd0(pd0, ida, charSequence);
        }
        return new qd0(this.c, this.a, this.f, l.longValue(), this.i);
    }

    public ld0(ida ida, p82 p82, pd0 pd0, uj3 uj3) {
        this.g = null;
        this.h = -1;
        this.a = ida;
        this.c = pd0;
        this.d = uj3;
        this.b = p82;
    }

    public ld0(ida ida, p82 p82, pd0 pd0, String str) {
        this.g = null;
        this.a = ida;
        this.c = pd0;
        this.e = str;
        this.h = 0;
        this.b = p82;
    }
}
