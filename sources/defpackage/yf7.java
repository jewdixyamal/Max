package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: yf7  reason: default package */
public final class yf7 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ bg7 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yf7(bg7 bg7, Continuation continuation) {
        super(2, continuation);
        this.Y = bg7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yf7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new yf7(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        bg7 bg7 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            hmc hmc = (hmc) ((je7) bg7.h).getValue();
            this.X = 1;
            Object t0 = j47.t0(((w9a) hmc.a).b(), new bmc(hmc, (Continuation) null), this);
            if (t0 != tx3) {
                t0 = e5f;
            }
            if (t0 == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            try {
                od2.a0(obj);
            } catch (Throwable th) {
                hm9.p("LibraryUpgradeHelper", "fail to migrate 4", th);
                ((ty3) ((je7) bg7.i).getValue()).a("ONEME-14182", new IllegalStateException("fail to clear stats", th));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
