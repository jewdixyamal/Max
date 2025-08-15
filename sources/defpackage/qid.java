package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;

/* renamed from: qid  reason: default package */
public final class qid extends ffe implements a66 {
    public int X;
    public final /* synthetic */ vid Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qid(vid vid, Continuation continuation) {
        super(2, continuation);
        this.Y = vid;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qid) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new qid(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            vid vid = this.Y;
            ng5 ng5 = (ng5) vid.X.getValue();
            ng5.j.getClass();
            Long l = null;
            ng5.a(new va8((x8f) null)).h(Collections.singleton(gx0.a));
            fx0 fx0 = (fx0) vid.Z.getValue();
            if (fx0 != null) {
                l = new Long(fx0.a);
            }
            if (l != null) {
                vid.q(vid, l.longValue());
            }
            this.X = 1;
            if (vid.r(vid, this) == tx3) {
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
