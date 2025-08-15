package defpackage;

import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.b;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: p71  reason: default package */
public final class p71 extends ppd {
    public final /* synthetic */ int X = 1;
    public final Object Y;
    public final Object Z;
    public final Object s0;
    public final Object t0;

    public p71(ExecutorService executorService, gw7 gw7, wd6 wd6) {
        super(executorService);
        this.Y = executorService;
        this.Z = gw7;
        this.s0 = wd6;
        this.t0 = new w5e(this);
    }

    public void H(hqd hqd, int i) {
        switch (this.X) {
            case 0:
                ((o71) hqd).F0.setOpponents((sma) ((ol7) C(i)));
                return;
            default:
                super.r(hqd, i);
                return;
        }
    }

    public int j() {
        switch (this.X) {
            case 0:
                return this.o.f.size();
            default:
                return super.j();
        }
    }

    public void r(dec dec, int i) {
        switch (this.X) {
            case 0:
                ((o71) dec).F0.setOpponents((sma) ((ol7) C(i)));
                return;
            default:
                super.r(dec, i);
                return;
        }
    }

    public void s(dec dec, int i, List list) {
        switch (this.X) {
            case 0:
                o71 o71 = (o71) dec;
                if (list.isEmpty()) {
                    o71.F0.setOpponents((sma) ((ol7) C(i)));
                    return;
                }
                o71.B((sma) this.o.f.get(i), list);
                return;
            default:
                super.s(dec, i, list);
                return;
        }
    }

    public final dec t(ViewGroup viewGroup, int i) {
        switch (this.X) {
            case 0:
                FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                m71 m71 = new m71(viewGroup.getContext(), (AttributeSet) null);
                m71.setId(rvb.call_opponents);
                m71.setParentSizeProvider((e71) this.Y);
                m71.setVideoLayoutUpdatesControllerProvider((k56) this.s0);
                m71.setListener((l71) this.Z);
                m71.setOpponentsViewPool((b) ((k56) this.t0).invoke());
                frameLayout.addView(m71, -1, -1);
                return new o71(frameLayout);
            default:
                return new vt3(viewGroup.getContext(), (gw7) this.Z, (ExecutorService) ((Executor) this.Y), (w5e) this.t0);
        }
    }

    public p71(w4d w4d, qqd qqd, f71 f71, f71 f712) {
        super(jyc.a.p().a());
        this.Y = w4d;
        this.Z = qqd;
        this.s0 = f71;
        this.t0 = f712;
    }
}
