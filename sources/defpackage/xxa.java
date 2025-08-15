package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: xxa  reason: default package */
public final class xxa extends ffe implements a66 {
    public int X;
    public final /* synthetic */ eya Y;
    public final /* synthetic */ String Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xxa(eya eya, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = eya;
        this.Z = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xxa) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xxa(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        Object obj2;
        Object obj3;
        tx3 tx3 = tx3.a;
        int i = this.X;
        eya eya = this.Y;
        if (i == 0) {
            od2.a0(obj);
            String str = this.Z;
            this.X = 1;
            sy1 sy1 = new sy1(1, v3c.u(this));
            sy1.n();
            bc7[] bc7Arr = eya.F0;
            eya.r().d();
            eya.r().i = new nw4((Object) eya, (Object) str, (Object) sy1, 10);
            yx7 r = eya.r();
            r.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            hm9.H("yx7", "searchChats start", new Object[0]);
            r.b();
            drd i2 = new q1a(2, new u24(r, 5, str)).m(r.c).i(r.b);
            tx7 tx7 = r8;
            tx7 tx72 = new tx7(r, currentTimeMillis, str, 1);
            iq1 iq1 = new iq1(tx7, 2, new sx7(r, str, 2));
            i2.k(iq1);
            r.k = iq1;
            sy1.d(new c01(7, eya));
            obj3 = sy1.m();
            if (obj3 == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
            obj3 = obj;
        } else if (i == 2) {
            od2.a0(obj);
            obj2 = obj;
            eya.A0.setValue((List) obj2);
            return e5f.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : (List) obj3) {
            kzc kzc = (kzc) next;
            boolean z = kzc.a == 4;
            boolean z2 = z && kzc.X.t();
            if (kzc.a == 1 || z2 || (((Boolean) eya.Y.invoke()).booleanValue() && z)) {
                arrayList.add(next);
            }
        }
        ContextScope a = j1e.a(this.b);
        ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(j47.h(a, (nx3) null, new wxa(it.next(), (Continuation) null, eya), 3));
        }
        this.X = 2;
        obj2 = pag.c(arrayList2, this);
        if (obj2 == tx3) {
            return tx3;
        }
        eya.A0.setValue((List) obj2);
        return e5f.a;
    }
}
