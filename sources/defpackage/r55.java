package defpackage;

import java.util.Enumeration;
import java.util.HashMap;

/* renamed from: r55  reason: default package */
public final class r55 implements Enumeration {
    public final /* synthetic */ int a;
    public int b;

    public /* synthetic */ r55(int i) {
        this.a = i;
    }

    public final boolean hasMoreElements() {
        switch (this.a) {
            case 0:
                int i = this.b;
                g65[] g65Arr = u55.c;
                return i < 4;
            default:
                int i2 = this.b;
                g65[] g65Arr2 = u55.c;
                return i2 < 4;
        }
    }

    public final Object nextElement() {
        switch (this.a) {
            case 0:
                HashMap hashMap = new HashMap();
                for (g65 g65 : u55.d[this.b]) {
                    hashMap.put(g65.b, g65);
                }
                this.b++;
                return hashMap;
            default:
                this.b++;
                return new HashMap();
        }
    }
}
