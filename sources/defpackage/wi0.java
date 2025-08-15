package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: wi0  reason: default package */
public final /* synthetic */ class wi0 implements qj3 {
    public final /* synthetic */ qy7 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long o;

    public /* synthetic */ wi0(qy7 qy7, long j, boolean z, long j2) {
        this.a = qy7;
        this.b = j;
        this.c = z;
        this.o = j2;
    }

    public final void accept(Object obj) {
        Map map = (Map) obj;
        LinkedHashMap linkedHashMap = this.a.b;
        xi0 xi0 = (xi0) linkedHashMap.get(Long.valueOf(this.b));
        boolean z = this.c;
        if (xi0 != null) {
            y8 y8Var = xi0.a;
            if (z) {
                y8Var.G((sn0) map.get(uy7.a));
            } else {
                y8Var.G((sn0) map.get(uy7.c));
            }
            y8Var.I();
        }
        xi0 xi02 = (xi0) linkedHashMap.get(Long.valueOf(this.o));
        if (xi02 != null) {
            y8 y8Var2 = xi02.a;
            if (z) {
                y8Var2.G((sn0) map.get(uy7.b));
            } else {
                y8Var2.G((sn0) map.get(uy7.o));
            }
            y8Var2.I();
        }
    }
}
