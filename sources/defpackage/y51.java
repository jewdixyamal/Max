package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.sdk.uikit.common.views.EmptySearchView;

/* renamed from: y51  reason: default package */
public final class y51 extends ppd implements v15 {
    public final /* synthetic */ int X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y51(Executor executor, int i) {
        super(executor);
        this.X = i;
    }

    public void H(hqd hqd, int i) {
        switch (this.X) {
            case 5:
                xfd xfd = (xfd) hqd;
                k7d.n((ol7) C(i));
                throw null;
            case 6:
                dmd dmd = (dmd) ((ol7) C(i));
                cmd cmd = ((amd) ((emd) hqd).a).o;
                cmd.c = true;
                cmd.b.c();
                return;
            default:
                super.r(hqd, i);
                return;
        }
    }

    public void e() {
        E(Collections.singletonList(dy2.a));
    }

    public void g() {
        E((List) null);
    }

    public int l(int i) {
        switch (this.X) {
            case 0:
                return ((u51) ((ol7) C(i))).o;
            case 3:
                uz4 uz4 = (uz4) ((ol7) C(i));
                return uz4.b;
            case 4:
                ro7 ro7 = (ro7) ((ol7) C(i));
                return ro7.b;
            default:
                return super.l(i);
        }
    }

    public void r(dec dec, int i) {
        switch (this.X) {
            case 5:
                xfd xfd = (xfd) dec;
                k7d.n((ol7) C(i));
                throw null;
            case 6:
                dmd dmd = (dmd) ((ol7) C(i));
                cmd cmd = ((amd) ((emd) dec).a).o;
                cmd.c = true;
                cmd.b.c();
                return;
            default:
                super.r(dec, i);
                return;
        }
    }

    public final dec t(ViewGroup viewGroup, int i) {
        switch (this.X) {
            case 0:
                if (i == rvb.call_event_view_item) {
                    return new x51(new v51(viewGroup.getContext()));
                }
                throw new IllegalArgumentException("Not supported viewType for CallEventsAdapter");
            case 1:
                return new az0(new fy2(viewGroup.getContext()), 6);
            case 2:
                return new az0(new EmptySearchView(viewGroup.getContext(), (AttributeSet) null), 7);
            case 3:
                aba aba = new aba(viewGroup.getContext(), (AttributeSet) null);
                az0 az0 = new az0(aba, 8);
                aba.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                aba.setIcon(woc.O0);
                aba.setTitle(new eqe(yoc.e0));
                aba.setSubtitle(new eqe(yoc.c0));
                return az0;
            case 4:
                Context context = viewGroup.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                ProgressBar progressBar = new ProgressBar(context);
                float f = (float) 48;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                layoutParams.gravity = 17;
                progressBar.setLayoutParams(layoutParams);
                ngg.H(progressBar, qp4.u0.j(progressBar).getIcon().i);
                frameLayout.addView(progressBar);
                return new az0(frameLayout, 9);
            case 5:
                return new dec(new OneMeButton(viewGroup.getContext(), (AttributeSet) null));
            default:
                return new dec(new amd(viewGroup.getContext()));
        }
    }
}
