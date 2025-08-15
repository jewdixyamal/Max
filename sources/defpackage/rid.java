package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: rid  reason: default package */
public final class rid extends ffe implements a66 {
    public int X;
    public final /* synthetic */ vw0 Y;
    public final /* synthetic */ vid Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rid(vw0 vw0, vid vid, Continuation continuation) {
        super(2, continuation);
        this.Y = vw0;
        this.Z = vid;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rid) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rid(this.Y, this.Z, continuation);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [x8f, java.lang.Object] */
    public final Object o(Object obj) {
        List<v6f> list;
        List<iy8> list2;
        Long l;
        List list3;
        Object obj2;
        Object obj3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            vw0 vw0 = vw0.AUDIO;
            vw0 vw02 = this.Y;
            vid vid = this.Z;
            if (vw02 == vw0 || vw02 == vw0.MUSIC) {
                ((uh9) ((ch9) vid.Y.getValue())).t();
            }
            ng5 ng5 = (ng5) vid.X.getValue();
            ng5.getClass();
            y8f y8f = ng5.e;
            py8 py8 = ng5.f;
            ? obj4 = new Object();
            HashSet hashSet = new HashSet();
            obj4.a = hashSet;
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
            HashSet hashSet2 = obj4.a;
            try {
                list2 = (List) py8.a().c(Collections.emptyList());
            } catch (Throwable th2) {
                hm9.p("x8f", "getMessageUploads: failed", th2);
                list2 = Collections.emptyList();
            }
            for (iy8 iy8 : list2) {
                x8f.a(hashSet2, iy8.b);
            }
            obj4.a.addAll((List) new e0a(new e0a(new ty9(qy9.j(ng5.c.E(p82.I)), new n2f(9), 1), new n2f(10), 2), new n2f(11), 3).v().e());
            HashSet hashSet3 = obj4.a;
            oz7 oz7 = iu8.b;
            Iterator it = ng5.d.s().iterator();
            while (true) {
                l = null;
                if (!it.hasNext()) {
                    break;
                }
                cu8 cu8 = (cu8) it.next();
                if (cu8.n()) {
                    for (int i2 = 0; i2 < cu8.b(); i2++) {
                        k8g k8g = cu8.z0;
                        x8f.a(hashSet3, ((l20) (k8g != null ? (List) k8g.a : null).get(i2)).s);
                    }
                }
            }
            HashSet hashSet4 = obj4.a;
            for (lef lef : Collections.unmodifiableSet(ng5.g.i.keySet())) {
                x8f.a(hashSet4, lef.a);
            }
            ng5.j.getClass();
            ng5.a(new va8((x8f) obj4)).h(Collections.singletonList(s5c.d0(vw02)));
            fx0 fx0 = (fx0) vid.Z.getValue();
            if (!(fx0 == null || (list3 = fx0.b) == null)) {
                Iterator it2 = list3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (((uw0) obj2).a == vw02) {
                        break;
                    }
                }
                uw0 uw0 = (uw0) obj2;
                if (uw0 != null) {
                    l = new Long(uw0.b);
                }
            }
            if (l != null) {
                vid.q(vid, l.longValue());
            }
            this.X = 1;
            if (vid.r(vid, this) == obj3) {
                return obj3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
