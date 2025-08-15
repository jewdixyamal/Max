package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;

/* renamed from: a34  reason: default package */
public final class a34 {
    public static final /* synthetic */ int k = 0;
    public final Uri a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;
    public final Object j;

    static {
        nc8.a("media3.datasource");
    }

    public a34(Uri uri, long j2, long j3) {
        this(uri, 0, 1, (byte[]) null, Collections.emptyMap(), j2, j3, (String) null, 0, (Object) null);
    }

    public final y24 a() {
        y24 y24 = new y24(false, 1);
        y24.b = this.a;
        y24.c = this.b;
        y24.d = this.c;
        y24.e = this.d;
        y24.f = this.e;
        y24.g = this.f;
        y24.h = this.g;
        y24.i = this.h;
        y24.j = this.i;
        y24.k = this.j;
        return y24;
    }

    public final a34 b(long j2) {
        long j3 = this.g;
        long j4 = -1;
        if (j3 != -1) {
            j4 = j3 - j2;
        }
        return c(j2, j4);
    }

    public final a34 c(long j2, long j3) {
        if (j2 == 0 && this.g == j3) {
            return this;
        }
        return new a34(this.a, this.b, this.c, this.d, this.e, this.f + j2, j3, this.h, this.i, this.j);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i2 = this.c;
        if (i2 == 1) {
            str = HttpGet.METHOD_NAME;
        } else if (i2 == 2) {
            str = HttpPost.METHOD_NAME;
        } else if (i2 == 3) {
            str = HttpHead.METHOD_NAME;
        } else {
            throw new IllegalStateException();
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        return zr6.j(sb, this.i, "]");
    }

    public a34(Uri uri, long j2, int i2, byte[] bArr, Map map, long j3, long j4, String str, int i3, Object obj) {
        long j5 = j2;
        byte[] bArr2 = bArr;
        long j6 = j3;
        long j7 = j4;
        boolean z = false;
        fm9.f(j5 + j6 >= 0);
        fm9.f(j6 >= 0);
        fm9.f((j7 > 0 || j7 == -1) ? true : z);
        uri.getClass();
        this.a = uri;
        this.b = j5;
        this.c = i2;
        this.d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.f = j6;
        this.g = j7;
        this.h = str;
        this.i = i3;
        this.j = obj;
    }
}
