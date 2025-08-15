package defpackage;

import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoEncoderFactory;

/* renamed from: mra  reason: default package */
public final class mra implements VideoEncoderFactory.VideoEncoderSelector, n38 {
    public volatile ucg X = new ucg(1, false);
    public final kra a;
    public final a4c b;
    public VideoCodecInfo c;
    public VideoCodecInfo o;

    public mra(kra kra, a4c a4c) {
        this.a = kra;
        this.b = a4c;
    }

    public static VideoCodecInfo b(VideoCodecInfo[] videoCodecInfoArr, String str) {
        if (videoCodecInfoArr != null) {
            for (VideoCodecInfo videoCodecInfo : videoCodecInfoArr) {
                if (tpa.f(videoCodecInfo.name, str)) {
                    return videoCodecInfo;
                }
            }
        }
        return null;
    }

    public final VideoCodecInfo a() {
        VideoCodecInfo videoCodecInfo;
        if (this.o == null) {
            return null;
        }
        ucg ucg = this.X;
        if (lra.$EnumSwitchMapping$0[au1.s(ucg.a)] == 1) {
            videoCodecInfo = this.o;
        } else if (ucg.b) {
            VideoCodecInfo[] supportedCodecs = this.a.a.getSupportedCodecs();
            VideoCodecInfo b2 = b(supportedCodecs, "VP9");
            if (b2 == null) {
                videoCodecInfo = b(supportedCodecs, "VP8");
                if (videoCodecInfo == null) {
                    videoCodecInfo = b(this.a.b.getSupportedCodecs(), "VP8");
                }
            } else {
                videoCodecInfo = b2;
            }
        } else {
            videoCodecInfo = b(this.a.b.getSupportedCodecs(), "VP8");
            if (videoCodecInfo == null) {
                this.b.log("PatchedVideoEncoderFactoryCodecSelector", "Software VP8 encoder not found");
            }
        }
        if (tpa.f(videoCodecInfo, this.c)) {
            return null;
        }
        a4c a4c = this.b;
        VideoCodecInfo videoCodecInfo2 = this.c;
        a4c.log("PatchedVideoEncoderFactoryCodecSelector", "Selected encoder " + videoCodecInfo + " differs from current one " + videoCodecInfo2 + ". Let us suggest an update");
        return videoCodecInfo;
    }

    public final VideoCodecInfo onAvailableBitrate(int i) {
        return a();
    }

    public final void onCurrentEncoder(VideoCodecInfo videoCodecInfo) {
        if (this.o == null && videoCodecInfo != null) {
            a4c a4c = this.b;
            a4c.log("PatchedVideoEncoderFactoryCodecSelector", "Encoder  " + videoCodecInfo + " was selected as default");
            this.o = videoCodecInfo;
        }
        this.c = videoCodecInfo;
        a4c a4c2 = this.b;
        ucg ucg = this.X;
        a4c2.log("PatchedVideoEncoderFactoryCodecSelector", "Codec selected: " + videoCodecInfo + " for condition " + ucg);
    }

    public final VideoCodecInfo onEncoderBroken() {
        boolean f = tpa.f(this.c, this.o);
        a4c a4c = this.b;
        if (f) {
            VideoCodecInfo videoCodecInfo = this.o;
            if (videoCodecInfo != null) {
                a4c.log("PatchedVideoEncoderFactoryCodecSelector", "Default encoder " + videoCodecInfo + " was broken. reset");
            }
            this.o = null;
        }
        VideoCodecInfo videoCodecInfo2 = this.c;
        if (videoCodecInfo2 != null) {
            a4c.log("PatchedVideoEncoderFactoryCodecSelector", "Current encoder " + videoCodecInfo2 + " was broken. reset");
        }
        this.c = null;
        return a();
    }

    public final VideoCodecInfo onResolutionChange(int i, int i2) {
        return a();
    }

    public final void p(o38 o38) {
        a4c a4c = this.b;
        a4c.log("PatchedVideoEncoderFactoryCodecSelector", "Network condition did change. New condition is " + o38);
        this.X = new ucg(o38.a, o38.c);
    }
}
