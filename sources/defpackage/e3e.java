package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: e3e  reason: default package */
public final class e3e extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ i3e Y;
    public final /* synthetic */ Long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e3e(i3e i3e, Long l, Continuation continuation) {
        super(2, continuation);
        this.Y = i3e;
        this.Z = l;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((e3e) n((kpa) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        e3e e3e = new e3e(this.Y, this.Z, continuation);
        e3e.X = obj;
        return e3e;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        kpa kpa = (kpa) this.X;
        m3e m3e = (m3e) kpa.a;
        i3e i3e = this.Y;
        q0e q0e = i3e.B0;
        boolean booleanValue = ((Boolean) kpa.b).booleanValue();
        String str = m3e.b;
        if (str == null) {
            str = "";
        }
        iqe iqe = new iqe(str);
        List<d2e> list = m3e.h;
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        for (d2e r : list) {
            arrayList.add(i3e.r(r, false, this.Z));
        }
        q0e.m((Object) null, new w3e(m3e.a, iqe, m3e.c, (Integer) null, arrayList, booleanValue ? 2 : 4, false, false, 200));
        return e5f.a;
    }
}
