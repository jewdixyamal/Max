package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jz  reason: default package */
public final class jz extends ffe implements a66 {
    public String X;
    public Integer Y;
    public int Z;
    public /* synthetic */ Object s0;
    public final /* synthetic */ kz t0;
    public final /* synthetic */ cu8 u0;
    public final /* synthetic */ int v0;
    public final /* synthetic */ Long w0;
    public final /* synthetic */ boolean x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jz(kz kzVar, cu8 cu8, int i, Long l, boolean z, Continuation continuation) {
        super(2, continuation);
        this.t0 = kzVar;
        this.u0 = cu8;
        this.v0 = i;
        this.w0 = l;
        this.x0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jz) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        jz jzVar = new jz(this.t0, this.u0, this.v0, this.w0, this.x0, continuation);
        jzVar.s0 = obj;
        return jzVar;
    }

    public final Object o(Object obj) {
        Integer num;
        String str;
        String str2;
        Object obj2;
        Object obj3;
        yf4 yf4;
        tx3 tx3 = tx3.a;
        int i = this.Z;
        cu8 cu8 = this.u0;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3 = (sx3) this.s0;
            kz kzVar = this.t0;
            es8 a = zu8.a((zu8) kzVar.e.getValue(), cu8);
            zf4 h = j47.h(sx3, (nx3) null, new iz(this.t0, this.u0, this.w0, this.x0, (Continuation) null), 3);
            int i2 = this.v0;
            yf4 = j47.h(sx3, (nx3) null, new hz(this.t0, a, this.w0, i2 == 0 ? ((ida) kzVar.h.getValue()).f() : i2, (Continuation) null), 3);
            this.s0 = yf4;
            this.Z = 1;
            obj3 = h.awaitInternal(this);
            if (obj3 == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            yf4 = (yf4) this.s0;
            od2.a0(obj);
            obj3 = obj;
        } else if (i == 2) {
            Integer num2 = this.Y;
            String str3 = this.X;
            od2.a0(obj);
            num = num2;
            str = str3;
            str2 = (String) this.s0;
            obj2 = obj;
            CharSequence charSequence = (CharSequence) obj2;
            Integer num3 = new Integer(cu8.b());
            return new ez(charSequence, str2, str, num, (this.w0 == null || num3.intValue() <= 1) ? null : num3, cu8.t());
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fz fzVar = (fz) obj3;
        String str4 = fzVar.a;
        this.s0 = str4;
        String str5 = fzVar.b;
        this.X = str5;
        Integer num4 = fzVar.c;
        this.Y = num4;
        this.Z = 2;
        obj2 = yf4.a(this);
        if (obj2 == tx3) {
            return tx3;
        }
        num = num4;
        str = str5;
        str2 = str4;
        CharSequence charSequence2 = (CharSequence) obj2;
        Integer num32 = new Integer(cu8.b());
        return new ez(charSequence2, str2, str, num, (this.w0 == null || num32.intValue() <= 1) ? null : num32, cu8.t());
    }
}
