package defpackage;

import android.view.View;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.FrgLocalGif;
import ru.ok.messages.media.mediabar.FrgLocalMedia;
import ru.ok.messages.media.mediabar.FrgLocalPhoto;
import ru.ok.messages.media.mediabar.FrgLocalVideo;

/* renamed from: y5  reason: default package */
public final class y5 extends mof {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActLocalMedias b;

    public /* synthetic */ y5(ActLocalMedias actLocalMedias, int i) {
        this.a = i;
        this.b = actLocalMedias;
    }

    private final void d(int i) {
    }

    private final void e(int i, float f, int i2) {
    }

    public void a(int i) {
        int i2 = this.a;
    }

    public void b(int i, float f, int i2) {
        int i3 = this.a;
    }

    public final void c(int i) {
        boolean z = false;
        ActLocalMedias actLocalMedias = this.b;
        switch (this.a) {
            case 0:
                if (actLocalMedias.Z0 != null) {
                    up7 up7 = (up7) actLocalMedias.V0.get(actLocalMedias.W0);
                    if (up7 != null) {
                        FrgLocalMedia F = actLocalMedias.Z0.F(up7.b);
                        if (F instanceof FrgLocalVideo) {
                            FrgLocalVideo frgLocalVideo = (FrgLocalVideo) F;
                            View view = (View) frgLocalVideo.J1.c;
                            if (view != null) {
                                view.setVisibility(8);
                            }
                            frgLocalVideo.w1();
                        }
                    }
                    up7 up72 = (up7) actLocalMedias.V0.get(i);
                    if (up72 != null) {
                        FrgLocalMedia F2 = actLocalMedias.Z0.F(up72.b);
                        if (F2 instanceof FrgLocalVideo) {
                            ((FrgLocalVideo) F2).v1();
                        }
                    }
                }
                actLocalMedias.W0 = i;
                actLocalMedias.u0(i);
                String str = null;
                if (actLocalMedias.V0.size() - i < 6) {
                    xp7 m0 = actLocalMedias.m0();
                    String str2 = actLocalMedias.X0;
                    if (str2 == null) {
                        m0.getClass();
                    } else {
                        b86 b86 = (b86) m0.g.get(str2);
                        if (b86 != null) {
                            z = ((fz6) m0.c).b(b86);
                        }
                    }
                    if (z) {
                        xp7 m02 = actLocalMedias.m0();
                        j47.T(m02.e, ((w9a) m02.d).a().plus(m02.b), (vx3) null, new wp7(m02, actLocalMedias.X0, (Continuation) null), 2);
                    }
                }
                FrgLocalMedia k0 = actLocalMedias.k0();
                if (k0 != null) {
                    if (k0 instanceof FrgLocalPhoto) {
                        str = "LOCAL_PHOTO";
                    } else if (k0 instanceof FrgLocalVideo) {
                        str = "LOCAL_VIDEO";
                    } else if (k0 instanceof FrgLocalGif) {
                        str = "LOCAL_GIF";
                    }
                    if (!oag.t(str)) {
                        hm9.m("ru.ok.messages.media.mediabar.ActLocalMedias", "sendFragmentStats: " + str, new Object[0]);
                        ((y8a) ((ed3) actLocalMedias.K0.b)).b().f(str);
                    }
                }
                actLocalMedias.i1.Z1((up7) actLocalMedias.V0.get(actLocalMedias.W0));
                return;
            default:
                int i2 = ActLocalMedias.s1;
                List c = actLocalMedias.m0().f.c();
                int g = actLocalMedias.m0().f.g((up7) actLocalMedias.V0.get(i)) - 1;
                if (g == -1) {
                    for (int i3 = 0; i3 < c.size(); i3++) {
                        ((r4d) c.get(i3)).e = false;
                    }
                    actLocalMedias.t0();
                    return;
                }
                int i4 = 0;
                while (i4 < c.size()) {
                    ((r4d) c.get(i4)).e = g == i4;
                    i4++;
                }
                actLocalMedias.t0();
                actLocalMedias.f1.x(i);
                return;
        }
    }
}
