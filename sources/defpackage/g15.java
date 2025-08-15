package defpackage;

import android.media.MediaCodecInfo;

/* renamed from: g15  reason: default package */
public abstract class g15 {
    public static boolean a(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    public static boolean b(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }
}
