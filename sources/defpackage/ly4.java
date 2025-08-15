package defpackage;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: ly4  reason: default package */
public final class ly4 extends ppd {
    public final /* synthetic */ int X = 0;
    public m56 Y;
    public final Object Z;

    public ly4(rx2 rx2, ExecutorService executorService) {
        super(executorService);
        this.Z = rx2;
    }

    public /* bridge */ /* synthetic */ void H(hqd hqd, int i) {
        switch (this.X) {
            case 2:
                J((us2) hqd, i);
                return;
            default:
                super.r(hqd, i);
                return;
        }
    }

    public void J(us2 us2, int i) {
        us2 us22 = us2;
        nl2 nl2 = (nl2) this.o.f.get(i);
        f fVar = new f(1, (rx2) this.Z, rx2.class, "onChatItemClick", "onChatItemClick(J)V", 0, 14);
        vw vwVar = new vw(2, (rx2) this.Z, rx2.class, "onChatItemLongTap", "onChatItemLongTap(JLandroid/view/View;)V", 0, 8);
        us22.A(nl2);
        m62 m62 = (m62) us22.a;
        tu0.K(m62, 300, new tb((Object) fVar, 16, (Object) nl2));
        m62.setOnLongClickListener(new z52(vwVar, nl2, us22, 4));
    }

    public /* bridge */ /* synthetic */ void r(dec dec, int i) {
        switch (this.X) {
            case 2:
                J((us2) dec, i);
                return;
            default:
                super.r(dec, i);
                return;
        }
    }

    public final void s(dec dec, int i, List list) {
        switch (this.X) {
            case 0:
                ky4 ky4 = (ky4) dec;
                if (!list.isEmpty()) {
                    for (Object obj : list) {
                        if (obj instanceof v3e) {
                            ArrayList arrayList = new ArrayList();
                            for (Object next : list) {
                                if (next instanceof c02) {
                                    arrayList.add(next);
                                }
                            }
                            c02 c02 = (c02) x53.q0(arrayList);
                            if (c02 != null) {
                                ky4.E(c02.a);
                                return;
                            } else {
                                r(ky4, i);
                                return;
                            }
                        }
                    }
                }
                r(ky4, i);
                return;
            case 1:
                h4e h4e = (h4e) dec;
                if (!list.isEmpty()) {
                    for (Object obj2 : list) {
                        if (obj2 instanceof v3e) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object next2 : list) {
                                if (next2 instanceof v3e) {
                                    arrayList2.add(next2);
                                }
                            }
                            v3e v3e = (v3e) x53.i0(arrayList2);
                            if (v3e == null) {
                                r(h4e, i);
                                return;
                            } else if (v3e instanceof t3e) {
                                h4e.F(((t3e) v3e).a);
                                return;
                            } else if (v3e instanceof u3e) {
                                h4e.E(((u3e) v3e).a);
                                return;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    }
                }
                r(h4e, i);
                return;
            default:
                us2 us2 = (us2) dec;
                m56 m56 = this.Y;
                iv ivVar = this.o;
                if (m56 != null) {
                    m56.invoke(Long.valueOf(((nl2) ivVar.f.get(i)).a));
                }
                if (!list.isEmpty()) {
                    u2 u2Var = new u2(7);
                    for (Object next3 : list) {
                        ll2 ll2 = next3 instanceof ll2 ? (ll2) next3 : null;
                        if (ll2 != null) {
                            u2Var.M1(ll2);
                        }
                    }
                    us2.B((nl2) ivVar.f.get(i), u2Var);
                    return;
                }
                J(us2, i);
                return;
        }
    }

    public final dec t(ViewGroup viewGroup, int i) {
        switch (this.X) {
            case 0:
                return new ky4(viewGroup.getContext(), (ShapeDrawable) this.Z, (jy2) this.Y);
            case 1:
                return new h4e(viewGroup.getContext(), (ShapeDrawable) this.Z, (jy2) this.Y);
            default:
                return new dec(new m62(viewGroup.getContext()));
        }
    }

    public ly4(ExecutorService executorService, jy2 jy2, byte b) {
        super(executorService);
        this.Y = jy2;
        this.Z = new ShapeDrawable(new OvalShape());
    }

    public ly4(ExecutorService executorService, jy2 jy2) {
        super(executorService);
        this.Y = jy2;
        this.Z = new ShapeDrawable(new OvalShape());
    }
}
