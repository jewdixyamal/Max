package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.b;
import java.io.File;
import java.util.List;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;

/* renamed from: k46  reason: default package */
public final /* synthetic */ class k46 implements y2a, qj3, fnb {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgAttachVideo b;

    public /* synthetic */ k46(FrgAttachVideo frgAttachVideo, int i) {
        this.a = i;
        this.b = frgAttachVideo;
    }

    public x6g P(View view, x6g x6g) {
        FrgAttachVideo frgAttachVideo = this.b;
        b b0 = frgAttachVideo.b0();
        int i = 0;
        if (b0 != null) {
            int a2 = fk4.a(frgAttachVideo.U0());
            if (b0 instanceof ActAttachesView) {
                ActAttachesView actAttachesView = (ActAttachesView) b0;
                View view2 = actAttachesView.X0;
                if (view2 != null) {
                    i = (view2.getMeasuredHeight() - actAttachesView.l1.getMeasuredHeight()) + fk4.a(actAttachesView);
                }
            } else {
                i = a2;
            }
        }
        Rect rect = new Rect(x6g.b(), x6g.d(), x6g.c(), x6g.a() + i);
        wk9 wk9 = frgAttachVideo.M1;
        if (wk9 != null) {
            wk9.A(rect);
        }
        return x6g;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                FrgAttachVideo frgAttachVideo = this.b;
                frgAttachVideo.P1 = null;
                frgAttachVideo.j1();
                hm9.f0(frgAttachVideo.d0(), (File) obj, ((y8a) ((ed3) frgAttachVideo.p1.b)).h());
                return;
            default:
                Throwable th = (Throwable) obj;
                FrgAttachVideo frgAttachVideo2 = this.b;
                frgAttachVideo2.P1 = null;
                frgAttachVideo2.j1();
                a14.K(frgAttachVideo2.d0(), jpc.X2);
                return;
        }
    }

    public void b() {
        die die = this.b.P1;
        if (die != null) {
            cqc.b((sd7) die.o);
            for (lz a2 : (List) die.b) {
                a2.a();
            }
        }
    }
}
