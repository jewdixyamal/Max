package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: rfe  reason: default package */
public final class rfe extends ffe implements a66 {
    public aj9 X;
    public cge Y;
    public d7f Z;
    public int s0;
    public /* synthetic */ Object t0;
    public final /* synthetic */ cge u0;
    public final /* synthetic */ d7f v0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rfe(cge cge, d7f d7f, Continuation continuation) {
        super(2, continuation);
        this.u0 = cge;
        this.v0 = d7f;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rfe) n((iab) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        rfe rfe = new rfe(this.u0, this.v0, continuation);
        rfe.t0 = obj;
        return rfe;
    }

    /* JADX INFO: finally extract failed */
    public final Object o(Object obj) {
        iab iab;
        aj9 aj9;
        cge cge;
        d7f d7f;
        tx3 tx3 = tx3.a;
        int i = this.s0;
        if (i == 0) {
            od2.a0(obj);
            iab = (iab) this.t0;
            cge cge2 = this.u0;
            aj9 = cge2.h;
            this.t0 = iab;
            this.X = aj9;
            this.Y = cge2;
            d7f = this.v0;
            this.Z = d7f;
            this.s0 = 1;
            if (aj9.d(this) == tx3) {
                return tx3;
            }
            cge = cge2;
        } else if (i == 1) {
            d7f = this.Z;
            cge = this.Y;
            aj9 = this.X;
            iab = (iab) this.t0;
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
            return e5f.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            mn5 mn5 = (mn5) cge.i.f(d7f);
            if (mn5 == null) {
                cp5 cp5 = new cp5(new ac(new ac(od2.D(new mqc(new ofe(cge, d7f, (Continuation) null)), new pfe(cge, (Continuation) null)), 19, new qfe(cge, (Continuation) null, 0)), 18, new vp5(cge, d7f, (Continuation) null, 9)), new y03(cge, d7f, (Continuation) null));
                cge.i.k(d7f, cp5);
                mn5 = cp5;
            }
            aj9.e((Object) null);
            mu2 mu2 = new mu2(1, iab);
            this.t0 = null;
            this.X = null;
            this.Y = null;
            this.Z = null;
            this.s0 = 2;
            if (mn5.d(mu2, this) == tx3) {
                return tx3;
            }
            return e5f.a;
        } catch (Throwable th) {
            aj9.e((Object) null);
            throw th;
        }
    }
}
