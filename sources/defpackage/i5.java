package defpackage;

import androidx.fragment.app.a;
import ru.ok.messages.contacts.profile.ActContactAvatars;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.attaches.fragments.FrgAttachPhoto;
import ru.ok.messages.media.attaches.fragments.FrgAttachUnknown;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;
import ru.ok.messages.media.attaches.fragments.FrgAttachView;

/* renamed from: i5  reason: default package */
public final class i5 implements gof {
    public final /* synthetic */ int a;
    public final /* synthetic */ r5 b;

    public /* synthetic */ i5(r5 r5Var, int i) {
        this.a = i;
        this.b = r5Var;
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }

    private final void c(int i, float f) {
    }

    private final void d(int i, float f) {
    }

    public final void k(int i) {
        int i2 = this.a;
    }

    public final void m(int i) {
        switch (this.a) {
            case 0:
                ActAttachesView actAttachesView = (ActAttachesView) this.b;
                s20 s20 = actAttachesView.W0;
                if (s20 != null) {
                    if (s20.j.indexOf(actAttachesView.g1) != i) {
                        FrgAttachView k = actAttachesView.W0.k(actAttachesView.g1);
                        if (k instanceof FrgAttachVideo) {
                            ((FrgAttachVideo) k).G1();
                        }
                        s20 s202 = actAttachesView.W0;
                        a aVar = (a) s202.g.get(s202.h(i));
                        if (aVar instanceof FrgAttachVideo) {
                            ((FrgAttachVideo) aVar).F1();
                        }
                        mpa l = actAttachesView.W0.l(i);
                        if (l != null) {
                            actAttachesView.g1 = ((l20) l.a).r;
                            actAttachesView.e1 = false;
                            actAttachesView.r0();
                            actAttachesView.s0();
                            FrgAttachView k2 = actAttachesView.W0.k(actAttachesView.g1);
                            String str = k2 instanceof FrgAttachPhoto ? "ATTACH_PHOTO" : k2 instanceof FrgAttachVideo ? "ATTACH_VIDEO" : k2 instanceof FrgAttachUnknown ? "ATTACH_UNKNOWN" : null;
                            if (!oag.t(str)) {
                                hm9.m("ru.ok.messages.media.attaches.ActAttachesView", "sendFragmentStats: " + str, new Object[0]);
                                ((y8a) vl.b()).b().f(str);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ((ActContactAvatars) this.b).m(i);
                return;
        }
    }

    public final void n(int i, float f) {
        int i2 = this.a;
    }
}
