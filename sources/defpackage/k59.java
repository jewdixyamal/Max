package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: k59  reason: default package */
public final class k59 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ta3 Y;
    public final /* synthetic */ n59 Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ long t0;
    public final /* synthetic */ long u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k59(ua3 ua3, n59 n59, long j, long j2, long j3, Continuation continuation) {
        super(2, continuation);
        this.Y = ua3;
        this.Z = n59;
        this.s0 = j;
        this.t0 = j2;
        this.u0 = j3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k59) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new k59((ua3) this.Y, this.Z, this.s0, this.t0, this.u0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            obj = ((ua3) this.Y).awaitInternal(this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else if (i == 2 || i == 3) {
            od2.a0(obj);
            return e5f;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        n59 n59 = this.Z;
        if (booleanValue) {
            iy2 iy2 = n59.s0;
            this.X = 2;
            p82 l = ((jz2) iy2).l();
            v82 v82 = v82.o;
            long j = this.s0;
            l.c(j, v82);
            l.h(j, false, new c10(this.t0, 1));
            if (e5f == tx3) {
                return tx3;
            }
        } else {
            this.X = 3;
            ((ps2) n59.O0.getValue()).a(this.s0, this.u0, this);
            if (e5f == tx3) {
                return tx3;
            }
        }
        return e5f;
    }
}
