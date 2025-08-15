package defpackage;

import android.graphics.Bitmap;
import android.os.Environment;

/* renamed from: prc  reason: default package */
public final class prc extends wh0 {
    public final /* synthetic */ g0 a;
    public final /* synthetic */ ry1 b;
    public final /* synthetic */ qrc c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public prc(g0 g0Var, sy1 sy1, qrc qrc, boolean z, boolean z2) {
        this.a = g0Var;
        this.b = sy1;
        this.c = qrc;
        this.d = z;
        this.e = z2;
    }

    public final void d() {
        ry1 ry1 = this.b;
        if (ry1.isActive()) {
            ry1.cancel(new Throwable("Cancelled with fresco pipeline"));
        }
    }

    public final void e(g0 g0Var) {
        this.b.resumeWith((Object) null);
    }

    public final void g(Bitmap bitmap) {
        String str;
        boolean h = this.a.h();
        ry1 ry1 = this.b;
        if (!h) {
            ry1.resumeWith((Object) null);
        } else if (bitmap == null) {
            ry1.resumeWith((Object) null);
        } else {
            qrc qrc = this.c;
            boolean z = this.d;
            if (z) {
                StringBuilder l = au1.l(qrc.c.a.getCacheDir().getPath());
                l.append(qra.b);
                str = l.toString();
            } else {
                qrc.getClass();
                str = Environment.DIRECTORY_PICTURES;
            }
            ry1.resumeWith(qrc.d(new oo0(str, bitmap), this.e, z));
        }
    }
}
