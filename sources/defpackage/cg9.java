package defpackage;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: cg9  reason: default package */
public final class cg9 extends ffe implements a66 {
    public Set X;
    public int Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ eg9 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cg9(long j, eg9 eg9, Continuation continuation) {
        super(2, continuation);
        this.Z = j;
        this.s0 = eg9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cg9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cg9(this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        Set set;
        Set set2;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        e5f e5f = e5f.a;
        eg9 eg9 = this.s0;
        if (i == 0) {
            od2.a0(obj);
            long j = this.Z;
            if (j == -1) {
                return e5f;
            }
            Set set3 = ((yf9) eg9.f.getValue()).a;
            if (set3.isEmpty()) {
                set2 = Collections.singleton(new Long(j));
            } else if (set3.contains(new Long(j))) {
                set2 = x53.G0(set3);
                set2.remove(new Long(j));
            } else {
                Long l = new Long(j);
                LinkedHashSet linkedHashSet = new LinkedHashSet(mz7.Z(set3.size() + 1));
                linkedHashSet.addAll(set3);
                linkedHashSet.add(l);
                set2 = linkedHashSet;
            }
            this.X = set2;
            this.Y = 1;
            Object c = set2.isEmpty() ? nz4.a : set2.size() == 1 ? eg9.c(((l29) eg9.c.getValue()).d(((Number) x53.f0(set2)).longValue()), this) : eg9.b(set2, this);
            if (c == tx3) {
                return tx3;
            }
            Set set4 = set2;
            obj = c;
            set = set4;
        } else if (i == 1) {
            set = this.X;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        eg9.f.m((Object) null, new yf9((List) obj, set));
        return e5f;
    }
}
