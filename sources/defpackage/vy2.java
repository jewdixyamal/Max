package defpackage;

import java.util.Map;
import java.util.Set;

/* renamed from: vy2  reason: default package */
public final /* synthetic */ class vy2 implements m56 {
    public final /* synthetic */ Set X;
    public final /* synthetic */ Set Y;
    public final /* synthetic */ jz2 a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ Set c;
    public final /* synthetic */ Map o;

    public /* synthetic */ vy2(jz2 jz2, Set set, Set set2, Map map, Set set3, Set set4) {
        this.a = jz2;
        this.b = set;
        this.c = set2;
        this.o = map;
        this.X = set3;
        this.Y = set4;
    }

    public final Object invoke(Object obj) {
        boolean z;
        e52 e52 = (e52) obj;
        k92 k92 = e52.b;
        boolean contains = this.b.contains(Long.valueOf(k92.a));
        jz2 jz2 = this.a;
        Map map = this.o;
        if (contains || ((jt2) jz2.o.getValue()).a(this.c, map, e52)) {
            if (!this.X.contains(Long.valueOf(k92.a)) && !((jt2) jz2.o.getValue()).a(this.Y, map, e52)) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
