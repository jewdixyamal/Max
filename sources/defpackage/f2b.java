package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import java.util.Set;

/* renamed from: f2b  reason: default package */
public final class f2b implements ide {
    public final Context a;
    public final iv6 b;
    public final ty2 c;

    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object, ty2] */
    public f2b(Context context, vq7 vq7) {
        lv6 g = lv6.g();
        this.a = context;
        iv6 f = g.f();
        this.b = f;
        ty2 ty2 = (ty2) vq7.c;
        if (ty2 != null) {
            this.c = ty2;
        } else {
            this.c = new Object();
        }
        ty2 ty22 = this.c;
        Resources resources = context.getResources();
        bg4 h = bg4.h();
        j84 a2 = g.a();
        g.b.v.getClass();
        if (v4f.b == null) {
            v4f.b = new v4f(new Handler(Looper.getMainLooper()));
        }
        v4f v4f = v4f.b;
        ty22.a = resources;
        ty22.b = h;
        ty22.c = a2;
        ty22.getClass();
        ty22.o = v4f;
        ty22.X = (y7g) f.f;
        ty22.Y = (wz) vq7.b;
        ty22.Z = (ide) vq7.o;
    }

    /* renamed from: a */
    public final e2b get() {
        e2b e2b = new e2b(this.a, this.c, this.b, (Set) null, (Set) null);
        e2b.r = null;
        return e2b;
    }
}
