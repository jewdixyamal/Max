package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: s58  reason: default package */
public final /* synthetic */ class s58 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaBarWidget b;

    public /* synthetic */ s58(MediaBarWidget mediaBarWidget, int i) {
        this.a = i;
        this.b = mediaBarWidget;
    }

    public final Object invoke(Object obj) {
        Object value;
        n00 n00;
        e5f e5f = e5f.a;
        MediaBarWidget mediaBarWidget = this.b;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                bc7[] bc7Arr = MediaBarWidget.d1;
                q0e q0e = mediaBarWidget.B0().s0;
                do {
                    value = q0e.getValue();
                    int ordinal = ((n00) value).ordinal();
                    if (ordinal == 0) {
                        n00 = n00.b;
                    } else if (ordinal == 1) {
                        n00 = n00.a;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } while (!q0e.c(value, n00));
                return e5f;
            case 1:
                mediaBarWidget.X.f.k = (CharSequence) obj;
                return e5f;
            default:
                View view2 = (View) obj;
                bc7[] bc7Arr2 = MediaBarWidget.d1;
                mediaBarWidget.x0().j(true);
                return e5f;
        }
    }
}
