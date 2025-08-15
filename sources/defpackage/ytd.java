package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: ytd  reason: default package */
public final class ytd extends ffe implements a66 {
    public k56 X;
    public int Y;
    public final /* synthetic */ List Z;
    public final /* synthetic */ k56 s0;
    public final /* synthetic */ bud t0;
    public final /* synthetic */ m56 u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ytd(ArrayList arrayList, ig3 ig3, bud bud, utd utd, Continuation continuation) {
        super(2, continuation);
        this.Z = arrayList;
        this.s0 = ig3;
        this.t0 = bud;
        this.u0 = utd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ytd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ytd((ArrayList) this.Z, (ig3) this.s0, this.t0, (utd) this.u0, continuation);
    }

    public final Object o(Object obj) {
        k56 k56;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            List list = this.Z;
            int i2 = 0;
            for (Object next : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    j47.T(this.t0.a, (lx3) null, (vx3) null, new xtd(i2, (utd) this.u0, (l17) next, (Continuation) null), 3);
                    i2 = i3;
                } else {
                    y53.R();
                    throw null;
                }
            }
            k56 k562 = this.s0;
            if (k562 != null) {
                this.X = k562;
                this.Y = 1;
                if (j47.x(((long) list.size()) * 100, this) == tx3) {
                    return tx3;
                }
                k56 = k562;
            }
            return e5f.a;
        } else if (i == 1) {
            k56 = this.X;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        k56.invoke();
        return e5f.a;
    }
}
