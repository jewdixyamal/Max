package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: xo8  reason: default package */
public final class xo8 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ List Y;
    public final /* synthetic */ bp8 Z;
    public final /* synthetic */ yn8 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xo8(yn8 yn8, bp8 bp8, List list, Continuation continuation) {
        super(2, continuation);
        this.Y = list;
        this.Z = bp8;
        this.s0 = yn8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xo8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xo8(this.s0, this.Z, this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        List<kn8> list = this.Y;
        if (i == 0) {
            od2.a0(obj);
            List i0 = l6d.i0(new r1f(l6d.Z(new at(2, list), new wz7(3, this.s0)), new g27(13)));
            if (i0.isEmpty()) {
                return list;
            }
            this.X = 1;
            obj = this.Z.r(i0, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Iterable iterable = (Iterable) obj;
        int Z2 = mz7.Z(z53.S(iterable, 10));
        if (Z2 < 16) {
            Z2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(Z2);
        for (Object next : iterable) {
            linkedHashMap.put(new Long(((kn8) next).a), next);
        }
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        for (kn8 kn8 : list) {
            kn8 kn82 = (kn8) linkedHashMap.get(new Long(kn8.a));
            if (kn82 != null) {
                kn8 = kn82;
            }
            arrayList.add(kn8);
        }
        return arrayList;
    }
}
