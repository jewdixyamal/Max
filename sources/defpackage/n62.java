package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: n62  reason: default package */
public final class n62 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ k72 Z;
    public final /* synthetic */ long s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n62(k72 k72, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = k72;
        this.s0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((n62) n((xeb) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        n62 n62 = new n62(this.Z, this.s0, continuation);
        n62.Y = obj;
        return n62;
    }

    public final Object o(Object obj) {
        e52 o;
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            xeb xeb = (xeb) this.Y;
            if (xeb instanceof teb) {
                long j = ((teb) xeb).a;
                k72 k72 = this.Z;
                int i2 = (j > k72.t.get() ? 1 : (j == k72.t.get() ? 0 : -1));
                kld kld = k72.f;
                if (i2 == 0) {
                    k72.w.set(false);
                    e52 o2 = k72.o();
                    if (o2 == null) {
                        return e5f;
                    }
                    k72.m(k72, o2);
                    if (k72.j == qeb.CREATE && o2.I()) {
                        qcb qcb = new qcb(this.s0);
                        this.X = 1;
                        if (kld.a(qcb, this) == tx3) {
                            return tx3;
                        }
                    }
                } else if (j == k72.v.get()) {
                    e52 o3 = k72.o();
                    if (o3 == null) {
                        return e5f;
                    }
                    k72.m(k72, o3);
                    ucb ucb = new ucb(new eqe(vea.w2), new Integer(woc.z), 6);
                    this.X = 2;
                    if (kld.a(ucb, this) == tx3) {
                        return tx3;
                    }
                } else if (j != k72.u.get() || (o = k72.o()) == null) {
                    return e5f;
                } else {
                    k72.m(k72, o);
                }
            }
        } else if (i == 1 || i == 2) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
