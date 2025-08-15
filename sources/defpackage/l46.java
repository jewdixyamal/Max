package defpackage;

import androidx.fragment.app.b;
import androidx.viewpager.widget.ViewPager;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;

/* renamed from: l46  reason: default package */
public final /* synthetic */ class l46 implements f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgAttachVideo b;

    public /* synthetic */ l46(FrgAttachVideo frgAttachVideo, int i) {
        this.a = i;
        this.b = frgAttachVideo;
    }

    public final void run() {
        ViewPager viewPager;
        mpa l;
        l20 l20;
        switch (this.a) {
            case 0:
                FrgAttachVideo frgAttachVideo = this.b;
                if (frgAttachVideo.o1) {
                    frgAttachVideo.L1();
                    b b0 = frgAttachVideo.b0();
                    if (b0 instanceof im) {
                        b0.invalidateOptionsMenu();
                    }
                    n46 u1 = frgAttachVideo.r1();
                    if (u1 != null) {
                        String str = frgAttachVideo.D1.r;
                        ActAttachesView actAttachesView = (ActAttachesView) u1;
                        s20 s20 = actAttachesView.W0;
                        boolean z = false;
                        if (!(s20 == null || (viewPager = actAttachesView.f1) == null || (l = s20.l(viewPager.getCurrentItem())) == null || (l20 = (l20) l.a) == null)) {
                            z = oag.d(l20.r, str);
                        }
                        if (z && frgAttachVideo.N1 == null) {
                            frgAttachVideo.F1();
                            return;
                        }
                    }
                    frgAttachVideo.J1();
                    return;
                }
                return;
            case 1:
                n46 u12 = this.b.r1();
                if (u12 != null) {
                    ((ActAttachesView) u12).e();
                    return;
                }
                return;
            default:
                FrgAttachVideo frgAttachVideo2 = this.b;
                if (frgAttachVideo2.D1.d.a == 0) {
                    au8 n = frgAttachVideo2.q1.n();
                    n.getClass();
                    cqc.a(new vt8(n, frgAttachVideo2.C1, frgAttachVideo2.D1.r, (jy8) frgAttachVideo2.q1.getAccessor().c(jy8.class)), n.h, (f6) null, new hj8(12), (ztc) null);
                    return;
                }
                frgAttachVideo2.J1();
                return;
        }
    }
}
