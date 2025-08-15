package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vhd  reason: default package */
public final class vhd extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cid Y;
    public final /* synthetic */ boolean Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vhd(cid cid, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = cid;
        this.Z = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vhd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vhd(this.Y, this.Z, continuation);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, eaf] */
    public final Object o(Object obj) {
        Object obj2 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7Arr = cid.O0;
            cid cid = this.Y;
            boolean z = ((jp) cid.s()).g.getBoolean("app.privacy.online.show", true);
            boolean z2 = this.Z;
            if (z == z2) {
                return e5f;
            }
            ((jp) cid.s()).j("app.privacy.online.show", z2);
            pk r = cid.r();
            ? obj3 = new Object();
            obj3.h = Boolean.valueOf(!z2);
            r.a(new gaf(obj3));
            this.X = 1;
            if (cid.q(cid, this) == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
