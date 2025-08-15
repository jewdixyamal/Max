package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: mhc  reason: default package */
public final class mhc {
    public jw0 a;
    public final vq6 b;
    public final String c;
    public final cj6 d;
    public final tfg e;
    public final Map f;

    public mhc(vq6 vq6, String str, cj6 cj6, tfg tfg, Map map) {
        this.b = vq6;
        this.c = str;
        this.d = cj6;
        this.e = tfg;
        this.f = map;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [l84, java.lang.Object] */
    public final l84 a() {
        ? obj = new Object();
        obj.e = new LinkedHashMap();
        obj.a = this.b;
        obj.b = this.c;
        obj.d = this.e;
        Map map = this.f;
        obj.e = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        obj.c = this.d.c();
        return obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.c);
        sb.append(", url=");
        sb.append(this.b);
        cj6 cj6 = this.d;
        if (cj6.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object next : cj6) {
                int i2 = i + 1;
                if (i >= 0) {
                    kpa kpa = (kpa) next;
                    String str = (String) kpa.a;
                    String str2 = (String) kpa.b;
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(str);
                    sb.append(':');
                    sb.append(str2);
                    i = i2;
                } else {
                    y53.R();
                    throw null;
                }
            }
            sb.append(']');
        }
        Map map = this.f;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        return sb.toString();
    }
}
