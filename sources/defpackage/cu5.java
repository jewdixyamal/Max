package defpackage;

import android.net.Uri;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: cu5  reason: default package */
public final class cu5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ nu5 Y;
    public final /* synthetic */ je7 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cu5(nu5 nu5, je7 je7, Continuation continuation) {
        super(2, continuation);
        this.Y = nu5;
        this.Z = je7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cu5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cu5(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        Object obj2;
        uj3 l;
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            nu5 nu5 = this.Y;
            bc7[] bc7Arr = nu5.D0;
            long j = this.Y.c;
            this.X = 1;
            obj2 = ((jz2) ((iy2) nu5.Z.getValue())).k(j, this);
            if (obj2 == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e52 e52 = (e52) obj2;
        at5 at5 = this.Y.A0;
        String str = null;
        Set set = at5 != null ? at5.C0 : null;
        if (set == null) {
            set = wz4.a;
        }
        st5 st5 = new st5((iqe) null, !set.contains(cv5.NO_TITLE_EDIT));
        e5f e5f = e5f.a;
        if (e52 == null) {
            this.Y.v0.m((Object) null, y53.M(st5, new ou5(2)));
            return e5f;
        }
        this.Y.y0.updateAndGet(new c52(e52, 1));
        nu5 nu52 = this.Y;
        je7 je7 = this.Z;
        kl7 l2 = j1e.l();
        l2.add(st5);
        l2.add(new ou5(536870914));
        nu52.getClass();
        Uri t = nu5.t(e52);
        long j2 = e52.b.a;
        if (t != null) {
            str = t.toString();
        }
        String str2 = str;
        ((ld2) ((lr2) je7.getValue())).getClass();
        e52.k0();
        CharSequence charSequence = e52.u0;
        long f = e52.f();
        e52.l0();
        l2.add(new pu5(j2, str2, charSequence, f, e52.x0, e52.X() || ((l = e52.l()) != null && l.u()), -2147483644));
        this.Y.v0.setValue(j1e.d(l2));
        return e5f;
    }
}
