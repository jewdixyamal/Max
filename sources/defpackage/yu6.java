package defpackage;

import android.graphics.Bitmap;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: yu6  reason: default package */
public final class yu6 extends wh0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public yu6(sy1 sy1, g0 g0Var, sfc sfc) {
        this.b = sy1;
        this.c = g0Var;
        this.d = sfc;
    }

    public void d() {
        switch (this.a) {
            case 1:
                ry1 ry1 = (ry1) this.b;
                if (ry1.isActive()) {
                    ry1.cancel(new Throwable("Cancelled with fresco pipeline"));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void e(g0 g0Var) {
        switch (this.a) {
            case 0:
                ((av6) this.d).b((zu6) this.b);
                return;
            default:
                ry1 ry1 = (ry1) this.b;
                if (ry1.isActive()) {
                    ry1.resumeWith((Object) null);
                    return;
                }
                return;
        }
    }

    public final void g(Bitmap bitmap) {
        Object obj = this.d;
        FileOutputStream fileOutputStream = null;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (this.a) {
            case 0:
                zu6 zu6 = (zu6) obj3;
                av6 av6 = (av6) obj;
                if (bitmap == null) {
                    hm9.p("av6", "onNewResultImpl: bitmap is null in shareWebpImage", (Throwable) null);
                    av6.b(zu6);
                    return;
                }
                try {
                    String absolutePath = ((zi5) obj2).a("png").getAbsolutePath();
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                    av6.getClass();
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(absolutePath);
                        try {
                            bitmap.compress(compressFormat, 100, fileOutputStream2);
                            s5c.m(fileOutputStream2);
                            if (zu6 != null) {
                                av6.c(new vs5(zu6, 6, absolutePath));
                                return;
                            }
                            return;
                        } catch (IOException e) {
                            e = e;
                            fileOutputStream = fileOutputStream2;
                            try {
                                hm9.p("av6", "saveBitmap failure!", e);
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                s5c.m(fileOutputStream);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream2;
                            s5c.m(fileOutputStream);
                            throw th;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        hm9.p("av6", "saveBitmap failure!", e);
                        throw e;
                    }
                } catch (Exception e3) {
                    hm9.p("av6", "onNewResultImpl: failed to save webp image", e3);
                    av6.b(zu6);
                    return;
                }
            default:
                ry1 ry1 = (ry1) obj3;
                if (!ry1.isActive()) {
                    if (bitmap != null) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                } else if (!((g0) obj2).h()) {
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    ry1.resumeWith((Object) null);
                    return;
                } else if (bitmap == null) {
                    ry1.resumeWith((Object) null);
                    return;
                } else {
                    m26 m26 = ((sfc) obj).c;
                    ry1.resumeWith(new n26(m26.b, m26.c, bitmap));
                    return;
                }
        }
    }

    public yu6(av6 av6, zu6 zu6, zi5 zi5) {
        this.d = av6;
        this.b = zu6;
        this.c = zi5;
    }
}
