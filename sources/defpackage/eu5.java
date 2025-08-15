package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: eu5  reason: default package */
public final class eu5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ Collection Y;
    public final /* synthetic */ nu5 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eu5(AbstractCollection abstractCollection, nu5 nu5, Continuation continuation) {
        super(2, continuation);
        this.Y = abstractCollection;
        this.Z = nu5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((eu5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new eu5((AbstractCollection) this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            ContextScope a = j1e.a(this.b);
            Collection<Object> collection = this.Y;
            ArrayList arrayList = new ArrayList(z53.S(collection, 10));
            for (Object du5 : collection) {
                arrayList.add(j47.h(a, (nx3) null, new du5(du5, (Continuation) null, this.Z), 3));
            }
            this.X = 1;
            obj = pag.c(arrayList, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return x53.e0((Iterable) obj);
    }
}
