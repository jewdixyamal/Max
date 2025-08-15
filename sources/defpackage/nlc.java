package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: nlc  reason: default package */
public final class nlc extends ffe implements a66 {
    public int X;
    public final /* synthetic */ mg4 Y;
    public final /* synthetic */ vlc Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ long t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nlc(mg4 mg4, vlc vlc, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.Y = mg4;
        this.Z = vlc;
        this.s0 = j;
        this.t0 = j2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nlc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new nlc(this.Y, this.Z, this.s0, this.t0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            int ordinal = this.Y.ordinal();
            vlc vlc = this.Z;
            if (ordinal == 0) {
                t19 d = vlc.d();
                this.X = 1;
                d.getClass();
                if (ote.j(d.a, new q19(d, this.s0, this.t0, 0), this) == tx3) {
                    return tx3;
                }
            } else if (ordinal == 1) {
                t19 d2 = vlc.d();
                this.X = 2;
                d2.getClass();
                if (ote.j(d2.a, new q19(d2, this.s0, this.t0, 1), this) == tx3) {
                    return tx3;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (i == 1 || i == 2) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
