package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: gce  reason: default package */
public final class gce extends ffe implements a66 {
    public int X;
    public final /* synthetic */ moa Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ int s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gce(moa moa, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.Y = moa;
        this.Z = str;
        this.s0 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gce) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new gce(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        Integer num;
        tx3 tx3 = tx3.a;
        int i = this.X;
        moa moa = this.Y;
        if (i == 0) {
            od2.a0(obj);
            List list = (List) moa.s0;
            String str = this.Z;
            boolean f = tpa.f(str, (String) moa.X);
            int i2 = this.s0;
            if (f && (num = (Integer) moa.Y) != null && num.intValue() == i2 && list != null) {
                return list;
            }
            this.X = 1;
            ns3 ns3 = (ns3) moa.o;
            obj = j47.t0(((w9a) ns3.b).a(), new ls3(ns3, str, i2, (Continuation) null), this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        moa.s0 = (List) obj;
        return obj;
    }
}
