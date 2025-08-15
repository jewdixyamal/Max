package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ms3  reason: default package */
public final class ms3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ns3 Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ int s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ms3(ns3 ns3, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.Y = ns3;
        this.Z = str;
        this.s0 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ms3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ms3(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            ns3 ns3 = this.Y;
            obj = j47.t0(((w9a) ns3.b).a(), new ls3(ns3, this.Z, this.s0, (Continuation) null), this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
