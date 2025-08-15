package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import one.me.sdk.arch.Widget;

/* renamed from: joa  reason: default package */
public final class joa extends su3 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public joa(dv3 dv3, ArrayList arrayList) {
        this.c = dv3;
        this.b = arrayList;
    }

    public final void a(uu3 uu3, zu3 zu3, av3 av3) {
        switch (this.a) {
            case 0:
                if (((uu3) this.c) == uu3 && av3.b && zu3.d()) {
                    View view = uu3.getView();
                    gh7 gh7 = null;
                    if ((view != null ? view.getWindowToken() : null) != null) {
                        gh7 gh72 = ((loa) this.b).a;
                        if ((gh72 == null ? null : gh72).d == fg7.o) {
                            if (gh72 != null) {
                                gh7 = gh72;
                            }
                            gh7.d(eg7.ON_RESUME);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (av3 == av3.POP_EXIT) {
                    List list = (List) this.b;
                    for (int size = list.size() - 1; size > 0; size--) {
                        ((znc) this.c).z((coc) null, (coc) list.get(size), true, new gqd());
                    }
                    return;
                }
                return;
        }
    }

    public void b(uu3 uu3, zu3 zu3, av3 av3) {
        switch (this.a) {
            case 0:
                loa.a((loa) this.b, (uu3) this.c, uu3, zu3, av3);
                for (md6 md6 : nd6.a.values()) {
                    if (md6.a.contains(uu3.getInstanceId())) {
                        md6.b.invoke(uu3, zu3, av3);
                    }
                }
                return;
            default:
                return;
        }
    }

    public void c(uu3 uu3, Bundle bundle) {
        switch (this.a) {
            case 0:
                ((loa) this.b).o = bundle.getBundle("Registry.savedState");
                return;
            default:
                return;
        }
    }

    public void e(uu3 uu3, Bundle bundle) {
        switch (this.a) {
            case 0:
                bundle.putBundle("Registry.savedState", ((loa) this.b).o);
                return;
            default:
                return;
        }
    }

    public void f(uu3 uu3) {
        switch (this.a) {
            case 0:
                loa loa = (loa) this.b;
                if (!loa.c) {
                    Bundle bundle = new Bundle();
                    loa.o = bundle;
                    td tdVar = loa.b;
                    if (tdVar == null) {
                        tdVar = null;
                    }
                    tdVar.u(bundle);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void g(uu3 uu3) {
        switch (this.a) {
            case 0:
                gh7 gh7 = ((loa) this.b).a;
                if (gh7 == null) {
                    gh7 = null;
                }
                gh7.d(eg7.ON_RESUME);
                return;
            default:
                return;
        }
    }

    public void h(uu3 uu3) {
        switch (this.a) {
            case 0:
                loa loa = (loa) this.b;
                loa.getClass();
                LinkedHashMap linkedHashMap = nd6.a;
                kl7 l = j1e.l();
                for (uu3 parentController = uu3.getParentController(); parentController != null; parentController = parentController.getParentController()) {
                    l.add(parentController.getInstanceId());
                }
                nd6.a.put(uu3.getInstanceId(), new md6(j1e.d(l), new koa(loa)));
                return;
            default:
                return;
        }
    }

    public void j(uu3 uu3, View view) {
        switch (this.a) {
            case 0:
                Object tag = view.getTag(hvb.view_tree_lifecycle_owner);
                loa loa = (loa) this.b;
                if (tag == null && view.getTag(hvb.view_tree_saved_state_registry_owner) == null) {
                    s5c.Z(view, loa);
                    wmd.G(view, loa);
                }
                gh7 gh7 = loa.a;
                if (gh7 == null) {
                    gh7 = null;
                }
                gh7.d(eg7.ON_START);
                return;
            default:
                return;
        }
    }

    public void p(uu3 uu3) {
        switch (this.a) {
            case 0:
                ((loa) this.b).getClass();
                nd6.a.remove(uu3.getInstanceId());
                return;
            default:
                return;
        }
    }

    public void q(uu3 uu3) {
        switch (this.a) {
            case 0:
                loa loa = (loa) this.b;
                loa.c = false;
                loa.a = new gh7(loa);
                td tdVar = new td((isc) loa);
                loa.b = tdVar;
                tdVar.t(loa.o);
                gh7 gh7 = loa.a;
                if (gh7 == null) {
                    gh7 = null;
                }
                gh7.d(eg7.ON_CREATE);
                return;
            default:
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: gh7} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [android.view.View, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void s(defpackage.uu3 r3, android.view.View r4) {
        /*
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            boolean r0 = r3.isBeingDestroyed()
            java.lang.Object r2 = r2.b
            loa r2 = (defpackage.loa) r2
            r1 = 0
            if (r0 == 0) goto L_0x0036
            znc r3 = r3.getRouter()
            nf0 r3 = r3.a
            java.util.ArrayDeque r3 = r3.a
            int r3 = r3.size()
            if (r3 != 0) goto L_0x0036
            android.view.ViewParent r3 = r4.getParent()
            boolean r4 = r3 instanceof android.view.View
            if (r4 == 0) goto L_0x002a
            r1 = r3
            android.view.View r1 = (android.view.View) r1
        L_0x002a:
            if (r1 == 0) goto L_0x0041
            o50 r3 = new o50
            r4 = 7
            r3.<init>(r1, r4, r2)
            r1.addOnAttachStateChangeListener(r3)
            goto L_0x0041
        L_0x0036:
            gh7 r2 = r2.a
            if (r2 != 0) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r1 = r2
        L_0x003c:
            eg7 r2 = defpackage.eg7.ON_DESTROY
            r1.d(r2)
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.joa.s(uu3, android.view.View):void");
    }

    public void t(uu3 uu3) {
        switch (this.a) {
            case 0:
                loa loa = (loa) this.b;
                gh7 gh7 = loa.a;
                gh7 gh72 = null;
                if ((gh7 == null ? null : gh7).d == fg7.X) {
                    if (gh7 == null) {
                        gh7 = null;
                    }
                    gh7.d(eg7.ON_PAUSE);
                }
                gh7 gh73 = loa.a;
                if (gh73 != null) {
                    gh72 = gh73;
                }
                gh72.d(eg7.ON_STOP);
                return;
            default:
                return;
        }
    }

    public joa(loa loa, Widget widget) {
        this.b = loa;
        this.c = widget;
    }
}
