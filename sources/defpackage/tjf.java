package defpackage;

import android.widget.ImageView;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* renamed from: tjf  reason: default package */
public final class tjf implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoMessageWidget b;

    public /* synthetic */ tjf(VideoMessageWidget videoMessageWidget, int i) {
        this.a = i;
        this.b = videoMessageWidget;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ImageView imageView = (ImageView) obj;
                imageView.setId(t8a.v);
                imageView.setImageResource(woc.g);
                tu0.K(imageView, 300, new sjf(this.b, 0));
                return e5f.a;
            default:
                ImageView imageView2 = (ImageView) obj;
                imageView2.setId(t8a.x);
                imageView2.setAlpha(0.0f);
                tu0.K(imageView2, 300, new sjf(this.b, 1));
                return e5f.a;
        }
    }
}
