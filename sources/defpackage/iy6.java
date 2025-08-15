package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* renamed from: iy6  reason: default package */
public final class iy6 extends ffe implements a66 {
    public ConcurrentHashMap X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ fz6 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iy6(fz6 fz6, Continuation continuation) {
        super(2, continuation);
        this.s0 = fz6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((iy6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        iy6 iy6 = new iy6(this.s0, continuation);
        iy6.Z = obj;
        return iy6;
    }

    public final Object o(Object obj) {
        zme zme;
        ConcurrentHashMap concurrentHashMap;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3 = (sx3) this.Z;
            String str = fz6.E0;
            zme zme2 = new zme("fetchAlbums");
            ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
            List<u76> list = u76.e;
            ArrayList arrayList = new ArrayList(z53.S(list, 10));
            for (u76 hy6 : list) {
                fz6 fz6 = this.s0;
                arrayList.add(j47.T(sx3, ((w9a) fz6.c).b(), (vx3) null, new hy6(hy6, fz6, zme2, concurrentHashMap2, (Continuation) null), 2));
            }
            this.Z = zme2;
            this.X = concurrentHashMap2;
            this.Y = 1;
            if (pag.s(arrayList, this) == tx3) {
                return tx3;
            }
            zme = zme2;
            concurrentHashMap = concurrentHashMap2;
        } else if (i == 1) {
            concurrentHashMap = this.X;
            zme = (zme) this.Z;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        zme.getClass();
        return x53.D0(concurrentHashMap.values());
    }
}
