package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: ew5  reason: default package */
public final class ew5 extends ffe implements a66 {
    public w9f X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ iw5 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ew5(iw5 iw5, Continuation continuation) {
        super(2, continuation);
        this.s0 = iw5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ew5) n((List) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ew5 ew5 = new ew5(this.s0, continuation);
        ew5.Z = obj;
        return ew5;
    }

    public final Object o(Object obj) {
        List<at5> list;
        Object obj2;
        w9f w9f;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        e5f e5f = e5f.a;
        iw5 iw5 = this.s0;
        if (i == 0) {
            od2.a0(obj);
            List list2 = (List) this.Z;
            w9f w9f2 = new w9f((at5) null, v9f.c, new eqe(qba.m));
            ta2 ta2 = iw5.b;
            this.Z = list2;
            this.X = w9f2;
            this.Y = 1;
            zb2 zb2 = (zb2) ta2;
            zb2.getClass();
            obj2 = j47.t0(zb2.Y, new gb2(zb2, (Continuation) null), this);
            if (obj2 == tx3) {
                return tx3;
            }
            w9f w9f3 = w9f2;
            list = list2;
            w9f = w9f3;
        } else if (i == 1) {
            w9f = this.X;
            od2.a0(obj);
            list = (List) this.Z;
            obj2 = obj;
        } else if (i == 2) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Iterable<at5> iterable = (Iterable) obj2;
        ArrayList arrayList = new ArrayList(z53.S(iterable, 10));
        for (at5 at5 : iterable) {
            v9f v9f = v9f.o;
            CharSequence charSequence = at5 != null ? at5.b : null;
            if (charSequence == null) {
                charSequence = "";
            }
            arrayList.add(new w9f(at5, v9f, new iqe(charSequence)));
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        for (at5 at52 : list) {
            arrayList2.add(new w9f(at52, tpa.f(at52.a, "all.chat.folder") ? v9f.a : v9f.b, new iqe(((hda) iw5.o.getValue()).a(at52.b, at52.y0, 2, false, 0, true))));
        }
        arrayList2.add(w9f);
        arrayList2.addAll(arrayList);
        q0e q0e = iw5.X;
        this.Z = null;
        this.X = null;
        this.Y = 2;
        q0e.m((Object) null, arrayList2);
        return e5f == tx3 ? tx3 : e5f;
    }
}
