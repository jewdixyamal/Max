package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: e3g  reason: default package */
public final class e3g extends ffe implements a66 {
    public int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ g3g s0;
    public final /* synthetic */ List t0;
    public puf u0;
    public int v0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e3g(int i, Object obj, Continuation continuation, g3g g3g, List list) {
        super(2, continuation);
        this.Y = i;
        this.Z = obj;
        this.s0 = g3g;
        this.t0 = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e3g) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new e3g(this.Y, this.Z, continuation, this.s0, this.t0);
    }

    public final Object o(Object obj) {
        Object obj2;
        puf puf;
        int i;
        tx3 tx3 = tx3.a;
        int i2 = this.X;
        int i3 = 1;
        if (i2 == 0) {
            od2.a0(obj);
            puf = (puf) this.Z;
            long j = puf.c;
            kk0 kk0 = kk0.a;
            this.u0 = puf;
            int i4 = this.Y;
            this.v0 = i4;
            this.X = 1;
            obj2 = ((uc6) this.s0.o.getValue()).a(j, kk0, this);
            if (obj2 == tx3) {
                return tx3;
            }
            i = i4;
        } else if (i2 == 1) {
            i = this.v0;
            puf = this.u0;
            od2.a0(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        rc6 rc6 = (rc6) obj2;
        vfd vfd = new vfd(puf.c, 0, new iqe(rc6.a), (jfd) null, (jqe) null, (Integer) null, cfd.a, (zed) null, (jqe) null, 0, new wed(rc6.c, rc6.b), 952);
        List list = this.t0;
        if (list.size() == 1) {
            i3 = 4;
        } else if (i != 0) {
            i3 = i == y53.L(list) ? 3 : 2;
        }
        int i5 = i3;
        zxf.c.getClass();
        return new v2g(vfd, new c64(":settings/webapp?bot_id=" + puf.c), puf.c, i5);
    }
}
