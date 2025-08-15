package defpackage;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.MainDispatcherLoader;

/* renamed from: uq5  reason: default package */
public final class uq5 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ xm7 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uq5(xm7 xm7, Continuation continuation) {
        super(2, continuation);
        this.Z = xm7;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((uq5) n((iab) obj, (Continuation) obj2)).o(e5f.a);
        return tx3.a;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        uq5 uq5 = new uq5(this.Z, continuation);
        uq5.Y = obj;
        return uq5;
    }

    public final Object o(Object obj) {
        Throwable th;
        g2a g2a;
        tx3 tx3 = tx3.a;
        int i = this.X;
        xm7 xm7 = this.Z;
        if (i == 0) {
            od2.a0(obj);
            gu1 gu1 = new gu1(1, (iab) this.Y);
            jd4 jd4 = ql4.a;
            cx7 immediate = MainDispatcherLoader.dispatcher.getImmediate();
            rq5 rq5 = new rq5(xm7, gu1, (Continuation) null);
            this.Y = gu1;
            this.X = 1;
            if (j47.t0(immediate, rq5, this) == tx3) {
                return tx3;
            }
            g2a = gu1;
        } else if (i == 1) {
            g2a = (g2a) this.Y;
            od2.a0(obj);
        } else if (i == 2) {
            g2a = (g2a) this.Y;
            od2.a0(obj);
            this.Y = g2a;
            this.X = 3;
            j47.i(this);
            return tx3;
        } else if (i == 3) {
            g2a = (g2a) this.Y;
            try {
                od2.a0(obj);
                throw new KotlinNothingValueException();
            } catch (Throwable th2) {
                jd4 jd42 = ql4.a;
                lx3 plus = MainDispatcherLoader.dispatcher.getImmediate().plus(xq9.a);
                tq5 tq5 = new tq5(xm7, g2a, (Continuation) null);
                this.Y = th2;
                this.X = 4;
                if (j47.t0(plus, tq5, this) == tx3) {
                    return tx3;
                }
                th = th2;
            }
        } else if (i != 4) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            th = (Throwable) this.Y;
            od2.a0(obj);
            throw th;
        }
        jd4 jd43 = ql4.a;
        cx7 immediate2 = MainDispatcherLoader.dispatcher.getImmediate();
        sq5 sq5 = new sq5(xm7, g2a, (Continuation) null);
        this.Y = g2a;
        this.X = 2;
        if (j47.t0(immediate2, sq5, this) == tx3) {
            return tx3;
        }
        this.Y = g2a;
        this.X = 3;
        j47.i(this);
        return tx3;
    }
}
