package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: hva  reason: default package */
public final class hva extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ List Y;
    public final /* synthetic */ jva Z;
    public final /* synthetic */ List s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hva(ArrayList arrayList, jva jva, ArrayList arrayList2, Continuation continuation) {
        super(2, continuation);
        this.Y = arrayList;
        this.Z = jva;
        this.s0 = arrayList2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hva) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hva hva = new hva((ArrayList) this.Y, this.Z, (ArrayList) this.s0, continuation);
        hva.X = obj;
        return hva;
    }

    public final Object o(Object obj) {
        hva hva = this;
        od2.a0(obj);
        sx3 sx3 = (sx3) hva.X;
        ArrayList arrayList = new ArrayList();
        for (wua wua : hva.Y) {
            if (!j1e.z(sx3)) {
                return nz4.a;
            }
            wua b = jva.b(hva.Z, wua, hva.s0);
            if (b == null) {
                hva = this;
            } else if (!b.equals(wua)) {
                String str = b.X;
                Long d = jva.d(str);
                String str2 = wua.X;
                Long d2 = jva.d(str2);
                if (d == null || !d.equals(d2)) {
                    int s = au1.s(str2.equals(str) ? b.v0 : wua.v0);
                    String str3 = wua.t0;
                    String str4 = wua.u0;
                    long j = b.b;
                    long j2 = b.c;
                    int i = wua.o;
                    String str5 = wua.X;
                    long j3 = b.Y;
                    wua wua2 = r7;
                    wua wua3 = new wua(j, j2, i, str5, j3, (String) null, wua.s0, str3, str4, s);
                    arrayList.add(wua2);
                    hva = this;
                    sx3 = sx3;
                }
            }
        }
        return arrayList;
    }
}
