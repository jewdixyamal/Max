package defpackage;

import android.media.MediaCodecInfo;

/* renamed from: ma4  reason: default package */
public final /* synthetic */ class ma4 implements oa4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public /* synthetic */ ma4(String str, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = i;
    }

    public final int a(MediaCodecInfo mediaCodecInfo) {
        int i = this.c;
        String str = this.b;
        switch (this.a) {
            case 0:
                return Math.abs(((Integer) h15.d(mediaCodecInfo, str).clamp(Integer.valueOf(i))).intValue() - i);
            default:
                ms msVar = h15.a;
                return mediaCodecInfo.getCapabilitiesForType(str).getEncoderCapabilities().isBitrateModeSupported(i) ? 0 : Integer.MAX_VALUE;
        }
    }
}
