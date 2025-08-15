package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: n7e  reason: default package */
public final class n7e extends ffe implements a66 {
    public int X;
    public final /* synthetic */ a8e Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n7e(a8e a8e, Continuation continuation) {
        super(2, continuation);
        this.Y = a8e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((n7e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new n7e(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        a8e a8e = this.Y;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7Arr = a8e.C0;
            e0a a = ((md5) a8e.Z.getValue()).a();
            this.X = 1;
            obj = s36.g(a, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
            pnf.o(a8e.A0, new ued(woc.w, new eqe(hja.x)));
            return e5f;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Iterable<d2e> iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(z53.S(iterable, 10));
        for (d2e d2e : iterable) {
            arrayList.add(new Long(d2e.a));
        }
        if (arrayList.isEmpty()) {
            return e5f;
        }
        bc7[] bc7Arr2 = a8e.C0;
        db3 d = ((md5) a8e.Z.getValue()).d(arrayList);
        this.X = 2;
        if (s36.e(d, this) == tx3) {
            return tx3;
        }
        pnf.o(a8e.A0, new ued(woc.w, new eqe(hja.x)));
        return e5f;
    }
}
