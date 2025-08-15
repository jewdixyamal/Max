package defpackage;

import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VideoSource;

/* renamed from: klf  reason: default package */
public final /* synthetic */ class klf implements VideoSink {
    public final /* synthetic */ VideoSource a;

    public /* synthetic */ klf(VideoSource videoSource) {
        this.a = videoSource;
    }

    public final void onFrame(VideoFrame videoFrame) {
        this.a.lambda$setVideoProcessor$1(videoFrame);
    }
}
