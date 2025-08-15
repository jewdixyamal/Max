package defpackage;

import ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview;

/* renamed from: gkf  reason: default package */
public final class gkf extends kp {
    public final /* synthetic */ int e;
    public final /* synthetic */ VideoPlayerSeekBarPreview f;

    public /* synthetic */ gkf(VideoPlayerSeekBarPreview videoPlayerSeekBarPreview, int i) {
        this.e = i;
        this.f = videoPlayerSeekBarPreview;
    }

    public final void p() {
        switch (this.e) {
            case 0:
                this.f.w0 = null;
                return;
            default:
                VideoPlayerSeekBarPreview videoPlayerSeekBarPreview = this.f;
                videoPlayerSeekBarPreview.c.setVisibility(4);
                videoPlayerSeekBarPreview.c.setAlpha(1.0f);
                videoPlayerSeekBarPreview.x0 = null;
                return;
        }
    }

    public void r() {
        switch (this.e) {
            case 0:
                VideoPlayerSeekBarPreview videoPlayerSeekBarPreview = this.f;
                videoPlayerSeekBarPreview.c.setVisibility(0);
                videoPlayerSeekBarPreview.c.setAlpha(0.0f);
                return;
            default:
                return;
        }
    }
}
