package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vmb  reason: default package */
public final class vmb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ mec Y;
    public final /* synthetic */ lec Z;
    public final /* synthetic */ cnb s0;
    public final /* synthetic */ boolean t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vmb(mec mec, lec lec, cnb cnb, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = mec;
        this.Z = lec;
        this.s0 = cnb;
        this.t0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vmb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vmb(this.Y, this.Z, this.s0, this.t0, continuation);
    }

    public final Object o(Object obj) {
        k10 r;
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        String str = null;
        lec lec = this.Z;
        cnb cnb = this.s0;
        mec mec = this.Y;
        if (i == 0) {
            od2.a0(obj);
            if (mec.a == hdb.LOCAL_CHAT) {
                Long j = cnb.O0.j();
                if (j == null) {
                    return e5f;
                }
                lec.a = j.longValue();
                mec.a = hdb.SERVER_CHAT;
            }
            if (mec.a == hdb.SERVER_CHAT) {
                pab pab = cnb.O0;
                this.X = 1;
                obj = pab.n(this);
                if (obj == tx3) {
                    return tx3;
                }
            }
            pnf.o(cnb.A0, new mkb(lec.a, (hdb) mec.a, this.t0, str));
            return e5f;
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e52 e52 = (e52) obj;
        if (!(e52 == null || (r = e52.r()) == null)) {
            str = r.c;
        }
        pnf.o(cnb.A0, new mkb(lec.a, (hdb) mec.a, this.t0, str));
        return e5f;
    }
}
