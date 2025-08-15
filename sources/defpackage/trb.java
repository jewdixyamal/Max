package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;

/* renamed from: trb  reason: default package */
public final class trb extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ urb Z;
    public final /* synthetic */ File s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public trb(urb urb, File file, Continuation continuation) {
        super(2, continuation);
        this.Z = urb;
        this.s0 = file;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((trb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        trb trb = new trb(this.Z, this.s0, continuation);
        trb.Y = obj;
        return trb;
    }

    public final Object o(Object obj) {
        Object obj2;
        Object obj3;
        tx3 tx3 = tx3.a;
        int i = this.X;
        Object obj4 = null;
        urb urb = this.Z;
        if (i == 0) {
            od2.a0(obj);
            trc trc = urb.c;
            this.Y = (sx3) this.Y;
            this.X = 1;
            trc.getClass();
            obj2 = j47.t0(xq9.a.plus(trc.b), new src(this.s0, trc, (Continuation) null), this);
            if (obj2 == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            sx3 sx3 = (sx3) this.Y;
            od2.a0(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Uri uri = (Uri) obj2;
        e5f e5f = e5f.a;
        if (uri == null) {
            return e5f;
        }
        try {
            obj3 = ((cj0) urb.Z).d(uri.toString());
        } catch (Throwable th) {
            obj3 = new njc(th);
        }
        if (!(obj3 instanceof njc)) {
            obj4 = obj3;
        }
        xjf xjf = (xjf) obj4;
        up7 up7 = new up7(3, (long) uri.toString().hashCode(), uri.toString(), xjf != null ? xjf.a : uri.toString(), 0, 0, "video/mp4", 0, (Uri) null);
        pnf.o(urb.w0, new irb(up7, urb.o.f.r(up7)));
        return e5f;
    }
}
