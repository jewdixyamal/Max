package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* renamed from: jw2  reason: default package */
public final class jw2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ nx2 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jw2(nx2 nx2, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = nx2;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jw2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new jw2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            nx2 nx2 = this.Y;
            this.X = 1;
            obj = ((j52) nx2.y0.getValue()).a(this.Z, nx2.c, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : (Iterable) obj) {
            if (((g52) next) != g52.A0) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(br7.j((g52) it.next()));
        }
        return arrayList2;
    }
}
