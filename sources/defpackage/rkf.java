package defpackage;

import org.webrtc.MediaSource;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.Size;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoSource;
import org.webrtc.VideoTrack;

/* renamed from: rkf  reason: default package */
public final class rkf extends ej3 implements SurfaceTextureHelper.FrameGeometryAdjuster {
    public final PeerConnectionFactory Y;
    public final w5e Z;
    public SurfaceTextureHelper s0;
    public b9b t0;
    public final ogf u0;
    public volatile Size v0;
    public volatile float w0;

    public rkf(PeerConnectionFactory peerConnectionFactory, String str, MediaStream mediaStream, Integer num, boolean z, w5e w5e, a4c a4c) {
        super(str, mediaStream, a4c);
        this.Y = peerConnectionFactory;
        this.Z = w5e;
        this.u0 = new ogf(z, num != null ? num.intValue() : 960, new om8(1, this, rkf.class, "logBufferTransform", "logBufferTransform(Ljava/lang/String;)V", 0, 25));
        this.v0 = new Size(960, 540);
        this.w0 = 1.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        if (r2.intValue() == r4) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.webrtc.SurfaceTextureHelper.FrameGeometry adjustFrameGeometry(android.graphics.Matrix r7, int r8, int r9) {
        /*
            r6 = this;
            ogf r6 = r6.u0
            r6.getClass()
            java.lang.String r0 = "x"
            if (r8 == 0) goto L_0x008e
            if (r9 != 0) goto L_0x000d
            goto L_0x008e
        L_0x000d:
            nua r1 = r6.f
            java.lang.Integer r2 = r6.d
            java.lang.Integer r3 = r6.e
            int r4 = r6.c
            if (r2 == 0) goto L_0x0026
            if (r3 == 0) goto L_0x0026
            int r2 = r2.intValue()
            int r3 = r3.intValue()
            int r4 = java.lang.Math.min(r2, r3)
            goto L_0x0033
        L_0x0026:
            if (r2 == 0) goto L_0x002d
            int r4 = r2.intValue()
            goto L_0x0033
        L_0x002d:
            if (r3 == 0) goto L_0x0033
            int r4 = r3.intValue()
        L_0x0033:
            if (r1 == 0) goto L_0x0057
            java.lang.Integer r2 = r6.g
            if (r2 != 0) goto L_0x003a
            goto L_0x0057
        L_0x003a:
            int r2 = r2.intValue()
            if (r2 != r8) goto L_0x0057
            java.lang.Integer r2 = r6.h
            if (r2 != 0) goto L_0x0045
            goto L_0x0057
        L_0x0045:
            int r2 = r2.intValue()
            if (r2 != r9) goto L_0x0057
            java.lang.Integer r2 = r6.i
            if (r2 != 0) goto L_0x0050
            goto L_0x0057
        L_0x0050:
            int r2 = r2.intValue()
            if (r2 != r4) goto L_0x0057
            goto L_0x00a9
        L_0x0057:
            nua r1 = r6.a(r8, r9)
            r6.f = r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r6.g = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r6.h = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r6.i = r2
            m56 r6 = r6.b
            int r2 = r1.g
            int r3 = r1.h
            java.lang.String r4 = "get new transform "
            java.lang.String r5 = " -> "
            java.lang.StringBuilder r4 = defpackage.wg0.j(r4, r8, r0, r9, r5)
            r4.append(r2)
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            r6.invoke(r0)
            goto L_0x00a9
        L_0x008e:
            m56 r6 = r6.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Wrong frame size: "
            r1.<init>(r2)
            r1.append(r8)
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            r6.invoke(r0)
            mgf r1 = defpackage.mgf.a
        L_0x00a9:
            org.webrtc.SurfaceTextureHelper$FrameGeometry r6 = r1.a(r7, r8, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rkf.adjustFrameGeometry(android.graphics.Matrix, int, int):org.webrtc.SurfaceTextureHelper$FrameGeometry");
    }

    public final void b(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack) {
        VideoTrack videoTrack = (VideoTrack) mediaStreamTrack;
        videoTrack.setContentHint(VideoTrack.ContentHint.NONE);
        if (mediaStream != null) {
            mediaStream.addTrack(videoTrack);
        }
    }

    public final void c(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack) {
        VideoTrack videoTrack = (VideoTrack) mediaStreamTrack;
        if (mediaStream != null) {
            mediaStream.removeTrack(videoTrack);
        }
        SurfaceTextureHelper surfaceTextureHelper = this.s0;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.dispose();
        }
        this.s0 = null;
    }

    public final MediaSource g() {
        return this.Y.createVideoSource(false);
    }

    public final MediaStreamTrack h(String str, MediaSource mediaSource) {
        return this.Y.createVideoTrack(str, (VideoSource) mediaSource);
    }

    public final String j() {
        return "VideoRecord";
    }

    public final void m() {
        super.m();
        this.t0 = null;
    }

    public final String toString() {
        return "OkSdkVideoRecord(isScreenCast=false)";
    }

    public final void u() {
        VideoSource videoSource = (VideoSource) ((MediaSource) this.o);
        if (videoSource == null) {
            ((a4c) this.c).log("VideoRecord", "No source while trying to update video format");
            return;
        }
        Size b = this.u0.b(this.v0.width, this.v0.height);
        if (b == null) {
            b = new Size(960, 540);
        }
        ((a4c) this.c).log("VideoRecord", rh4.h("Apply output format adaptation: size= ", b.width, b.height, "x"));
        videoSource.adaptOutputFormat(b.width, b.height, tu0.G(this.w0 * 24.0f));
    }
}
