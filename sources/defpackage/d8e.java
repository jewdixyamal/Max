package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* renamed from: d8e  reason: default package */
public final class d8e extends jdc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d8e(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public void a() {
        switch (this.a) {
            case 0:
                ty2.a((ty2) this.b);
                return;
            default:
                return;
        }
    }

    public void b(int i, int i2) {
        switch (this.a) {
            case 0:
                Class<d8e> cls = d8e.class;
                String name = cls.getName();
                RecyclerView recyclerView = (RecyclerView) this.c;
                ir6 ir6 = hm9.m;
                if (ir6 != null && ir6.c()) {
                    ir6.d(us7.X, name, ey8.j("onItemRangeInserted start. isComputingLayout:", recyclerView.Z()), (Throwable) null);
                }
                ty2.a((ty2) this.b);
                String name2 = cls.getName();
                RecyclerView recyclerView2 = (RecyclerView) this.c;
                ir6 ir62 = hm9.m;
                if (ir62 != null && ir62.c()) {
                    ir62.d(us7.X, name2, ey8.j("onItemRangeInserted end. isComputingLayout:", recyclerView2.Z()), (Throwable) null);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void c(int i, int i2, Object obj) {
        switch (this.a) {
            case 0:
                ty2.a((ty2) this.b);
                return;
            default:
                super.c(i, i2, obj);
                return;
        }
    }

    public final void d(int i, int i2) {
        int i3;
        switch (this.a) {
            case 0:
                ty2.a((ty2) this.b);
                return;
            default:
                if (i2 != 0 && ((NeuroAvatarsScreen) this.b).I0.J(i) != null) {
                    wp9 r0 = ((NeuroAvatarsScreen) this.b).r0();
                    qo9 qo9 = r0.o;
                    if (qo9 != null) {
                        int i4 = qo9.c;
                        qo9 qo92 = r0.o;
                        if (qo92 != null) {
                            long j = qo92.a;
                            Iterator it = ((Map) r0.y0.getValue()).keySet().iterator();
                            int i5 = 0;
                            int i6 = 0;
                            while (true) {
                                i3 = -1;
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    if (i6 < 0) {
                                        y53.R();
                                        throw null;
                                    } else if (((Number) next).intValue() != i4) {
                                        i6++;
                                    }
                                } else {
                                    i6 = -1;
                                }
                            }
                            Iterator it2 = ((List) r0.X.getValue()).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (((qo9) it2.next()).a == j) {
                                        i3 = i5;
                                    } else {
                                        i5++;
                                    }
                                }
                            }
                            Integer valueOf = Integer.valueOf(i3);
                            r0.Y = i6;
                            r0.v0.g(new ro9(i6, valueOf));
                        }
                    }
                    ((hdc) this.c).B(this);
                    return;
                }
                return;
        }
    }

    public void e(int i, int i2) {
        switch (this.a) {
            case 0:
                ty2.a((ty2) this.b);
                return;
            default:
                return;
        }
    }

    public void f(int i, int i2) {
        switch (this.a) {
            case 0:
                ty2.a((ty2) this.b);
                return;
            default:
                return;
        }
    }
}
