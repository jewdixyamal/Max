package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: cq8  reason: default package */
public final class cq8 extends ffe implements a66 {
    public e52 X;
    public int Y;
    public final /* synthetic */ jq8 Z;
    public final /* synthetic */ boolean s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cq8(jq8 jq8, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Z = jq8;
        this.s0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cq8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cq8(this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        e52 e52;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        e5f e5f = e5f.a;
        jq8 jq8 = this.Z;
        if (i == 0) {
            od2.a0(obj);
            hm9.m(jq8.J0, "load members with read status", new Object[0]);
            e52 = jq8.t();
            if (e52 == null) {
                return e5f;
            }
            this.X = e52;
            this.Y = 1;
            if (jq8.r(jq8, e52, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            e52 = this.X;
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
            jq8.q(jq8);
            return e5f;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (!this.s0) {
            return e5f;
        }
        this.X = null;
        this.Y = 2;
        if (jq8.s(jq8, e52, this) == tx3) {
            return tx3;
        }
        jq8.q(jq8);
        return e5f;
    }
}
