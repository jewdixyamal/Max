package defpackage;

import android.graphics.Bitmap;
import ru.ok.messages.video.widgets.VideoFramePreview;
import ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview;

/* renamed from: fkf  reason: default package */
public final /* synthetic */ class fkf implements qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoPlayerSeekBarPreview b;

    public /* synthetic */ fkf(VideoPlayerSeekBarPreview videoPlayerSeekBarPreview, int i) {
        this.a = i;
        this.b = videoPlayerSeekBarPreview;
    }

    public final void accept(Object obj) {
        VideoPlayerSeekBarPreview videoPlayerSeekBarPreview = this.b;
        switch (this.a) {
            case 0:
                Long l = (Long) obj;
                int i = VideoPlayerSeekBarPreview.E0;
                videoPlayerSeekBarPreview.getClass();
                if (System.currentTimeMillis() - videoPlayerSeekBarPreview.B0 > 1000) {
                    videoPlayerSeekBarPreview.c.a(true);
                    return;
                }
                return;
            default:
                int i2 = VideoPlayerSeekBarPreview.E0;
                videoPlayerSeekBarPreview.getClass();
                videoPlayerSeekBarPreview.B0 = System.currentTimeMillis();
                cqc.b(videoPlayerSeekBarPreview.u0);
                VideoFramePreview videoFramePreview = videoPlayerSeekBarPreview.c;
                videoFramePreview.s0.setImageBitmap((Bitmap) obj);
                videoFramePreview.a(false);
                return;
        }
    }
}
