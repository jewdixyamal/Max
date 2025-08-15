package defpackage;

import android.view.View;
import android.widget.TextView;
import java.util.BitSet;
import one.me.sdk.uikit.common.views.EmptySearchView;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: az0  reason: default package */
public final class az0 extends hqd {
    public final /* synthetic */ int F0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ az0(View view, int i) {
        super(view);
        this.F0 = i;
    }

    private final void F(ol7 ol7) {
    }

    private final void G(ol7 ol7) {
    }

    private final void H(ol7 ol7) {
    }

    private final void I(ol7 ol7) {
    }

    private final void J(ol7 ol7) {
    }

    private final void K(ol7 ol7) {
    }

    private final void L(ol7 ol7) {
    }

    private final void M(ol7 ol7) {
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [le, java.lang.Object, ey2] */
    public final void A(ol7 ol7) {
        switch (this.F0) {
            case 0:
                if (ol7 instanceof g01) {
                    View view = this.a;
                    ((TextView) view).setText(((g01) ol7).a.b(((TextView) view).getContext()));
                    return;
                }
                return;
            case 1:
                if (ol7 instanceof f01) {
                    View view2 = this.a;
                    ((TextView) view2).setText(((f01) ol7).a.b(((TextView) view2).getContext()));
                    return;
                }
                return;
            case 2:
                ((h71) this.a).setOpponents(((qd1) ol7).b);
                return;
            case 3:
                return;
            case 4:
                jb1 jb1 = (jb1) ol7;
                return;
            case 5:
                E((sd1) ol7);
                return;
            case 6:
                dy2 dy2 = (dy2) ol7;
                View view3 = this.a;
                fy2 fy2 = (fy2) view3;
                if (fy2.b == null) {
                    ? obj = new Object();
                    fy2.c.c(obj);
                    fy2.b = obj;
                }
                view3.requestLayout();
                view3.invalidate();
                return;
            case 7:
                tz4 tz4 = (tz4) ol7;
                EmptySearchView emptySearchView = (EmptySearchView) this.a;
                emptySearchView.setTitle(yoc.d0);
                emptySearchView.setDescription(yoc.c0);
                emptySearchView.setIsButtonVisible(false);
                return;
            case 8:
                uz4 uz4 = (uz4) ol7;
                return;
            case 9:
                ro7 ro7 = (ro7) ol7;
                return;
            case 10:
                i6c i6c = (i6c) ol7;
                return;
            case 11:
                r9c r9c = (r9c) ol7;
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                if (ol7 instanceof b1d) {
                    View view4 = this.a;
                    ((TextView) view4).setText(((b1d) ol7).a.b(((TextView) view4).getContext()));
                    return;
                }
                return;
            case 13:
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                if (ol7 instanceof u0d) {
                    View view5 = this.a;
                    ((TextView) view5).setText(((u0d) ol7).a.b(((TextView) view5).getContext()));
                    return;
                }
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return;
            case 16:
                if (ol7 instanceof j1d) {
                    View view6 = this.a;
                    ((TextView) view6).setText(((j1d) ol7).a.b(((TextView) view6).getContext()));
                    return;
                }
                return;
            case LangUtils.HASH_SEED /*17*/:
            case 18:
                return;
            case 19:
                if (ol7 instanceof t0d) {
                    View view7 = this.a;
                    ((TextView) view7).setText(((t0d) ol7).a.b(((TextView) view7).getContext()));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void B(ol7 ol7, Object obj) {
        switch (this.F0) {
            case 2:
                qd1 qd1 = (qd1) ol7;
                pd1 pd1 = obj instanceof pd1 ? (pd1) obj : null;
                View view = this.a;
                if (pd1 == null) {
                    ((h71) view).setOpponents(qd1.b);
                    return;
                } else if (((BitSet) pd1.b).get(0)) {
                    ((h71) view).setOpponents(qd1.b);
                    return;
                } else {
                    return;
                }
            case 5:
                sd1 sd1 = (sd1) ol7;
                rd1 rd1 = obj instanceof rd1 ? (rd1) obj : null;
                if (rd1 != null) {
                    BitSet bitSet = (BitSet) rd1.b;
                    int i = 0;
                    boolean z = bitSet.get(0);
                    View view2 = this.a;
                    if (z) {
                        ak1 ak1 = sd1.c;
                        if (!ak1.a()) {
                            i = 8;
                        }
                        view2.setVisibility(i);
                        yl1 yl1 = (yl1) view2;
                        boolean z2 = yl1.H0;
                        boolean z3 = ak1.e;
                        if (z2 != z3) {
                            yl1.H0 = z3;
                            yl1.I0.setEndView(new ffd(z3, true));
                        }
                    }
                    if (bitSet.get(1)) {
                        ((yl1) view2).setTitle(sd1.b);
                        return;
                    }
                    return;
                }
                E(sd1);
                return;
            default:
                super.B(ol7, obj);
                return;
        }
    }

    public void D() {
        switch (this.F0) {
            case 6:
                fy2 fy2 = (fy2) this.a;
                ey2 ey2 = fy2.b;
                if (ey2 != null) {
                    fy2.c.f(ey2);
                }
                fy2.b = null;
                return;
            default:
                return;
        }
    }

    public void E(sd1 sd1) {
        ak1 ak1 = sd1.c;
        int i = ak1.a() ? 0 : 8;
        View view = this.a;
        view.setVisibility(i);
        yl1 yl1 = (yl1) view;
        boolean z = yl1.H0;
        boolean z2 = ak1.e;
        if (z != z2) {
            yl1.H0 = z2;
            yl1.I0.setEndView(new ffd(z2, true));
        }
        yl1.setTitle(sd1.b);
    }
}
