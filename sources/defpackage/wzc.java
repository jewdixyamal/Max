package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: wzc  reason: default package */
public final class wzc implements xzc {
    public final String[] a;
    public final p82 b;
    public final b0d c;

    public wzc(String[] strArr, p82 p82, b0d b0d) {
        this.a = strArr;
        this.b = p82;
        this.c = b0d;
    }

    public final List a(String str) {
        b0d b0d = this.c;
        p82 p82 = this.b;
        p82.getClass();
        e52 e52 = (e52) p82.e0((String) null, new b82(p82, 2));
        nz4 nz4 = nz4.a;
        if (e52 == null) {
            return nz4;
        }
        try {
            if (b0d.f(e52, str)) {
                return Collections.singletonList(b0d.a(e52, str));
            }
            for (String str2 : this.a) {
                if (b0d.h(str2, str)) {
                    return Collections.singletonList(b0d.a(e52, str2));
                }
            }
            return nz4;
        } catch (Throwable th) {
            hm9.l0(wzc.class.getName(), "fail to search saved messages chat", th);
            return nz4;
        }
    }
}
