package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.MediaBarPreviewLayout;

/* renamed from: w5  reason: default package */
public final /* synthetic */ class w5 implements y2a {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActLocalMedias b;

    public /* synthetic */ w5(ActLocalMedias actLocalMedias, int i) {
        this.a = i;
        this.b = actLocalMedias;
    }

    public final x6g P(View view, x6g x6g) {
        switch (this.a) {
            case 0:
                MediaBarPreviewLayout mediaBarPreviewLayout = this.b.f1;
                int b2 = x6g.b();
                int c = x6g.c();
                int a2 = x6g.a();
                View view2 = mediaBarPreviewLayout.I0;
                j47.V(view2, b2);
                View view3 = mediaBarPreviewLayout.H0;
                j47.V(view3, b2);
                j47.U(view2, c);
                j47.U(view3, c);
                j47.r(mediaBarPreviewLayout, 0);
                j47.o(mediaBarPreviewLayout, a2);
                return x6g;
            default:
                View view4 = this.b.e1;
                int a3 = x6g.a();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view4.getLayoutParams();
                if (marginLayoutParams.bottomMargin != a3) {
                    marginLayoutParams.bottomMargin = a3;
                    view4.setLayoutParams(marginLayoutParams);
                }
                return x6g;
        }
    }
}
