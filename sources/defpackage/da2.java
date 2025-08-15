package defpackage;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;

/* renamed from: da2  reason: default package */
public final class da2 extends ffe implements a66 {
    public AtomicLong X;
    public int Y;
    public final /* synthetic */ ka2 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public da2(ka2 ka2, Continuation continuation) {
        super(2, continuation);
        this.Z = ka2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((da2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new da2(this.Z, continuation);
    }

    public final Object o(Object obj) {
        AtomicLong atomicLong;
        Number number;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        e5f e5f = e5f.a;
        ka2 ka2 = this.Z;
        if (i == 0) {
            od2.a0(obj);
            e52 p = ka2.p();
            if (p == null) {
                return e5f;
            }
            atomicLong = ka2.l;
            yfc yfc = (yfc) ka2.x.getValue();
            this.X = atomicLong;
            this.Y = 1;
            v82 v82 = v82.b;
            p82 l = ((jz2) ((iy2) yfc.a.getValue())).l();
            long j = p.a;
            l.c(j, v82);
            e52 f = ((jz2) ((iy2) yfc.a.getValue())).f(j, new w8c(2));
            if (f == null) {
                number = new Long(0);
            } else {
                ((av0) yfc.c.getValue()).c(new vz2(Collections.singletonList(new Long(j)), false, false, (mg4) null, (h9b) null, 124));
                number = new Long(((k4a) ((pk) yfc.b.getValue())).m(j, f.b.a, (String) null, "", (a20) null));
            }
            if (number == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            AtomicLong atomicLong2 = this.X;
            od2.a0(obj);
            atomicLong = atomicLong2;
            number = obj;
        } else if (i == 2) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        atomicLong.set(number.longValue());
        kld kld = ka2.d;
        sfb sfb = new sfb(new eqe(vea.W), new Integer(woc.m));
        this.X = null;
        this.Y = 2;
        return kld.a(sfb, this) == tx3 ? tx3 : e5f;
    }
}
