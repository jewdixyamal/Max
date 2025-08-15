package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;
import one.me.calls.ui.ui.pip.PipScreen;

/* renamed from: h91  reason: default package */
public final class h91 implements yu3 {
    public final /* synthetic */ l91 a;

    public h91(l91 l91) {
        this.a = l91;
    }

    public final void a(uu3 uu3, uu3 uu32, boolean z) {
        boolean z2 = false;
        l91 l91 = this.a;
        if (uu3 != null) {
            xj1 xj1 = (xj1) l91.Y.getValue();
            boolean z3 = uu3 instanceof iq9;
            boolean a2 = xj1.a();
            l91 l912 = xj1.a;
            if (z3) {
                l91.e(l912);
                if (a2) {
                    l912.f(true);
                } else {
                    Activity activity = l912.Z;
                    if (activity != null) {
                        boolean F = y8a.a.o().f().F();
                        hm9.m("PipAppController", "try to hide call indicator hasCall=" + l912.b(), new Object[0]);
                        if (F) {
                            ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
                            View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
                            dy7.j(activity, childAt != null && qp4.u0.b(childAt.getContext()).j());
                        }
                    }
                }
            } else if (a2) {
                Activity activity2 = l912.Z;
                if (activity2 != null) {
                    ((cb5) l912.b).d(activity2, l91.c());
                }
            } else {
                Activity activity3 = l912.Z;
                if (activity3 != null) {
                    boolean b = l912.b();
                    coc coc = (coc) x53.q0(l91.c().e());
                    uu3 uu33 = coc != null ? coc.a : null;
                    boolean z4 = !((uu33 instanceof iq9) || uu33 == null);
                    hm9.m("PipAppController", "try to show call indicator hasCall=" + b + " canShow=" + z4 + ".", new Object[0]);
                    if (z4 && b && y8a.a.o().f().l(new CallIndicatorWidget())) {
                        dy7.j(activity3, true);
                    }
                    if (!b) {
                        hm9.m("PipAppController", "can't show indicator due to call is absent, try to force close indicator.", new Object[0]);
                        l912.f(true);
                    }
                }
            }
        }
        boolean z5 = uu3 instanceof PipScreen;
        v1e v1e = v1e.b;
        if (z5 && !(uu32 instanceof PipScreen)) {
            String str = ((wr1) l91.a).k().c;
            w1e w1e = (w1e) ((tg1) l91.s0.getValue());
            q0e q0e = w1e.a;
            if (q0e.getValue() != v1e) {
                w1e.a(str, true);
            }
            q0e.m((Object) null, v1e);
        }
        boolean z6 = uu32 instanceof PipScreen;
        if (z6 && !z5) {
            String str2 = ((wr1) l91.a).k().c;
            w1e w1e2 = (w1e) ((tg1) l91.s0.getValue());
            q0e q0e2 = w1e2.a;
            if (q0e2.getValue() == v1e) {
                w1e2.a(str2, false);
            }
            q0e2.m((Object) null, v1e.a);
        }
        if (!z6 || uu3 != null) {
            l91.getClass();
            if ((uu32 instanceof iq9) || uu32 == null) {
                if (((wr1) l91.a).q() && ((xj1) l91.Y.getValue()).a()) {
                    z2 = true;
                }
                l91.v0 = z2;
                return;
            }
            return;
        }
        hm9.m("PipAppController", "pip screen was hidden quietly, skip hide fake pip.", new Object[0]);
    }

    public final void b(uu3 uu3, uu3 uu32, boolean z) {
        l91 l91 = this.a;
        if (uu3 != null) {
            xj1 xj1 = (xj1) l91.Y.getValue();
            boolean z2 = uu3 instanceof iq9;
            boolean a2 = xj1.a();
            boolean z3 = true;
            l91 l912 = xj1.a;
            if (z2) {
                l912.f(true);
                l91.e(l912);
            } else {
                l912.g(false);
                if (a2) {
                    Activity activity = l912.Z;
                    nb5 nb5 = l912.b;
                    if (activity != null) {
                        ((cb5) nb5).d(activity, l91.c());
                    }
                    Activity activity2 = l912.Z;
                    if (activity2 != null && l912.v0) {
                        znc c = l91.c();
                        cb5 cb5 = (cb5) nb5;
                        cb5.getClass();
                        hm9.m("FakePipController", "try to show local pip", new Object[0]);
                        xg1 xg1 = cb5.g;
                        Float valueOf = xg1 != null ? Float.valueOf(xg1.getAlpha()) : null;
                        if (valueOf == null || valueOf.floatValue() != 1.0f || !ft.l(xg1)) {
                            cb5.d(activity2, c);
                            if (xg1 != null) {
                                xg1.setVisibility(8);
                            }
                            String str = ((wr1) ((kr1) cb5.e.getValue())).k().c;
                            w1e w1e = (w1e) ((tg1) cb5.a.getValue());
                            q0e q0e = w1e.a;
                            Object value = q0e.getValue();
                            v1e v1e = v1e.b;
                            if (value != v1e) {
                                w1e.a(str, true);
                            }
                            q0e.m((Object) null, v1e);
                            if (xg1 != null) {
                                ft.g(xg1, true, 0, (m56) null, 4);
                            }
                        } else {
                            hm9.m("FakePipController", "local pip already in show progress", new Object[0]);
                        }
                        if (l91.c().e().size() >= 2) {
                            z3 = false;
                        }
                        l912.y0.f(z3);
                    }
                } else {
                    l91.e(l912);
                }
            }
        }
        l91.j();
    }
}
