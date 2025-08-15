package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Collections;
import ru.ok.messages.media.attaches.ActAttachesView;

/* renamed from: d5  reason: default package */
public final /* synthetic */ class d5 implements qj3, y2a {
    public final /* synthetic */ ActAttachesView a;

    public /* synthetic */ d5(ActAttachesView actAttachesView) {
        this.a = actAttachesView;
    }

    public x6g P(View view, x6g x6g) {
        ActAttachesView actAttachesView = this.a;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) actAttachesView.X0.getLayoutParams();
        layoutParams.bottomMargin = x6g.a();
        actAttachesView.X0.setLayoutParams(layoutParams);
        actAttachesView.X0.setPadding(x6g.b(), actAttachesView.X0.getPaddingTop(), x6g.c(), actAttachesView.X0.getPaddingBottom());
        FrameLayout frameLayout = actAttachesView.n1;
        int d = x6g.d();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        if (marginLayoutParams.topMargin != d) {
            marginLayoutParams.topMargin = d;
            frameLayout.setLayoutParams(marginLayoutParams);
        }
        j47.U(actAttachesView.n1, x6g.c());
        return x6g;
    }

    public void accept(Object obj) {
        ActAttachesView actAttachesView = this.a;
        s20 s20 = actAttachesView.W0;
        s20.k.clear();
        s20.j.clear();
        actAttachesView.W0.j(Collections.singletonList((es8) obj), true);
        actAttachesView.q0(0);
    }
}
