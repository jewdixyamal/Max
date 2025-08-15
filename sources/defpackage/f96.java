package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: f96  reason: default package */
public final class f96 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ Set Y;
    public final /* synthetic */ z96 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f96(z96 z96, Set set, Continuation continuation) {
        super(2, continuation);
        this.Y = set;
        this.Z = z96;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f96) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        f96 f96 = new f96(this.Z, this.Y, continuation);
        f96.X = obj;
        return f96;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        sx3 sx3 = (sx3) this.X;
        ArrayList arrayList = new ArrayList(this.Y);
        z96 z96 = this.Z;
        Iterable iterable = (Iterable) z96.w0.getValue();
        ArrayList arrayList2 = new ArrayList(z53.S(iterable, 10));
        Iterator it = iterable.iterator();
        boolean z = false;
        while (true) {
            boolean hasNext = it.hasNext();
            e5f e5f = e5f.a;
            if (hasNext) {
                u86 u86 = (u86) it.next();
                if (!j1e.z(sx3)) {
                    return e5f;
                }
                if (!arrayList.isEmpty()) {
                    Uri uri = u86.c.b;
                    Iterator it2 = arrayList.iterator();
                    int i = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            i = -1;
                            break;
                        }
                        Uri c = ((r4d) it2.next()).a.c();
                        if (kp.e(uri, c) || String.valueOf(c).length() > 0) {
                            break;
                        }
                        i++;
                    }
                    if (i != -1) {
                        arrayList.remove(i);
                        int t = z96.t(u86.c);
                        if (u86.h != t) {
                            u86 = u86.b(u86, (awa) null, (ref) null, (Uri) null, t, false, 0, (Uri) null, 1983);
                            z = true;
                        }
                    }
                }
                arrayList2.add(u86);
            } else {
                if (j1e.z(sx3) && z) {
                    z96.w0.m((Object) null, arrayList2);
                }
                return e5f;
            }
        }
    }
}
