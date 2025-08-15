package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;

/* renamed from: hm3  reason: default package */
public final class hm3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ jm3 Y;
    public final /* synthetic */ xu4 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hm3(jm3 jm3, xu4 xu4, Continuation continuation) {
        super(2, continuation);
        this.Y = jm3;
        this.Z = xu4;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hm3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new hm3(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            jm3 jm3 = this.Y;
            hq3 hq3 = (hq3) jm3.v.getValue();
            xu4 xu4 = this.Z;
            String str = xu4.c;
            String str2 = null;
            String obj2 = str != null ? w9e.b1(str).toString() : null;
            String str3 = xu4.f;
            String obj3 = str3 != null ? w9e.b1(str3).toString() : null;
            this.X = 1;
            hq3.getClass();
            String name = hq3.class.getName();
            StringBuilder sb = new StringBuilder("rename, id = ");
            long j = jm3.n;
            ms2.j(j, " => ", obj2, sb);
            sb.append(" ");
            sb.append(obj3);
            hm9.m(name, sb.toString(), new Object[0]);
            je7 je7 = hq3.a;
            uj3 i2 = ((el3) je7.getValue()).i(j, false);
            if (i2 != null) {
                jl3 jl3 = (jl3) x53.i0(i2.i());
                ((el3) je7.getValue()).c(j, new bl3(obj2, obj3, 1));
                je7 je72 = hq3.d;
                ((av0) je72.getValue()).c(new ps3(j));
                pk pkVar = (pk) hq3.c.getValue();
                String str4 = jl3 != null ? jl3.a : null;
                if (jl3 != null) {
                    str2 = jl3.b;
                }
                k4a k4a = (k4a) pkVar;
                k4a.w(k4a, new sq3(5, ((p7b) k4a.y()).a.o(), j, str4, str2, obj2, obj3));
                long j2 = j;
                ((ike) hq3.b.getValue()).f(Collections.singletonList(new Long(j2)));
                ((av0) je72.getValue()).c(new ps3(j2));
            }
            if (e5f == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
