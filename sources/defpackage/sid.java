package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: sid  reason: default package */
public final class sid extends ffe implements a66 {
    public final /* synthetic */ vid X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sid(vid vid, Continuation continuation) {
        super(2, continuation);
        this.X = vid;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((sid) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new sid(this.X, continuation);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [x8f, java.lang.Object] */
    public final Object o(Object obj) {
        List<v6f> list;
        List<iy8> list2;
        q0e q0e;
        Object value;
        od2.a0(obj);
        vid vid = this.X;
        ng5 ng5 = (ng5) vid.X.getValue();
        ng5.getClass();
        y8f y8f = ng5.e;
        py8 py8 = ng5.f;
        ? obj2 = new Object();
        HashSet hashSet = new HashSet();
        obj2.a = hashSet;
        try {
            q8f q8f = q8f.UNKNOWN;
            list = (List) y8f.f().c(Collections.emptyList());
        } catch (Throwable th) {
            hm9.p("x8f", "getUploadsFromRepository: failed", th);
            list = Collections.emptyList();
        }
        for (v6f v6f : list) {
            x8f.a(hashSet, v6f.a.a);
            x8f.a(hashSet, v6f.b);
        }
        HashSet hashSet2 = obj2.a;
        try {
            list2 = (List) py8.a().c(Collections.emptyList());
        } catch (Throwable th2) {
            hm9.p("x8f", "getMessageUploads: failed", th2);
            list2 = Collections.emptyList();
        }
        for (iy8 iy8 : list2) {
            x8f.a(hashSet2, iy8.b);
        }
        obj2.a.addAll((List) new e0a(new e0a(new ty9(qy9.j(ng5.c.E(p82.I)), new n2f(9), 1), new n2f(10), 2), new n2f(11), 3).v().e());
        HashSet hashSet3 = obj2.a;
        oz7 oz7 = iu8.b;
        Iterator it = ng5.d.s().iterator();
        while (it.hasNext()) {
            cu8 cu8 = (cu8) it.next();
            if (cu8.n()) {
                for (int i = 0; i < cu8.b(); i++) {
                    k8g k8g = cu8.z0;
                    x8f.a(hashSet3, ((l20) (k8g != null ? (List) k8g.a : null).get(i)).s);
                }
            }
        }
        HashSet hashSet4 = obj2.a;
        for (lef lef : Collections.unmodifiableSet(ng5.g.i.keySet())) {
            x8f.a(hashSet4, lef.a);
        }
        ng5.j.getClass();
        nw4 a = ng5.a(new va8((x8f) obj2));
        ArrayList arrayList = new ArrayList();
        v25 v25 = vw0.w0;
        v25.getClass();
        u1 u1Var = new u1(0, v25);
        long j = 0;
        while (u1Var.hasNext()) {
            vw0 vw0 = (vw0) u1Var.next();
            long l = a.l(s5c.d0(vw0));
            if (l != 0) {
                arrayList.add(new uw0(vw0, l));
                j += l;
            }
        }
        if (arrayList.size() > 1) {
            c63.U(arrayList, new ky6(13));
        }
        do {
            q0e = vid.Z;
            value = q0e.getValue();
            fx0 fx0 = (fx0) value;
        } while (!q0e.c(value, new fx0(j, arrayList)));
        return e5f.a;
    }
}
