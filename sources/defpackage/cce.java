package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: cce  reason: default package */
public final class cce extends ffe implements a66 {
    public int X;
    public final /* synthetic */ qi8 Y;
    public final /* synthetic */ Set Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cce(qi8 qi8, LinkedHashSet linkedHashSet, Continuation continuation) {
        super(2, continuation);
        this.Y = qi8;
        this.Z = linkedHashSet;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cce) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cce(this.Y, (LinkedHashSet) this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        qi8 qi8 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            tq2 tq2 = new tq2(x53.E0(this.Z));
            this.X = 1;
            obj = ((k4a) ((pk) qi8.a)).J(tq2, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List c = ((ym3) obj).c();
        ArrayList arrayList = new ArrayList(z53.S(c, 10));
        Iterator it = ((ArrayList) c).iterator();
        while (it.hasNext()) {
            wm3 wm3 = (wm3) it.next();
            qi8.getClass();
            String c2 = bre.c(wm3.w0);
            ArrayList arrayList2 = new ArrayList();
            qi8.n(arrayList2, wm3.X);
            arrayList.add(((bdb) qi8.b).b(wm3.a, arrayList2, c2, wm3.a(), wm3.d(kk0.c), (r7b) null, ((y4d) ((je7) qi8.X).getValue()).a(wm3.a)));
        }
        return arrayList;
    }
}
