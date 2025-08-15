package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VpxDecoderWrapper;

/* renamed from: t54  reason: default package */
public final class t54 implements VideoSink, VpxDecoderWrapper.ErrorCallback {
    public final Handler X;
    public final int Y;
    public volatile boolean Z = false;
    public final VpxDecoderWrapper a;
    public final ypc b;
    public final a4c c;
    public final HandlerThread o;
    public volatile boolean s0 = false;
    public volatile boolean t0 = true;
    public final AtomicInteger u0 = new AtomicInteger(0);
    public final AtomicInteger v0 = new AtomicInteger(0);
    public final AtomicInteger w0 = new AtomicInteger(-1);
    public final AtomicInteger x0 = new AtomicInteger(-1);
    public final AtomicInteger y0 = new AtomicInteger(-1);
    public final /* synthetic */ vbg z0;

    public t54(vbg vbg, int i, ypc ypc, a4c a4c) {
        this.z0 = vbg;
        this.b = ypc;
        this.c = a4c;
        this.a = new VpxDecoderWrapper();
        HandlerThread handlerThread = new HandlerThread("DecoderWrapperVpxQueue");
        this.o = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.X = handler;
        this.Y = i;
        handler.post(new l40(i, 7, this));
    }

    public final void a() {
        if (!this.Z) {
            this.Z = true;
            a4c a4c = this.c;
            a4c.log("DecoderWrapper", "releasing decoder " + System.identityHashCode(this));
            HandlerThread handlerThread = this.o;
            Handler handler = this.z0.e;
            VpxDecoderWrapper vpxDecoderWrapper = this.a;
            Objects.requireNonNull(vpxDecoderWrapper);
            cu1 cu1 = new cu1(23, vpxDecoderWrapper);
            handler.removeCallbacksAndMessages((Object) null);
            handler.post(cu1);
            handlerThread.quitSafely();
            this.s0 = true;
        }
    }

    public final void onDecodeError(int i) {
        StringBuilder n = rh4.n(i, "onDecodeError vpx_error_code:", " System.identityHashCode: ");
        n.append(System.identityHashCode(this));
        this.c.log("DecoderWrapper", n.toString());
        vbg vbg = this.z0;
        vbg.x.a();
        vbg.t.incrementAndGet();
        this.t0 = true;
        this.w0.set(this.v0.get());
    }

    public final void onFrame(VideoFrame videoFrame) {
        if (!this.Z) {
            this.z0.s.incrementAndGet();
            this.z0.w.a();
            if (SystemClock.elapsedRealtimeNanos() > vbg.E) {
                ypc ypc = this.b;
                bwc bwc = (bwc) ypc.b;
                bg1 bg1 = (bg1) ypc.c;
                if (!bwc.f) {
                    bwc.e.a(bg1, videoFrame);
                }
            }
            this.x0.set(videoFrame.getRotatedWidth());
            this.y0.set(videoFrame.getRotatedHeight());
        }
    }
}
