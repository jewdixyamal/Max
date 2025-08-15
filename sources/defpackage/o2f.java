package defpackage;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;

/* renamed from: o2f  reason: default package */
public final class o2f {
    public static volatile e14 e;
    public final d9f a;
    public final d9f b;
    public final ytc c;
    public final t8f d;

    public o2f(d9f d9f, d9f d9f2, ytc ytc, t8f t8f, o7g o7g) {
        this.a = d9f;
        this.b = d9f2;
        this.c = ytc;
        this.d = t8f;
        o7g.getClass();
        o7g.a.execute(new ule(19, o7g));
    }

    public static o2f a() {
        e14 e14 = e;
        if (e14 != null) {
            return (o2f) e14.Z.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (o2f.class) {
                try {
                    if (e == null) {
                        o9g o9g = new o9g(11, false);
                        context.getClass();
                        o9g.b = context;
                        e = o9g.o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final m2f c(f05 f05) {
        Set set;
        byte[] bArr;
        if (f05 instanceof f05) {
            ((fw0) f05).getClass();
            set = Collections.unmodifiableSet(fw0.d);
        } else {
            set = Collections.singleton(new i15("proto"));
        }
        vq7 a2 = hc0.a();
        f05.getClass();
        a2.b = "cct";
        fw0 fw0 = (fw0) f05;
        String str = fw0.a;
        String str2 = fw0.b;
        if (str2 == null && str == null) {
            bArr = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bArr = rh4.k("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a2.c = bArr;
        return new m2f(set, a2.j(), this);
    }
}
