package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: i27  reason: default package */
public final class i27 extends ffe implements a66 {
    public String X;
    public int Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ String s0;
    public final /* synthetic */ q27 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i27(String str, String str2, q27 q27, Continuation continuation) {
        super(2, continuation);
        this.Z = str;
        this.s0 = str2;
        this.t0 = q27;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i27) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new i27(this.Z, this.s0, this.t0, continuation);
    }

    public final Object o(Object obj) {
        String str;
        boolean z;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        e5f e5f = e5f.a;
        q27 q27 = this.t0;
        if (i == 0) {
            od2.a0(obj);
            String str2 = this.Z + " " + this.s0;
            if ("".equals(((eaa) q27.w0.getValue()).a)) {
                z = true;
            } else {
                je7 je7 = q27.X;
                z = ((zua) je7.getValue()).m(((zua) je7.getValue()).t((String) null, str2));
            }
            if (!z) {
                kld kld = q27.Z;
                rt7 rt7 = new rt7(new eqe(v0c.oneme_login_input_is_not_valid_phone_error), (Throwable) null);
                this.Y = 1;
                if (kld.a(rt7, this) == tx3) {
                    return tx3;
                }
            } else {
                String b = q27.A0.b("", str2);
                this.X = str2;
                this.Y = 2;
                Object a = ((i80) q27.c.getValue()).a(b, 1, this);
                if (a == tx3) {
                    return tx3;
                }
                String str3 = str2;
                obj = a;
                str = str3;
                h80 h80 = (h80) obj;
                pnf.o(q27.Y, new x17(h80.c, str, h80.o));
                return e5f;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else if (i == 2) {
            str = this.X;
            od2.a0(obj);
            h80 h802 = (h80) obj;
            pnf.o(q27.Y, new x17(h802.c, str, h802.o));
            return e5f;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
