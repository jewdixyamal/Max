package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: bcb  reason: default package */
public final class bcb extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ccb Z;
    public final /* synthetic */ xab s0;
    public final /* synthetic */ uab t0;
    public final /* synthetic */ String u0;
    public final /* synthetic */ int v0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bcb(ccb ccb, xab xab, uab uab, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.Z = ccb;
        this.s0 = xab;
        this.t0 = uab;
        this.u0 = str;
        this.v0 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bcb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        bcb bcb = new bcb(this.Z, this.s0, this.t0, this.u0, this.v0, continuation);
        bcb.Y = obj;
        return bcb;
    }

    public final Object o(Object obj) {
        Object obj2;
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3 = (sx3) this.Y;
            pnf.o(this.Z.Z, zbb.a);
            ccb ccb = this.Z;
            xab xab = this.s0;
            uab uab = this.t0;
            String str = this.u0;
            int i2 = this.v0;
            fbb fbb = ccb.b;
            boolean z = ccb.Y == i2;
            om8 om8 = new om8(1, ccb, ccb.class, "mapAndNotifyEvent", "mapAndNotifyEvent(Lone/me/profile/screens/avatars/ProfileAvatars$Event;)V", 0, 10);
            this.X = 1;
            if (fbb.b(xab, uab, str, z, om8, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            try {
                od2.a0(obj);
            } catch (Throwable th) {
                obj2 = new njc(th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj2 = e5f;
        if (!(obj2 instanceof njc)) {
            jqe jqe = this.s0.b;
            if (jqe != null) {
                pnf.o(this.Z.Z, new wbb((eqe) jqe, false));
            }
        } else {
            Throwable a = pjc.a(obj2);
            if (!(a instanceof CancellationException)) {
                String str2 = this.Z.c;
                xab xab2 = this.s0;
                hm9.p(str2, "action " + xab2 + ": failed", a);
                jqe jqe2 = this.s0.c;
                if (jqe2 != null) {
                    pnf.o(this.Z.Z, new wbb((eqe) jqe2, true));
                }
            }
        }
        pnf.o(this.Z.Z, vbb.a);
        return e5f;
    }
}
