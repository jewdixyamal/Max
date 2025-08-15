package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: zd9  reason: default package */
public final class zd9 {
    public final long a;
    public final long b;
    public final qy5 c;
    public final qy5 d;

    public zd9(long j, long j2, qy5 qy5, qy5 qy52) {
        this.a = j;
        this.b = j2;
        this.c = qy5;
        this.d = qy52;
    }

    /* JADX WARNING: type inference failed for: r12v2, types: [lh4, java.lang.Object] */
    public static zd9 a(Context context, long j, String str) {
        qy5 qy5;
        long j2;
        qy5 qy52;
        String str2;
        long j3 = j;
        wd9 wd9 = new wd9(16, mbe.a0);
        yd9 yd9 = new yd9();
        j94 j94 = new j94(context);
        Map emptyMap = Collections.emptyMap();
        Uri parse = Uri.parse(str);
        fm9.m(parse, "The uri must be set.");
        try {
            long G = j94.G(new a34(parse, 0, 1, (byte[]) null, emptyMap, 0, -1, (String) null, 0, (Object) null));
            fm9.k(G != 0);
            String str3 = "The uri must be set.";
            sa4 sa4 = r5;
            sa4 sa42 = new sa4(j94, 0, G);
            fm9.j("The MP4 file is invalid", wd9.n(sa4));
            wd9.S(yd9);
            ? obj = new Object();
            sa4 sa43 = sa4;
            while (!yd9.c) {
                int g = wd9.g(sa43, obj);
                if (g == 1) {
                    j94.close();
                    Map emptyMap2 = Collections.emptyMap();
                    Uri parse2 = Uri.parse(str);
                    long j4 = obj.a;
                    str2 = str3;
                    fm9.m(parse2, str2);
                    long G2 = j94.G(new a34(parse2, 0, 1, (byte[]) null, emptyMap2, j4, -1, (String) null, 0, (Object) null));
                    if (G2 != -1) {
                        G2 += obj.a;
                    }
                    sa43 = new sa4(j94, obj.a, G2);
                } else {
                    str2 = str3;
                    if (g != -1) {
                        continue;
                    } else if (!yd9.c) {
                        throw new IllegalStateException("The MP4 file is invalid");
                    }
                }
                str3 = str2;
            }
            long j5 = wd9.J0;
            int i = yd9.a;
            HashMap hashMap = (HashMap) yd9.o;
            if (i != -1) {
                xd9 xd9 = (xd9) hashMap.get(2);
                xd9.getClass();
                qy5 qy53 = xd9.a;
                qy53.getClass();
                fm9.k(j5 != -9223372036854775807L);
                long j6 = wd9.i(yd9.a, j5).a.a;
                if (j3 != -9223372036854775807L) {
                    t1d i2 = wd9.i(yd9.a, j3);
                    long j7 = i2.a.a;
                    if (j3 != j7) {
                        j7 = i2.b.a;
                        if (j3 > j7) {
                            j2 = Long.MIN_VALUE;
                            qy5 = qy53;
                        }
                    }
                    qy5 = qy53;
                    j2 = j7;
                } else {
                    qy5 = qy53;
                    j2 = -9223372036854775807L;
                }
            } else {
                j2 = -9223372036854775807L;
                qy5 = null;
            }
            if (yd9.b != -1) {
                xd9 xd92 = (xd9) hashMap.get(1);
                xd92.getClass();
                qy5 qy54 = xd92.a;
                qy54.getClass();
                qy52 = qy54;
            } else {
                qy52 = null;
            }
            zd9 zd9 = new zd9(j5, j2, qy5, qy52);
            mr0.i(j94);
            return zd9;
        } catch (Throwable th) {
            mr0.i(j94);
            throw th;
        }
    }
}
