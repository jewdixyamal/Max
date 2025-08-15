package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: tp2  reason: default package */
public final class tp2 extends ffe implements a66 {
    public glc X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ rq2 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tp2(rq2 rq2, Continuation continuation) {
        super(2, continuation);
        this.s0 = rq2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tp2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        tp2 tp2 = new tp2(this.s0, continuation);
        tp2.Z = obj;
        return tp2;
    }

    public final Object o(Object obj) {
        sx3 sx3;
        zic zic;
        CharSequence charSequence;
        sx3 sx32;
        Object obj2;
        glc glc;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        rq2 rq2 = this.s0;
        if (i == 0) {
            od2.a0(obj);
            sx32 = (sx3) this.Z;
            glc = rq2.Z;
            this.Z = sx32;
            this.X = glc;
            this.Y = 1;
            obj2 = rq2.y(this);
            if (obj2 == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            glc = this.X;
            od2.a0(obj);
            obj2 = obj;
            sx32 = (sx3) this.Z;
        } else if (i == 2) {
            sx3 = (sx3) this.Z;
            od2.a0(obj);
            zic = (zic) obj;
            e5f e5f = e5f.a;
            if (!(zic == null || (charSequence = zic.a) == null || w9e.C0(charSequence))) {
                hm9.m(sx3.getClass().getName(), "send restored draft on UI", new Object[0]);
                pnf.o(rq2.b1, new cp2(charSequence, zic.c, zic.b));
            }
            return e5f;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long longValue = ((Number) obj2).longValue();
        this.Z = sx32;
        this.X = null;
        this.Y = 2;
        Object t0 = j47.t0(((w9a) ((kke) ((je7) glc.o).getValue())).b(), new ajc(glc, longValue, (Continuation) null), this);
        if (t0 == tx3) {
            return tx3;
        }
        sx3 sx33 = sx32;
        obj = t0;
        sx3 = sx33;
        zic = (zic) obj;
        e5f e5f2 = e5f.a;
        hm9.m(sx3.getClass().getName(), "send restored draft on UI", new Object[0]);
        pnf.o(rq2.b1, new cp2(charSequence, zic.c, zic.b));
        return e5f2;
    }
}
