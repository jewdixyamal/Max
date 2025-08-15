package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: aq2  reason: default package */
public final class aq2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ rq2 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ CharSequence s0;
    public final /* synthetic */ List t0;
    public final /* synthetic */ boolean u0;
    public final /* synthetic */ Long v0;
    public final /* synthetic */ cz5 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aq2(rq2 rq2, long j, CharSequence charSequence, List list, boolean z, Long l, cz5 cz5, Continuation continuation) {
        super(2, continuation);
        this.Y = rq2;
        this.Z = j;
        this.s0 = charSequence;
        this.t0 = list;
        this.u0 = z;
        this.v0 = l;
        this.w0 = cz5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((aq2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new aq2(this.Y, this.Z, this.s0, this.t0, this.u0, this.v0, this.w0, continuation);
    }

    public final Object o(Object obj) {
        int i;
        tx3 tx3 = tx3.a;
        int i2 = this.X;
        int i3 = 1;
        rq2 rq2 = this.Y;
        if (i2 == 0) {
            od2.a0(obj);
            this.X = 1;
            if (((p5d) rq2.D0.getValue()).a(this.Z, this.s0, this.t0, this.u0, this.v0, this.w0, this) == tx3) {
                return tx3;
            }
        } else if (i2 == 1) {
            od2.a0(obj);
        } else if (i2 == 2) {
            od2.a0(obj);
            pnf.o(rq2.b1, (zo2) obj);
            return e5f.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        rq2.s();
        boolean z = this.u0;
        List list = this.t0;
        if (z) {
            i = list.size();
        } else {
            qyc qyc = (qyc) ((y7d) rq2.y0.getValue());
            qyc.getClass();
            int q = (int) qyc.q(PmsKey.f63maxattachcount, (long) 12);
            int size = list.size() / q;
            if (list.size() % q == 0) {
                i3 = 0;
            }
            i = size + i3;
        }
        int i4 = i;
        this.X = 2;
        obj = zo2.d.c(this.Z, i4, (lu0) rq2.E0.getValue(), this.w0, false, this);
        if (obj == tx3) {
            return tx3;
        }
        pnf.o(rq2.b1, (zo2) obj);
        return e5f.a;
    }
}
