package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* renamed from: my2  reason: default package */
public final /* synthetic */ class my2 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ty2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ my2(ty2 ty2, long j, int i) {
        this.a = i;
        this.b = ty2;
        this.c = j;
    }

    public final Object invoke(Object obj) {
        Long l = (Long) obj;
        switch (this.a) {
            case 0:
                ty2 ty2 = this.b;
                ConcurrentHashMap concurrentHashMap = ((p82) ((je7) ty2.c).getValue()).f;
                long j = this.c;
                q0e a2 = r0e.a((e52) concurrentHashMap.get(Long.valueOf(j)));
                e52 e52 = (e52) a2.getValue();
                if (e52 == null) {
                    j47.T((sx3) ((khe) ty2.X).getValue(), (lx3) null, (vx3) null, new qy2(a2, (Continuation) null, ty2, j), 3);
                } else {
                    long j2 = e52.b.a;
                    if (j2 != 0) {
                        ((ti9) ((ConcurrentHashMap) ty2.Z).computeIfAbsent(Long.valueOf(j2), new sy2(new py2(e52, 0)))).setValue(e52);
                    }
                }
                return a2;
            default:
                ty2 ty22 = this.b;
                ConcurrentHashMap concurrentHashMap2 = ((p82) ((je7) ty22.c).getValue()).g;
                long j3 = this.c;
                q0e a3 = r0e.a((e52) concurrentHashMap2.get(Long.valueOf(j3)));
                e52 e522 = (e52) a3.getValue();
                if (e522 == null) {
                    j47.T((sx3) ((khe) ty22.X).getValue(), (lx3) null, (vx3) null, new ry2(a3, (Continuation) null, ty22, j3), 3);
                } else {
                    ((ti9) ((ConcurrentHashMap) ty22.Y).computeIfAbsent(Long.valueOf(e522.a), new sy2(new py2(e522, 1)))).setValue(e522);
                }
                return a3;
        }
    }
}
