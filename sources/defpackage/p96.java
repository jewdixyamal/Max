package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: p96  reason: default package */
public final class p96 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ z96 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p96(z96 z96, Continuation continuation) {
        super(2, continuation);
        this.Y = z96;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p96) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new p96(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            z96 z96 = this.Y;
            s86 s86 = z96.Y;
            ArrayList x = dy7.x(z96.F0);
            s86.getClass();
            pnf.o(s86.c, new m86(x));
            this.X = 1;
            Object t0 = j47.t0(((w9a) z96.s()).e(), new y96(z96, false, (Continuation) null), this);
            if (t0 != tx3) {
                t0 = e5f;
            }
            if (t0 == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
