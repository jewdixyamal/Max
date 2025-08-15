package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: yp2  reason: default package */
public final class yp2 extends ffe implements a66 {
    public long X;
    public int Y;
    public final /* synthetic */ rq2 Z;
    public final /* synthetic */ Uri s0;
    public final /* synthetic */ Long t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yp2(rq2 rq2, Uri uri, Long l, Continuation continuation) {
        super(2, continuation);
        this.Z = rq2;
        this.s0 = uri;
        this.t0 = l;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yp2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new yp2(this.Z, this.s0, this.t0, continuation);
    }

    public final Object o(Object obj) {
        Object obj2;
        long j;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        e5f e5f = e5f.a;
        rq2 rq2 = this.Z;
        if (i == 0) {
            od2.a0(obj);
            e52 e52 = (e52) rq2.Y0.a.getValue();
            if (e52 != null) {
                List singletonList = Collections.singletonList(new aqd(1, this.s0.toString()));
                long j2 = e52.a;
                this.X = j2;
                this.Y = 1;
                if (((p5d) rq2.D0.getValue()).a(j2, (CharSequence) null, singletonList, false, this.t0, (cz5) null, this) == tx3) {
                    return tx3;
                }
                j = j2;
            }
            return e5f;
        } else if (i == 1) {
            long j3 = this.X;
            od2.a0(obj);
            j = j3;
        } else if (i == 2) {
            od2.a0(obj);
            obj2 = obj;
            pnf.o(rq2.b1, (zo2) obj2);
            return e5f;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mq9 mq9 = zo2.d;
        lu0 q = rq2.q(rq2);
        this.Y = 2;
        obj2 = mq9.c(j, 1, q, (cz5) null, true, this);
        if (obj2 == tx3) {
            return tx3;
        }
        pnf.o(rq2.b1, (zo2) obj2);
        return e5f;
    }
}
