package ru.ok.messages.media.mediabar;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import androidx.fragment.app.b;
import ru.ok.messages.views.fragments.FrgSlideOut;

public abstract class FrgLocalMedia extends FrgSlideOut implements qq7 {
    public up7 C1;
    public boolean D1;
    public dq7 E1;
    public ProgressBar F1;
    public View G1;
    public boolean H1;

    public static Bundle s1(up7 up7, boolean z, rp7 rp7) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("ru.ok.messages.extra.LOCAL_MEDIA", up7);
        bundle.putBoolean("ru.ok.messages.extra.ANIMATED_FRAGMENT", z);
        bundle.putParcelable("ru.ok.messages.extra.OPTIONS", rp7);
        return bundle;
    }

    public final void C(boolean z) {
        ProgressBar progressBar = this.F1;
        if (progressBar == null || this.G1 == null) {
            this.H1 = z;
            return;
        }
        boolean z2 = !z;
        j47.Q(progressBar, z2);
        j47.Q(this.G1, z2);
    }

    public final boolean D() {
        return !this.D1;
    }

    public void H0() {
        super.H0();
        dq7 dq7 = this.E1;
        p4d p4d = dq7.b;
        p4d.f.remove(dq7);
        p4d.g.remove(dq7);
    }

    public void K0() {
        super.K0();
        dq7 dq7 = this.E1;
        p4d p4d = dq7.b;
        p4d.f.add(dq7);
        p4d.g.add(dq7);
    }

    public final void M(int i) {
        y46 y46 = (y46) g1();
        if (y46 != null) {
            ActLocalMedias actLocalMedias = (ActLocalMedias) y46;
            if (!actLocalMedias.Y0.u0) {
                p4d p4d = actLocalMedias.m0().f;
                p4d.a.clear();
                p4d.n();
                p4d.b.clear();
                if (((jp) p4d.h).g.getBoolean("app.send.media.as.collage", true)) {
                    p4d.l = 3;
                } else {
                    p4d.l = 1;
                }
            }
        }
        if (this.D1) {
            b b0 = b0();
            b0.getClass();
            u7.a(b0);
            return;
        }
        super.M(i);
    }

    public void O0(View view, Bundle bundle) {
        view.setBackgroundColor(-16777216);
        this.F1 = (ProgressBar) view.findViewById(xxb.frg_local_media__progress_bar);
        this.G1 = view.findViewById(xxb.frg_local_media__progress_background);
        ngg.H(this.F1, lt3.a(d0(), epc.f));
        j47.Q(this.F1, !this.H1);
        j47.Q(this.G1, !this.H1);
    }

    public final String f1() {
        return null;
    }

    public final void m1(q5 q5Var) {
        super.m1(q5Var);
        if (!(b0() instanceof y46)) {
            throw new IllegalStateException("Parent activity must implement FrgLocalMedia.Listener interface");
        }
    }

    public void t1() {
    }

    public final void v0(Bundle bundle) {
        super.v0(bundle);
        ai3 h1 = h1();
        Y0(true);
        if (h1 != null) {
            h1.h();
        }
        Bundle bundle2 = this.Z;
        this.C1 = (up7) bundle2.getParcelable("ru.ok.messages.extra.LOCAL_MEDIA");
        this.D1 = bundle2.getBoolean("ru.ok.messages.extra.ANIMATED_FRAGMENT");
        rp7 rp7 = (rp7) bundle2.getParcelable("ru.ok.messages.extra.OPTIONS");
        this.E1 = ((cq7) ((y8a) ((ed3) this.p1.b)).getAccessor().c(cq7.class)).a(this, this.C1);
    }

    public void y0() {
        super.y0();
        this.E1.a();
    }
}
