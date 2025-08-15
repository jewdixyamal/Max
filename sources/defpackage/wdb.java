package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: wdb  reason: default package */
public final class wdb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ feb Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ int s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wdb(feb feb, long j, int i, Continuation continuation) {
        super(2, continuation);
        this.Y = feb;
        this.Z = j;
        this.s0 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wdb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new wdb(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        jqe jqe;
        tx3 tx3 = tx3.a;
        int i = this.X;
        boolean z = true;
        feb feb = this.Y;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            obj = ((ea) feb.w0.getValue()).a(this.s0, this.Z, feb.c, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pke pke = (pke) obj;
        if (pke != null) {
            bc7[] bc7Arr = feb.G0;
            feb.getClass();
            String str = pke.o;
            if (str == null || str.length() == 0) {
                String str2 = pke.b;
                jqe = (!f46.U(str2) || !tpa.f(str2, "io.exception")) ? (!f46.U(str2) || tpa.f(str2, "io.exception")) ? new eqe(jpc.F) : new eqe(jpc.J) : new eqe(jpc.G);
                z = false;
            } else {
                jqe = new iqe(str);
            }
            pnf.o(feb.C0, new kdb(jqe, (Integer) null));
            if (z) {
                rdb rdb = rdb.SETUP_NEW_ADMIN;
                rdb rdb2 = feb.o;
                s35 s35 = feb.B0;
                if (rdb2 == rdb) {
                    gfb.c.getClass();
                    pnf.o(s35, new c64(":profile/members?id=" + feb.b + "&type=ADMIN"));
                } else {
                    pnf.o(s35, g43.b);
                }
            }
        } else {
            bc7[] bc7Arr2 = feb.G0;
            feb.getClass();
            rdb rdb3 = rdb.SETUP_NEW_ADMIN;
            rdb rdb4 = feb.o;
            s35 s352 = feb.B0;
            if (rdb4 == rdb3) {
                if (feb.X) {
                    pnf.o(feb.C0, new kdb(new eqe(vea.J0), Integer.valueOf(woc.z)));
                }
                gfb.c.getClass();
                pnf.o(s352, new c64(":profile/members?id=" + feb.b + "&type=ADMIN"));
            } else {
                pnf.o(s352, g43.b);
            }
        }
        return e5f.a;
    }
}
