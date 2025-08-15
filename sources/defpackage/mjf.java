package defpackage;

import one.me.chatscreen.videomsg.VideoMessageWidget;

/* renamed from: mjf  reason: default package */
public final /* synthetic */ class mjf implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoMessageWidget b;

    public /* synthetic */ mjf(VideoMessageWidget videoMessageWidget, int i) {
        this.a = i;
        this.b = videoMessageWidget;
    }

    public final Object invoke() {
        VideoMessageWidget videoMessageWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = VideoMessageWidget.y0;
                return kt3.b(videoMessageWidget.getContext(), woc.N);
            default:
                bc7[] bc7Arr2 = VideoMessageWidget.y0;
                return kt3.b(videoMessageWidget.getContext(), woc.M);
        }
    }
}
