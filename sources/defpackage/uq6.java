package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: uq6  reason: default package */
public final class uq6 extends qy9 {
    public static final /* synthetic */ int Z = 0;
    public final String X;
    public final ztc Y;
    public final je7 a;
    public final int b;
    public final String c;
    public final String o;

    public uq6(je7 je7, int i, String str, String str2, String str3, ztc ztc) {
        this.a = je7;
        this.b = i;
        this.c = str;
        this.o = str2;
        this.X = str3;
        this.Y = ztc;
    }

    /* JADX WARNING: type inference failed for: r11v1, types: [pad, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v3, types: [java.lang.Object, bk5] */
    public final void q(f2a f2a) {
        tq6 tq6;
        String str;
        vq6 vq6;
        long j;
        String str2;
        bk5 bk5 = null;
        tq6 tq62 = new tq6(f2a, this.a, this.b, this.c, this.o, this.X, this.Y.a());
        f2a.c(tq62);
        if (!tq62.s0.get()) {
            int i = tq62.b;
            String str3 = tq62.c;
            String str4 = tq62.o;
            String str5 = tq62.X;
            ek5 ek5 = (ek5) ((kq6) tq62.a.getValue());
            ek5.getClass();
            hm9.m("ek5", "upload", new Object[0]);
            File file = new File(str3);
            if (!file.exists()) {
                tq62.b("file not found", nu0.x0);
            } else if (file.length() == 0) {
                tq62.b("file is zero length", nu0.y0);
            } else {
                int s = au1.s(i);
                if (s == 0) {
                    str = "HTTP_UPLOAD_IMAGE";
                } else if (s == 1) {
                    str = "HTTP_UPLOAD_AUDIO";
                } else if (s == 2) {
                    str = "HTTP_UPLOAD_VIDEO";
                } else if (s != 3) {
                    if (i == 1) {
                        str2 = "PHOTO";
                    } else if (i == 2) {
                        str2 = "AUDIO";
                    } else if (i == 3) {
                        str2 = "VIDEO";
                    } else if (i == 4) {
                        str2 = "FILE";
                    } else if (i == 5) {
                        str2 = "STICKER";
                    } else {
                        throw null;
                    }
                    str = "HTTP_UPLOAD_".concat(str2);
                } else {
                    str = "HTTP_UPLOAD_FILE";
                }
                ? obj = new Object();
                obj.f = ek5.c.b();
                obj.a = str;
                int s2 = au1.s(i);
                rl8 rl8 = s2 != 0 ? (s2 == 1 || s2 == 2 || s2 == 3 || s2 == 4) ? ek5.d : null : ek5.e;
                try {
                    od3 od3 = new od3();
                    od3.j((vq6) null, str5);
                    vq6 = od3.b();
                } catch (IllegalArgumentException unused) {
                    vq6 = null;
                }
                if (vq6 == null) {
                    hm9.p("ek5", "url is not valid - try to get new url from server", (Throwable) null);
                    ek5.f(tq62);
                } else {
                    if (i == 5) {
                        j = 0;
                    } else if (i == 1) {
                        try {
                            j = ek5.g(vq6);
                        } catch (ck5 e) {
                            tq6 = tq62;
                            tq6.b("upload failed", e.a);
                        } catch (IOException e2) {
                            tq6 = tq62;
                            String obj2 = e2.toString();
                            eq6 eq6 = nu0.w0;
                            if (obj2 != null) {
                                eq6 = new eq6(-1, "UNKNOWN_ERROR", obj2);
                            }
                            tq6.b("upload failed", eq6);
                        }
                    } else {
                        j = ek5.d(vq6);
                    }
                    if (j < 0) {
                        hm9.p("ek5", "url expired - try to get new url from server", (Throwable) null);
                        ek5.f(tq62);
                    } else {
                        pad pad = obj;
                        String str6 = str4;
                        long j2 = j;
                        int i2 = i;
                        tq6 = tq62;
                        mhc b2 = ek5.b(file, str4, vq6, rl8, j2, pad, tq62, i2);
                        b8c b3 = ((u2a) ek5.b.getValue()).b(b2);
                        ? obj3 = new Object();
                        obj3.b = false;
                        obj3.a = b3;
                        zj5 zj5 = r7;
                        bk5 bk52 = obj3;
                        zj5 zj52 = new zj5(ek5, b2, tq6, pad, file, new AtomicBoolean(), str6, vq6, rl8, i2, bk52);
                        b3.e(zj5);
                        bk5 = bk52;
                        tq6.set(bk5);
                    }
                }
            }
            tq6 = tq62;
            tq6.set(bk5);
        }
    }
}
