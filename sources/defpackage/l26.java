package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.EncodedImage;
import org.webrtc.EncoderCallback;
import org.webrtc.GlUtil;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VpxEncoderWrapper;

/* renamed from: l26  reason: default package */
public final class l26 implements EncoderCallback, VideoSink {
    public final dnc X;
    public volatile VpxEncoderWrapper Y;
    public volatile z26 Z;
    public final long a;
    public final long b;
    public final mu3 c;
    public final a4c o;
    public volatile z26 s0;
    public volatile long t0;
    public final cue u0;
    public final cue v0;
    public final AtomicInteger w0 = new AtomicInteger(0);
    public volatile boolean x0;
    public volatile long y0;

    public l26(a4c a4c, dnc dnc) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.a = timeUnit.toMillis(5);
        this.b = timeUnit.toNanos(1) / 10;
        this.o = a4c;
        this.X = dnc;
        this.c = new mu3("SSFrameEncoder");
        this.u0 = new cue();
        this.v0 = new cue();
    }

    public final void a() {
        this.x0 = false;
        VpxEncoderWrapper vpxEncoderWrapper = this.Y;
        if (vpxEncoderWrapper != null) {
            vpxEncoderWrapper.release();
        }
        this.Y = null;
    }

    public final void onEncodedImage(EncodedImage encodedImage) {
        this.u0.a();
        EncodedImage.FrameType frameType = encodedImage.frameType;
        EncodedImage.FrameType frameType2 = EncodedImage.FrameType.VideoFrameKey;
        if (frameType == frameType2) {
            this.t0 = SystemClock.elapsedRealtime();
        }
        if (this.Z != null) {
            z26 z26 = this.Z;
            if (!z26.a) {
                encodedImage.release();
                return;
            }
            if (encodedImage.frameType == frameType2) {
                z26.h = false;
            }
            z26.c.add(encodedImage);
            z26.d.addAndGet(encodedImage.buffer.remaining());
            z26.b(z26.g);
        }
    }

    public final void onFrame(VideoFrame videoFrame) {
        z26 z26 = this.s0;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (elapsedRealtimeNanos >= this.y0 + this.b) {
            if ((z26 == null || (z26.c.size() <= 15 && z26.d.get() <= 4000000)) && this.w0.get() < 5) {
                try {
                    VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
                    this.X.getClass();
                    float rotation = (((float) (videoFrame.getRotation() + 360)) + 0.0f) % 360.0f;
                    a4c a4c = this.o;
                    a4c.log("SSFrameEncoder", "rotation angle = " + rotation);
                    VideoFrame videoFrame2 = new VideoFrame(i420, (int) rotation, videoFrame.getTimestampNs());
                    this.y0 = elapsedRealtimeNanos;
                    this.w0.incrementAndGet();
                    this.c.c(new v05((Object) this, (Object) z26, (Object) videoFrame2, 6));
                } catch (GlUtil.GlOutOfMemoryException unused) {
                    this.o.log("SSFrameEncoder", "gl oom @ toI420, skipping");
                }
            }
        }
    }

    public final void onFrameDropped(int i) {
        this.v0.a();
    }
}
