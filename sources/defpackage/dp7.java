package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* renamed from: dp7  reason: default package */
public final class dp7 implements lu6 {
    public final Context a;
    public final cx7 b;

    public dp7(Context context, cx7 cx7) {
        this.a = context;
        this.b = cx7;
    }

    public final l43 a(g05 g05, int i, pqb pqb, ju6 ju6) {
        Context context = this.a;
        try {
            String str = g05.v0;
            if (str != null) {
                Drawable b2 = kt3.b(context, Integer.parseInt(Uri.parse(str).getPathSegments().get(0)));
                kre kre = b2 instanceof kre ? (kre) b2 : null;
                pq9 pq9 = qp4.u0;
                if (kre != null) {
                    kre.onThemeChanged(pq9.b(context).i());
                }
                if (b2 != null) {
                    return new t84(b2, (w7c) pq9.b(context).t0, this.b);
                }
                return null;
            }
            throw new IllegalStateException("No source in encoded image".toString());
        } catch (Throwable th) {
            ta5.c("DrawableImageDecoder", "Cannot decode drawable", th);
            return null;
        }
    }
}
