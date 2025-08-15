package defpackage;

import android.view.View;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.MediaBarPreviewLayout;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: q48  reason: default package */
public final /* synthetic */ class q48 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaBarPreviewLayout b;

    public /* synthetic */ q48(MediaBarPreviewLayout mediaBarPreviewLayout, int i) {
        this.a = i;
        this.b = mediaBarPreviewLayout;
    }

    public final void onClick(View view) {
        int i = 1;
        MediaBarPreviewLayout mediaBarPreviewLayout = this.b;
        switch (this.a) {
            case 0:
                if (mediaBarPreviewLayout.T0 != null) {
                    if (mediaBarPreviewLayout.X0) {
                        z7d z7d = mediaBarPreviewLayout.W0.b;
                        z7d.getClass();
                        int q = (int) z7d.q(PmsKey.f63maxattachcount, (long) 12);
                        if (mediaBarPreviewLayout.R0.f.b() > q) {
                            a14.N(0, mediaBarPreviewLayout.getContext(), are.s(ipc.a, q, mediaBarPreviewLayout.getContext()));
                            return;
                        }
                    }
                    ((ActLocalMedias) mediaBarPreviewLayout.T0).o0();
                    return;
                }
                return;
            case 1:
                int i2 = MediaBarPreviewLayout.b1;
                p4d p4d = mediaBarPreviewLayout.R0.f;
                p4d.p(p4d.l == 2 ? 1 : 2);
                mediaBarPreviewLayout.w();
                p4d p4d2 = mediaBarPreviewLayout.R0.f;
                if (p4d2.l == 2) {
                    mediaBarPreviewLayout.y(p4d2.b() > 1 ? jpc.G2 : jpc.F2);
                    return;
                } else {
                    mediaBarPreviewLayout.y(jpc.H2);
                    return;
                }
            case 2:
                int i3 = MediaBarPreviewLayout.b1;
                p4d p4d3 = mediaBarPreviewLayout.R0.f;
                if (p4d3.l != 3) {
                    i = 3;
                }
                p4d3.p(i);
                mediaBarPreviewLayout.w();
                if (mediaBarPreviewLayout.R0.f.l == 3) {
                    mediaBarPreviewLayout.y(jpc.E2);
                    return;
                } else {
                    mediaBarPreviewLayout.y(jpc.J2);
                    return;
                }
            default:
                p4d p4d4 = mediaBarPreviewLayout.R0.f;
                p4d4.a.clear();
                p4d4.n();
                r48 r48 = mediaBarPreviewLayout.T0;
                if (r48 != null) {
                    ActLocalMedias actLocalMedias = (ActLocalMedias) r48;
                    if (tpa.f(actLocalMedias.X0, "SELECTED_MEDIA_ALBUM")) {
                        actLocalMedias.Y();
                    } else {
                        actLocalMedias.t0();
                    }
                }
                mediaBarPreviewLayout.S0.m();
                return;
        }
    }
}
