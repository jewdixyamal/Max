package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: p79  reason: default package */
public final class p79 extends ffe implements m56 {
    public int X;
    public final /* synthetic */ r79 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ fs8 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p79(r79 r79, long j, fs8 fs8, Continuation continuation) {
        super(1, continuation);
        this.Y = r79;
        this.Z = j;
        this.s0 = fs8;
    }

    public final Object invoke(Object obj) {
        return new p79(this.Y, this.Z, this.s0, (Continuation) obj).o(e5f.a);
    }

    public final Object o(Object obj) {
        Object obj2;
        tx3 tx3 = tx3.a;
        int i = this.X;
        fs8 fs8 = this.s0;
        r79 r79 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            long j = fs8.a;
            this.X = 1;
            obj2 = r79.a.j(this.Z, j, this);
            if (obj2 == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
            obj2 = obj;
        } else if (i == 2) {
            od2.a0(obj);
            return obj;
        } else if (i == 3) {
            od2.a0(obj);
            return obj;
        } else if (i == 4) {
            od2.a0(obj);
            return obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cu8 cu8 = (cu8) obj2;
        if (cu8 != null) {
            return cu8;
        }
        long j2 = fs8.Y;
        if (j2 == 0) {
            long e = r79.a.e(this.Z, ((Number) r79.b.getValue()).longValue(), fs8);
            this.X = 2;
            Object a = r79.a(e, this);
            return a == tx3 ? tx3 : a;
        }
        r79 r792 = r79;
        vlc vlc = r792.a;
        ru8 h = vlc.d().h(this.Z, j2);
        cu8 b = h != null ? vlc.b(h) : null;
        if (b != null) {
            oz7 oz7 = iu8.b;
            r792.a.o(this.s0, this.Z, false, (vx8) null);
            xt8 xt8 = new xt8(b, iz7.g(fs8.s0, (vxc) r792.c.getValue()), 1);
            vlc vlc2 = r792.a;
            long j3 = b.b;
            vlc2.n(j3, xt8);
            this.X = 3;
            Object a2 = r792.a(j3, this);
            return a2 == tx3 ? tx3 : a2;
        }
        long e2 = r792.a.e(this.Z, ((Number) r792.b.getValue()).longValue(), this.s0);
        this.X = 4;
        Object a3 = r792.a(e2, this);
        return a3 == tx3 ? tx3 : a3;
    }
}
