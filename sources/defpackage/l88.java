package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* renamed from: l88  reason: default package */
public final class l88 implements j88, k88 {
    public final /* synthetic */ int a;
    public final int b;
    public MediaCodecInfo[] c;

    public l88(int i, boolean z, boolean z2) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = (z || z2) ? 1 : 0;
                return;
            default:
                this.b = (z || z2) ? 1 : 0;
                return;
        }
    }

    public final MediaCodecInfo a(int i) {
        switch (this.a) {
            case 0:
                if (this.c == null) {
                    this.c = new MediaCodecList(this.b).getCodecInfos();
                }
                return this.c[i];
            default:
                if (this.c == null) {
                    this.c = new MediaCodecList(this.b).getCodecInfos();
                }
                return this.c[i];
        }
    }

    public final boolean d(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        switch (this.a) {
            case 0:
                return codecCapabilities.isFeatureSupported(str);
            default:
                return codecCapabilities.isFeatureSupported(str);
        }
    }

    public final boolean e(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        switch (this.a) {
            case 0:
                return codecCapabilities.isFeatureRequired(str);
            default:
                return codecCapabilities.isFeatureRequired(str);
        }
    }

    public final int g() {
        switch (this.a) {
            case 0:
                if (this.c == null) {
                    this.c = new MediaCodecList(this.b).getCodecInfos();
                }
                return this.c.length;
            default:
                if (this.c == null) {
                    this.c = new MediaCodecList(this.b).getCodecInfos();
                }
                return this.c.length;
        }
    }

    public final boolean h() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return true;
        }
    }
}
