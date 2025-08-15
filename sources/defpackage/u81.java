package defpackage;

import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;

/* renamed from: u81  reason: default package */
public final class u81 extends pnf {
    public final je7 X;
    public final je7 Y = tu0.r(3, new x5(25, this));
    public final q0e Z;
    public final je7 b;
    public final m5d c;
    public final rg1 o;
    public final q0e s0;
    public final q0e t0;
    public final q0e u0;
    public final q0e v0;

    public u81(je7 je7, je7 je72, m5d m5d, rg1 rg1) {
        this.b = je72;
        this.c = m5d;
        this.o = rg1;
        this.X = je7;
        q0e a = r0e.a(new s81());
        this.Z = a;
        this.s0 = a;
        q0e a2 = r0e.a(new ls1(nz4.a, false, false));
        this.t0 = a2;
        this.u0 = a2;
        q0e a3 = r0e.a(Boolean.FALSE);
        this.v0 = a3;
        od2.L(new zn5(a3, new r81(this, (Continuation) null), 5), this.a);
    }

    public final void q(long j, al6 al6) {
        q0e q0e;
        Object value;
        s81 s81;
        LinkedHashMap linkedHashMap;
        do {
            q0e = this.Z;
            value = q0e.getValue();
            s81 = (s81) value;
            linkedHashMap = new LinkedHashMap(s81.b);
            if (linkedHashMap.containsKey(Long.valueOf(j))) {
                al6 al62 = (al6) linkedHashMap.remove(Long.valueOf(j));
            } else {
                al6 al63 = (al6) linkedHashMap.put(Long.valueOf(j), al6);
            }
        } while (!q0e.c(value, new s81(linkedHashMap, s81.a)));
    }
}
