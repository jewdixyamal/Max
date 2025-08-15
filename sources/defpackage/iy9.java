package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import org.webrtc.EglBase;
import org.webrtc.HardwareVideoDecoderFactory;
import org.webrtc.SoftwareVideoDecoderFactory;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoDecoderFactory;
import org.webrtc.VideoDecoderFallback;

/* renamed from: iy9  reason: default package */
public final class iy9 implements VideoDecoderFactory {
    public static final String e = "OKDefaultVideoDecoderFactory";
    public final hy9 a;
    public final SoftwareVideoDecoderFactory b;
    public boolean c = true;
    public final a4c d;

    static {
        new ArrayList(Arrays.asList(new String[]{"OMX.qcom.".toLowerCase(), "OMX.MTK.".toLowerCase(), "OMX.Intel.".toLowerCase(), "OMX.Exynos.".toLowerCase()}));
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [hy9, org.webrtc.HardwareVideoDecoderFactory] */
    public iy9(EglBase.Context context, a4c a4c) {
        this.d = a4c;
        this.a = new HardwareVideoDecoderFactory(context, new jj9(17));
        this.b = new SoftwareVideoDecoderFactory();
    }

    public final VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        VideoDecoderFallback videoDecoderFallback;
        String str = videoCodecInfo.name;
        boolean equals = str.equals("VP8");
        SoftwareVideoDecoderFactory softwareVideoDecoderFactory = this.b;
        a4c a4c = this.d;
        if ((equals || str.equals("VP9")) && !this.c) {
            return new ph4(softwareVideoDecoderFactory.createDecoder(videoCodecInfo), videoCodecInfo, a4c);
        }
        try {
            videoDecoderFallback = this.a.createDecoder(videoCodecInfo);
        } catch (Exception e2) {
            a4c.log(e, "Hardware encoder creating failed! Error=" + e2.getMessage());
            videoDecoderFallback = null;
        }
        VideoDecoder createDecoder = softwareVideoDecoderFactory.createDecoder(videoCodecInfo);
        if (videoDecoderFallback != null && createDecoder != null) {
            videoDecoderFallback = new VideoDecoderFallback(createDecoder, videoDecoderFallback);
        } else if (videoDecoderFallback == null) {
            if (createDecoder == null) {
                return null;
            }
            videoDecoderFallback = createDecoder;
        }
        return new ph4(videoDecoderFallback, videoCodecInfo, a4c);
    }

    public final VideoCodecInfo[] getSupportedCodecs() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Collections.addAll(linkedHashSet, this.b.getSupportedCodecs());
        VideoCodecInfo[] supportedCodecs = this.a.getSupportedCodecs();
        if (this.c) {
            Collections.addAll(linkedHashSet, supportedCodecs);
        } else {
            for (VideoCodecInfo videoCodecInfo : supportedCodecs) {
                String str = videoCodecInfo.name;
                if (!str.equals("VP8") && !str.equals("VP9")) {
                    linkedHashSet.add(videoCodecInfo);
                }
            }
        }
        return (VideoCodecInfo[]) linkedHashSet.toArray(new VideoCodecInfo[linkedHashSet.size()]);
    }
}
