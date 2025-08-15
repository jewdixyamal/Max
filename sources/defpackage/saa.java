package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* renamed from: saa  reason: default package */
public final class saa extends ffe implements a66 {
    public raa X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ taa s0;
    public final /* synthetic */ String t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public saa(taa taa, String str, Continuation continuation) {
        super(2, continuation);
        this.s0 = taa;
        this.t0 = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((saa) n((iab) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        saa saa = new saa(this.s0, this.t0, continuation);
        saa.Z = obj;
        return saa;
    }

    public final Object o(Object obj) {
        iab iab;
        raa raa;
        Object obj2;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        String str = this.t0;
        taa taa = this.s0;
        if (i == 0) {
            od2.a0(obj);
            iab iab2 = (iab) this.Z;
            raa = new raa(str, iab2);
            int i2 = taa.f;
            so4 a = taa.a();
            a.getClass();
            a.e.add(raa);
            long j = taa.e;
            this.Z = iab2;
            this.X = raa;
            this.Y = 1;
            if (j47.y(j, this) == tx3) {
                return tx3;
            }
            iab = iab2;
        } else if (i == 1) {
            raa = this.X;
            iab = (iab) this.Z;
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
            return e5f.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i3 = taa.f;
        Iterator it = taa.a().l.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (tpa.f(((dn4) obj2).a.a, str)) {
                break;
            }
        }
        if (obj2 == null) {
            fab fab = (fab) iab;
            fab.getClass();
            fab.i(new IllegalStateException("download not started after ".concat(ft4.j(taa.e))));
        }
        yf3 yf3 = new yf3(taa, 26, raa);
        this.Z = null;
        this.X = null;
        this.Y = 2;
        if (j47.j(iab, yf3, this) == tx3) {
            return tx3;
        }
        return e5f.a;
    }
}
