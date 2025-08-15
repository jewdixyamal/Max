package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;

/* renamed from: zl3  reason: default package */
public final class zl3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ jm3 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zl3(jm3 jm3, Continuation continuation) {
        super(2, continuation);
        this.Y = jm3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zl3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zl3(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        jm3 jm3 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            obj = ((ds3) jm3.o.getValue()).b(jm3.n, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        uj3 uj3 = (uj3) obj;
        if (uj3 == null) {
            return e5f;
        }
        AtomicLong atomicLong = jm3.l;
        long j = uj3.a.c.e;
        k4a k4a = (k4a) ((pk) jm3.z.getValue());
        atomicLong.set(ome.d(k4a.z(), new bgc(((p7b) k4a.y()).a.o(), j), false, 0, 12));
        kld kld = jm3.d;
        sfb sfb = new sfb(new eqe(vea.W), new Integer(woc.m));
        this.X = 2;
        return kld.a(sfb, this) == tx3 ? tx3 : e5f;
    }
}
