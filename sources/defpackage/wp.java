package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: wp  reason: default package */
public final /* synthetic */ class wp implements x3a, qj3, m7a, wu, q16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m56 b;

    public /* synthetic */ wp(int i, m56 m56) {
        this.a = i;
        this.b = m56;
    }

    public void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.invoke(obj);
                return;
            default:
                this.b.invoke(obj);
                return;
        }
    }

    public void accept(Object obj) {
        z07 z07;
        Object obj2;
        j5g j5g;
        j5g j5g2;
        List list;
        Object obj3;
        switch (this.a) {
            case 1:
                this.b.invoke((u82) obj);
                return;
            case 3:
                m20 m20 = (m20) obj;
                z07 z072 = m20.b;
                m56 m56 = this.b;
                if (z072 != null) {
                    y07 y07 = new y07();
                    y07.a = z072.a;
                    y07.b = z072.b;
                    m56.invoke(y07);
                    m20.b = new z07(y07);
                    return;
                }
                Iterator it = m20.a.iterator();
                while (true) {
                    z07 = null;
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((l20) obj2).n != null) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                l20 l20 = (l20) obj2;
                if (!(l20 == null || (j5g2 = l20.n) == null || (list = j5g2.a) == null)) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj3 = it2.next();
                            if (((f5g) obj3).b()) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    f5g f5g = (f5g) obj3;
                    if (f5g != null) {
                        z07 = f5g.c;
                    }
                }
                if (z07 != null) {
                    y07 y072 = new y07();
                    y072.a = z07.a;
                    y072.b = z07.b;
                    m56.invoke(y072);
                    l20 l202 = (l20) x53.i0(m20.a);
                    if (l202 != null && (j5g = l202.n) != null) {
                        List list2 = j5g.a;
                        Iterator it3 = list2.iterator();
                        int i = 0;
                        while (true) {
                            if (!it3.hasNext()) {
                                i = -1;
                            } else if (!((f5g) it3.next()).b()) {
                                i++;
                            }
                        }
                        f5g f5g2 = (f5g) list2.get(i);
                        ArrayList arrayList = new ArrayList(list2);
                        arrayList.set(i, new f5g(f5g2.a, f5g2.b, new z07(y072), f5g2.d));
                        List list3 = m20.a;
                        j10 j = l202.j();
                        j.w = new j5g(arrayList);
                        list3.set(0, j.a());
                        return;
                    }
                    return;
                }
                return;
            default:
                this.b.invoke((j10) obj);
                return;
        }
    }

    public bm7 apply(Object obj) {
        return (bm7) this.b.invoke(obj);
    }

    public void b(String str, Bundle bundle) {
        ktc ktc = (ktc) bundle.getParcelable(str);
        if (ktc != null) {
            this.b.invoke(ktc);
        }
    }

    public void c(int i) {
        this.b.invoke(Integer.valueOf(i));
    }

    public /* synthetic */ wp(m56 m56, r79 r79) {
        this.a = 3;
        this.b = m56;
    }
}
