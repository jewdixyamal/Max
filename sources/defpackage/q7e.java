package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: q7e  reason: default package */
public final class q7e extends ffe implements a66 {
    public int X;
    public final /* synthetic */ a8e Y;
    public final /* synthetic */ Set Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q7e(a8e a8e, Set set, Continuation continuation) {
        super(2, continuation);
        this.Y = a8e;
        this.Z = set;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((q7e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new q7e(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        Set set = this.Z;
        a8e a8e = this.Y;
        if (i == 0) {
            od2.a0(obj);
            if (a8e.b == a5e.RECENT) {
                List D0 = x53.D0(set);
                this.X = 1;
                if (((x9c) a8e.Y.getValue()).c(D0, this) == tx3) {
                    return tx3;
                }
            } else {
                db3 d = ((md5) a8e.Z.getValue()).d(x53.D0(set));
                this.X = 2;
                if (s36.e(d, this) == tx3) {
                    return tx3;
                }
            }
        } else if (i == 1 || i == 2) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i2 = hja.F;
        int size = set.size();
        bc7[] bc7Arr = a8e.C0;
        String s = a8e.s(size);
        pnf.o(a8e.A0, new ued(woc.w, new iqe(a8e.o.getString(i2, new Object[]{s}))));
        return e5f.a;
    }
}
