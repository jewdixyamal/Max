package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: j58  reason: default package */
public final class j58 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ p58 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j58(p58 p58, Continuation continuation) {
        super(2, continuation);
        this.Y = p58;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j58) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new j58(this.Y, continuation);
    }

    public final Object o(Object obj) {
        boolean z;
        int i;
        tx3 tx3 = tx3.a;
        int i2 = this.X;
        if (i2 == 0) {
            od2.a0(obj);
            p58 p58 = this.Y;
            CharSequence charSequence = p58.q(p58).f.k;
            je7 je7 = p58.o;
            ((xp7) je7.getValue()).f.k = null;
            q0e q0e = p58.s0;
            int ordinal = ((n00) q0e.getValue()).ordinal();
            if (ordinal == 0) {
                z = false;
            } else if (ordinal == 1) {
                z = true;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            p4d p4d = ((xp7) je7.getValue()).f;
            n00 n00 = (n00) q0e.getValue();
            n00.getClass();
            int i3 = m00.$EnumSwitchMapping$0[n00.ordinal()];
            if (i3 != 1) {
                i = 2;
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i = 3;
            }
            p4d.p(i);
            pnf.o(p58.w0, new b58(charSequence, ((xp7) je7.getValue()).f.d(), z));
            a48 a48 = new a48(true);
            this.X = 1;
            if (p58.t0.o(a48, this) == tx3) {
                return tx3;
            }
        } else if (i2 == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
