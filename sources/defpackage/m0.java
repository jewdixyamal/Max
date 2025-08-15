package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: m0  reason: default package */
public final class m0 implements ide {
    public final /* synthetic */ mq4 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ n0 f;

    public m0(n0 n0Var, d2b d2b, String str, Object obj, Object obj2, int i) {
        this.f = n0Var;
        this.a = d2b;
        this.b = str;
        this.c = obj;
        this.d = obj2;
        this.e = i;
    }

    public final Object get() {
        vv6 vv6;
        n0 n0Var = this.f;
        mq4 mq4 = this.a;
        String str = this.b;
        Object obj = this.c;
        Object obj2 = this.d;
        int i = this.e;
        e2b e2b = (e2b) n0Var;
        e2b.getClass();
        wv6 wv6 = (wv6) obj;
        iv6 iv6 = e2b.p;
        int s = au1.s(i);
        if (s == 0) {
            vv6 = vv6.FULL_FETCH;
        } else if (s == 1) {
            vv6 = vv6.DISK_CACHE;
        } else if (s == 2) {
            vv6 = vv6.BITMAP_MEMORY_CACHE;
        } else {
            StringBuilder sb = new StringBuilder("Cache level");
            sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "BITMAP_MEMORY_CACHE" : "DISK_CACHE" : "FULL_FETCH");
            sb.append("is not supported. ");
            throw new RuntimeException(sb.toString());
        }
        vv6 vv62 = vv6;
        p06 p06 = null;
        if (mq4 instanceof d2b) {
            d2b d2b = (d2b) mq4;
            synchronized (d2b) {
                HashSet hashSet = d2b.G;
                if (hashSet != null) {
                    p06 = new p06((Set) hashSet);
                }
            }
        }
        return iv6.b(wv6, obj2, vv62, p06, str);
    }

    public final String toString() {
        nw4 r0 = j47.r0(this);
        r0.e(this.c.toString(), "request");
        return r0.toString();
    }
}
