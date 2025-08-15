package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: u6e  reason: default package */
public final class u6e extends ffe implements a66 {
    public int X;
    public final /* synthetic */ w6e Y;
    public final /* synthetic */ Long Z;
    public final /* synthetic */ Long s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u6e(w6e w6e, Long l, Long l2, Continuation continuation) {
        super(2, continuation);
        this.Y = w6e;
        this.Z = l;
        this.s0 = l2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((u6e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new u6e(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7Arr = w6e.B0;
            sc5 sc5 = (sc5) this.Y.o.getValue();
            Long l = this.Z;
            long longValue = l.longValue();
            Long l2 = this.s0;
            long longValue2 = l2.longValue();
            sc5.getClass();
            hm9.m("sc5", "setFavoriteStickerSetMoved: stickerSetId=%d, targetPositionStickerId=%d", l, l2);
            long j = longValue2;
            qa3 qa3 = new qa3(sc5.b(), 2, new pc5(longValue, longValue2, 0));
            dd5 dd5 = (dd5) sc5.Y.getValue();
            dd5.getClass();
            db3 f = new qa3(qa3, 0, new qa3(new oqd(new ad5(dd5, longValue, j), 0).h(new gd1(12, mu.class)), 2, new nc5(14)).k(dd5.d)).g(new nc5(2)).f(new qc5(longValue, j));
            this.X = 1;
            if (s36.e(f, this) == tx3) {
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
