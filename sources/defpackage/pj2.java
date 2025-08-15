package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: pj2  reason: default package */
public final class pj2 extends ffe implements a66 {
    public final /* synthetic */ ck2 X;
    public final /* synthetic */ int Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pj2(ck2 ck2, int i, Continuation continuation) {
        super(2, continuation);
        this.X = ck2;
        this.Y = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pj2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new pj2(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = ck2.d1;
        ck2 ck2 = this.X;
        sb8 x = ck2.x();
        e5f e5f = e5f.a;
        if (x == null) {
            return e5f;
        }
        int i = k8a.l;
        s35 s35 = ck2.N0;
        int i2 = this.Y;
        if (i2 == i) {
            boolean z = x instanceof jb8;
            pnf.o(s35, new n35(x.j(), x.i(), x.x(), (!z || !((jb8) x).X) ? z ? en4.X : en4.c : en4.Z));
        } else if (i2 == k8a.m) {
            boolean z2 = x instanceof jb8;
            pnf.o(s35, new n35(x.j(), x.i(), x.x(), (!z2 || !((jb8) x).X) ? z2 ? en4.o : en4.b : en4.Y));
        } else {
            int i3 = k8a.j;
            s35 s352 = ck2.O0;
            if (i2 == i3) {
                hi2 hi2 = hi2.c;
                long j = x.j();
                Long l = new Long(x.i());
                hi2.getClass();
                pnf.o(s352, hi2.Z1(j, l));
            } else if (i2 == k8a.k) {
                hi2 hi22 = hi2.c;
                long j2 = x.j();
                hi22.getClass();
                wg0.k(":chats?id=" + ck2.b + "&type=local&message_id=" + j2, s352);
            } else if (i2 == k8a.c) {
                hi2 hi23 = hi2.c;
                long j3 = x.j();
                hi23.getClass();
                pnf.o(s352, hi2.Z1(j3, (Long) null));
            }
        }
        return e5f;
    }
}
