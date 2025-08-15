package defpackage;

import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: rv5  reason: default package */
public final class rv5 extends ppd {
    public final /* synthetic */ int X = 0;
    public final Object Y;
    public final Object Z;
    public final f66 s0;

    public rv5(ExecutorService executorService, v02 v02, ox2 ox2) {
        super(executorService);
        this.Y = executorService;
        this.Z = v02;
        this.s0 = ox2;
    }

    public void s(dec dec, int i, List list) {
        switch (this.X) {
            case 1:
                hqd hqd = (hqd) dec;
                if (!list.isEmpty()) {
                    for (Object obj : list) {
                        if (obj instanceof in8) {
                            hqd.B((ol7) this.o.f.get(i), x53.p0(list));
                            return;
                        }
                    }
                }
                r(hqd, i);
                return;
            default:
                super.s(dec, i, list);
                return;
        }
    }

    public final dec t(ViewGroup viewGroup, int i) {
        switch (this.X) {
            case 0:
                if (i == uvb.oneme_folder_widget_section_view_type) {
                    return new x51(viewGroup.getContext(), (ExecutorService) ((Executor) this.Y), (v02) ((sv5) this.Z));
                }
                if (i == uvb.oneme_folder_widget_section_empty_view_type) {
                    return new x51(viewGroup.getContext(), (ox2) ((k56) this.s0));
                }
                String name = rv5.class.getName();
                throw new IllegalStateException(("Not supported viewType " + i + " for " + name).toString());
            default:
                if (i != mda.D) {
                    return new vt3(viewGroup.getContext(), (om8) ((m56) this.Z));
                }
                return new vt3(viewGroup.getContext(), (xxc) this.Y, (pt8) ((m56) this.s0));
        }
    }

    public rv5(ExecutorService executorService, xxc xxc, om8 om8, pt8 pt8) {
        super(executorService);
        this.Y = xxc;
        this.Z = om8;
        this.s0 = pt8;
    }
}
