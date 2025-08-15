package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: g3e  reason: default package */
public final class g3e extends ffe implements a66 {
    public int X;
    public int Y;
    public final /* synthetic */ z2e Z;
    public final /* synthetic */ i3e s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g3e(z2e z2e, i3e i3e, Continuation continuation) {
        super(2, continuation);
        this.Z = z2e;
        this.s0 = i3e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g3e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new g3e(this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        boolean z;
        int i;
        za3 za3;
        tx3 tx3 = tx3.a;
        int i2 = this.Y;
        z2e z2e = this.Z;
        i3e i3e = this.s0;
        if (i2 == 0) {
            od2.a0(obj);
            boolean z2 = !z2e.v0;
            md5 md5 = (md5) i3e.Y.getValue();
            md5.getClass();
            long j = z2e.a;
            hm9.m("md5", "markAsFavorite: stickerId=%d, favorite=%b", Long.valueOf(j), Boolean.valueOf(z2));
            rm4 rm4 = md5.a;
            qa3 qa3 = new qa3(z2 ? new qa3(new uqd(((hc5) rm4.get()).a(), new ta4(22), 0), 2, new kd5(md5, 4)) : wa3.a, 0, new qa3(((hc5) rm4.get()).a(), 2, new bc5(0, j, z2)));
            if (z2) {
                hm9.m("md5", "addToFavorites: stickerId=%d", Long.valueOf(j));
                hd5 hd5 = (hd5) md5.g.get();
                hd5.getClass();
                za3 = new qa3(new oqd(new zc5(hd5, j, 1), 0).h(new gd1(12, cu.class)), 2, new nc5(18)).k(hd5.d);
                z = true;
            } else {
                z = true;
                za3 = md5.e(new long[]{j});
            }
            db3 g = new qa3(qa3, 0, za3).f(new oc5(z, j, z2)).g(new bc5(4, j, z2));
            this.X = z2 ? 1 : 0;
            this.Y = z ? 1 : 0;
            if (s36.e(g, this) == tx3) {
                return tx3;
            }
            i = z2;
        } else if (i2 == 1) {
            i = this.X;
            od2.a0(obj);
            z = true;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i3e.x0.m((Object) null, z2e.k(z2e, i != 0 ? z : false, false, 7167));
        boolean z3 = i != 0 ? z : false;
        pnf.o(i3e.w0, new qnd(z3 ? woc.n : woc.w, z3 ? cja.e : cja.f));
        return e5f.a;
    }
}
