package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.MainDispatcherLoader;

/* renamed from: ng7  reason: default package */
public final class ng7 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ pg7 Y;
    public final /* synthetic */ a66 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ng7(pg7 pg7, lg7 lg7, Continuation continuation) {
        super(2, continuation);
        this.Y = pg7;
        this.Z = lg7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ng7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ng7(this.Y, (lg7) this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            gh7 gh7 = ((rg7) this.Y).a;
            this.X = 1;
            fg7 fg7 = fg7.c;
            jd4 jd4 = ql4.a;
            if (j47.t0(MainDispatcherLoader.dispatcher.getImmediate(), new wra(gh7, fg7, this.Z, (Continuation) null), this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
