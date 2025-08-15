package defpackage;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: e81  reason: default package */
public final class e81 extends ppd {
    public final o9g X;
    public final Executor Y;

    public e81(o9g o9g, ExecutorService executorService) {
        super(executorService);
        this.X = o9g;
        this.Y = executorService;
    }

    public final void s(dec dec, int i, List list) {
        d81 d81 = (d81) dec;
        if (list.isEmpty()) {
            d81.A((il6) this.o.f.get(i));
            return;
        }
        pk5 pk5 = new pk5(l6d.Z(new um5(new at(2, list), new k8(21), n6d.a), n71.c));
        while (pk5.hasNext()) {
            hl6 hl6 = (hl6) pk5.next();
            boolean z = hl6 instanceof fl6;
            View view = d81.a;
            if (z) {
                ((fk3) view).setTitle(((fl6) hl6).a);
            } else if (hl6 instanceof bl6) {
                bl6 bl6 = (bl6) hl6;
                boolean z2 = bl6.d;
                long j = bl6.a;
                if (z2) {
                    fk3 fk3 = (fk3) view;
                    fk3.E(j, (CharSequence) null, (String) null);
                    fk3.setAvatarOverlay((od0) d81.G0.getValue());
                } else {
                    fk3 fk32 = (fk3) view;
                    fk32.setAvatarOverlay((od0) null);
                    String str = bl6.c;
                    if (str == null) {
                        str = "";
                    }
                    fk32.E(j, bl6.b, str);
                }
            } else if (hl6 instanceof gl6) {
                ((fk3) view).setTime(((gl6) hl6).a);
            } else if (hl6 instanceof el6) {
                ((fk3) view).C(((el6) hl6).a);
            } else if (hl6 instanceof dl6) {
                ((fk3) view).setDescription(((dl6) hl6).a);
            } else if (hl6 instanceof cl6) {
                fk3 fk33 = (fk3) view;
                cl6 cl6 = (cl6) hl6;
                boolean z3 = true;
                fk33.A(cl6.a == 1);
                if (cl6.a != 2) {
                    z3 = false;
                }
                fk33.B(z3);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final dec t(ViewGroup viewGroup, int i) {
        return new d81(new fk3(viewGroup.getContext(), (AttributeSet) null), this.X);
    }
}
