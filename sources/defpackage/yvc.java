package defpackage;

import org.webrtc.MediaSource;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoSource;
import org.webrtc.VideoTrack;

/* renamed from: yvc  reason: default package */
public final class yvc extends ej3 {
    public final PeerConnectionFactory Y;
    public SurfaceTextureHelper Z;
    public final jo7 s0;

    /* JADX WARNING: type inference failed for: r1v1, types: [jo7, java.lang.Object] */
    public yvc(PeerConnectionFactory peerConnectionFactory, String str, MediaStream mediaStream, a4c a4c, u5e u5e, dnc dnc) {
        super(str, mediaStream, a4c);
        this.Y = peerConnectionFactory;
        ? obj = new Object();
        obj.a = dnc;
        obj.b = u5e;
        this.s0 = obj;
    }

    public final void b(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack) {
        VideoTrack videoTrack = (VideoTrack) mediaStreamTrack;
        if (mediaStream != null) {
            mediaStream.addTrack(videoTrack);
        }
    }

    public final void c(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack) {
        VideoTrack videoTrack = (VideoTrack) mediaStreamTrack;
        if (mediaStream != null) {
            mediaStream.removeTrack(videoTrack);
        }
        SurfaceTextureHelper surfaceTextureHelper = this.Z;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.dispose();
        }
        this.Z = null;
    }

    public final MediaSource g() {
        return this.Y.createVideoSource(false);
    }

    public final MediaStreamTrack h(String str, MediaSource mediaSource) {
        return this.Y.createVideoTrack(str, (VideoSource) mediaSource);
    }

    public final String toString() {
        return "OkSdkScreenShareRecord";
    }

    public final void u(int i, int i2, int i3) {
        aff aff;
        int i4;
        if (i <= 0 || i2 <= 0 || i < i2 || i3 <= 0) {
            aff = null;
        } else {
            int i5 = 320;
            if (i < 320) {
                i4 = tu0.G(((float) 320) * (((float) i2) / ((float) i))) / 16;
            } else {
                i5 = (i / 16) * 16;
                i4 = i2 / 16;
            }
            int i6 = i5;
            int i7 = i4 * 16;
            aff = new aff(i6, i7, i7, i6, i3);
        }
        if (aff != null) {
            VideoSource videoSource = (VideoSource) ((MediaSource) this.o);
            if (videoSource != null) {
                videoSource.adaptOutputFormat(aff.a, aff.b, aff.c, aff.d, i3);
            }
            String j = j();
            StringBuilder sb = new StringBuilder("Set screenshare dimensions to ");
            sb.append(aff.a);
            sb.append(" x ");
            ms2.k(sb, aff.b, " by requested ", i, " x ");
            sb.append(i2);
            sb.append(" fps ");
            sb.append(i3);
            ((a4c) this.c).log(j, sb.toString());
        }
    }
}
