package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ih5  reason: default package */
public final class ih5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ jh5 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ih5(jh5 jh5, Continuation continuation) {
        super(2, continuation);
        this.Y = jh5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ih5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ih5(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        jh5 jh5 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            String str = jh5.b.c;
            if (str != null) {
                kh5 kh5 = jh5.b;
                long j = kh5.a;
                long j2 = kh5.b;
                d20 d20 = d20.X;
                this.X = 1;
                if (((k6f) jh5.X.getValue()).a(j, j2, str, d20, this) == tx3) {
                    return tx3;
                }
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kh5 kh52 = jh5.b;
        ((no4) jh5.o.getValue()).a(kh52.b, kh52.d, kh52.c, kh52.e, kh52.f);
        return e5f.a;
    }
}
