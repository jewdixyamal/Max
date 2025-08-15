package defpackage;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import ru.ok.messages.video.widgets.VideoView;
import ru.ok.utils.widgets.RoundedRectFrameLayout;

/* renamed from: fl9  reason: default package */
public final class fl9 extends v2 implements pl9 {
    public VideoView X;
    public final float[] o;

    public fl9(Context context, float[] fArr) {
        super(context);
        this.o = fArr;
        l((ViewGroup) null, yyb.view_raw_video_player);
    }

    public final void a(int i, int i2) {
        this.X.d();
    }

    public final void b(slf slf) {
        this.X.a(slf);
    }

    public final void d(hkf hkf) {
    }

    public final BitmapDrawable e() {
        return this.X.getVideoScreenShot();
    }

    public final void m() {
        float[] fArr = this.o;
        if (fArr != null) {
            ((RoundedRectFrameLayout) ((View) this.c)).setCornersRadii(fArr);
        }
        VideoView videoView = (VideoView) ((View) this.c).findViewById(xxb.view_raw_video_player__v_video);
        this.X = videoView;
        videoView.setOnClickListener(new e44((View.OnClickListener) new xx5(18, this), 0));
        this.X.setOnLongClickListener(new zl0(6, this));
    }

    public final void release() {
        this.X.b();
    }
}
