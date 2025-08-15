package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* renamed from: srb  reason: default package */
public final class srb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ urb Y;
    public final /* synthetic */ byte[] Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public srb(urb urb, byte[] bArr, Continuation continuation) {
        super(2, continuation);
        this.Y = urb;
        this.Z = bArr;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((srb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new srb(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        Object obj2;
        tx3 tx3 = tx3.a;
        int i = this.X;
        urb urb = this.Y;
        if (i == 0) {
            od2.a0(obj);
            djb djb = urb.b;
            this.X = 1;
            djb.getClass();
            obj2 = j47.t0(xq9.a.plus((nx3) djb.c), new rrc(djb, this.Z, (Continuation) null), this);
            if (obj2 == tx3) {
                return tx3;
            }
        } else if (i == 1) {
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
        up7 up7 = new up7(1, (long) uri.hashCode(), uri.toString(), uri.toString(), 0, 0, "image/jpeg", 0, (Uri) null);
        pnf.o(urb.w0, new irb(up7, urb.o.f.r(up7)));
        urb.t0.m((Object) null, drb.a);
        return e5f;
    }
}
